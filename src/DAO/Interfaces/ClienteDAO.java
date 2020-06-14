package DAO.Interfaces;

import Models.Cliente;
import java.util.List;

public interface ClienteDAO {
    public List<Cliente> consultar(String nome);
    public Boolean salvar(Cliente cliente);
    public void editar(Cliente cliente);
    public void remover(Cliente cliente);
}
