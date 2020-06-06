package DAO.JDBC;

import DAO.Interfaces.AutomovelDAO;
import DAO.Interfaces.AutomovelDAO;
import DAO.Tabelas.Tabelas;
import Models.Automovel;
import Services.DatabaseService;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AutomovelJDBC extends DatabaseService implements AutomovelDAO{

    public AutomovelJDBC() throws ClassNotFoundException, SQLException {
    }
    
    @Override
    public List<Automovel> consultar(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cadastrar(Automovel automovel) {
        PreparedStatement pstm = null;
        
        try {
            final String insertString = "insert into "+Tabelas.automovel+" (placa, renavam, chassi, valorLocacao, cor, tipoCombustivel, idModelo) values(?)";
            
            pstm = contexto.prepareStatement(insertString);
            pstm.setString(1, automovel.getPlaca());
            pstm.setString(2, automovel.getRenavam());
            pstm.setString(3, automovel.getChassi());
            pstm.setDouble(4, automovel.getValorLocacao());
            pstm.setString(4, automovel.getCor());
            pstm.setString(5, automovel.getTipoCombustivel());
            pstm.setLong(6, automovel.getIdModelo());
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(AutomovelJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }

    @Override
    public void editar(Automovel automovel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Automovel automovel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
