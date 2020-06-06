package DAO.JDBC;

import DAO.Interfaces.ModeloDAO;
import Models.Modelo;
import Services.DatabaseService;
import java.sql.SQLException;

public class ModeloJDBC extends DatabaseService implements ModeloDAO{
    public ModeloJDBC() throws ClassNotFoundException, SQLException {
    }

    @Override
    public Modelo obterPorChavePrimaria(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
