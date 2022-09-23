package atividade;

public class Aluno {
   private String nomeAluno;
   private String nomeCurso;
   
   public String getNomeCurso() {
    return nomeCurso;
}
public void setNomeCurso(String nomeCurso) {
    this.nomeCurso = nomeCurso;
}
private String emailAluno;


    public Aluno(String nomeAluno2, String emailAluno2) {
}
    public String getNomeAluno() {

        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {

        this.nomeAluno = nomeAluno;
    }
    public String getEmailAluno() {

        return emailAluno;
    }
    public void setEmailAluno(String emailAluno) {
        
        this.emailAluno = emailAluno;
    }
    
}
