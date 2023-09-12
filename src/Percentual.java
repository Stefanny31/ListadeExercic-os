
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stefanny.0181
 */
public class Percentual {
    public static void main(String args[]){
        Scanner inputnum = new Scanner(System.in);
        float num, perc, resultado;
        
        System.out.println("Informe o Valor:");
        num = inputnum.nextFloat();
        
        System.out.println("Informe a porcentagem:");
        perc = inputnum.nextFloat();
        
        float Resultado = ( num * perc ) / 100;
        
        System.out.println(" A porcentagem é = " + Resultado + "%" );
    }
    
}
