package atividade;


public class App {
    public static void main(String[] args) throws Exception{

        Professor professor = new Professor("Julio", "prof@gmail.com", "Mestrado em Fisica");
        Curso curso01 = new Curso("ADS", "Presencial", "Superior", 2000, true);

        System.out.println("Nome: " + professor.getNomeProfessor()+" Email: " + professor.getEmailProf() + " Formação: " + professor.getFormacao());
        System.out.println("Nome do Curso: " + curso01.getNomeCurso() + " Modalidade: " + curso01.getModalidade() + " Nivel: " + curso01.getNivel() + " Carga Horária: "+ curso01.getCargaHoraria()+" Gratuito: "+ curso01.isGratuito());
    }
}
