
package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Principal {
    public static void main(String[] args){
    Scanner objInput = new Scanner(System.in);
    
    String strContinuar = null;
    
    do{
        System.out.println("Seleccionar una opcion");
        System.out.println("a - Si desea sumar");
        System.out.println("b - Si desea restar");
        System.out.println("c - Si desea multiplicar");
        System.out.println("d - Si desea dividr");
        System.out.println("Escriba su opcion");
        //Recibe el valor del buffer del teclado
        String strOpcion = objInput.nextLine();
        //Definir variables para las operaciones
        float[] fltArrNumeros = new float[2];
        float fltResultado = 0;
        
        //Define variable de error.
        boolean blnError = true;
        
        
        switch(strOpcion){
            case "a":
                strOpcion = "suma";
                System.out.println("");
                //Solicita los valores numericos
                for(int i=0; i<2; i++){
                    System.out.println("Ingrese el numero " + (i+1) + " : ");
                    fltArrNumeros[i] = objInput.nextFloat();
                }
                
                
                fltResultado = fltArrNumeros[0] + fltArrNumeros[1];
                
                //Control
                blnError = false;
                
                //Sale del case
                break;
                
            case "b":
                strOpcion = "resta";
                System.out.println("");
                //Solicita los valores numericos
                for(int i=0; i<2; i++){
                    System.out.println("Ingrese el numero " + (i+1) + " : ");
                    fltArrNumeros[i] = objInput.nextFloat();
                }
                
                
                fltResultado = fltArrNumeros[0] - fltArrNumeros[1];
                
                //Control
                blnError = false;
                
                //Sale del case
                break; 
                
            case "c":
                strOpcion = "multiplicacion";
                System.out.println("");
                //Solicita los valores numericos
                for(int i=0; i<2; i++){
                    System.out.println("Ingrese el numero " + (i+1) + " : ");
                    fltArrNumeros[i] = objInput.nextFloat();
                }
                
                
                fltResultado = fltArrNumeros[0] * fltArrNumeros[1];
                
                //Control
                blnError = false;
                
                //Sale del case
                break;
            case "d":
                strOpcion = "division";
                System.out.println("");
                //Solicita los valores numericos
                for(int i=0; i<2; i++){
                    System.out.println("Ingrese el numero " + (i+1) + " : ");
                    fltArrNumeros[i] = objInput.nextFloat();
                }
                
                if(fltArrNumeros[1] != 0){                                 
                fltResultado = fltArrNumeros[0] / fltArrNumeros[1];
                }else{
                    System.out.println("El denominador es 0, no se puede realizar la operacion.");
                }
                //Control
                blnError = false;
                
                //Sale del case
                break;
            default: 
                
                //Error
                blnError = true;
                //Sale del case
                break;
    }
        
        System.out.println("");
        
        if(blnError == false){
            System.out.println("El resultado es: " + fltResultado);
        }else if(blnError == true){
            System.out.println("Error no se puede realizar su operacion");
            
        }
        System.out.println("La opcion seleccionada es " + strOpcion);
        
        
        System.out.println("Desea continuar S/N");
        
        
        //Captura el buffer para continuar
        Scanner objInput2=new Scanner(System.in);
        strContinuar = objInput2.nextLine();
        
    }while (strContinuar.equals("s") || strContinuar.equals("S"));
}
}
