public class Main {
    public static void main(String[] args) {
        Directivo dir  = new Directivo("Pedro", 33000777);
        Operario ope = new Operario("Carlos", 35777888);
        Oficial ofi  = new Oficial("Juan", 37888999, 1456);
        Tecnico tec = new Tecnico("Alberto", 40444777, 2345);

        dir.decisiones();
        System.out.println(dir.toString());
        ope.operaciones();
        System.out.println(ope.toString());
        ofi.operaciones();
        System.out.println(ofi.toString());
        tec.operaciones();
        System.out.println(tec.toString());
    }
}