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
public class Calendario1 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        int mes;
        
        System.out.println("Digite o valor de 1 a 12");
        mes = entrada.nextInt();
        
        if (mes == 1){
            System.out.println("Janeiro");
        }else if(mes == 2){
            System.out.println("Fevereiro");
        }else if(mes == 3){
            System.out.println("Março");
        }else if(mes == 4){
            System.out.println("Abril");
        }else if(mes == 5){
            System.out.println("Maio");
        }else if(mes == 6){
            System.out.println("Junho");    
        }else if(mes == 7){
            System.out.println("Julho");    
        }else if(mes == 8){
            System.out.println("Agosto");    
        }else if(mes == 9){
            System.out.println("Setembro");    
        }else if(mes == 10){
            System.out.println("Outubro");
        }else if(mes == 11){
            System.out.println("Novembro");    
        }else if(mes == 12){
            System.out.println("Dezembro");
               
    
        }
        
        
    }    
}    
    

