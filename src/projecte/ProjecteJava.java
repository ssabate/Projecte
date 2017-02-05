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
    //Número de caselles màxim de l'array
    private static final int MAX_PILOTS=2;
    //Array on guardarem la informació dels pilots
    private static Pilot[] array=new Pilot[MAX_PILOTS];
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variables locals del main
        Scanner ent = new Scanner(System.in);
        int opcio;      //opció del menú
        Pilot p=null;   //l'utilizo per apuntar al Pilot de les caselles de l'array
        
        //Inicialitzem l'array en nous pilots sense dades
        for (int i = 0; i < array.length; i++) {
            array[i]=new Pilot();
            array[i].setOmplit(false);
        }
                
        // Les meues propietats        
       
        //Menú del programa
        do {
            char siNo;
            System.out.println("\n\nMenú de l'aplicació.");
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
                    //Primer recorrem l'array fins trobar una casella no omplida o arribar al seu final
                    int i;
                    for(i=0; i<array.length && array[i].isOmplit();i++);
                    //Si no hem arribat al final és per que hem trobat una casella buida (no omplida)
                    if (i<array.length) {
                        System.out.println("\nNom:");
                        array[i].setNom(ent.skip("[\r\n]*").nextLine());
                        System.out.println("Dorsal:");
                        array[i].setDorsal(ent.skip("[\r\n]*").nextInt());
                        System.out.println("Diners guanyats:");
                        array[i].setDinersGuanyats(ent.skip("[\r\n]*").nextDouble());

                        char esHome;
                        do {
                            System.out.println("És home o dona?(H/D):");
                            esHome = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                                                                                                //per tant només haurem de tractar les lletres majúscules
                        } while (esHome != 'H' && esHome != 'D');
                        array[i].setHome(esHome == 'H');     //si esHome conté la 'H' home serà true i sinó false. Fa el mateix que un if_else però és molt més curt
                        array[i].setOmplit(true);
                    } else {
                        System.out.println("\nNo hi caben més pilots, si vols, primer borra'n.");
                    }
                    break;
                case 2:                             //2. Modificar pilot
                    //Primer recorrem l'array buscant caselles omplides i preguntant quina volem modificar
                    siNo='N';
                    int cont=1;
                    for(i=0; i<array.length && siNo!='F';i++){
                        if(array[i].isOmplit()){
                            System.out.format("\nPilot %d:\n", cont++);
                            System.out.println(array[i].toString());
                            do {
                                System.out.println("\nVols modificar el pilot(S/N) o finalitzar la cerca (F)?:");
                                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                                                                                                //per tant només haurem de tractar les lletres majúscules
                            } while (siNo != 'S' && siNo != 'N' && siNo != 'F');
                        }
                        if(siNo=='S') break;
                    }
                    //Si l'usuari ha contestat que sí és que ha triat un pilot per modificar    
                    if (siNo=='S') {
                            
                        System.out.println("\nNom: "+array[i].getNom());
                        do {
                            System.out.println("\nVols modificar el nom?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); 
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S'){
                            System.out.print("Nou nom: ");
                            array[i].setNom(ent.skip("[\r\n]*").nextLine());
                        }

                        System.out.println("\nDorsal: "+array[i].getDorsal());
                        do {
                            System.out.println("\nVols modificar el dorsal?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); 
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S'){
                            System.out.print("Nou dorsal: ");
                            array[i].setDorsal(ent.skip("[\r\n]*").nextInt());
                        }

                        System.out.println("\nDiners guanyats: "+array[i].getDinersGuanyats());
                        do {
                            System.out.println("\nVols modificar els diners guanyats?(S/N):");
                            siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); 
                        } while (siNo != 'S' && siNo != 'N');
                        if (siNo == 'S'){
                            System.out.print("Nous diners guanyats: ");
                            array[i].setDinersGuanyats(ent.skip("[\r\n]*").nextDouble());
                        }

                        if(array[i].isHome()) System.out.println("\nÉs home");
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
                            array[i].setHome(esHome == 'H');     //si esHome conté la 'H' home serà true i sinó false. Fa el mateix que un if_else però és molt més curt
                            System.out.print("Nou gènere: ");
                            if(array[i].isHome()) System.out.println("home");
                            else System.out.println("dona");
                        }

                        System.out.println("Pilot modificat correctament.");
                        
                        
                    } else {
                        System.out.println("\nNo hi ha pilots per modificar, o no n'has triat cap per modificar.");
                    }
                    break;
                case 3:                                     //3. Borrar pilot
                    siNo='N';
                    for (i = 0; i < array.length && siNo!='F'; i++) {
                        p=array[i];
                        if(p.isOmplit()){
                            System.out.println(p);
                            do {
                                System.out.println("\nVols borrar el pilot(S/N) o finalitzar la cerca (F)?:");
                                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                                                                                                //per tant només haurem de tractar les lletres majúscules
                            } while (siNo != 'S' && siNo != 'N' && siNo != 'F');
                        }
                        if(siNo=='S') break;                    
                    }
                    
                    if (siNo=='S') {
                        p.setOmplit(false);       
                        System.out.println("Pilot borrat correctament.");
                        
                    } else {
                        System.out.println("\nNo s'ha borrat cap pilot.");
                    }
                    break;
                case 4:                                     //4. Llistar pilots
                    boolean algun=false;
                    siNo='S';
                    for (i = 0; i < array.length; i++) {
                        p=array[i];
                        if(p.isOmplit()){
                            algun=true;
                            System.out.println(p);
                            do {
                                System.out.println("\nVols vore més pilots(S/N)?:");
                                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                                                                                                //per tant només haurem de tractar les lletres majúscules
                            } while (siNo != 'S' && siNo != 'N');
                        }
                        if(siNo=='N') break;                    
                    }
                    if (!algun) {
                        System.out.println("\nNo hi ha pilots per mostrar, si vols, primer crea'n.");                        
                    }                    
                    break;
                case 5:                                     //5. Recuperar pilot borrat
                    siNo='N';
                    for (i = 0; i < array.length && siNo!='F'; i++) {
                        p=array[i];
                        if(!p.isOmplit()){
                            System.out.println(p);
                            do {
                                System.out.println("\nVols recuperar el pilot(S/N) o finalitzar la cerca (F)?:");
                                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                                                                                                //per tant només haurem de tractar les lletres majúscules
                            } while (siNo != 'S' && siNo != 'N' && siNo != 'F');
                        }
                        if(siNo=='S') break;                    
                    }
                    
                    if (siNo=='S') {
                        p.setOmplit(true);       
                        System.out.println("Pilot recuperat correctament.");
                        
                    } else {
                        System.out.println("\nNo s'ha recuperat cap pilot.");
                    }
                    
                    break;
                default:
                    System.out.println("\nOpció incorrecta!!");
            }
        } while (opcio != 0);

        
    }
    
    

}

