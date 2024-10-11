package entity;

public class ContadorSinc {
    private Integer contador;
    private final Integer inicio;

    public ContadorSinc(Integer inicio){
        this.inicio = inicio;
        this.contador = inicio;
    }

    public synchronized void decrementar(){
        this.contador--;
    }

    public synchronized void decrementar(Integer n){
        this.contador = this.contador - n;
    }

    public synchronized void incrementar(){
        this.contador++;
    }

    public synchronized void incrementar(Integer n){
        this.contador = this.contador + n;
    }

    public synchronized void zerarContador(){
        this.contador = 0;
    } 

    public synchronized int getContador ( ) {
        return this.contador;
    }

    public Integer getInicio() {
        return inicio;
    }

}
