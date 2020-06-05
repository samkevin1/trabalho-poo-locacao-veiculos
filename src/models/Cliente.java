package models;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    //Variables
    private int idCliente;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String cnh;
    private String telefone;
    private Set<Locacao> locacoes;
    private Set<Endereco> enderecos;

    //Constructor - Loaded and Empty
    public Cliente() { locacoes = new HashSet<>(); enderecos = new HashSet<>(); }

    public Cliente(int idCliente, String nome, String sobrenome, String cpf, String cnh, String telefone) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.cnh = cnh;
        this.telefone = telefone;
    }

    //Getters and Setters
    public int getIdCliente() { return idCliente; }

    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getSobrenome() { return sobrenome; }

    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }

    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getCnh() { return cnh; }

    public void setCnh(String cnh) { this.cnh = cnh; }

    public String getTelefone() { return telefone; }

    public void setTelefone(String telefone) { this.telefone = telefone; }

    //Methods
    public void adicionarLocacao(Locacao locacao){ locacoes.add(locacao); }

    public void adicionarEndereco(Endereco endereco) { enderecos.add(endereco); }

    //toString should return an object similar to a JSON file
    @Override
    public String toString() {
        return "Cliente{" + "id=" + idCliente + ", nome=" + nome + ", sobrenome=" + sobrenome + ", cpf="+ cpf +
                ", cnh="+ cnh + ", telefone=" + telefone + ", locacoes=" + locacoes + ", enderecos=" + enderecos + '}';
    }
}
