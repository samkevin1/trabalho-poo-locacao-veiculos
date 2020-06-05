package models;

import java.util.Objects;

public class Modelo {
    //Variables
    private int idModelo;
    private String descricao;
    private int marca_idMarca;

    //Constructor - Loaded and Empty
    public Modelo(int idModelo, String descricao, int marca_idMarca) {
        this.idModelo = idModelo;
        this.descricao = descricao;
        this.marca_idMarca = marca_idMarca;
    }

    public Modelo() {
    }

    //Getters and Setters
    public int getIdModelo() { return idModelo; }

    public void setIdModelo(int idModelo) { this.idModelo = idModelo; }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }

    public int getMarca_idMarca() { return marca_idMarca; }

    public void setMarca_idMarca(int marca_idMarca) { this.marca_idMarca = marca_idMarca; }

    //Methods
    //toString should return an object similar to a JSON file
    @Override
    public String toString() {
        return "Modelo{" + "id=" + idModelo + ", descricao=" + descricao + ", Marca_idMarca=" + marca_idMarca + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(idModelo);
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
        final Modelo other = (Modelo) obj;
        return Objects.equals(this.idModelo, other.idModelo);
    }
}
