
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stefanny.0181
 */
public class TrocadeVariaveis {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int var1, var2, var3;
        
        System.out.println("Troca de variáveis. Informe os valores:");
        System.out.println("Valor 1");
        var1 = scanner.nextInt();
        System.out.println("Valor 2");
        var2 = scanner.nextInt();
        
        var3 = var1;
        var1 = var2;
        var2 = var3;
                
        System.out.println(" Agora o valor 1 é " + var1 + " E o valor 2 é " + var2 +".");
        
    }
    
}
