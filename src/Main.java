import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Cursos

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("curso react");
        curso3.setDescricao("descrição curso react");
        curso3.setCargaHoraria(6);

        //Mentorias 

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("mentoria de java");
        mentoriaJava.setDescricao("descrição mentoria java");
        mentoriaJava.setData(LocalDate.now());

        Mentoria mentoriaReact = new Mentoria();
        mentoriaReact.setTitulo("mentoria de react.js");
        mentoriaReact.setDescricao("descrição mentoria react.js");
        mentoriaReact.setData(LocalDate.now());

        //Bootcamps

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descrição Bootcamp Java Developer");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoriaReact);

        Bootcamp bootcampReact = new Bootcamp();
        bootcampReact.setNome("Bootcamp React Developer");
        bootcampReact.setDescricao("Descrição Bootcamp React Developer");
        bootcampReact.getConteudos().add(curso2);
        bootcampReact.getConteudos().add(curso3);
        bootcampReact.getConteudos().add(mentoriaReact);

        //Devs

        Dev devCamilaSantos = new Dev();
        devCamilaSantos.setNome("Camila");
        devCamilaSantos.setSobrenome("Santos");
        devCamilaSantos.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos Camila Santos:" + devCamilaSantos.getConteudosInscritos());
        devCamilaSantos.progredir();
        devCamilaSantos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila Santos:" + devCamilaSantos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila Santos:" + devCamilaSantos.getConteudosConcluidos());
        System.out.println("XP:" + devCamilaSantos.calcularTotalXp());

        System.out.println("-------");

        Dev devJoaoLima = new Dev();
        devJoaoLima.setNome("Joao");
        devJoaoLima.setSobrenome("Lima");
        devJoaoLima.inscreverBootcamp(bootcampReact);
        System.out.println("Conteúdos Inscritos João Lima:" + devJoaoLima.getConteudosInscritos());
        devJoaoLima.progredir();
        devJoaoLima.progredir();
        devJoaoLima.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João Lima:" + devJoaoLima.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João Lima:" + devJoaoLima.getConteudosConcluidos());
        System.out.println("XP:" + devJoaoLima.calcularTotalXp());

        System.out.println("-------");

        Dev devMariaBarbosa = new Dev();
        devMariaBarbosa.setNome("Maria");
        devMariaBarbosa.setSobrenome("Barbosa");
        devMariaBarbosa.inscreverBootcamp(bootcampReact);
        System.out.println("Conteúdos Inscritos Maria Barbosa:" + devMariaBarbosa.getConteudosInscritos());
        devMariaBarbosa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maria Barbosa:" + devMariaBarbosa.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Maria Barbosa:" + devMariaBarbosa.getConteudosConcluidos());
        System.out.println("XP:" + devMariaBarbosa.calcularTotalXp());

        System.out.println("-------");

        Dev devJoaoSilva = new Dev();
        devJoaoSilva.setNome("Joao");
        devJoaoSilva.setSobrenome("Silva");
        devJoaoSilva.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos João Silva:" + devJoaoSilva.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João Silva:" + devJoaoSilva.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João Silva:" + devJoaoSilva.getConteudosConcluidos());
        System.out.println("XP:" + devJoaoSilva.calcularTotalXp());

    }

}
