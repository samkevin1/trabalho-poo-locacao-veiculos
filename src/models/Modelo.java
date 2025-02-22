package Models;

import java.util.Objects;

public class Modelo {
    //Variables
    private int id;
    private String descricao;
    private int idMarca;

    //Constructor - Loaded and Empty
    public Modelo(String descricao, int idMarca) {
        this.descricao = descricao;
        this.idMarca = idMarca;
    }

    public Modelo(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    //Getters and Setters
    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    public String getDescricao() { return this.descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }

    public int getIdMarca() { return this.idMarca; }

    public void setIdMarca(int id) { this.idMarca = id; }

    //Methods
    //toString should return an object similar to a JSON file
    @Override
    public String toString() {
        return "{" + "id:" + id + ", descricao:" + descricao + ", idMarca:" + idMarca + "}\n";
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
        final Modelo other = (Modelo) obj;
        return Objects.equals(this.id, other.id);
    }
}
