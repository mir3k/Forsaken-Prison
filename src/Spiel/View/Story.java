/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Spiel.View;

/**
 *
 * @author Gamer
 */
public class Story extends javax.swing.JPanel {
     private final MainFrame main;

        /**
         * Creates new form Help
         */
        public Story(MainFrame main) {
                initComponents();
                this.main=main;
                this.setVisible(false);
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jScrollPane1 = new javax.swing.JScrollPane();
      jTextArea1 = new javax.swing.JTextArea();
      jButton1 = new javax.swing.JButton();

      setBackground(new java.awt.Color(183, 89, 22));
      setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
      jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

      jTextArea1.setEditable(false);
      jTextArea1.setBackground(new java.awt.Color(183, 89, 22));
      jTextArea1.setColumns(20);
      jTextArea1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
      jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
      jTextArea1.setLineWrap(true);
      jTextArea1.setRows(5);
      jTextArea1.setTabSize(4);
      jTextArea1.setText("Du bist ein erfolgloser Abenteurer auf der Suche nach Reichtum. Eines Tages hörst du in einer Taverne von einem verfluchten Gefängnis in den Bergen. Dort soll es viele Schätze zu finden geben, aber auch Gefahren! Schnell besorgst du dir Proviant und machst dich auf den Weg in die Gegend, wo das Gefängnis sein soll. Nach einigen Tagen kommst du an. Du siehst einen großen kahlen Berg.In einem Tal davor rotten einige Steinbauten vor sich hin. Du machst dich dort auf die Suche nach einem Eingang. Schließlich findest du eine zugewachsene und halb verfallene Tür in den Berg. Du überlegst nicht lange und stemmst die Tür auf und machst dich auf den Weg in die Dunkelheit...\n\n");
      jTextArea1.setWrapStyleWord(true);
      jTextArea1.setBorder(null);
      jScrollPane1.setViewportView(jTextArea1);

      jButton1.setText("Start");
      jButton1.setActionCommand("Weiter");
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addGap(0, 0, Short.MAX_VALUE)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton1)
            .addContainerGap())
      );
   }// </editor-fold>//GEN-END:initComponents

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                this.setVisible(false);
        main.openGameFrame();
        main.getController().resumeGame();
        }//GEN-LAST:event_jButton1ActionPerformed

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jButton1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTextArea jTextArea1;
   // End of variables declaration//GEN-END:variables
}