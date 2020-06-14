package Utils;

import javax.swing.JOptionPane;

public class Alerta {
    public final static String tituloError = "Alerta de erro!";
    public final static String tituloSucesso = "Ação concluída com sucesso";
    
    public static void display(String mensagem, String titulo, int tipo ) {
        JOptionPane.showMessageDialog(null, mensagem, titulo, tipo);
    }
}
