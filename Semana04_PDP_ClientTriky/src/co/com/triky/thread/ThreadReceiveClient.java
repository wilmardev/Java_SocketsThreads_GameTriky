/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.triky.thread;

import co.com.gui.triky.frmWindowClient;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wilmar Duque
 */
public class ThreadReceiveClient implements Runnable{
    
    private final Socket sConnection;
    private final frmWindowClient window;
    private DataInputStream disInput;
    private String msg;

    public ThreadReceiveClient(Socket sConnection, frmWindowClient window) {
        this.sConnection = sConnection;
        this.window = window;
    }

    @Override
    public void run() {
        try {
            disInput = new DataInputStream(sConnection.getInputStream());
            while (true) {                
                msg = disInput.readUTF();
                if(msg.equals("HayGanador"))
                    window.CleanButtons();
                else
                    window.printButton(msg);
            }
        } catch (IOException ex) {
            Logger.getLogger(ThreadReceiveClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
