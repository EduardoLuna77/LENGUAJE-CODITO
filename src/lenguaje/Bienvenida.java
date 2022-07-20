
package lenguaje;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Date;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.Timer;
import javax.swing.JPanel;





public class Bienvenida extends javax.swing.JFrame {
    
    Interfaz interfaz;
    Timer tiempo;
    int c=0;
    FondoPanel fondo=new FondoPanel();
    public Bienvenida() {
        
        
        initComponents();
        fondo.setRuta("/images/bienvenida.gif"); 
        this.setContentPane(fondo);
        this.setLocationRelativeTo(null);
        interfaz=new Interfaz();
        
        Timer tiempo=new Timer();  
        
        
        interfaz.setVisible(false);
        this.setVisible(true);
        TimerTask t=new TimerTask(){
          @Override
          public void run(){
              cierra();
          }
        };
          
        tiempo.schedule(t,3500);
        
    }
    void cierra(){
        new Interfaz().setVisible(true);
        this.setVisible(false);
        
    }
    
    
    private ImageIcon imagen;
private Icon icono;


    
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


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
    
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
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
