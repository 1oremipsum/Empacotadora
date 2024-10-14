package entity;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Equipe extends Thread {
  //Atributos
  private final int nr_integrantes;
  private CountDownLatch latch;
  private final Semaphore pool_fita;
  private final PoolProdutos pool_produtos;
  private final ArrayList< Empacotador > empacotadores;
  private final ContadorSinc prod_empacotados_eqp;

  //Métodos
  public Equipe ( String nome , int nr_integrantes , Semaphore pool_fita , PoolProdutos pool_produtos ) {
  	this.setName(nome);
  	this.nr_integrantes = nr_integrantes;
  	this.pool_fita = pool_fita;  	
    this.pool_produtos = pool_produtos;
  	this.empacotadores = new ArrayList<Empacotador>();
  	prod_empacotados_eqp = new ContadorSinc(0);
  	prepararEmpacotadores();
  }

private void prepararEmpacotadores() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'prepararEmpacotadores'");
}

public void liberarFita() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'liberarFita'");
}
}