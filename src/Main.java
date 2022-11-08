import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String arg[]){
        System.out.println("Da vinci tournament");
        // Enero es 0, Agosto es 7, Date es fecha (1, 31), Day dia de la semana Domingo es 0

        Date comienzoDeCuatri = new Date(2022,7,16);

        Date finDelCuatri = new Date(2022,11,5);

        Season torneoDaVinci = new Season(
                "Torneo POO 2022, 2do Cuatri",
                comienzoDeCuatri,
                finDelCuatri
        );


        Date fechaDeParcial = new Date(2022,8,29);


        Team profes = new Team("Equipo de profes");
        Player profeSergio = new Player("Sergio Medina");
        Player coordinador = new Player("Coordinador AdS");
        Player suplentePoo = new Player("Suplente POO");


        profes.addPlayer(profeSergio);
        profes.addPlayer(coordinador);
        profes.addPlayer(suplentePoo);

        System.out.println(profes.getPlayers().size());

        Team estudiantes = new Team("Equipo de estudiantes");



        estudiantes.addPlayer(new Player("San Martin"));
        estudiantes.addPlayer(new Player("Manuel Belgrano"));
        estudiantes.addPlayer(new Player("Mariano Moreno"));

        //....
        Match primerParcial = new Match(
                "Aula virtual de POO jueves",
                fechaDeParcial,
                profes,
                estudiantes
        );

        torneoDaVinci.addMatch(primerParcial);

        System.out.println(profes.getPlayers().size());
        System.out.println(String.format("Cantidad de match: %d",torneoDaVinci.getMatchs().size()));

        ArrayList<Match> partidosDeHoy = torneoDaVinci.getMatchs();

        partidosDeHoy.get(0).getLocalTeam().incrementGoalCounter();
        partidosDeHoy.get(0).getLocalTeam().incrementGoalCounter();
        partidosDeHoy.get(0).getVisitantTeam().incrementGoalCounter();

        System.out.println(
                partidosDeHoy
                        .get(0)
                        .getDate()
        );

        System.out.println(
                partidosDeHoy
                        .get(0)
                        .getLocalTeam()
                        .getName()
        );

        System.out.println(
                partidosDeHoy
                        .get(0)
                        .getLocalTeam()
                        .getGoalCounter()
        );

        System.out.println(
                partidosDeHoy
                        .get(0)
                        .getVisitantTeam()
                        .getName()
        );

        System.out.println(
                partidosDeHoy
                        .get(0)
                        .getVisitantTeam()
                        .getGoalCounter()
        );




    }
}
