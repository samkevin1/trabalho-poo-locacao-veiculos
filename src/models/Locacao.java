package Models;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Locacao {
    private int id;
    private java.sql.Date dtLocacao;
    private java.sql.Date dtDevolucao;
    private float km;
    private float valorLocacao;
    private float valorKm;
    private float valorTotal;
    private boolean devolvido;
    private float bonus;
    private int idCliente;
    private int idAutomovel;

    //Constructor - Loaded and empty
    public Locacao(int id, float valorKm, float km) {
        this.valorKm = valorKm;
        this.km = km;
        this.id = id;
        this.valorLocacao = km * valorKm;
    }

    public Locacao( float km, float valorLocacao, float valorKm, float bonus, int idCliente, int idAutomovel) {
        this.idAutomovel = idAutomovel;
        this.idCliente = idCliente;
        this.dtLocacao = new java.sql.Date(new Date().getTime());
        this.dtDevolucao = new java.sql.Date(new Date().getTime());
        this.km = km;
        this.valorLocacao = valorLocacao;
        this.valorKm = valorKm;
        this.valorTotal = km * valorKm;
<<<<<<< HEAD
        this.devolvido = false;
=======
        this.devolvido = devolvido;
>>>>>>> ba66a8a25b2ff123b8489e7ace66f1d9481b2e05
        this.bonus = bonus;
    }

    //Getters and Setters
    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    public java.sql.Date getDataLocacao() { return this.dtLocacao; }

    public void setDataLocacao(java.sql.Date dtLocacao) { this.dtLocacao = dtLocacao; }

    public java.sql.Date getDataDevolucao() { return dtDevolucao; }

    public void setDataDevolucao(java.sql.Date dtDevolucao) { this.dtDevolucao = dtDevolucao; }

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
    public String toString() {
        return "Locacao{" + "id=" + id + ", dt_locacao=" + dtLocacao + ", dt_devolucao=" + dtDevolucao + ", km="+ km +
                ", valor_km="+ valorKm + ", devolucao=" + devolvido + ", bonus=" + bonus + ", valor_total=" + valorTotal +
                ", idCliente=" + idCliente +  ", idAutomovel=" + idAutomovel + "}\n";
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
        final Locacao other = (Locacao) obj;
        return Objects.equals(this.id, other.id);
    }
}
