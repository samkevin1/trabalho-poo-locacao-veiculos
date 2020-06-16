package DAO.Interfaces;

import Models.Modelo;
import java.util.List;

public interface ModeloDAO {
    public Boolean salvar(Modelo modelo);
    public List<Modelo> consultar(String descricao);
}
