
package Classes;

public class Localizcao {
    
    private String nome, andar, predio, turma;
    private int idLocalizacao;

    public Localizcao(String nome, String andar, String predio, String turma, int idLocalizacao, int idTurma) {
        this.nome = nome;
        this.andar = andar;
        this.predio = predio;
        this.turma = turma;
        this.idLocalizacao = idLocalizacao;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getPredio() {
        return predio;
    }

    public void setPredio(String predio) {
        this.predio = predio;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(int idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }

}
