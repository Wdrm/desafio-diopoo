import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 =  new Curso();
   curso1.setTitulo("curso java");
   curso1.setDescricao("descricao curso java");
   curso1.setCargaHoraria(8);

        Curso curso2 =  new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


       // System.out.println(curso1);
       // System.out.println(curso2);
       // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);



        Dev devWellington = new Dev();
        devWellington.setNome("Wellington");
        devWellington.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+ devWellington.getConteudosInscritos());
        devWellington.progredir();
        System.out.println("__");
        System.out.println("Conteúdos Inscritos "+ devWellington.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos "+ devWellington.getConteudosConcluidos());
      //  System.out.println("XP:"+devWellington.calculaTotalXP());


        System.out.println("________________");


        Dev devAnna = new Dev();
        devAnna.setNome("Anna");
        devAnna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+ devAnna.getConteudosInscritos());
        devAnna.progredir();
        System.out.println("__");
        System.out.println("Conteúdos Inscritos "+ devAnna.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos "+ devAnna.getConteudosConcluidos());
        //System.out.println("XP:"+devAnna.calculaTotalXP());




        }

    }
