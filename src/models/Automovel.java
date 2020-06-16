package Models;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Automovel {
    //Variables
    private int id;
    private String placa;
    private String renavam;
    private String chassi;
    private float valorLocacao;
    private String cor;
    private String tipoCombustivel;
    private int idModelo;
    private Set<Models.Locacao> locacoes;

    public Automovel(String placa, String renavam, String chassi,
                     float valorLocacao, String cor, String tipoCombustivel,
                     int idModelo) {
        this.placa = placa;
        this.renavam = renavam;
        this.chassi = chassi;
        this.valorLocacao = valorLocacao;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
        this.idModelo = idModelo;
    }

    public Automovel(int id, String placa, String renavam, String chassi,
                     float valorLocacao, String cor, String tipoCombustivel,
                     int idModelo) {
        this.id = id;
        this.placa = placa;
        this.renavam = renavam;
        this.chassi = chassi;
        this.valorLocacao = valorLocacao;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
        this.idModelo = idModelo;
    }

    public Automovel() { locacoes = new HashSet<>(); }

    public Automovel(int id, String descricao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Getters and setters

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public Set<Models.Locacao> getLocacoes() { return this.locacoes; }

    public void setLocacoes(Set<Models.Locacao> locacoes) { this.locacoes = locacoes; }

    public String getPlaca() { return placa; }

    public void setPlaca(String placa) { this.placa = placa; }

    public String getRenavam() { return renavam; }

    public void setRenavam(String renavam) { this.renavam = renavam; }

    public String getChassi() { return this.chassi; }

    public void setChassi(String chassi) { this.chassi = chassi; }

    public float getValorLocacao() { return this.valorLocacao; }

    public void setValorLocacao(float valor) { this.valorLocacao = valor; }

    public String getCor() { return this.cor; }

    public void setCor(String cor) { this.cor = cor; }

    public String getTipoCombustivel() { return this.tipoCombustivel; }

    public void setTipoCombustivel(String tipoCombustivel) { this.tipoCombustivel = tipoCombustivel; }

    public int getIdModelo() { return this.idModelo; }

    public void setIdModelo(int id) { this.idModelo = id; }

    //Methods
    public void adicionarLocacao(Models.Locacao locacao){ locacoes.add(locacao); }

    //toString should return an object similar to a JSON file
    @Override
    public String toString() {
        return "{" + "id:" + id + ", placa:" + placa + ", renavam:" + renavam +
                ", chassi:"+ chassi + ", valor locacao:"+ valorLocacao + ", cor:" + cor +
                ", tipo combustivel:" + tipoCombustivel + ", idModelo:" + idModelo +"}\n";
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
        final Automovel other = (Automovel) obj;
        return Objects.equals(this.id, other.id);
    }
}
