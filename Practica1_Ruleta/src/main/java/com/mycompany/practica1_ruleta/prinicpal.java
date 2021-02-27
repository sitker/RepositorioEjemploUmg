/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica1_ruleta;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Carlos
 */
public class prinicpal {
    public static void main(String[] args) {
            Scanner miEscaner = new Scanner (System.in);
    int creditoJugador = 100;
    int valorRuleta = 0;
    int valorSelec = 0;
 
    do{
        String strOpcion = miEscaner.nextLine();
            System.out.println("Juego de Ruleta");
        System.out.println("Seleccione una opcion");
        System.out.println("a - Jugar");
        System.out.println("b - Ver Credito");
        System.out.println("c - Salir del Juego");
        switch(strOpcion){
            case "a":
                System.out.println("Ingrese un numero para apostar entre 1 al 10");
                valorSelec = miEscaner.nextInt();
                creditoJugador = creditoJugador - 10;
                
                valorRuleta = (int)(Math.random()*10+1);
                System.out.println("El valor de la ruleta es: " + valorRuleta);
                if (valorRuleta == valorSelec){
                    System.out.println("Felicidades!!! Ha acertado al valor, has ganado 30 unidades.");
                    creditoJugador = creditoJugador + 30;
                }else{
                    System.out.println("No ha acertado al valor de la ruleta. Intenta jugar nuevamente.");
                }
                if(valorRuleta%2 == 0 && valorSelec % 2 == 0){
                    System.out.println("Felicidades ha acertado al color de la ruleta, has ganado 20 unidades");
                    creditoJugador = creditoJugador + 20;
                }else if(valorRuleta%2 != 0 && valorSelec % 2 != 0){
                    System.out.println("Felicidades ha acertado al color de la ruleta, has ganado 20 unidades");
                    creditoJugador = creditoJugador + 20;
                }else {
                    System.out.println("No has acertado al color. Intenta jugar nuevamente.");
                }
                
                
                
                break;
            
            case "b":
                System.out.println("Su credito actual es: " + creditoJugador);
                System.out.println("Presione enter para continuar.");
                break;
            
            case "c":
                System.exit(0);
                break;
        }
    
    
    
    }while (creditoJugador > 0);  
    }
    
}
