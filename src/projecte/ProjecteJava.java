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
        String nom = null;
        int dorsal = 0;
        boolean home = false;
        double dinersGuanyats = 0.0;
        boolean omplit = false;

        Scanner ent = new Scanner(System.in);
        int opcio;

        do {
            System.out.println("\n\nMenú del programa.");
            System.out.println("0. Sortir.");
            System.out.println("1. Introduïr pilot.");
            System.out.println("2. Modificar pilot.");
            System.out.println("3. Borrar pilot.");
            System.out.println("4. Llistar pilots.");
            System.out.println("5. Recuperar pilot borrat.");
            switch (opcio = ent.skip("[\r\n]*").nextInt()) {
                case 0:                             //0. Sortir
                    System.out.println("Adéu!!");
                    break;
                case 1:                             //1. Introduïr pilot
                    if (!omplit) {
                        System.out.println("\nNom:");
                        nom = ent.skip("[\r\n]*").nextLine();
                        System.out.println("Dorsal:");
                        dorsal = ent.skip("[\r\n]*").nextInt();
                        System.out.println("Diners guanyats:");
                        dinersGuanyats = ent.skip("[\r\n]*").nextDouble();

                        char esHome;
                        do {
                            System.out.println("És home o dona?(H/D):");
                            esHome = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                                                                                                //per tant només haurem de tractar les lletres majúscules
                        } while (esHome != 'H' && esHome != 'D');
                        home = (esHome == 'H');     //si esHome conté la 'H' home serà true i sinó false. Fa el mateix que un if_else però és molt més curt
                        omplit = true;
                    } else {
                        System.out.println("\nNo hi ha pilots per omplir, si vols primer borra'n.");
                    }
                    break;
                case 2:                             //2. Modificar pilot
                    if (omplit) {
                        char siNo;
                        do {
                            System.out.println("\nVols vore el pilot?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                                                                                                //per tant només haurem de tractar les lletres majúscules
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S'){
                            System.out.println("\nNom: "+nom);
                            System.out.println("Dorsal: "+dorsal);
                            System.out.println("Diners guanyats: "+dinersGuanyats);
                            if(home) System.out.println("És home");
                            else System.out.println("És dona");
                      }     

                        do {
                            System.out.println("\nVols modificar el pilot?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); 
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S'){
                            
                            System.out.println("\nNom: "+nom);
                            do {
                                System.out.println("\nVols modificar el nom?(S/N):");
                                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); 
                            } while (siNo != 'S' && siNo != 'N');
                            if (siNo == 'S'){
                                System.out.print("Nou nom: ");
                                nom = ent.skip("[\r\n]*").nextLine();
                            }

                            System.out.println("\nDorsal: "+dorsal);
                            do {
                                System.out.println("\nVols modificar el dorsal?(S/N):");
                                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); 
                            } while (siNo != 'S' && siNo != 'N');
                            if (siNo == 'S'){
                                System.out.print("Nou dorsal: ");
                                dorsal = ent.skip("[\r\n]*").nextInt();
                            }

                            System.out.println("\nDiners guanyats: "+dinersGuanyats);
                            do {
                                System.out.println("\nVols modificar els diners guanyats?(S/N):");
                                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); 
                            } while (siNo != 'S' && siNo != 'N');
                            if (siNo == 'S'){
                                System.out.print("Nous diners guanyats: ");
                                dinersGuanyats = ent.skip("[\r\n]*").nextDouble();
                            }

                            if(home) System.out.println("\nÉs home");
                            else System.out.println("\nÉs dona");
                            do {
                                System.out.println("\nVols modificar el gènere?(S/N):");
                                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); 
                            } while (siNo != 'S' && siNo != 'N');
                            if (siNo == 'S'){
                                char esHome;
                                do {
                                    System.out.println("És home o dona?(H/D):");
                                    esHome = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                                } while (esHome != 'H' && esHome != 'D');
                                home = (esHome == 'H');     //si esHome conté la 'H' home serà true i sinó false. Fa el mateix que un if_else però és molt més curt
                                System.out.print("Nou gènere: ");
                                if(home) System.out.println("home");
                                else System.out.println("dona");
                            }

                            System.out.println("Pilot modificat correctament.");
                        } else System.out.println("Pilot no modificat.");  
                        
                    } else {
                        System.out.println("\nNo hi ha pilots per modificar, si vols primer crea'n.");
                    }
                    break;
                case 3:                                     //3. Borrar pilot
                    if (omplit) {
                        char siNo;
                        do {
                            System.out.println("\nVols vore el pilot?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                                                                                                //per tant només haurem de tractar les lletres majúscules
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S'){
                            System.out.println("\nNom: "+nom);
                            System.out.println("Dorsal: "+dorsal);
                            System.out.println("Diners guanyats: "+dinersGuanyats);
                            if(home) System.out.println("És home");
                            else System.out.println("És dona");
                        }     

                        do {
                            System.out.println("\nVols borrar el pilot?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                                                                                                //per tant només haurem de tractar les lletres majúscules
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S'){
                            omplit = false;       
                            System.out.println("Pilot borrat correctament.");
                        } else System.out.println("Pilot no borrat.");  
                        
                    } else {
                        System.out.println("\nNo hi ha pilots per borrar, si vols primer crea'n.");
                    }
                    break;
                case 4:                                     //4. Llistar pilots
                    if (omplit) {
                        System.out.println("\nNom: "+nom);
                        System.out.println("Dorsal: "+dorsal);
                        System.out.println("Diners guanyats: "+dinersGuanyats);                        
                        if(home) System.out.println("És home");
                        else System.out.println("És dona");
                    } else {
                        System.out.println("\nNo hi ha pilots per mostrar, si vols primer crea'n.");
                    }                    
                    break;
                case 5:                                     //5. Recuperar pilot borrat
                    
                    if (!omplit) {

                        char siNo;
                        do {
                            System.out.println("\nVols vore el pilot?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                                                                                                //per tant només haurem de tractar les lletres majúscules
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S'){
                            System.out.println("\nNom: "+nom);
                            System.out.println("Dorsal: "+dorsal);
                            System.out.println("Diners guanyats: "+dinersGuanyats);
                            if(home) System.out.println("És home");
                            else System.out.println("És dona");
                       }     

                        do {
                            System.out.println("\nVols recuperar el pilot?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                                                                                                //per tant només haurem de tractar les lletres majúscules
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S'){
                            omplit = true;       
                            System.out.println("Pilot recuperat correctament.");
                        } else System.out.println("Pilot no recuperat.");  
                        
                    } else {
                        System.out.println("\nNo hi ha pilots per recuperar, si vols primer borra'n.");
                    }

                    break;
                default:
                    System.out.println("\nOpció incorrecta!!");
            }
        } while (opcio != 0);

    }

}
