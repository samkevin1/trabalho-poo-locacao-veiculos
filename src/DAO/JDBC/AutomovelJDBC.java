package DAO.JDBC;

import DAO.Interfaces.AutomovelDAO;
import DAO.Interfaces.AutomovelDAO;
import DAO.Tabelas.Tabelas;
import Models.Automovel;
import Models.Locacao;
import Services.DatabaseService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AutomovelJDBC extends DatabaseService implements AutomovelDAO{

    public AutomovelJDBC() throws ClassNotFoundException, SQLException {
    }
    
    @Override
    public List<Automovel> consultar(String nome) {
        List automoveis = new ArrayList<Automovel>();
        try {
            Statement stmt = contexto.createStatement();
            ResultSet rs;
            final String sqlString = "SELECT * from "+Tabelas.locacao+" where nome='"+nome+"'";
            rs = stmt.executeQuery(sqlString);
            while (rs.next()) {
                int id = Integer.parseInt(rs.getString("id"));
                String placa = rs.getString("placa");
                String chassi = rs.getString("chassi");
                float valorLocacao = Float.parseFloat(rs.getString("valorLocacao"));
                Automovel automovel = new Automovel(id, placa, chassi, valorLocacao);
                automoveis.add(automovel);
            }
            return automoveis;
            
        } catch (SQLException ex) {
            Logger.getLogger(LocacaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
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
   
}
