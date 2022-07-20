/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguaje;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import static java.util.Locale.filter;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author amigo
 */
public class Interfaz extends javax.swing.JFrame {

   FondoPanel fondo =new FondoPanel();
   NumeroLinea noLineas;
    
   Archivo archivo;
   
   Tabla tabla=new Tabla();
   Timer tiempo=new Timer();
    public Interfaz() {
        fondo.setRuta("/images/img1.jpg");
        this.setContentPane(fondo);
        
        
        
        initComponents();
        
        
        noLineas = new NumeroLinea(Area);
        Contador.setRowHeaderView(noLineas);
        archivo = new Archivo();
        
        
        Area.setText("");
        Terminal.setText("");
        Proceso.setText("");
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Terminal = new javax.swing.JTextArea();
        Checar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Abrir = new javax.swing.JButton();
        Contador = new javax.swing.JScrollPane();
        Area = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        Proceso = new javax.swing.JTextArea();
        tecnm = new javax.swing.JLabel();
        codito = new javax.swing.JLabel();
        ito = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Terminal.setEditable(false);
        Terminal.setBackground(new java.awt.Color(255, 255, 204));
        Terminal.setColumns(20);
        Terminal.setRows(5);
        jScrollPane2.setViewportView(Terminal);

        Checar.setBackground(new java.awt.Color(0, 255, 0));
        Checar.setText("Checar");
        Checar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChecarActionPerformed(evt);
            }
        });

        Guardar.setBackground(new java.awt.Color(0, 204, 255));
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Abrir.setBackground(new java.awt.Color(255, 204, 0));
        Abrir.setText("Abrir");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });

        Area.setBackground(new java.awt.Color(208, 251, 206));
        Area.setColumns(20);
        Area.setRows(5);
        Contador.setViewportView(Area);

        Proceso.setEditable(false);
        Proceso.setBackground(new java.awt.Color(115, 229, 255));
        Proceso.setColumns(20);
        Proceso.setRows(5);
        jScrollPane1.setViewportView(Proceso);

        tecnm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tecnm.png"))); // NOI18N

        codito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cod-ito.png"))); // NOI18N

        ito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-orizaba.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 0, 204));
        jButton1.setText("Agradecimientos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(tecnm, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218)
                        .addComponent(codito, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                        .addComponent(ito, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                            .addComponent(Contador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(Abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(Checar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(codito, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tecnm, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ito, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Checar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Contador, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
       Area.setText(archivo.accionAbrir());
       if(archivo.error){
             Terminal.setText("¡Error al abrir el archivo!\nIntentalo de nuevo");
             Terminal.setForeground(Color.red);
       }else{
           if(Area.getText().equals(null)){
               Terminal.setText("¡No se ha agreado código!");
              Terminal.setForeground(Color.red);
           }else{
                Terminal.setText("¡Listo para programar!");
                Terminal.setForeground(Color.blue);
           }
            
       }
        
        
    }//GEN-LAST:event_AbrirActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        archivo.accionGuardar(Area.getText());
        if(archivo.error){
             Terminal.setText("¡Error al guardar el archivo!\nIntentalo de nuevo");
             Terminal.setForeground(Color.red);
       }else{
            
            Terminal.setText("¡Código guardado correctamente!");
            Terminal.setForeground(Color.blue);
       }
        
    }//GEN-LAST:event_GuardarActionPerformed

    private void ChecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChecarActionPerformed
    if(Area.getText().equals("")){
        
        Terminal.setText("El programa esta vacío, debes ingresar código");
        Terminal.setForeground(Color.red);
    }else{
        Terminal.setText(tabla.evalua(Area.getText()));
    
        if(tabla.aceptado)
            Terminal.setForeground(Color.blue);
        else
            Terminal.setForeground(Color.red);
        Proceso.setText(tabla.proceso);
    }
        
        
    }//GEN-LAST:event_ChecarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Agradecimientos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abrir;
    private javax.swing.JTextArea Area;
    private javax.swing.JButton Checar;
    private javax.swing.JScrollPane Contador;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextArea Proceso;
    private javax.swing.JTextArea Terminal;
    private javax.swing.JLabel codito;
    private javax.swing.JLabel ito;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel tecnm;
    // End of variables declaration//GEN-END:variables

private ImageIcon imagen;
private Icon icono;

 void pintarImagen (JLabel label, String ruta){
     imagen = new ImageIcon(ruta);
     icono = new ImageIcon(
             imagen.getImage().getScaledInstance(
                     label.getWidth(),
                     label.getHeight(),
                     Image.SCALE_DEFAULT)
     );
     label.setIcon(icono);
     this.repaint();
 } 
    

    
    class FondoPanel extends JPanel{
        
        private Image imagen;
        private String ruta;

        public void setRuta(String ruta) {
            this.ruta = ruta;
        }

        public String getRuta() {
            return ruta;
        }
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource(ruta)).getImage();
            g.drawImage(imagen, 0,0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            super.paint(g);
        }
    }
}
