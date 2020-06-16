package Controllers;

import DAO.JDBC.LocacaoJDBC;
import Models.Locacao;
import java.sql.SQLException;
import java.util.List;

public class LocacaoController {
    LocacaoJDBC contexto = null;
    
    public LocacaoController() throws ClassNotFoundException, SQLException {
        this.contexto = new LocacaoJDBC();
    }
    
    public Boolean salvar(Locacao locacao) {
        if(contexto.salvar(locacao)){
            return true;
        } else {
            return false;
        }
    }
    
    public List<Locacao> obterTodos() {
        return this.contexto.obterTodos();
    }
    
    public Boolean registraDevolucao(int id) {
        return this.contexto.registrarDevolucao(id);
    }
    
    
}
