package models;

import java.util.Objects;

public class Endereco {
    //Variables
    private int idEndereco;
    private int cep;
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String pais;
    private int cliente_idCliente;

    //Constructor - Loaded and Empty
    public Endereco() {
    }

    public Endereco(int idEndereco, int cep, String logradouro, int numero, String bairro,
                    String cidade, String pais, int cliente_idCliente) {
        this.idEndereco = idEndereco;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.pais = pais;
        this.cliente_idCliente = cliente_idCliente;
    }

    //Getters and Setters

    public int getIdEndereco() { return idEndereco; }

    public void setIdEndereco(int idEndereco) { this.idEndereco = idEndereco; }

    public int getCep() { return cep; }

    public void setCep(int cep) { this.cep = cep; }

    public String getLogradouro() { return logradouro; }

    public void setLogradouro(String logradouro) { this.logradouro = logradouro; }

    public int getNumero() { return numero; }

    public void setNumero(int numero) { this.numero = numero; }

    public String getBairro() { return bairro; }

    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getCidade() { return cidade; }

    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getPais() { return pais; }

    public void setPais(String pais) { this.pais = pais; }

    public int getCliente_idCliente() { return cliente_idCliente; }

    public void setCliente_idCliente(int cliente_idCliente) { this.cliente_idCliente = cliente_idCliente; }

    //Methods
    //toString should return an object similar to a JSON file
    @Override
    public String toString() {
        return "Endereco{" + "id=" + idEndereco + ", cep=" + cep + ", logradouro=" + logradouro +
                ", numero="+ numero + ", bairro="+ bairro + ", cidade=" + cidade +
                ", pais=" + pais + ", Cliente_idCliente=" + cliente_idCliente + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEndereco);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Endereco other = (Endereco) obj;
        return Objects.equals(this.idEndereco, other.idEndereco);
    }
}
