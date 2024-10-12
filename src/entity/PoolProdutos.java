package entity;

public class PoolProdutos extends ContadorSinc{

    public PoolProdutos(Integer qtt_product) {
        super(qtt_product);
        if (qtt_product < 1) {
            throw new IllegalArgumentException("The quantity of products must be greater than or equal to 1.");
        }
    }

    /**
     * Checks to see if there are enough products available to meet the pickup.
     * If there is, returns the number of products. Otherwise, it will return the value
     * counter start.
     * @param Integer n_products
     * @return Integer n_products or aux
     */
    public synchronized Integer retirarProdutos(Integer n_products){
        int aux = getContador();
        if((aux - n_products) >= 0){
            decrementar(n_products);
            return n_products;
        }else{
            zerarContador();
            return aux;
        }
    }

}