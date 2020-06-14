package DAO.Interfaces;

import Models.Marca;

public interface MarcaDAO {
    public Marca obterPorChavePrimaria(int id);
    public Boolean salvar(Marca marca);
}
