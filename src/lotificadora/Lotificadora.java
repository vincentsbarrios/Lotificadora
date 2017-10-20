/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotificadora;
import java.util.Scanner;

/**
 *
 * @author Juan Zepeda
 */
public class Lotificadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner anubis = new Scanner(System.in);
        int opp;
        Projecto_Lotificacion obj = new Projecto_Lotificacion();
        
        do{
            System.out.println("\n*******MENU PRINCIPAL*******");
            System.out.println("1. VENTA DEL LOTE");
            System.out.println("2. REPORTE DEL LOTE");
            System.out.println("3. SALIR");
            System.out.print("\nINGRESE OPCION: ");
            opp = anubis.nextInt();
            
            switch(opp){
                case 1:
                    System.out.println("\n*******VENTA DE LOTE*******");
                    System.out.println("INGRESE COORDENAS");
                    System.out.print("X = ");
                    int x = anubis.nextInt();
                    System.out.print("Y = ");
                    int y = anubis.nextInt();
                    obj.ventaLote(x-1, y-1);
                    break;
                case 2:
                    obj.reporte();
                    obj.prinMap();
                    break;
            }//END SWITCH
            
        }while(opp != 3);
    }//END MAIN
    
}
