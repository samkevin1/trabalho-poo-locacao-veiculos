package DAO.JDBC;

import DAO.Interfaces.ModeloDAO;
import DAO.Tabelas.Tabelas;
import Models.Modelo;
import Services.DatabaseService;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloJDBC extends DatabaseService implements ModeloDAO{
    public ModeloJDBC() throws ClassNotFoundException, SQLException {
    }

    
    
    @Override
    public Modelo obterPorChavePrimaria(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean salvar(Modelo modelo) {
        PreparedStatement pstm = null;
        try {
            final String insertSqlString = "insert into "+Tabelas.modelo+" (descricao, idMarca) values(?)";
            
            pstm = contexto.prepareStatement(insertSqlString);
            pstm.setString(1, modelo.getDescricao());
            pstm.setInt(2, modelo.getIdMarca());
            pstm.executeUpdate();
            pstm.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloJDBC.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
