/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.gui.triky;

import co.com.triky.thread.ThreadReceiveClient;
import co.com.triky.thread.ThreadSendClient;
import java.awt.Color;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Wilmar Duque
 */
public class frmWindowClient extends javax.swing.JFrame {

    private static Socket sConnection;
    private static frmWindowClient window;
    private static final int PUERTO = 12345;
    private static final String IP = "localhost";

    /**
     * Creates new form frmWindowClient
     */
    public frmWindowClient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setName("btn1"); // NOI18N

        btn2.setName("btn2"); // NOI18N

        btn3.setName("btn3"); // NOI18N

        btn4.setName("btn4"); // NOI18N

        btn5.setName("btn5"); // NOI18N

        btn6.setName("btn6"); // NOI18N

        btn7.setName("btn7"); // NOI18N

        btn8.setName("btn8"); // NOI18N

        btn9.setName("btn9"); // NOI18N

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void printButton(String numberButton) {
        try {
            Class cClass = getClass();
            Field fField = cClass.getDeclaredField("btn" + numberButton);
            JButton button = (JButton) fField.get(this);
            button.setBackground(Color.red);
            button.setEnabled(false);
            this.setEnabled(true);
            validarSiHayGanador();
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(frmWindowClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void validarSiHayGanador() {
        validarDiagonalPrincipal();
        validarDiagonalSecundaria();
        validarHorizontal();
        validarVertical();
    }

    private void validarDiagonalPrincipal() {
        Color color = Color.red;
        if (btn1.getBackground() == color && btn5.getBackground() == color && btn9.getBackground() == color) {
            JOptionPane.showMessageDialog(null, "Servidor ha ganado");
            PreguntarSalida();
        }
    }

    private void validarDiagonalSecundaria() {
        Color color = Color.red;
        if (btn3.getBackground() == color && btn5.getBackground() == color && btn7.getBackground() == color) {
            JOptionPane.showMessageDialog(null, "Servidor ha ganado");
            PreguntarSalida();
        }
    }

    private void validarHorizontal() {
        Color color = Color.red;
        if (btn4.getBackground() == color && btn5.getBackground() == color && btn6.getBackground() == color) {
            JOptionPane.showMessageDialog(null, "Servidor ha ganado");
            PreguntarSalida();
        } else if (btn1.getBackground() == color && btn2.getBackground() == color && btn3.getBackground() == color) {
            JOptionPane.showMessageDialog(null, "Servidor ha ganado");
            PreguntarSalida();
        } else if (btn7.getBackground() == color && btn8.getBackground() == color && btn9.getBackground() == color) {
            JOptionPane.showMessageDialog(null, "Servidor ha ganado");
            PreguntarSalida();
        }
    }

    private void validarVertical() {
        if ((btn1.getBackground() == Color.red && btn4.getBackground() == Color.red && btn7.getBackground() == Color.red)
                || (btn2.getBackground() == Color.red && btn5.getBackground() == Color.red && btn8.getBackground() == Color.red)
                || (btn3.getBackground() == Color.red && btn6.getBackground() == Color.red && btn9.getBackground() == Color.red)) {
            JOptionPane.showMessageDialog(null, "Servidor ha ganado");
            PreguntarSalida();
        }
    }

    public void CleanButtons() {
        String color = "#F0F0F0";
        Boolean enabled = true;
        this.setEnabled(enabled);
        btn1.setEnabled(enabled);
        btn1.setBackground(Color.decode(color));
        btn2.setEnabled(enabled);
        btn2.setBackground(Color.decode(color));
        btn3.setEnabled(enabled);
        btn3.setBackground(Color.decode(color));
        btn4.setEnabled(enabled);
        btn4.setBackground(Color.decode(color));
        btn5.setEnabled(enabled);
        btn5.setBackground(Color.decode(color));
        btn6.setEnabled(enabled);
        btn6.setBackground(Color.decode(color));
        btn7.setEnabled(enabled);
        btn7.setBackground(Color.decode(color));
        btn8.setEnabled(enabled);
        btn8.setBackground(Color.decode(color));
        btn9.setEnabled(enabled);
        btn9.setBackground(Color.decode(color));
    }

    private void PreguntarSalida() {
        ThreadSendClient tscThread = new ThreadSendClient(sConnection, window);
        int response = JOptionPane.showConfirmDialog(null, "El juego ha terminado. ¿Desea reiniciarlo?",
                "Confirmación", JOptionPane.YES_NO_OPTION);
        if (response == 0) {
            tscThread.run();
            tscThread.sendButton(btn1, "HayGanador");
            CleanButtons();
        } else {
            System.exit(0);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        window = new frmWindowClient();
        window.setVisible(true);
        window.setTitle("Client Triky");

        ExecutorService esService = Executors.newCachedThreadPool();

        try {
            sConnection = new Socket(IP, PUERTO);
            esService.execute(new ThreadSendClient(sConnection, window));
            esService.execute(new ThreadReceiveClient(sConnection, window));
        } catch (IOException ex) {
            Logger.getLogger(frmWindowClient.class.getName()).log(Level.SEVERE, null, ex);
        }

        esService.shutdown();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn1;
    public javax.swing.JButton btn2;
    public javax.swing.JButton btn3;
    public javax.swing.JButton btn4;
    public javax.swing.JButton btn5;
    public javax.swing.JButton btn6;
    public javax.swing.JButton btn7;
    public javax.swing.JButton btn8;
    public javax.swing.JButton btn9;
    private javax.swing.JPanel pnlContainer;
    // End of variables declaration//GEN-END:variables

}
