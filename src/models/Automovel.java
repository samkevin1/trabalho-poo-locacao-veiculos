package models;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Automovel {
    //Variables
    private int idAutomovel;
    private String placa;
    private String renavam;
    private String chassi;
    private float valor_locacao;
    private String cor;
    private String tipo_combustivel;
    private int model_idModelo;
    private Set<Locacao> locacoes;

    //Constructor - Loaded and only with locacao list

    public Automovel(int id, String placa, String renavam, String chassi,
                     float valor_locacao, String cor, String tipo_combustivel,
                     int model_idModelo, Set<Locacao> locacoes) {
        this.idAutomovel = id;
        this.placa = placa;
        this.renavam = renavam;
        this.chassi = chassi;
        this.valor_locacao = valor_locacao;
        this.cor = cor;
        this.tipo_combustivel = tipo_combustivel;
        this.model_idModelo = model_idModelo;
        this.locacoes = locacoes;
    }

    public Automovel() { locacoes = new HashSet<>(); }

    //Getters and setters

    public int getId() { return idAutomovel; }

    public void setId(int id) { this.idAutomovel = id; }

    public Set<Locacao> getLocacoes() { return locacoes; }

    public void setLocacoes(Set<Locacao> locacoes) { this.locacoes = locacoes; }

    public String getPlaca() { return placa; }

    public void setPlaca(String placa) { this.placa = placa; }

    public String getRenavam() { return renavam; }

    public void setRenavam(String renavam) { this.renavam = renavam; }

    public String getChassi() { return chassi; }

    public void setChassi(String chassi) { this.chassi = chassi; }

    public float getValor_locacao() { return valor_locacao; }

    public void setValor_locacao(float valor_locacao) { this.valor_locacao = valor_locacao; }

    public String getCor() { return cor; }

    public void setCor(String cor) { this.cor = cor; }

    public String getTipo_combustivel() { return tipo_combustivel; }

    public void setTipo_combustivel(String tipo_combustivel) { this.tipo_combustivel = tipo_combustivel; }

    public int getModel_idModelo() { return model_idModelo; }

    public void setModel_idModelo(int model_idModelo) { this.model_idModelo = model_idModelo; }

    //Methods
    public void adicionarLocacao(Locacao locacao){ locacoes.add(locacao); }

    //toString should return an object similar to a JSON file
    @Override
    public String toString() {
        return "Automovel{" + "id=" + idAutomovel + ", placa=" + placa + ", renavam=" + renavam +
                ", chassi="+ chassi + ", valor_locacao="+ valor_locacao + ", cor=" + cor +
                ", tipo_combustivel=" + tipo_combustivel + ", model_idModelo=" + model_idModelo +
                ", locacoes=" + locacoes + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAutomovel);
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
        return Objects.equals(this.idAutomovel, other.idAutomovel);
    }
}
