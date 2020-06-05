package models;

import java.util.HashSet;
import java.util.Set;

public class Marca {
    //Variables
    private int idMarca;
    private String descricao;
    private Set<Modelo> modelos;

    //Constructor - Loaded and Empty
    public Marca(int idMarca, String descricao, Set<Modelo> modelos) {
        this.idMarca = idMarca;
        this.descricao = descricao;
        this.modelos = modelos;
    }

    public Marca() { modelos = new HashSet<>(); }

    //Getters and Setters
    public int getIdMarca() { return idMarca; }

    public void setIdMarca(int idMarca) { this.idMarca = idMarca; }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Set<Modelo> getModelos() { return modelos; }

    public void setModelos(Set<Modelo> modelos) { this.modelos = modelos; }

    //Methods
    public void adicionarModelo(Modelo modelo){ modelos.add(modelo); }
    //toString should return an object similar to a JSON file
    @Override
    public String toString() {
        return "Marca{" + "id=" + idMarca + ", descricao=" + descricao + ", modelos=" + modelos + '}';
    }
}
