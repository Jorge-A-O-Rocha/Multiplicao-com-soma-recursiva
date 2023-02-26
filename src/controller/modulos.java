package controller;

public class modulos {
	
	public modulos() {
		super();
	}
	
	public int multiplica(int a, int b) {
		//Condição de parada
		if (b == 1 ) {
		return a;
		}else{
		return  a + multiplica(a, b-1);
		}
	}
	
}
