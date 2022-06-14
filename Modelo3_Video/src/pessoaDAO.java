
import javax.swing.JOptionPane;


public class pessoaDAO {
 
    public void imprimirPessoa(pessoaDTO objpessoaDTO){
        String nome;
        nome = objpessoaDTO.getNome();
        
        JOptionPane.showMessageDialog(null, nome);
    }
    
    
    
}
