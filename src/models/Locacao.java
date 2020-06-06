package Models;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Locacao {
    private int id;
    private Date dtLocacao;
    private Date dtDevolucao;
    private float km;
    private float valorLocacao;
    private float valorKm;
    private float valorTotal;
    private boolean devolvido;
    private float bonus;
    private int idCliente;
    private int idAutomovel;

    //Constructor - Loaded and empty
    public Locacao() {
    }

    public Locacao(int id, Date dtLocacao,  Date dtDevolucao, int km,
                   float valorLocacao, float valorKm, float valorTotal, boolean devolvido, int bonus) {
        this.id = id;
        this.dtLocacao = dtLocacao;
        this.dtDevolucao = dtDevolucao;
        this.km = km;
        this.valorLocacao = valorLocacao;
        this.valorKm = valorKm;
        this.valorTotal = valorTotal;
        this.devolvido = devolvido;
        this.bonus = bonus;
    }

    //Getters and Setters
    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    public Date getDataLocacao() { return this.dtLocacao; }

    public void setDataLocacao(Date dtLocacao) { this.dtLocacao = dtLocacao; }

    public Date getDataDevolucao() { return dtDevolucao; }

    public void setDataDevolucao(Date dtDevolucao) { this.dtDevolucao = dtDevolucao; }

    public float getKm() { return this.km; }

    public void setKm(float km) { this.km = km; }

    public float getValorLocalcao() { return this.valorLocacao; }

    public void setValorLocacao(float valorLocacao) { this.valorLocacao = valorLocacao; }

    public float getValorKm() { return valorKm; }

    public void setValorKm(float valor) { this.valorKm = valor; }

    public float getValorTotal() { return valorTotal; }

    public void setValorTotal(float valor) { this.valorTotal = valor; }

    public boolean getDevolvido() { return this.devolvido; }

    public void setDevolvido(boolean devolvido) { this.devolvido = devolvido; }

    public float getBonus() { return this.bonus; }

    public void setBonus(float bonus) { this.bonus = bonus; }

    public int getIdCliente() { return this.idCliente; }

    public void setIdCliente(int id) { this.idCliente = id; }

    public int getIdAutomovel() { return this.idAutomovel; }

    public void setIdAutomovel(int id) { this.idAutomovel = id; }

    //Methods

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
        final Locacao other = (Locacao) obj;
        return Objects.equals(this.id, other.id);
    }
}
