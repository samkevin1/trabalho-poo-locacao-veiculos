package Controllers;

import DAO.JDBC.AutomovelJDBC;
import Models.Automovel;
import java.sql.SQLException;

public class AutomovelController {
    AutomovelJDBC contexto = null;
   
    public AutomovelController() throws ClassNotFoundException, SQLException {
        this.contexto = new AutomovelJDBC();
    }
    
    public boolean salvar(Automovel automovel) {
        if(contexto.salvar(automovel)){
            return true;
        } else {
            return false;
        }
    }
}
