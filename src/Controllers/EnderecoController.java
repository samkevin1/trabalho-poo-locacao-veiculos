package Controllers;

import DAO.JDBC.EnderecoJDBC;
import Models.Endereco;
import java.sql.SQLException;

public class EnderecoController {
    EnderecoJDBC contexto = null;
   
    public EnderecoController() throws ClassNotFoundException, SQLException {
        this.contexto = new EnderecoJDBC();
    }
    
    public boolean salvar(Endereco endereco) {
        if(contexto.salvar(endereco)){
            return true;
        } else {
            return false;
        }
    }
}
