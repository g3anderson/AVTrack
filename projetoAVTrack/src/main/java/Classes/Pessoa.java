
package Classes;

public class Pessoa {
    
    private String nome, email, turma, salaDeAula, urlFoto;
    private int idPessoa, idade, idTurma;

    public Pessoa(String nome, String email, String turma, String salaDeAula, String urlFoto, int idPessoa, int idade, int idTurma) {
        
        this.nome = nome;
        this.email = email;
        this.turma = turma;
        this.salaDeAula = salaDeAula;
        this.urlFoto = urlFoto;
        this.idPessoa = idPessoa;
        this.idade = idade;
        this.idTurma = idTurma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getSalaDeAula() {
        return salaDeAula;
    }

    public void setSalaDeAula(String salaDeAula) {
        this.salaDeAula = salaDeAula;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }
    
}