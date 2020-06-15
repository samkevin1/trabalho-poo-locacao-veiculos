package DAO.JDBC;

import DAO.Interfaces.ClienteDAO;
import DAO.Tabelas.Tabelas;
import Models.Automovel;
import Models.Cliente;
import Services.DatabaseService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteJDBC extends DatabaseService implements ClienteDAO{

    public ClienteJDBC() throws ClassNotFoundException, SQLException {
    }
    
    @Override
    public List<Cliente> consultar(String nome) {
        List clientes = new ArrayList<Cliente>();
        try {
            Statement stmt = contexto.createStatement();
            ResultSet rs;
            final String sqlString = "SELECT * from "+Tabelas.cliente+" where nome='"+nome+"'";
            rs = stmt.executeQuery(sqlString);
            while (rs.next()) {
                int id = Integer.parseInt(rs.getString("id"));
                String nomeCliente = rs.getString("nome");
                String sobrenome = rs.getString("sobrenome");
                Cliente cliente = new Cliente(id, nomeCliente, sobrenome);
                clientes.add(cliente);
            }
            return clientes;
            
        } catch (SQLException ex) {
            Logger.getLogger(LocacaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        PreparedStatement pstm = null;
        try {
            final String insertSqlString = "insert into "+Tabelas.cliente+" (nome, sobrenome, cpf, cnh, telefone) values(?,?,?,?,?)";
            
            pstm = contexto.prepareStatement(insertSqlString);
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getSobrenome());
            pstm.setString(3, cliente.getCpf());
            pstm.setString(4, cliente.getCnh());
            pstm.setString(5, cliente.getTelefone());
            pstm.executeUpdate();
            pstm.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AutomovelJDBC.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }  
    }
    
}
