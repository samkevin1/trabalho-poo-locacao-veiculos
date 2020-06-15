package DAO.JDBC;

import DAO.Interfaces.EnderecoDAO;
import DAO.Tabelas.Tabelas;
import Models.Endereco;
import Services.DatabaseService;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnderecoJDBC extends DatabaseService implements EnderecoDAO{
    
    public EnderecoJDBC() throws ClassNotFoundException, SQLException {
    }
    
    @Override
    public Boolean salvar(Endereco endereco) {
        PreparedStatement pstm = null;
        try {
            final String insertSqlString = "insert into "+Tabelas.endereco+" (cep, logradouro, numero, bairro, cidade, pais, idCliente) values(?)";
            
            pstm = contexto.prepareStatement(insertSqlString);
            pstm.setString(1, endereco.getCep());
            pstm.setString(2, endereco.getLogradouro());
            pstm.setInt(3, endereco.getNumero());
            pstm.setString(4, endereco.getBairro());
            pstm.setString(5, endereco.getCidade());
            pstm.setString(6, endereco.getPais());
            pstm.setInt(7, endereco.getIdCliente());
            pstm.executeUpdate();
            pstm.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AutomovelJDBC.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }  
    }
    
}
