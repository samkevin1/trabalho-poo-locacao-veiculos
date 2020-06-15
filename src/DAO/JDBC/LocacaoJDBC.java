package DAO.JDBC;

import DAO.Interfaces.LocacaoDAO;
import DAO.Tabelas.Tabelas;
import Models.Locacao;
import Services.DatabaseService;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LocacaoJDBC extends DatabaseService implements LocacaoDAO{
    public LocacaoJDBC() throws ClassNotFoundException, SQLException {
    }

    @Override
    public Boolean salvar(Locacao locacao) {
        PreparedStatement pstm = null;
        try {
            final String insertSqlString = "insert into "+Tabelas.locacao+" (dtLocacao, dtDevolucao, km, valorLocacao, valorKm, valorTotal, devolvido, bonus, idCliente, idAutomovel) values(?,?,?,?,?,?,?,?,?,?)";
            Date dataLocacao = (Date) locacao.getDataLocacao();
            java.sql.Date dateLocacaoFormatado =  new java.sql.Date (dataLocacao.getTime());
            Date dataDevolucao = (Date) locacao.getDataDevolucao();
            java.sql.Date dateDevolucaoFormatado =  new java.sql.Date (dataDevolucao.getTime());

            pstm = contexto.prepareStatement(insertSqlString);
            pstm.setDate(1, dateLocacaoFormatado);
            pstm.setDate(2, dateDevolucaoFormatado);
            pstm.setFloat(3, locacao.getKm());
            pstm.setFloat(4, locacao.getValorLocalcao());
            pstm.setFloat(5, locacao.getValorKm());
            pstm.setFloat(6, locacao.getValorTotal());
            pstm.setBoolean(7, locacao.getDevolvido());
            pstm.setFloat(8, locacao.getBonus());
            pstm.setInt(9, locacao.getIdCliente());
            pstm.setInt(10, locacao.getIdAutomovel());
            pstm.executeUpdate();
            pstm.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AutomovelJDBC.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }

    @Override
    public void registrarDevolucao(int idLocacao) {
        try {
            Statement stmt = contexto.createStatement();
            final String sqlString = "UPDATE "+Tabelas.locacao+" SET devolucao='true' where id='"+idLocacao+"'";
            stmt.executeUpdate(sqlString); 
        } catch (SQLException ex) {
            Logger.getLogger(LocacaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public List<Locacao> obterTodos() {
        List locacoes = new ArrayList<Locacao>();
        
        try {
            Statement stmt = contexto.createStatement();
            ResultSet rs;
            final String sqlString = "SELECT * from "+Tabelas.locacao+"";
            rs = stmt.executeQuery(sqlString);
            while (rs.next()) {
                int id = Integer.parseInt(rs.getString("id"));
                float valorKm = Float.parseFloat(rs.getString("valorKm"));
                float km = Float.parseFloat(rs.getString("km"));
                Locacao locacao = new Locacao(id, valorKm, km);
                locacoes.add(locacao);
            }
            return locacoes;
            
        } catch (SQLException ex) {
            Logger.getLogger(LocacaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
