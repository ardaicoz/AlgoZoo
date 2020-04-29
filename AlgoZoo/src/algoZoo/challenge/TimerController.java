/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.challenge;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author esra
 */
public class TimerController extends javax.swing.JPanel {
    //properties
    Timer timer;
    TimerTask task;
    int second;
    int minute;
    ChallengeModeModel cmm;

    /**
     * Creates new form TimerController
     */
    public TimerController(ChallengeModeModel cmm) {
        this.cmm = cmm;
        remainingTime.setText(minute + ":" + second);
        resetTimer();    
    }
    
    //methods
    public void resetTimer() {
        cmm.setUsedTime(0);
        second = cmm.getMinRequiredTime() % 60;
        minute = cmm.getMinRequiredTime() / 60;
        remainingTime.setText(minute + ":" + second);
        timer = new java.util.Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                remainingTime.setText(minute + ":" + second);
                second--;
                if(second < 0) {
                    second = 59;
                    minute--;
                }
                if(minute < 0) {
                    timer.cancel();
                }
                cmm.increaseUsedTime();
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
    
    public void stopTimer() {
        timer.cancel();  
    }

    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        remainingTime = new javax.swing.JLabel();

        remainingTime.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(remainingTime, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(remainingTime, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel remainingTime;
    // End of variables declaration//GEN-END:variables
}
