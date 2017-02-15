/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.ovirgenm.a04.pkg1;
import java.util.Scanner;
/**
 *
 * @author Orianna
 */
public class SPP2OVirgenMA041 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu ();
    }
        
    public static void menu(){
        solicitarMatricula(" tu matricula");   
        solicitarNombre("tu nombre");
        solicitarEdad("tu edad");
        solicitarPeso("tu peso");
          
        
    }
    public static long solicitarMatricula (String mensaje){
        //Instanciamos nuestro teclado
        Scanner keyboard = new Scanner (System.in);
        long matricula=0;
        boolean flag;
        
        do{
            System.out.println("Introduce " + mensaje);
            try{
                //Código para error
                matricula= keyboard.nextLong();
                flag = true;
                
            } catch (Exception ex)  {
                //Código para el manejo del error
                System.out.println("El dato es incorrecto");
                flag = false;
                keyboard.nextLine();
            }
        }while (flag==false);
        return matricula;
    }
    static String solicitarNombre (String mensaje) {
        Scanner keyboard = new Scanner (System.in);
        String nombre="";
        boolean flag;
        do {
            System.out.println("Introduce "+ mensaje);
            try{
                //Código para error
                nombre = keyboard.nextLine();
                flag = true;
            }catch (Exception ex) {
                //Código para el manejo del error
                flag = false;
                System.out.println("No se encontro tu nombre ");
                keyboard.nextLine();
                       
            }
        }while (flag==false);
        return nombre;
    }
    static double solicitarEdad (String mensaje) {
        Scanner keyboard = new Scanner (System.in);
        double edad = 0;
        boolean flag;
        do {
            System.out.println("Introduce " + mensaje);
            try{
                //Código para error
                edad = keyboard.nextDouble();
                flag=true;
            }catch (Exception ex) {
                //Código para el manejo del error
                flag = false;
                System.out.println("El dato es incorrecto");
                keyboard.nextLine();
            }
            
        }while(flag==false);
        return edad;
    }
    static double solicitarPeso (String mensaje) {
        Scanner keyboard = new Scanner (System.in);
        double peso = 0;
        boolean flag;
        do {
            System.out.println("Introduce"+ mensaje);
            try{
                //Código para error
                peso = keyboard.nextDouble();
                flag=true;
            }catch (Exception ex) {
                //Código para el manejo del error
                flag = false;
                System.out.println("El valor no es un entero");
                keyboard.nextLine();
            }
        }while(flag==false);
        return peso;
               
    }
}
