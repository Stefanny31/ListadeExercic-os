/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadeexercicios;

import java.util.Scanner;

/**
 *
 * @author stefanny.0181
 */
public class IMC {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        float altura, peso, imc;
        
        System.out.println("Informe altura em CM");
        altura = scanner.nextInt();
        System.out.println("Informe peso em KG");
        peso = scanner.nextInt();
        
        imc = peso / (altura/100) * (altura/100);
        if(imc<16 )
        
        
        
    }
    
}
