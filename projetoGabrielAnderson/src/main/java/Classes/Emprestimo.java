
package Classes;

public class Emprestimo {
    
    private int idPessoa, idEquipamento, patrimonio;
    private String dataEmprestimo, dataRetorno;
    private boolean status;

    public Emprestimo(int idPessoa, int idEquipamento, int patrimonio) {
        this.idPessoa = idPessoa;
        this.idEquipamento = idEquipamento;
        this.patrimonio = patrimonio;
        this.dataEmprestimo = null;
        this.dataRetorno = null;
        this.status = true;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public int getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(int idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public int getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(int patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(String dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
