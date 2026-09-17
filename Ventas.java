public class Ventas {
    private int mes;
    private String dia;
    private double valor;
    
    public Ventas(int mes, String dia, double valor) {
        this.mes = mes;
        this.dia = dia;
        this.valor = valor;
    }
    

    public int getMes() {
        return mes;
    }


    public void setMes(int mes) {
        this.mes = mes;
    }


    public String getDia() {
        return dia;
    }


    public void setDia(String dia) {
        this.dia = dia;
    }


    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


    @Override
    public String toString() {
        
        return "Ventas [mes=" + mes + ", dia=" + dia + ",valor=" + valor +"]";
    }

    
}
