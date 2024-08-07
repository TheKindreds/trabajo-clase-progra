/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author zelay
 */
public class Tarea_de_Compu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = 0, altura = 0, area,mayorarea = 0,numtriangulo;
        for (int i = 0; i <= 8; i++) {
            do {
                try{
             System.out.println("ingresar la base para el triangulo "+i);
            base = sc.nextInt();
            if (base < 0) {
                System.out.println("no ingresar numeros menor a 0");
                System.out.println("ingresar un numero valido para base ");
                base = sc.nextInt();
            }

            System.out.println("ingresar la altura del triangulo "+i);
            altura = sc.nextInt();

            if (altura < 0) {
                System.out.println("numero ingresado incorrecto no puede ser menor a 0 o 0");
                System.out.println("ingresar un numero valido por favor para altura ");
                altura = sc.nextInt();
            }   
                }catch(Exception e){
                    System.out.println("no valido el valor ingresado");
                    
                }
            break;
            } while (true);
            
                area = (base * altura) / 2;
                System.out.println("el area es= " + area);
                System.out.println("");
                if (area > mayorarea) {
                mayorarea = area;
                numtriangulo = i;
            }

        }
    }

}
