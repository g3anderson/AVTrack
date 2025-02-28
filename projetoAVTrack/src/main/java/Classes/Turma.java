
package Classes;

public class Turma {
    
    private String nomeSala;
    private String predioLocalizado; 
    private int andarSala;
    
    public Turma(String nomeSala, String predioLocalizado, int andarSala){
    
        this.nomeSala = nomeSala;
        this.predioLocalizado = predioLocalizado;
        this.andarSala = andarSala;
    }
    
    public String getNomeSala(){
        return this.nomeSala;
    }
    
    public void setNomeSala(String novoNomeSala){
        this.nomeSala =novoNomeSala;
    }
    
    public String getPredioLocalizado(){
        return this.predioLocalizado;
    }
    
    public void setPredioLocalizado(String novoPredioLocalizado){
        this.predioLocalizado = novoPredioLocalizado;
    }
    
    public int getAndarSala(){
        return this.andarSala;
    }
    
    public void setAndarSala(int novoAndarSala){
        this.andarSala = novoAndarSala;
    }
}
