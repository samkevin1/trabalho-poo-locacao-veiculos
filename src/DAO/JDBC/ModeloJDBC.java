package DAO.JDBC;

import DAO.Interfaces.ModeloDAO;
import DAO.Tabelas.Tabelas;
import Models.Automovel;
import Models.Modelo;
import Services.DatabaseService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloJDBC extends DatabaseService implements ModeloDAO{
    public ModeloJDBC() throws ClassNotFoundException, SQLException {
    }

    @Override
    public Boolean salvar(Modelo modelo) {
        PreparedStatement pstm = null;
        try {
            final String insertSqlString = "insert into "+Tabelas.modelo+" (descricao, Marca_idMarca) values(?,?)";
            
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

    @Override
    public List<Modelo> consultar(String descricao) {
        List modelos = new ArrayList<Modelo>();
        try {
            Statement stmt = contexto.createStatement();
            ResultSet rs;
            final String sqlString = "SELECT * from "+Tabelas.modelo+" where descricao='"+descricao+"'";
            rs = stmt.executeQuery(sqlString);
            while (rs.next()) {
                int id = Integer.parseInt(rs.getString("idModelo"));
                String descricaoModelo = rs.getString("descricao");
                Modelo modelo = new Modelo(id, descricaoModelo);
                modelos.add(modelo);
            }
            return modelos;
            
        } catch (SQLException ex) {
            Logger.getLogger(LocacaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
