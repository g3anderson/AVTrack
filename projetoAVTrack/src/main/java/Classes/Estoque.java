package Classes;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Estoque {
 
    private HashMap<Integer, Equipamentos> todosEquipamentos;

    public Estoque() {
        this.todosEquipamentos = new HashMap<>();
    }
    
    public void adicionarEquipamento(int patrimonio, Equipamentos equipamento){
        this.todosEquipamentos.put(patrimonio, equipamento);       
    }
    
    public void removerEquipamento(int patrimonio){
        this.todosEquipamentos.remove(patrimonio);
    }
    
    public Equipamentos buscarEquipamento(int patrimonio){
        Equipamentos equipamentoBuscado = this.todosEquipamentos.get(patrimonio);
        return equipamentoBuscado;
    
    }
    
    public void listarEquipamentos(){      
        for(Equipamentos equipamento : todosEquipamentos.values()){
            JOptionPane.showMessageDialog(null, equipamento);   
        }
    }
    
    public void editarMarca(int patrimonio, String novaMarca){
         Equipamentos equipamentoBuscado = this.todosEquipamentos.get(patrimonio);    
         equipamentoBuscado.setMarca(novaMarca);
    }
    
    public void editarModelo(int patrimonio, String novoModelo){
         Equipamentos equipamentoBuscado = this.todosEquipamentos.get(patrimonio);    
         equipamentoBuscado.setModelo(novoModelo);
    }
    
    public void editarDataFabricacao(int patrimonio, String novaDataFabricacao){
        Equipamentos equipamentoBuscado = this.todosEquipamentos.get(patrimonio);
        equipamentoBuscado.setDataFabricacao(novaDataFabricacao);
    }
    
    public void editarDataCompra(int patrimonio, String novaDataCompra){
        Equipamentos equipamentoBuscado = this.todosEquipamentos.get(patrimonio);
        equipamentoBuscado.setDataCompra(novaDataCompra);
    }
    
    public void editarLocalizacao(int patrimonio, String novaLocalizacao){
        Equipamentos equipamentoBuscado = this.todosEquipamentos.get(patrimonio);
        equipamentoBuscado.setLocalizacao(novaLocalizacao);
    }
}