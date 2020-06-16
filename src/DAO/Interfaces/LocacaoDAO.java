package DAO.Interfaces;

import Models.Locacao;
import java.util.List;

public interface LocacaoDAO {
    public Boolean salvar(Locacao locacao);
    public Boolean registrarDevolucao(int idLocacao);
    public List<Locacao> obterTodos();
}
