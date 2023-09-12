
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stefanny.0181
 */
public class ClssificaçãoPorIdade {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        int idade;
        
        System.out.println("Informe a idade da pessoa:");
        idade = entrada.nextInt();
        
        if(idade <5){
            System.out.println("Erro: Idade invalida !");
        }else if((idade >= 5) && (idade <= 7)){
            System.out.println("Sua classificação é: Infantil A");
        }else if((idade >= 8) && (idade <= 10)){
            System.out.println("Sua classificação é: Infantil B");
        }else if((idade >= 11) && (idade <= 13)){
            System.out.println("Sua classificação é: Juvenil A");
        }else if((idade >= 14) && (idade <= 17)){
            System.out.println("Sua Classificação é: Juvenil B");
        }else if((idade <= 18)){
            System.out.println("Sua classificação é: Adulto");
                
        }
       
    }
    
}
