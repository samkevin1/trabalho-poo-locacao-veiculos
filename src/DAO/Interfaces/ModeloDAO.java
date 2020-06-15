package DAO.Interfaces;

import Models.Modelo;

public interface ModeloDAO {
    public Modelo obterPorChavePrimaria(int id);
    public Boolean salvar(Modelo modelo);
}
