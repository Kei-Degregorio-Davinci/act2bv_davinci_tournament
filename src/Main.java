import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

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

        Match primerParcial = new Match("Aula virtual de POO jueves", fechaDeParcial);


        Team profes = new Team();
        profes.addPlayer(new Player("Profe Poo"));
        profes.addPlayer(new Player("Profe Adp"));
        profes.addPlayer(new Player("Profe Pwl"));
        profes.addPlayer(new Player("Profe Ux"));
        profes.addPlayer(new Player("Profe Pw2"));

        System.out.println(profes.getPlayers().size());

        Team estudiantes = new Team();
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
        primerParcial.makeLocalGoal(0);
        System.out.println("Anoto el equipo visitante");
        primerParcial.makeVisitantGoal(0);
        System.out.println("Anoto el equipo visitante");
        primerParcial.makeLocalGoal(0);
        System.out.println("resultado:" + primerParcial.generateMarker());

        }


    }

