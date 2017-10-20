/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotificadora;

import java.util.Scanner;

/**
 *
 * @author Ghost Sammy III
 */
public class Projecto_Lotificacion {
    
    private Terreno array[][];
    Scanner anubis = new Scanner(System.in);

    public Projecto_Lotificacion(){
        array = new Terreno[5][5];
    }
    
    public void ventaLote(int x, int y){
        
        if(x > 5 || y > 5 || x < 0 || y < 0){
            System.out.println("\nCOORDENADAS DE LOTE NO EXISTE.");
        }
        else if(array[x][y] == null){
            System.out.println("\nINGRESE MEDIDAS");
            System.out.print("LARGO: ");
            double l = anubis.nextDouble();
            System.out.print("ANCHO: ");
            double a = anubis.nextDouble();
            System.out.print("PRECIO: ");
            double p = anubis.nextDouble();
            array[x][y] = new Terreno(l,a,p);
        }
        else{
            System.out.println("\nTERRENO OCUPADO");
        }//END FUNCTION
    }
    
    public void reporte(){
        int counter_lote=0;
        int revenue=0;
        
        for(int x=0;x<array.length;x++){
            for(int y=0;y<array.length;y++){
                if(array[x][y] != null){
                    counter_lote++;
                    revenue += array[x][y].getPrecio();
                }
            }
        }//END FOR
        
        System.out.println("\n*******REPORTE*******");
        System.out.println("");
        System.out.println("CANTIDAD DE LOTES OCUPADOS");
        System.out.println(counter_lote);
        System.out.println("CANTIDAD DE LOTES VACIOS");
        System.out.println(25 - counter_lote);
        System.out.println("TOTAL DE LEMPIRAS");
        System.out.println(revenue);
    }
    
}
