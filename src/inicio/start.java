/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inicio;
import javax.swing.JOptionPane;
import conexao.ConexaoSql;

/**
 *
 * @author pedro
 */
public class start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        acesso ace = new acesso();
        ace.efetuarLogin();
        ace.setLogin("teste");
        ace.setSenha("teste");
        //ConexaoSql c  = new ConexaoSql();
        //c.getConexao();
        JOptionPane.showMessageDialog(null,"Fim de Programa!");
    }
    
}
