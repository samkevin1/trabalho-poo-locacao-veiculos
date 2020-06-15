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
    public Boolean salvar(Automovel automovel) {
        PreparedStatement pstm = null;
        
        try {
            final String insertSqlString = "insert into "+Tabelas.automovel+" (placa, renavam, chassi, valor_locacao, cor, tipo_combustivel, Modelo_idModelo) values(?,?,?,?,?,?,?)";
            
            pstm = contexto.prepareStatement(insertSqlString);
            pstm.setString(1, automovel.getPlaca());
            pstm.setString(2, automovel.getRenavam());
            pstm.setString(3, automovel.getChassi());
            pstm.setDouble(4, automovel.getValorLocacao());
            pstm.setString(5, automovel.getCor());
            pstm.setString(6, automovel.getTipoCombustivel());
            pstm.setLong(7, automovel.getIdModelo());
            pstm.executeUpdate();
            pstm.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AutomovelJDBC.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            
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
