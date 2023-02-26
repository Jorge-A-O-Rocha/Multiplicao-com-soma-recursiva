package view;
import controller.modulos;
public class main {
	public static void main( String[] args) {
		modulos mod = new modulos();
		int n1 = 5;
		int n2 = 6;
		int mul = mod.multiplica(n1, n2);
		
		System.out.println(n1 + " x " + n2 + " = "+ mul);
	}
}
