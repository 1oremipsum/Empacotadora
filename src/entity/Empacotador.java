package entity;

public class Empacotador implements Runnable {

    private final Equipe equipe;
    private final ContadorSinc empacotamentos;
    private String nome;
    private String lista_threads_id;

    public Empacotador(Integer nr_empacotador, Equipe equipe) {
        this.equipe = equipe;
        this.lista_threads_id = new String();
        //this.nome = this.nome = "Emp[" + nr_empacotador + "]@" + equipe.getName();
        Thread.currentThread().setName(nome);
        empacotamentos = new ContadorSinc(0);
    }

    public void listarIdThreads() {
        System.out.println(" |----- Lista de threads executadas por " + nome + " : " + lista_threads_id);
    }

    public void listarEmpacotamentos() {
        System.out.println(" |----- Empacotamentos feitos por " + nome + " : " + empacotamentos.getContador());
    }


    @Override
    public void run() {
        try {
            /**
             * Builds a list of all the threads that have been created on the Packager (Empacotador) instance.
             * On line 38: Puts the thread to sleep for a random period of time between 100 and 999 milliseconds.
             * On line 41: Increments the packer instance's packaging counter.
             */
            synchronized (lista_threads_id) {
                lista_threads_id = lista_threads_id + "[" + Thread.currentThread().getId() + "]";
            }
            System.out.println(nome + " empacotando (" + System.currentTimeMillis() + ")");
            Thread.sleep((int) (Math.random() * 899 + 100));
            System.out.println(nome + " concluiu  (" + System.currentTimeMillis() + ")");
            empacotamentos.incrementar();
            equipe.liberarFita();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
