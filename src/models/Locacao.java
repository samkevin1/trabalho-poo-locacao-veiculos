package models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Locacao {
    //Variables
    private int id;
    private LocalDateTime dtLocacao;
    private LocalDateTime dtDevolucao;
    private float km;
    private float valorLocacao;
    private float valorKm;
    private float valorTotal;
    private int devolucao;
    private float bonus;
    private int idCliente;
    private int idAutomovel;

    //Constructor - Loaded and empty
    public Locacao() {
    }

    public Locacao(int id, LocalDateTime dtLocacao,  LocalDateTime dtDevolucao, int km,
                   float valorLocacao, float valorKm, float valorTotal, int devolucao, int bonus) {
        this.id = id;
        this.dtLocacao = dtLocacao;
        this.dtDevolucao = dtDevolucao;
        this.km = km;
        this.valorLocacao = valorLocacao;
        this.valorKm = valorkm;
        this.valorTotal = valorTotal;
        this.devolucao = devolucao;
        this.bonus = bonus;
    }

    //Getters and Setters
    public int getId() { return idLocacao; }

    public void setId(int id) { this.id = id; }

    public LocalDateTime getDataLocacao() { return this.dtLocacao; }

    public void setDataLocacao(LocalDateTime dtLocacao) { this.dtLocacao = dtLocacao; }

    public LocalDateTime getDataDevolucao() { return dtDevolucao; }

    public void setDataDevolucao(LocalDateTime dtDevolucao) { this.dt_devolucao = dt_devolucao; }

    public float getKm() { return this.km; }

    public void setKm(float km) { this.km = km; }

    public float getValorLocalcao() { return this.valorLocacao; }

    public void setValorLocacao(float valorLocacao) { this.valorLocacao = valorLocacao; }

    public float getValorKm() { return valorKm; }

    public void setValorKm(float valor) { this.valorKm = valor; }

    public float getValorTotal() { return valorTotal; }

    public void setValorTotal(float valor) { this.valorTotal = valor; }

    public int getDevolucao() { return devolucao; }

    public void setDevolucao(int devolucao) { this.devolucao = devolucao; }

    public float getBonus() { return this.bonus; }

    public void setBonus(float bonus) { this.bonus = bonus; }

    public int getIdCliente() { return this.idCliente; }

    public void setIdCliente(int id) { this.idCliente = id; }

    public int getIdAutomovel() { return this.idAutomovel; }

    public void setIdAutomovel(int id) { this.idAutomovel = id; }

    //Methods

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
