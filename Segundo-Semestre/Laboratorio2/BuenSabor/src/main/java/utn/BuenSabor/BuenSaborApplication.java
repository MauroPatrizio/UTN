package utn.BuenSabor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utn.BuenSabor.entities.Empresa;
import utn.BuenSabor.entities.Pais;
import utn.BuenSabor.entities.Provincia;

@SpringBootApplication
public class BuenSaborApplication {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("buenSabor");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			Empresa empresa = new Empresa("McDonalds", "CosaSA", 1444444448);
			Pais pais = new Pais("Argentina");
			Provincia provincia = new Provincia("Mendoza");
			provincia.setPais(pais);
			em.persist(empresa);
			em.persist(pais);
			em.persist(provincia);
			em.flush();
			em.getTransaction().commit();

		}catch (Exception e){
			em.getTransaction().rollback();
		}

		em.close();
		emf.close();
	}

}
