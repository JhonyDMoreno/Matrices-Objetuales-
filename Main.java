import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        GestorVentas gestor = new GestorVentas(100);
        int opcion;

         do {
            System.out.println("---Menu---");
            System.out.println("1- Registrar venta:");
            System.out.println("2- Consultar total mes de abril: ");
            System.out.println("3- Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("INGRESE EL MES (numero)");
                   while (!sc.hasNextInt()) {
                    System.out.println("debe ingresar el numero correspodiente al mes, intente de nuevo ");
                    sc.next();
                    
                   }
                     int mes = sc.nextInt();
                     sc.nextLine();
                  
                    System.out.println("INGRESE EL DIA :");
                    String dia = sc.nextLine();
                    System.out.println("INGRESE EL VALOR :");
                    double valor = sc.nextDouble();

                    gestor.registrarVentas(new Ventas(mes,dia,valor));
                    System.out.println("VENTA REGISTRADA CON EXITO");
                    break;

                case 2:
                    double total = gestor.totalventasAbril();
                    System.out.println("El total de ventas de abril es: $" + total);

                    break;
            
                default:
                    break;
            }

         } while (opcion !=3);
         System.out.println("Hasta luego");
    }
   
    
}
