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
        profes.addPlayer(new Player("Profe Poo"));
        profes.addPlayer(new Player("Profe Adp"));
        profes.addPlayer(new Player("Profe Pwl"));
        profes.addPlayer(new Player("Profe Ux"));
        profes.addPlayer(new Player("Profe Pw2"));

        System.out.println(profes.getPlayers().size());

        Team estudiantes = new Team("Equipo de estudiantes");
        estudiantes.addPlayer(new Player("Estudiante Martin"));
        estudiantes.addPlayer(new Player("Estudiante Manuel"));
        estudiantes.addPlayer(new Player("Estudiante Marcos"));
        estudiantes.addPlayer(new Player("Estudiante Santino"));
        estudiantes.addPlayer(new Player("Estudiante Mateo"));

        //....
        Match primerParcial = new Match(
                "Aula virtual de POO jueves",
                fechaDeParcial,
                profes,
                estudiantes
        );

        torneoDaVinci.addMatch(primerParcial);


        primerParcial.generatePlayersList();
        System.out.println("Anoto el equipo local");
        primerParcial.incrementLocalTeamScore();
        System.out.println("Anoto el equipo visitante");
        primerParcial.incrementLocalTeamScore();
        System.out.println("Anoto el equipo visitante");
        primerParcial.incrementVisitantTeamScore();
        System.out.println("resultado:" + primerParcial.generateMarker());


        //System.out.println(profes.getPlayers().size());
        //System.out.println(String.format("Cantidad de match: %d",torneoDaVinci.getMatchs().size()));

        ArrayList<Match> partidosDeHoy = torneoDaVinci.getMatchs();

        //partidosDeHoy.get(0).getLocalTeam().incrementGoalCounter();
        //partidosDeHoy.get(0).getLocalTeam().incrementGoalCounter();
        //partidosDeHoy.get(0).getVisitantTeam().incrementGoalCounter();

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
