package metodos;

public class Cuenta {
     
	double saldo;
    int agencia;
    int numero;
    String titular;

   
public void deposita(double valor) {
    this.saldo = this.saldo + valor;
  
}

public boolean saca(double valor) {
    if(this.saldo >= valor) {
        this.saldo -= valor;
        return true;
    } else {
        return false;
    }
}

public boolean transfiere(double valor, Cuenta destino) {
    if(this.saldo >= valor) {
        this.saldo -= valor;
        destino.deposita(valor);
        return true;
    }

    return false;
   

}

 public double getSaldo() {
	  return saldo;
  }


public int getAgencia() {
	 return agencia;
}

public void setAgencia(int agencia) {
	if(agencia > 0) {
		this.agencia = agencia;
	}
}

  public int getNumero() {
	  return numero;
  }
  public void setNumero(int numero) {
	  if(numero >0) {
		  this.numero = numero;
	  }
  }
}
