package atividade;


public class Curso {
    private String nomeCurso;
    private String modalidade;
    private String nivel;
    private int cargaHoraria;
    private boolean gratuito;

    public Curso(String nomeCurso, String modalidade, String nivel, int cargaHoraria, boolean gratuito) {
        this.nomeCurso = nomeCurso;
        this.modalidade = modalidade;
        this.nivel = nivel;
        this.cargaHoraria = cargaHoraria;
        this.gratuito = gratuito;
    }
    
    public Curso(String nomeCurso2, String nivelCurso, int parseInt, Professor p1) {
    }

    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public String getModalidade() {
        return modalidade;
    }
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public boolean isGratuito() {
        return gratuito;
    }
    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

    public Aluno[] getAlunos() {
        return null;
    }

    public void realizarMatricula(Aluno novoAluno) {
    }

    

}