package metodos;

public class TestMetodos {
       
	 public static void main(String[] args){
		 
		 Cuenta miCuenta = new Cuenta();
		 
		 miCuenta.saldo = 400;
		System.out.println(miCuenta.saldo);
		 miCuenta.deposita(500);
		 System.out.println(miCuenta.saldo);
		 miCuenta.saca(150);
		 System.out.println(miCuenta.saldo);
		 
		 
		 Cuenta cuentaDeNN = new Cuenta();
		  cuentaDeNN.deposita(500);
		  cuentaDeNN.transfiere(200,miCuenta);
		  System.out.println(cuentaDeNN.saldo);
		  System.out.println(miCuenta.saldo);
	 }
	
}
