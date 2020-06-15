package Controllers;

import DAO.JDBC.LocacaoJDBC;
import Models.Locacao;
import java.sql.SQLException;

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
}
