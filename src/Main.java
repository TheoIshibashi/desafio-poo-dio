//Classes Filha

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descriçao curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTheo = new Dev();
        devTheo.setNome("Theo");
        devTheo.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Theo:" + devTheo.getConteudosInscritos());
        devTheo.progredir();

        System.out.println("-");
        System.out.println("Conteudos Inscritos Theo:" + devTheo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Theo:" + devTheo.getConteudosConcluidos());
        System.out.println("XP Theo:" + devTheo.calcularTotalXp());


        System.out.println("--------------");



        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Ana:" + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        devAna.progredir();

        System.out.println("-");
        System.out.println("Conteudos Inscritos Ana: " + devAna.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Ana: " + devAna.getConteudosConcluidos());
        System.out.println("XP Ana:" + devAna.calcularTotalXp());




    }
}
