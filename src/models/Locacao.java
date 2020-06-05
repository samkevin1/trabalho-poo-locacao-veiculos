package models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Locacao {
    //Variables
    private int idLocacao;
    private LocalDateTime dt_locacao;
    private LocalDateTime dt_devolucao;
    private int km;
    private float valor_calcao;
    private float valor_km;
    private float valor_total;
    private int devolucao;
    private int bonus;
    private int cliente_idCliente;
    private int automovel_idAutomovel;

    //Constructor - Loaded and empty
    public Locacao() {
    }

    public Locacao(int idLocacao, LocalDateTime dt_locacao,  LocalDateTime dt_devolucao, int km,
                   float valor_calcao, float valor_km, float valor_total, int devolucao, int bonus) {
        this.idLocacao = idLocacao;
        this.dt_locacao = dt_locacao;
        this.dt_devolucao = dt_devolucao;
        this.km = km;
        this.valor_calcao = valor_calcao;
        this.valor_km = valor_km;
        this.valor_total = valor_total;
        this.devolucao = devolucao;
        this.bonus = bonus;
    }

    //Getters and Setters
    public int getIdLocacao() { return idLocacao; }

    public void setIdLocacao(int idLocacao) { this.idLocacao = idLocacao; }

    public LocalDateTime getDt_locacao() { return dt_locacao; }

    public void setDt_locacao(LocalDateTime dt_locacao) { this.dt_locacao = dt_locacao; }

    public LocalDateTime getDt_devolucao() { return dt_devolucao; }

    public void setDt_devolucao(LocalDateTime dt_devolucao) { this.dt_devolucao = dt_devolucao; }

    public int getKm() { return km; }

    public void setKm(int km) { this.km = km; }

    public float getValor_calcao() { return valor_calcao; }

    public void setValor_calcao(float valor_calcao) { this.valor_calcao = valor_calcao; }

    public float getValor_km() { return valor_km; }

    public void setValor_km(float valor_km) { this.valor_km = valor_km; }

    public float getValor_total() { return valor_total; }

    public void setValor_total(float valor_total) { this.valor_total = valor_total; }

    public int getDevolucao() { return devolucao; }

    public void setDevolucao(int devolucao) { this.devolucao = devolucao; }

    public int getBonus() { return bonus; }

    public void setBonus(int bonus) { this.bonus = bonus; }

    public int getCliente_idCliente() { return cliente_idCliente; }

    public void setCliente_idCliente(int cliente_idCliente) { this.cliente_idCliente = cliente_idCliente; }

    public int getAutomovel_idAutomovel() { return automovel_idAutomovel; }

    public void setAutomovel_idAutomovel(int automovel_idAutomovel) { this.automovel_idAutomovel = automovel_idAutomovel; }

    //Methods

    //toString should return an object similar to a JSON file
    @Override
    public String toString() {
        return "Locacao{" + "id=" + idLocacao + ", dt_locacao=" + dt_locacao + ", dt_devolucao=" + dt_devolucao +
                ", km="+ km + ", valor_calcao="+ valor_calcao + ", valor_km=" + valor_km + ", devolucao=" + devolucao +
                ", bonus=" + bonus + ", valor_total=" + valor_total + ", Cliente_idCliente=" + cliente_idCliente +
                ", Automovel_idAutomovel=" + automovel_idAutomovel +'}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLocacao);
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
        final Locacao other = (Locacao) obj;
        return Objects.equals(this.idLocacao, other.idLocacao);
    }
}
