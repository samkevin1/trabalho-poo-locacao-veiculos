package Controllers;

import DAO.JDBC.ModeloJDBC;
import Models.Modelo;
import java.sql.SQLException;

public class ModeloController {
    ModeloJDBC contexto = null;
   
    public ModeloController() throws ClassNotFoundException, SQLException {
        this.contexto = new ModeloJDBC();
    }
    
    public boolean salvar(Modelo modelo) {
        if(contexto.salvar(modelo)){
            return true;
        } else {
            return false;
        }
    }
}
