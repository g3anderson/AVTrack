
package Classes;

public class Equipamentos {
    
    private int idEquipamentos, idPessoa, idEmprestimo, patrimonio;
    private String nome,tipo,modelo,marca,dataFabricacao,dataCompra,localizacao;
    private boolean status;

    public Equipamentos(int idEquipamentos, int idPessoa, int idEmprestimo, int patrimonio, String nome, String tipo, String modelo, String marca, String dataFabricacao, String dataCompra, String localizacao, boolean status) {
        this.idEquipamentos = idEquipamentos;
        this.idPessoa = idPessoa;
        this.idEmprestimo = idEmprestimo;
        this.patrimonio = patrimonio;
        this.nome = nome;
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
        this.dataFabricacao = dataFabricacao;
        this.dataCompra = dataCompra;
        this.localizacao = localizacao;
        this.status = status;
    }

    public int getIdEquipamentos() {
        return idEquipamentos;
    }

    public void setIdEquipamentos(int idEquipamentos) {
        this.idEquipamentos = idEquipamentos;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public int getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(int patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}   