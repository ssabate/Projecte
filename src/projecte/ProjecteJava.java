/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class ProjecteJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Les meues propietats        
        String nom=null;
        int dorsal=0;
        boolean home=false;
        double dinersGuanyats=0.0;
        char tipo=' ';
        
        
        Scanner ent = new Scanner(System.in);
        int opcio;

        do {
            System.out.println("\n\nMenú del programa.");
            System.out.println("0. Sortir.");
            System.out.println("1. Introduïr pilot.");
            System.out.println("2. Modificar pilot.");
            System.out.println("3. Borrar pilot.");
            System.out.println("4. Llistar pilots.");
            System.out.println("5. Altres.");
            switch (opcio = ent.nextInt()) {
                case 0:
                    System.out.println("Adéu!!");
                    break;
                case 1:        
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opció incorrecta!!\n\n");
            }
        } while (opcio != 0);

    }

}
