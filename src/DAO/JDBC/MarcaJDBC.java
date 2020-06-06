package DAO.JDBC;

import DAO.Interfaces.MarcaDAO;
import Models.Marca;
import Services.DatabaseService;
import java.sql.SQLException;

public class MarcaJDBC extends DatabaseService implements MarcaDAO{ 
    public MarcaJDBC() throws ClassNotFoundException, SQLException {
    }

    @Override
    public Marca obterPorChavePrimaria(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
