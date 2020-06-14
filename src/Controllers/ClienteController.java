package Controllers;

import DAO.JDBC.ClienteJDBC;
import Models.Cliente;
import java.sql.SQLException;

public class ClienteController {
    ClienteJDBC contexto = null;
    
    public ClienteController() throws ClassNotFoundException, SQLException {
        this.contexto = new ClienteJDBC();
    }
    
    public Boolean salvar(Cliente cliente) {
        if(contexto.salvar(cliente)){
            return true;
        } else {
            return false;
        }
    }
    
}
