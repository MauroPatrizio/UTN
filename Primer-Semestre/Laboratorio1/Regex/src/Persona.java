import java.util.Date;

public class Persona {
    String email, tel, cp;
    Date birthday;

    public Persona(String email, String tel, String cp, Date birthday) {
        this.email = email;
        this.tel = tel;
        this.cp = cp;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", birthday='" + birthday + '\'' +
                ", cp='" + cp + '\'' +
                '}';
    }
}
