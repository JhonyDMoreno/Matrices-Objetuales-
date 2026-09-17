public class GestorVentas {
    private  Ventas[] ventas;
    private int cantidadRegistrada;

    public  GestorVentas (int totalventas){
        this.ventas = new Ventas[totalventas];
        this.cantidadRegistrada =0;
    }

        public void registrarVentas (Ventas v ){
            if (cantidadRegistrada < ventas.length) {
                ventas[cantidadRegistrada] = v;
                cantidadRegistrada++; 
            }
    }

    public double totalventasAbril (){
        double total=0;
        for (int i = 0; i < cantidadRegistrada; i++) {
            if (ventas[i].getMes() ==4) {
                total +=ventas[i].getValor();
            }
        }
        return total;
    }
}
