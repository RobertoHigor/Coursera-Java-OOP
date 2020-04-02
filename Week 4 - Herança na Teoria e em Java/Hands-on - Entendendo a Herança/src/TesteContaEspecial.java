import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteContaEspecial extends TesteContaCorrente{
	
	@Before
	public void inicalizaConta(){
		cc = new ContaEspecial(100);
		cc.depositar(200);
	}
	
	@Test
	public void sacarSemSaldo(){		
		int valorSacado = cc.sacar(350);		
		assertEquals(200, cc.saldo);
		assertEquals(0, valorSacado);
	}
	
	@Test
	public void sacarLimite(){		
		int valorSacado = cc.sacar(250);		
		assertEquals(-50, cc.saldo);
		assertEquals(250, valorSacado);
	}

}
