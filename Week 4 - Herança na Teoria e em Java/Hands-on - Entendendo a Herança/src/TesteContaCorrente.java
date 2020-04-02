

 
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteContaCorrente {
	ContaCorrente cc;
	
	@Before
	public void inicalizaConta(){
		cc = new ContaCorrente();
		cc.depositar(200);
	}

	@Test
	public void deposita() {				
		assertEquals(200, cc.saldo);
	}
	
	@Test
	public void sacar(){	
		int valorSacado = cc.sacar(50);		
		assertEquals(150, cc.saldo);
		assertEquals(50, valorSacado);
	}
	
	@Test
	public void sacarSemSaldo(){		
		int valorSacado = cc.sacar(250);		
		assertEquals(200, cc.saldo);
		assertEquals(0, valorSacado);
	}

}
