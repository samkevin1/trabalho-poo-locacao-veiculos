package DAO.Interfaces;

import Models.Locacao;
import java.util.List;

public interface LocacaoDAO {
    public Boolean salvar(Locacao locacao);
    public void registrarDevolucao(int devolucao);
    public List<Locacao> obterTodos();
}
