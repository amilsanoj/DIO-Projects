package program;

import domain.entities.Bootcamp;
import domain.entities.Curso;
import domain.entities.Dev;
import domain.entities.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Curso onde se aprende java ué", 8);
        Curso curso2 = new Curso("Curso JS", "Com certeza não Java...", 4);
        Mentoria mentoria = new Mentoria("mentoria de java", "Essa mentoria é do Java Java, o da xícara", LocalDate.now());
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer","Bootcamp onde você aprende a ser um Java Developer");
        bootcamp.addActivity(curso1);
        bootcamp.addActivity(curso2);
        bootcamp.addActivity(mentoria);

        Dev devCamila = new Dev("Camila");
        devCamila.insertBootcamp(bootcamp);
        System.out.printf("%s: ", devCamila.getName() + "\n");
        System.out.println(devCamila.getContents());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.printf("%s: ", devCamila.getName() + "\n");
        System.out.println(devCamila.getFinishContents());
        System.out.println("XP:" + devCamila.totalX());

        System.out.println("-------");

        Dev devJoao = new Dev("Joao");
        devJoao.insertBootcamp(bootcamp);
        System.out.printf("%s: ", devJoao.getName() +"\n");
        System.out.println(devJoao.getContents());
        devJoao.progredir();
        System.out.println("-");
        System.out.printf("%s: ", devJoao.getName() +"\n");
        System.out.println("Conteudos Concluidos:");
        System.out.println(devJoao.getFinishContents());
        System.out.println("XP:" + devJoao.totalX());
    }

}
