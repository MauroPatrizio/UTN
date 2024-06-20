package utn.ElBuenSabor;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import utn.ElBuenSabor.entities.*;
import utn.ElBuenSabor.entities.enums.*;
import utn.ElBuenSabor.repositories.*;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class ElBuenSaborApplication {

	@Autowired
	private ArticuloInsumoRepository articuloInsumoRepository;
	@Autowired
	private ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository;
	@Autowired
	private ArticuloManufacturadoRepository articuloManufacturadoRepository;
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private DetallePedidoRepository detallePedidoRepository;
	@Autowired
	private DomicilioRepository domicilioRepository;
	@Autowired
	private EmpleadoRepository empleadoRepository;
	@Autowired
	private EmpresaRepository empresaRepository;
	@Autowired
	private ImagenRepository imagenRepository;
	@Autowired
	private LocalidadRepository localidadRepository;
	@Autowired
	private PaisRepository paisRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private PromocionDetalleRepository promocionDetalleRepository;
	@Autowired
	private ProvinciaRepository provinciaRepository;
	@Autowired
	private SucursalRepository sucursalRepository;
	@Autowired
	private UnidadMedidaRepository unidadMedidaRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private FacturaRepository facturaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ElBuenSaborApplication.class, args);
	}

	@Bean
	@Transactional
	CommandLineRunner init(ArticuloInsumoRepository articuloInsumoRepository,
						   ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository,
						   ArticuloManufacturadoRepository articuloManufacturadoRepository,
						   CategoriaRepository categoriaRepository,
						   ClienteRepository clienteRepository,
						   DetallePedidoRepository detallePedidoRepository,
						   DomicilioRepository domicilioRepository,
						   EmpleadoRepository empleadoRepository,
						   EmpresaRepository empresaRepository,
						   ImagenRepository imagenRepository,
						   LocalidadRepository localidadRepository,
						   PaisRepository paisRepository,
						   PedidoRepository pedidoRepository,
						   PromocionDetalleRepository promocionDetalleRepository,
						   ProvinciaRepository provinciaRepository,
						   SucursalRepository sucursalRepository,
						   UnidadMedidaRepository unidadMedidaRepository,
						   UsuarioRepository usuarioRepository,
						   PromocionRepository promocionRepository,
						   FacturaRepository facturaRepository) {
		return args -> {

			Categoria categ1 = Categoria.builder()
					.denominacion("Categoria 1")
					.build();
			categoriaRepository.save(categ1);

			Categoria categ2 = Categoria.builder()
					.denominacion("Categoria 2")
					.build();
			categoriaRepository.save(categ2);

			UnidadMedida uniM1 = UnidadMedida.builder()
					.denominacion("Unidad Medida 1")
					.build();
			unidadMedidaRepository.save(uniM1);

			UnidadMedida uniM2 = UnidadMedida.builder()
					.denominacion("Unidad Medida 2")
					.build();
			unidadMedidaRepository.save(uniM2);

			Imagen img1 = Imagen.builder()
					.denominacion("Imagen 1")
					.build();
			imagenRepository.save(img1);

			Imagen img2 = Imagen.builder()
					.denominacion("Imagen 2")
					.build();
			imagenRepository.save(img2);

			ArticuloInsumo artInsumo1 = ArticuloInsumo.builder()
					.denominacion("Artículo insumo 1")
					.precioVenta(300D)
					.precioCompra(100D)
					.stockActual(14)
					.stockMaximo(100)
					.esParaElaborar(Boolean.FALSE)
					.categoria(categ1)
					.unidadMedida(uniM1)
					.build();
			artInsumo1.getImagenesArticulos().add(img1);
			articuloInsumoRepository.save(artInsumo1);

			ArticuloInsumo artInsumo2 = ArticuloInsumo.builder()
					.denominacion("Artículo insumo 2")
					.precioVenta(200D)
					.precioCompra(190D)
					.stockActual(30)
					.stockMaximo(200)
					.esParaElaborar(Boolean.TRUE)
					.categoria(categ2)
					.unidadMedida(uniM2)
					.build();
			artInsumo2.getImagenesArticulos().add(img2);
			articuloInsumoRepository.save(artInsumo2);

			ArticuloManufacturado artMan1 = ArticuloManufacturado.builder()
					.denominacion("Articulo manufacturado 1")
					.precioVenta(300D)
					.descripcion("Articulo para el hogar")
					.tiempoEstimadoMinutos(150)
					.preparacion("Preparacion articulo manufacturado 1")
					.unidadMedida(uniM1)
					.categoria(categ1)
					.build();
			articuloManufacturadoRepository.save(artMan1);

			ArticuloManufacturado artMan2 = ArticuloManufacturado.builder()
					.denominacion("Articulo manufacturado 2")
					.precioVenta(500D)
					.descripcion("Articulo para el hogar")
					.tiempoEstimadoMinutos(100)
					.preparacion("Preparacion articulo manufacturado 2")
					.unidadMedida(uniM2)
					.categoria(categ2)
					.build();
			articuloManufacturadoRepository.save(artMan2);

			ArticuloManufacturadoDetalle artManDet1 = ArticuloManufacturadoDetalle.builder()
					.cantidad(11)
					.articuloInsumo(artInsumo1)
					.articuloManufacturado(artMan1)
					.build();
			articuloManufacturadoDetalleRepository.save(artManDet1);

			ArticuloManufacturadoDetalle artManDet2 = ArticuloManufacturadoDetalle.builder()
					.cantidad(7)
					.articuloInsumo(artInsumo2)
					.articuloManufacturado(artMan2)
					.build();
			articuloManufacturadoDetalleRepository.save(artManDet2);

			Pais pais1 = Pais.builder()
					.nombre("Argentina")
					.build();
			paisRepository.save(pais1);

			Provincia prov1 = Provincia.builder()
					.nombre("Mendoza")
					.pais(pais1)
					.build();
			provinciaRepository.save(prov1);

			Localidad loc1 = Localidad.builder()
					.nombre("San Francisco del monte")
					.provincia(prov1)
					.build();
			localidadRepository.save(loc1);

			Localidad loc2 = Localidad.builder()
					.nombre("Las tortugas")
					.provincia(prov1)
					.build();
			localidadRepository.save(loc2);

			Domicilio dom1 = Domicilio.builder()
					.calle("Alem")
					.numero(512)
					.cp(5500)
					.localidad(loc1)
					.build();
			domicilioRepository.save(dom1);

			Domicilio dom2 = Domicilio.builder()
					.calle("San Martin")
					.numero(360)
					.cp(5501)
					.localidad(loc2)
					.build();
			domicilioRepository.save(dom2);

			Domicilio dom3 = Domicilio.builder()
					.calle("Morón")
					.numero(777)
					.cp(5508)
					.localidad(loc2)
					.build();
			domicilioRepository.save(dom3);

			Domicilio dom4 = Domicilio.builder()
					.calle("Zapala")
					.numero(888)
					.cp(5507)
					.localidad(loc2)
					.build();
			domicilioRepository.save(dom4);

			Empresa empresa1 = Empresa.builder()
					.nombre("Empresa 1")
					.razonSocial("MiEmpresa S.R.L")
					.cuil(22222222)
					.build();
			empresaRepository.save(empresa1);

			Sucursal sucursal1 = Sucursal.builder()
					.nombre("Sucursal 1")
					.horaApertura(LocalTime.of(9,10))
					.horaCierre(LocalTime.of(23,00))
					.casaMatriz(Boolean.TRUE)
					.domicilio(dom3)
					.empresa(empresa1)
					.build();
			sucursal1.getCategorias().add(categ1);
			sucursalRepository.save(sucursal1);



			Sucursal sucursal2 = Sucursal.builder()
					.nombre("Sucursal 2")
					.horaApertura(LocalTime.of(9,10))
					.horaCierre(LocalTime.of(23,00))
					.casaMatriz(Boolean.FALSE)
					.domicilio(dom4)
					.empresa(empresa1)
					.build();
			sucursal2.getCategorias().add(categ2);
			sucursalRepository.save(sucursal2);


			Usuario user1 = Usuario.builder()
					.userName("Cliente")
					.authId("passCliente")
					.build();
			usuarioRepository.save(user1);

			Usuario user2 = Usuario.builder()
					.userName("Empleados")
					.authId("passEmpleados")
					.build();
			usuarioRepository.save(user2);

			Cliente cliente1 = Cliente.builder().build();
			cliente1.setNombre("Pedro");
			cliente1.setApellido("Gonzalez");
			cliente1.setTelefono("123456789");
			cliente1.setEmail("pedro@gmail.com");
			cliente1.setFechaNacimiento("2000-07-27");
			cliente1.setRol(Rol.CLIENTE);
			cliente1.getDomicilios().add(dom1);
			cliente1.setUsuario(user1);
			clienteRepository.save(cliente1);

			Cliente cliente2 = Cliente.builder().build();
			cliente2.setNombre("Leandro");
			cliente2.setApellido("Paredes");
			cliente2.setTelefono("987654321");
			cliente2.setEmail("paredesleo@gmail.com");
			cliente2.setFechaNacimiento("2013-08-22");
			cliente2.setRol(Rol.CLIENTE);
			cliente2.getDomicilios().add(dom2);
			cliente2.setUsuario(user2);
			clienteRepository.save(cliente2);

			Empleado empleado1 = Empleado.builder()
					.sucursal(sucursal1)
					.build();
			empleado1.setNombre("Lionel");
			empleado1.setApellido("Messi");
			empleado1.setTelefono("987654321");
			empleado1.setEmail("messi@gmail.com");
			empleado1.setFechaNacimiento("2013-08-22");
			empleado1.setRol(Rol.DELIVERY);
			empleado1.setImagenPersona(img2);
			empleado1.setUsuario(user1);
			empleadoRepository.save(empleado1);

			Empleado empleado2 = Empleado.builder()
					.sucursal(sucursal2)
					.build();
			empleado2.setNombre("Emiliano");
			empleado2.setApellido("Martinez");
			empleado2.setTelefono("88888888");
			empleado2.setEmail("martinez@gmail.com");
			empleado2.setFechaNacimiento("2011-02-21");
			empleado2.setRol(Rol.CAJERO);
			empleado2.setImagenPersona(img1);
			empleado2.setUsuario(user2);
			empleadoRepository.save(empleado2);


			Pedido pedido1 = Pedido.builder()
					.horaEstimadaFinalizacion(LocalTime.of(15,30))
					.empleado(empleado1).total(300D)
					.totalCosto(100D)
					.estado(Estado.PREPARACION)
					.tipoEnvio(TipoEnvio.DELIVERY)
					.formaPago(FormaPago.MERCADOPAGO)
					.fechaPedido(LocalDate.of(2023,03,21))
					.sucursal(sucursal1).cliente(cliente1)
					.build();
			pedidoRepository.save(pedido1);

			Factura factura1 = Factura.builder()
					.fechaFacturacion(pedido1.getFechaPedido())
					.formaPago(FormaPago.MERCADOPAGO)
					.mpPaymentId(222222)
					.mpMerchantOrderId(66666666)
					.mpPreferenceId("no se que es esto")
					.mpPaymentType("QR")
					.totalVenta(pedido1.getTotal())
					.build();
			facturaRepository.save(factura1);
			pedido1.setFactura(factura1);
			pedidoRepository.save(pedido1);

			Pedido pedido2 = Pedido.builder()
					.horaEstimadaFinalizacion(LocalTime.of(20,30))
					.empleado(empleado2).total(540D)
					.totalCosto(350D)
					.estado(Estado.PENDIENTE)
					.tipoEnvio(TipoEnvio.TAKEAWAY)
					.formaPago(FormaPago.EFECTIVO)
					.fechaPedido(LocalDate.of(2023,05,13))
					.sucursal(sucursal2).cliente(cliente2)
					.build();
			pedidoRepository.save(pedido2);

			Factura factura2 = Factura.builder()
					.fechaFacturacion(pedido1.getFechaPedido())
					.formaPago(FormaPago.MERCADOPAGO)
					.mpPaymentId(333333)
					.mpMerchantOrderId(77777)
					.mpPreferenceId("no se que es esto")
					.mpPaymentType("QR")
					.totalVenta(pedido1.getTotal())
					.build();
			facturaRepository.save(factura2);
			pedido2.setFactura(factura2);
			pedidoRepository.save(pedido2);

			DetallePedido detaPed1 = DetallePedido.builder()
					.pedido(pedido1)
					.cantidad(2)
					.subTotal(650D)
					.articulo(artMan2)
					.build();
			detallePedidoRepository.save(detaPed1);

			DetallePedido detaPed2 = DetallePedido.builder()
					.pedido(pedido2)
					.cantidad(5)
					.subTotal(980D)
					.articulo(artMan1)
					.build();
			detallePedidoRepository.save(detaPed2);

			Promocion promocion1 = Promocion.builder()
					.denominacion("Promocion 1")
					.fechaDesde(LocalDate.of(2023,05,18))
					.fechaHasta(LocalDate.of(2023,05,25))
					.horaDesde(LocalTime.of(10,55))
					.horaHasta(LocalTime.of(23,59))
					.descripcionDescuento("Descuentos del 15%")
					.precioPromocional(1500D)
					.tipoPromocion(TipoPromocion.PROMOCION1)
					.build();
			promocion1.getSucursales().add(sucursal1);
			promocion1.getImagenesPromocion().add(img1);
			promocionRepository.save(promocion1);

			Promocion promocion2 = Promocion.builder()
					.denominacion("Promocion 2")
					.fechaDesde(LocalDate.of(2023,06,01))
					.fechaHasta(LocalDate.of(2023,06,15))
					.horaDesde(LocalTime.of(10,55))
					.horaHasta(LocalTime.of(23,59))
					.descripcionDescuento("Descuentos del 25%")
					.precioPromocional(2700D)
					.tipoPromocion(TipoPromocion.HAPPYHOUR)
					.build();
			promocion2.getSucursales().add(sucursal1);
			promocion2.getImagenesPromocion().add(img2);
			promocionRepository.save(promocion2);


			PromocionDetalle promDet1 = PromocionDetalle.builder()
					.cantidad(3)
					.articulo(artMan2)
					.promocion(promocion1)
					.build();
			promocionDetalleRepository.save(promDet1);

			PromocionDetalle promDet2 = PromocionDetalle.builder()
					.cantidad(5)
					.articulo(artMan1)
					.promocion(promocion2)
					.build();
			promocionDetalleRepository.save(promDet2);
		};
	}
}
