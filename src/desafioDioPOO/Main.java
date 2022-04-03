package desafioDioPOO;

import desafioDioPOO.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();

        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setDate(LocalDate.now());

      /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer ");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCarla = new Dev();
        devCarla.setNome("Carla ");
        devCarla.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devCarla.getConteudosInscritos());
        System.out.println("-------------");
        devCarla.progredir();
        System.out.println("Conteúdos inscritos: " + devCarla.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devCarla.getConteudosConcluidos());
        System.out.println("XP: " + devCarla.calcularTotalXp());

        System.out.println("=============================================================");

        Dev devIzabella = new Dev();
        devIzabella.setNome("Izabella ");
        devIzabella.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devIzabella.getConteudosInscritos());
        System.out.println("-------------");
        devIzabella.progredir();
        System.out.println("Conteúdos inscritos: " + devIzabella.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devIzabella.getConteudosConcluidos());
        System.out.println("XP: " + devIzabella.calcularTotalXp());

    }
}
