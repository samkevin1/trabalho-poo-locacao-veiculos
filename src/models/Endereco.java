package Models;

import java.util.Objects;

public class Endereco {
    //Variables
    private int id;
    private String cep;
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String pais;
    private int idCliente;

    //Constructor - Loaded and Empty
    public Endereco() {
    }

    public Endereco(int id, String cep, String logradouro, int numero, String bairro,
                    String cidade, String pais, int idCliente) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.pais = pais;
        this.idCliente = idCliente;
    }

    //Getters and Setters

    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    public String getCep() { return cep; }

    public void setCep(String cep) { this.cep = cep; }

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

    public int getIdCliente() { return this.idCliente; }

    public void setIdCliente(int id) { this.idCliente = idCliente; }

    //Methods
    //toString should return an object similar to a JSON file
    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", cep=" + cep + ", logradouro=" + logradouro +
                ", numero="+ numero + ", bairro="+ bairro + ", cidade=" + cidade +
                ", pais=" + pais + ", idCliente=" + idCliente + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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
        return Objects.equals(this.id, other.id);
    }
}
