package Controllers;

import DAO.JDBC.ClienteJDBC;
import Models.Cliente;
import Models.Modelo;
import java.sql.SQLException;
import java.util.List;

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
    
    public List<Cliente> consultar(String nome){
        return this.contexto.consultar(nome);
    }
    
}
