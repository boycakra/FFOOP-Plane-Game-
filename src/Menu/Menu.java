package Menu;

import Adegan1.Starter;
import Adegan2.Starter2;
import Adegan3.Starter3;
import Adegan4.Starter4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Hp
 */
public class Menu extends javax.swing.JFrame {
    /**
     * Creates new form Menu
     */
    
    //membuat object musik
        String filePath= ".\\Sound\\Menu.wav";
        MusicStuff musicObject ;
        private boolean highscore;
    
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        
        //jalankan musik

        musicObject = new MusicStuff();
        musicObject.playMusic(filePath);
        
    }
    //object dari starter
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Story1 = new javax.swing.JButton();
        Help = new javax.swing.JButton();
        Judul = new javax.swing.JLabel();
        SoundSeting = new javax.swing.JLabel();
        Offsound = new javax.swing.JRadioButton();
        onSound = new javax.swing.JRadioButton();
        Option = new javax.swing.JLabel();
        Option2 = new javax.swing.JLabel();
        Story4 = new javax.swing.JButton();
        Story2 = new javax.swing.JButton();
        Story3 = new javax.swing.JButton();
        Story = new javax.swing.JLabel();
        Game1 = new javax.swing.JButton();
        Game2 = new javax.swing.JButton();
        Game3 = new javax.swing.JButton();
        Game4 = new javax.swing.JButton();
        HighScore = new javax.swing.JButton();
        Story0 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Story5 = new javax.swing.JButton();
        Story6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));

        Story1.setFont(new java.awt.Font("VCR OSD Mono", 1, 18)); // NOI18N
        Story1.setText("Story 1");
        Story1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Story1ActionPerformed(evt);
            }
        });

        Help.setFont(new java.awt.Font("VCR OSD Mono", 1, 18)); // NOI18N
        Help.setText("Help");
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });

        Judul.setFont(new java.awt.Font("VCR OSD Mono", 1, 55)); // NOI18N
        Judul.setText("GERILYA UDARA ‘47");

        SoundSeting.setFont(new java.awt.Font("VCR OSD Mono", 1, 18)); // NOI18N
        SoundSeting.setText("Sound :");

        Offsound.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(Offsound);
        Offsound.setFont(new java.awt.Font("VCR OSD Mono", 1, 18)); // NOI18N
        Offsound.setText("OFF");
        Offsound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OffsoundActionPerformed(evt);
            }
        });

        onSound.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(onSound);
        onSound.setFont(new java.awt.Font("VCR OSD Mono", 1, 18)); // NOI18N
        onSound.setText("ON");
        onSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSoundActionPerformed(evt);
            }
        });

        Option.setFont(new java.awt.Font("VCR OSD Mono", 1, 24)); // NOI18N
        Option.setText("Option");

        Option2.setFont(new java.awt.Font("VCR OSD Mono", 1, 24)); // NOI18N
        Option2.setText("Game");

        Story4.setFont(new java.awt.Font("VCR OSD Mono", 1, 18)); // NOI18N
        Story4.setText("Transit");
        Story4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Story4ActionPerformed(evt);
            }
        });

        Story2.setFont(new java.awt.Font("VCR OSD Mono", 1, 18)); // NOI18N
        Story2.setText("Story 2");
        Story2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Story2ActionPerformed(evt);
            }
        });

        Story3.setFont(new java.awt.Font("VCR OSD Mono", 1, 18)); // NOI18N
        Story3.setText("Story 3");
        Story3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Story3ActionPerformed(evt);
            }
        });

        Story.setFont(new java.awt.Font("VCR OSD Mono", 1, 24)); // NOI18N
        Story.setText("Story");

        Game1.setFont(new java.awt.Font("VCR OSD Mono", 1, 18)); // NOI18N
        Game1.setText("Game 1");
        Game1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Game1ActionPerformed(evt);
            }
        });

        Game2.setFont(new java.awt.Font("VCR OSD Mono", 1, 18)); // NOI18N
        Game2.setText("Game 2");
        Game2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Game2ActionPerformed(evt);
            }
        });

        Game3.setFont(new java.awt.Font("VCR OSD Mono", 1, 18)); // NOI18N
        Game3.setText("Game 3");
        Game3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Game3ActionPerformed(evt);
            }
        });

        Game4.setFont(new java.awt.Font("VCR OSD Mono", 1, 18)); // NOI18N
        Game4.setText("Game 4");
        Game4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Game4ActionPerformed(evt);
            }
        });

        HighScore.setFont(new java.awt.Font("VCR OSD Mono", 1, 18)); // NOI18N
        HighScore.setText("Hight Score");
        HighScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HighScoreActionPerformed(evt);
            }
        });

        Story0.setFont(new java.awt.Font("VCR OSD Mono", 1, 18)); // NOI18N
        Story0.setText("Intro");
        Story0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Story0ActionPerformed(evt);
            }
        });

        Story5.setFont(new java.awt.Font("VCR OSD Mono", 1, 18)); // NOI18N
        Story5.setText("End");
        Story5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Story5ActionPerformed(evt);
            }
        });

        Story6.setFont(new java.awt.Font("VCR OSD Mono", 1, 18)); // NOI18N
        Story6.setText("Story 4");
        Story6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Story6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1)
                        .addGap(168, 168, 168)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Option2)
                                .addGap(250, 250, 250))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Option, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(220, 220, 220))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(SoundSeting, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(onSound)
                                .addGap(31, 31, 31)
                                .addComponent(Offsound)
                                .addGap(155, 155, 155))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Game1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Help, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(HighScore))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Game2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Game3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(Game4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(Story0, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Story1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Story2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Story3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Story4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Story6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Story5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(483, 483, 483)
                        .addComponent(Story)))
                .addGap(0, 60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Judul, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(Judul, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Story, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Story2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Story3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Story1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Story4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Story0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Story5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Story6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Option2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Game2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Game3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Game1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Game4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Option, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(onSound)
                            .addComponent(Offsound, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SoundSeting, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Help, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HighScore, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Game4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Game4ActionPerformed
        // TODO add your handling code here:
        //musicObject.stopMusic();
        Starter4.main("game1");
    }//GEN-LAST:event_Game4ActionPerformed

    private void Game3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Game3ActionPerformed
        // TODO add your handling code here:
        //musicObject.stopMusic();
        Starter3.main("game1");
    }//GEN-LAST:event_Game3ActionPerformed

    private void Game2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Game2ActionPerformed
        // TODO add your handling code here:
        //musicObject.stopMusic();
        Starter2.main("game1");
    }//GEN-LAST:event_Game2ActionPerformed

    private void Game1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Game1ActionPerformed
        // TODO add your handling code here:
        //StartStory startStory = new StartStory();
        //new Starter().setVisible(true);
        //musicObject.stopMusic();
        //String namaLagu = ".\\Sound\\Adegan1.wav";
        //BackSound music = new BackSound();
        //music.playMusic(namaLagu);
        //musicObject = new MusicStuff();
        //musicObject.playMusic(".\\Sound\\Adegan1.wav");
        
        Starter.main("game1");
 
    }//GEN-LAST:event_Game1ActionPerformed

    private void Story3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Story3ActionPerformed
        // TODO add your handling code here:
        new Story5().setVisible(true);
    }//GEN-LAST:event_Story3ActionPerformed

    private void Story2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Story2ActionPerformed
        // TODO add your handling code here:
        new Story4().setVisible(true);
    }//GEN-LAST:event_Story2ActionPerformed

    private void Story4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Story4ActionPerformed
        // TODO add your handling code here:
        new Story6().setVisible(true);
    }//GEN-LAST:event_Story4ActionPerformed

    private void onSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onSoundActionPerformed
        // TODO add your handling code here:
        musicObject.stopMusic();
        musicObject = new MusicStuff();
        musicObject.playMusic(filePath);
    }//GEN-LAST:event_onSoundActionPerformed

    private void OffsoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OffsoundActionPerformed
        // TODO add your handling code here:
        musicObject.stopMusic();
    }//GEN-LAST:event_OffsoundActionPerformed

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        // TODO add your handling code here:
        new help().setVisible(true);
    }//GEN-LAST:event_HelpActionPerformed

    private void Story1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Story1ActionPerformed
      
        new Story3().setVisible(true);

    }//GEN-LAST:event_Story1ActionPerformed

    private void HighScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HighScoreActionPerformed
        // TODO add your handling code here:
       // HighScore scores = new HighScore(100,1,"yasin");
        new score().setVisible(true);
       // scores.addHighScore(scores);
      
    }//GEN-LAST:event_HighScoreActionPerformed

    private void Story0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Story0ActionPerformed
        // TODO add your handling code here:
        new Story1().setVisible(true);
    }//GEN-LAST:event_Story0ActionPerformed

    private void Story5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Story5ActionPerformed
        // TODO add your handling code here:
        new Story9().setVisible(true);
    }//GEN-LAST:event_Story5ActionPerformed

    private void Story6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Story6ActionPerformed
        // TODO add your handling code here:
        new Story7().setVisible(true);
    }//GEN-LAST:event_Story6ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Game1;
    private javax.swing.JButton Game2;
    private javax.swing.JButton Game3;
    private javax.swing.JButton Game4;
    private javax.swing.JButton Help;
    private javax.swing.JButton HighScore;
    private javax.swing.JLabel Judul;
    private javax.swing.JRadioButton Offsound;
    private javax.swing.JLabel Option;
    private javax.swing.JLabel Option2;
    private javax.swing.JLabel SoundSeting;
    private javax.swing.JLabel Story;
    private javax.swing.JButton Story0;
    private javax.swing.JButton Story1;
    private javax.swing.JButton Story2;
    private javax.swing.JButton Story3;
    private javax.swing.JButton Story4;
    private javax.swing.JButton Story5;
    private javax.swing.JButton Story6;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton onSound;
    // End of variables declaration//GEN-END:variables
}
