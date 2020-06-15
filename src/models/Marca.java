package Models;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Marca {
    //Variables
    private int id;
    private String nome;
    private String descricao;
    private Set<Modelo> modelos;

    //Constructor - Loaded and Empty
    public Marca(String descricao) {
        this.descricao = descricao;
    }

    public Marca(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Marca() { modelos = new HashSet<>(); }

    //Getters and Setters
    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    public String getDescricao() { return this.descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Set<Modelo> getModelos() { return this.modelos; }

    public void setModelos(Set<Modelo> modelos) { this.modelos = modelos; }

    //Methods
    public void adicionarModelo(Modelo modelo){ modelos.add(modelo); }
    //toString should return an object similar to a JSON file
    @Override
    public String toString() {
        return "Marca{" + "id=" + id + ", descricao=" + descricao + ", modelos=" + modelos + '}';
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
        final Marca other = (Marca) obj;
        return Objects.equals(this.id, other.id);
    }
}
