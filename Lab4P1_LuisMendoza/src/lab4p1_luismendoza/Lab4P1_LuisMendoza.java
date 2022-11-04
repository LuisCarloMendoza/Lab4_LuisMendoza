/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_luismendoza;
import java.util.Scanner;
import java.util.Random;



public class Lab4P1_LuisMendoza {
    
public static void Rodatcripne(){
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Bienvenido al ejercicio Rodatcripne!");
    System.out.println("Ingrese una cadena");
    
    String cadena = entrada.next();
    cadena += entrada.nextLine();
    String inversa = "";
    String replace = "";
    String gucci = "";

    for (int i = cadena.length() - 1; i >= 0; i--) {

        inversa += cadena.charAt(i) + "";
    }

    for (int j = 0; j < inversa.length(); j += 2) {

        int r = new Random().nextInt(9 - 0);

        replace = replace + r;
        String w = inversa.charAt(j) + "";

        gucci += w + replace;

        replace = "";
    }
     
    System.out.println(gucci);
                
    
  
    
    
    
}

public static void Alpha(){
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Ingrese una cadena: ");
    String cadena = entrada.next();
    cadena += entrada.nextLine();
    String lol3 = "";
    
    for(int i = 0; i < cadena.length();i++){
        
        char x = cadena.charAt(i);
        int int1 = x;

        if (int1 <= 90 && int1 >= 60) {
        } else if (int1 >= 97 && int1 <= 122) {
        } else {
            lol3 = "Adios";

        }

    }
    if (lol3 == "Adios") {
        System.out.println("La cadena contiene otros caracteres que no son letras");
    } else {
        System.out.println("La cadena solo contiene letras");
    }
}

public static void Fallout(){
 Scanner entrada = new Scanner(System.in);      
    
        int l = 0;
        int m = 0;
        String n1 = "comer";
        String n2 = "unida";
        String n3 = "jugar";
        String n4 = "venit";
        String n5 = "salta";
        String n6 = "llama";
        String n7 = "llora";
        String n8 = "evee";
        String n9 = "muere";
        String n10 = "comer";
        String r = "";
        
        int random = new Random().nextInt(10-1);
        int option = random;
        
        switch (option){
            case 1:
                r = n1;
                break;
            case 2:
                r = n2;
                break;
            case 3:
                r = n3;
                break;
            case 4:
                r = n4;
                break;
            case 5:
                r = n5;
                break;
            case 6:
                r = n6;
                break;
            case 7:
                r = n7;
                break;
            case 8:
                r = n8;
                break;
            case 9:
                r = n9;
                break;
            case 10:
                r = n10;
                break;
            default:
                r = "";
                break;
                
        }
        
        System.out.println("Elija una opción escribiendola en texto");
        System.out.println("1. comer, 2. unida 3. jugar 4. venti, 5. salta 6. llama, 7. llora, 8. evee, 9. muere, 10. local");
        String opcion = entrada.next();
        
        do{
        
        
        for(int i = 0;i<opcion.length();i++){
            
            char x = opcion.charAt(i);
            char y = r.charAt(i);
            char y1 = r.charAt(0);
            char y2 = r.charAt(1);
            char y3 = r.charAt(2);
            char y4 = r.charAt(3);
           
            
            if(x == y1){
                l++;   
            } else if(x == y2) {
                l++;
            } else if (x == y3){
                l++;
            } else if(x==y4){
                l++;
            }   
            else if (x == y) {
                m++;
            }
        }
        
        System.out.println("Tiene " + l + " Palabras correctas");
        System.out.println("Tiene " + m + " Posiciones correctas");
        
        System.out.println("Elija una opción escribiendola en texto");
        System.out.println("1. comer, 2. unida 3. jugar 4. venti, 5. salta 6. llama, 7. llora, 8. evee, 9. muere, 10. local");
    
        opcion += entrada.next();
        
        }while(r.equalsIgnoreCase(opcion));
        
        System.out.println("Acceso Desbloqueado!");
}


    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("********************************************");
            System.out.println("Bienvenido a la segunda tarea en Java!");
            System.out.println("Elija una opción: ");
            System.out.println("1. Fallout Words, 2. Rodatcripne, 3.Alpha , 4. Salir");
            int opcionUsuario = entrada.nextInt();
            
            if(opcionUsuario == 1){
                
                Fallout();
                
            } else if (opcionUsuario == 2){
                
                Rodatcripne();
                
            } else if (opcionUsuario == 3){
                
                Alpha();
                
                
            } else if (opcionUsuario == 4) {
                System.out.println("Bye Bye!");
                break;
                
            } else {
                System.out.println("Opción no valida, intentenlo nuevamente!");
            }
            
            
        } while (true);
        
        
        
        
    }
    
}
