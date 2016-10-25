package testeEntidade;

import entidade.Pessoa;

import static junit.framework.Assert.assertNotNull;
import org.junit.Test;
public class PessoaTeste {
     
    @Test
    public void testeConstrutorPessoa() {
        String nome = null;
        long telefone = 123456789;
        
        Pessoa pessoa = new Pessoa(nome, telefone);
        
        assertNotNull(pessoa.getNome());
    }
    
}
