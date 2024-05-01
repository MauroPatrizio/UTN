public class Main {
    public static void main(String[] args) {
        Athlete athlete1 = new Athlete(11111111, "Nico", 1.75, 34, 70);
        Athlete athlete2 = new Athlete(22222222, "Fabio", 1.8, 28, 92);
        Athlete athlete3 = new Athlete(33333333, "Abril", 1.5, 20, 55);
        Athlete athlete4 = new Athlete(44444444, "Eli", 1.48, 27, 80);
        Athlete athlete5 = new Athlete(55555555, "Juli", 1.7, 31, 65);


        NationalTeam argentina = new NationalTeam("Celeste", "Argentina");
        NationalTeam bolivia = new NationalTeam("Verde", "Bolivia");

        argentina.addAthlete(athlete1);
        argentina.addAthlete(athlete2);
        argentina.addAthlete(athlete3);
        argentina.addAthlete(athlete4);
        argentina.addAthlete(athlete5);

        Site site1 = new Site(5, "15/12/2024", "20.30");
        Site site2 = new Site(7, "21/5/2024", "07.30");


        Installation tomba = new Installation("Primera", "Godoy Cruz", "Tomba", "Pista de atletismo", site1);

        Test test1 = new Test(10555, "Cancha de futbol");
        Test test2 = new Test(66213, "Maraton de mendoza");

        test1.addAthlete(athlete1);
        test1.addAthlete(athlete2);
        test1.addAthlete(athlete3);
        test1.addAthlete(athlete4);
        test1.addAthlete(athlete5);

        test2.addAthlete(athlete1);
        test2.addAthlete(athlete2);
        test2.addAthlete(athlete3);
        test2.addAthlete(athlete4);
        test2.addAthlete(athlete5);

        tomba.addIsMade(test1);
        tomba.addIsMade(test2);

        System.out.println("El nombre del 3er atleta de la 2da prueba es: ");
        System.out.println(tomba.getIsMade().get(1).getParticipate().get(2).getName());

        System.out.println("El código de la 2da prueba es: ");
        System.out.println(tomba.getIsMade().get(1).getCode());

        System.out.println("La altura de todos los atletas es:");
        for (Athlete athlete: argentina.getAthletes()){
            System.out.println(athlete.getName() + ": " + athlete.getHeight() + "m.");
        }

        System.out.println("El peso extra de cada atleta es: ");
        for (Athlete athlete: argentina.getAthletes()){
            System.out.println(athlete.getName() + ": " + ((athlete.extraWeight()) ? "Tiene sobrepeso" : "No tiene sobrepeso"));
        }

    }
}