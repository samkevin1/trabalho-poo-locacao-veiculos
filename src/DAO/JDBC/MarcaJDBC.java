package DAO.JDBC;

import DAO.Interfaces.MarcaDAO;
import DAO.Tabelas.Tabelas;
import Models.Marca;
import Services.DatabaseService;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MarcaJDBC extends DatabaseService implements MarcaDAO{ 
    public MarcaJDBC() throws ClassNotFoundException, SQLException {
    }
    public Boolean salvar(Marca marca) {
        PreparedStatement pstm = null;
        try {
            final String insertSqlString = "insert into "+Tabelas.marca+" ( descricao) values(?)";
            
            pstm = contexto.prepareStatement(insertSqlString);
            pstm.setString(1, marca.getDescricao());
            pstm.executeUpdate();
            pstm.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MarcaJDBC.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
