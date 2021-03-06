/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.Arrays;
import javax.swing.JOptionPane;
import metodes.GUI_UF3;
import projecte.Pilot;
import projecte.ProjecteJava;

/**
 *
 * @author profe
 */
public class GUI_exemple extends javax.swing.JFrame {

    //Usada per saber si hi ha alguna fila de la taula seleccionada, i quina és
    private static int filaSel=-1; 
    
    /**
     * Creates new form GUI_exemple
     */
    public GUI_exemple() {
        initComponents();
        inicialitzaComponents();
    }

    private void inicialitzaComponents(){
        //Si no han seleccionat cap fila desactivo els botons de borrar i modificar
        botoBorrar.setEnabled(false);
        botoModificar.setEnabled(false);
        
        //Inicialment el pilot serà home
        opcioHome.setSelected(true);
        
        ProjecteJava.inicialitzarVariables();
        
        GUI_UF3.carregaTaula(new String[]{"Fila", "Nom", "Dorsal", "Diners", "Home"}, 
                transformaDades(ProjecteJava.getArray())
//                new Object[][]{
//                    {"Marc", 93, 2346.6, true},
//                    {"Viñales", 25, 234.6, true}
//                }
                , taula);
    
    }
    
    /**
     * Mètode que transforma l'array de pilots en una matriu
     * @param dades array que conté les dades a transformar
     * @return una matriu d'objectes que conté les dades que ens interessen dels pilots
     */
    public static Object[][] transformaDades(Pilot[] dades){
        Object[][] resultat=new Object[dades.length][5];
        //Variable per comptar el número de pilots en dades que hi ha a l'array de dades
        int omplits=0;
        
        for (int i = 0; i < dades.length; i++) {
            if(dades[i].isOmplit()){
                resultat[omplits][0]=i;
                resultat[omplits][1]=dades[i].getNom();
                resultat[omplits][2]=dades[i].getDorsal();
                resultat[omplits][3]=dades[i].getDinersGuanyats();
                resultat[omplits][4]=dades[i].isHome();
                omplits++;
            }
        }
        //Retornem només els pilots plens
        return Arrays.copyOf(resultat,omplits);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        taula = new javax.swing.JTable();
        casellaNom = new javax.swing.JTextField();
        casellaDorsal = new javax.swing.JTextField();
        casellaGuanys = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        opcioHome = new javax.swing.JRadioButton();
        opcioDona = new javax.swing.JRadioButton();
        botoInserir = new javax.swing.JButton();
        botoModificar = new javax.swing.JButton();
        botoBorrar = new javax.swing.JButton();
        botoSortir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        taula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        taula.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        taula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taulaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(taula);

        jLabel1.setText("Nom");

        jLabel2.setText("Dorsal");

        jLabel3.setText("Guanys");

        buttonGroup1.add(opcioHome);
        opcioHome.setText("Home");

        buttonGroup1.add(opcioDona);
        opcioDona.setText("Dona");

        botoInserir.setText("Inserir");

        botoModificar.setText("Modificar");
        botoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoModificarActionPerformed(evt);
            }
        });

        botoBorrar.setText("Borrar");

        botoSortir.setText("Sortir");
        botoSortir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoSortirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(botoModificar)
                        .addGap(162, 162, 162)
                        .addComponent(botoBorrar)
                        .addGap(167, 167, 167)
                        .addComponent(botoInserir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opcioDona)
                    .addComponent(opcioHome)
                    .addComponent(casellaNom, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casellaDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casellaGuanys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botoSortir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {casellaDorsal, casellaGuanys, casellaNom});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(casellaNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(casellaDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(casellaGuanys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(1, 1, 1)
                .addComponent(opcioHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcioDona)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botoModificar)
                    .addComponent(botoBorrar)
                    .addComponent(botoInserir)
                    .addComponent(botoSortir))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taulaMouseClicked
        //Actualitzo la fila seleccionada 
        filaSel=taula.getSelectedRow();
        
        if(filaSel==-1){    
            //Si no han seleccionat cap fila desactivo els botons de borrar i modificar
            botoBorrar.setEnabled(false);
            botoModificar.setEnabled(false);
            
            //Poso les caselles en blanc
            casellaNom.setText("");
            casellaDorsal.setText("");
            casellaGuanys.setText("");
            opcioHome.setSelected(true);
        }        
        else{
            //Si han seleccionat alguna fila activo els botons de borrar i modificar
            botoBorrar.setEnabled(true);
            botoModificar.setEnabled(true);
            
            //Actualizo les caselles en la informació de la fila seleccionada
            casellaNom.setText((String)taula.getValueAt(filaSel, 1));
            casellaDorsal.setText(String.valueOf(taula.getValueAt(filaSel, 2)));
            casellaGuanys.setText(String.valueOf(taula.getValueAt(filaSel, 3)));
            if((boolean)taula.getValueAt(filaSel, 4))
                opcioHome.setSelected(true);
            else opcioDona.setSelected(true);
        }
        
        
    }//GEN-LAST:event_taulaMouseClicked

    private boolean dadesCorrectes(){
    
        try {
            //casellaNom.getText().trim().charAt(0);
            if(casellaNom.getText().trim().equals("")) throw new StringIndexOutOfBoundsException();
            Integer.valueOf(casellaDorsal.getText());
            Double.valueOf(casellaGuanys.getText());
        } catch (StringIndexOutOfBoundsException|NumberFormatException e) {
            return false;
        }
    
        return true;
    
    }
    
    
    
    
    
    
    
    private void botoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoModificarActionPerformed
        
        //Primer miro si les dades de les caselles són correctes. Si no ho són mostro
        //un advertiment i acabo l'execució del mètode
        if(!dadesCorrectes()){
            JOptionPane.showMessageDialog(this, "Dades de les caselles incorrectes!!");
            return;
        }
        
        // Obtenim l'índex de l'array a partir del valor de la columna 0 de la taula
        int iArray=(int)taula.getValueAt(filaSel, 0);
        Pilot[] array=ProjecteJava.getArray();
        
        array[iArray].setNom(casellaNom.getText().trim());
        array[iArray].setDorsal(Integer.valueOf(casellaDorsal.getText()));
        array[iArray].setDinersGuanyats(Double.valueOf(casellaGuanys.getText()));
        array[iArray].setHome(opcioHome.isSelected());
        
        GUI_UF3.carregaTaula(new String[]{"Fila", "Nom", "Dorsal", "Diners", "Home"}, 
                transformaDades(ProjecteJava.getArray())
                , taula);
        JOptionPane.showMessageDialog(this, "Dades modificades!!");
    }//GEN-LAST:event_botoModificarActionPerformed

    private void botoSortirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoSortirActionPerformed
        // TODO add your handling code here:
        
        ProjecteJava.finalitzar();
        System.exit(1);
    }//GEN-LAST:event_botoSortirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        ProjecteJava.finalitzar();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_exemple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_exemple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_exemple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_exemple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_exemple().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoBorrar;
    private javax.swing.JButton botoInserir;
    private javax.swing.JButton botoModificar;
    private javax.swing.JButton botoSortir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField casellaDorsal;
    private javax.swing.JTextField casellaGuanys;
    private javax.swing.JTextField casellaNom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton opcioDona;
    private javax.swing.JRadioButton opcioHome;
    private javax.swing.JTable taula;
    // End of variables declaration//GEN-END:variables
}
