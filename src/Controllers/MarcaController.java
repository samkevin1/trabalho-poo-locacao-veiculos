package Controllers;

import DAO.JDBC.MarcaJDBC;
import Models.Marca;
import java.sql.SQLException;

public class MarcaController {
    MarcaJDBC contexto = null;
   
    public MarcaController() throws ClassNotFoundException, SQLException {
        this.contexto = new MarcaJDBC();
    }
    
    public boolean salvar(Marca marca) {
        if(contexto.salvar(marca)){
            return true;
        } else {
            return false;
        }
    }
}
