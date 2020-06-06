package DAO.Interfaces;

import Models.Automovel;
import java.util.List;

public interface AutomovelDAO {
    public List<Automovel> consultar(String nome);
    public void cadastrar(Automovel automovel);
    public void editar(Automovel automovel);
    public void remover(Automovel automovel);
}
