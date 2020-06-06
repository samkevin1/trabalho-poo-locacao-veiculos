package DAO.JDBC;

import DAO.Interfaces.ClienteDAO;
import DAO.Tabelas.Tabelas;
import Models.Cliente;
import Services.DatabaseService;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteJDBC extends DatabaseService implements ClienteDAO{

    public ClienteJDBC() throws ClassNotFoundException, SQLException {
    }
    
    @Override
    public List<Cliente> consultar(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cadastrar(Cliente cliente) {
        PreparedStatement pstm = null;
        try {
            final String insertSqlString = "insert into "+Tabelas.cliente+" (nome, sobrenome, cpf, cnh, telefone) values(?)";
            
            pstm = contexto.prepareStatement(insertSqlString);
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getSobrenome());
            pstm.setString(3, cliente.getCpf());
            pstm.setString(4, cliente.getCnh());
            pstm.setString(5, cliente.getTelefone());
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(AutomovelJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    @Override
    public void editar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
