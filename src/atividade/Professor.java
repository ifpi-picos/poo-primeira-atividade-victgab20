package atividade;

public class Professor {
    
    private String nomeProfessor;
    private String emailProf;
    private String formacao;

    
    public Professor(String nomeProfessor, String emailProf, String formacao) {
        this.nomeProfessor = nomeProfessor;
        this.emailProf = emailProf;
        this.formacao = formacao;
    }


    public String getNomeProfessor() {
        return nomeProfessor;
    }


    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }


    public String getEmailProf() {
        return emailProf;
    }


    public void setEmailProf(String emailProf) {
        this.emailProf = emailProf;
    }


    public String getFormacao() {
        return formacao;
    }


    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    
    

}
