/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Spiel.View;

import Spiel.model.Entities.Items.Armor.Armor.Armortype;
import Spiel.model.Entities.Items.Item;
import Spiel.model.Entities.Items.Waffe;
import Spiel.model.Entities.Player;
import Spiel.model.MainModel;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Gamer
 */

public class Itemwindow extends javax.swing.JPanel implements Observer {


        private Player player;
        private int i;
        private Item[] items;
        private BufferedImage allitems;
        private BufferedImage bg;
        public static ImageIcon[][] singleitem= new ImageIcon[8][8];
        public static ImageIcon[][] armoritem= new ImageIcon[5][20];
        private MainFrame gameframe;
        /**
         * Creates new form Itemwindow
         */
        public Itemwindow(MainFrame gameframe) {
                this.gameframe=gameframe;
                initComponents();
                try {
                     bg= ImageIO.read(getClass().getResource("/resources/inventorybg.png"));
                      allitems= ImageIO.read(getClass().getResource("/resources/items1.png"));
                        //Erstellen der Icons für alle Items
                        for (int j = 0; j < 8; j++) {
                                for (int k = 0; k < 8; k++) {
                                Image temp = allitems.getSubimage(j*32,k*32,32,32);
                                temp = temp.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
                                singleitem[j][k] = new ImageIcon(temp);
                                }
                        }
                    for (Armortype ar : Armortype.values()) {
                       boolean nextFile;
                        String name = ar.name();
                        int i = 1;
                        do {

                            String path = "/resources/items/" + name + " (" + i + ").png";
                            armoritem[ar.getValue()][i] = new ImageIcon(ImageIO.read(getClass().getResource(path)).getScaledInstance(34, 34, Image.SCALE_DEFAULT));
                            boolean exists = false;
                            try {
                                exists = (new File(getClass().getResource("/resources/items/" + name + " (" + (i + 1) + ").png").toURI())).exists();

                            } catch (Exception e) {
                                exists = false;
                            }

                            if (exists) {
                                nextFile = true;
                                i++;
                            } else {
                                nextFile = false;
                            }

                        } while (nextFile);

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                setVisible(false);
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      headLineLabel = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      itemList = new ItemList(gameframe);
      jLabel1 = new javax.swing.JLabel();
      jPanel1 = new javax.swing.JPanel();
      smallhealthPotionLabel = new javax.swing.JLabel();
      bighealthPotionLabel = new javax.swing.JLabel();
      mediumhealthPotionLabel = new javax.swing.JLabel();
      jPanel2 = new javax.swing.JPanel();
      weaponLabel = new javax.swing.JLabel();
      jPanel3 = new javax.swing.JPanel();
      bodyArmorLabel = new javax.swing.JLabel();
      helmetLabel = new javax.swing.JLabel();
      shoesLabel = new javax.swing.JLabel();
      glovesLabel = new javax.swing.JLabel();
      shieldLabel = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      defenceLabel = new javax.swing.JLabel();
      damageLabel = new javax.swing.JLabel();
      moneyLable = new javax.swing.JLabel();

      setBackground(new java.awt.Color(183, 89, 22));
      setBorder(javax.swing.BorderFactory.createEtchedBorder());
      setForeground(new java.awt.Color(255, 255, 255));

      headLineLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
      headLineLabel.setForeground(new java.awt.Color(255, 255, 255));
      headLineLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      headLineLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backpack.png"))); // NOI18N
      headLineLabel.setText("Ausrüstung");
      headLineLabel.setFocusable(false);

      jScrollPane1.setBackground(new java.awt.Color(183, 89, 22));
      jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inventar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14), java.awt.Color.white)); // NOI18N
      jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

      itemList.setBackground(new java.awt.Color(183, 89, 22));
      itemList.setForeground(new java.awt.Color(255, 255, 255));
      jScrollPane1.setViewportView(itemList);

      jLabel1.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(255, 255, 255));
      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel1.setText("Mit Pfeiltasten navigieren. Drücke \"E\" um ein Item auszurüsten oder zu benutzen!");
      jLabel1.setToolTipText("");

      jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tränke", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 18), java.awt.Color.white)); // NOI18N
      jPanel1.setFocusable(false);
      jPanel1.setOpaque(false);

      smallhealthPotionLabel.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
      smallhealthPotionLabel.setForeground(new java.awt.Color(255, 255, 255));
      smallhealthPotionLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/small-potion.png"))); // NOI18N
      smallhealthPotionLabel.setToolTipText("");
      smallhealthPotionLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Klein:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 12), java.awt.Color.white)); // NOI18N

      bighealthPotionLabel.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
      bighealthPotionLabel.setForeground(new java.awt.Color(255, 255, 255));
      bighealthPotionLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/big-potion.png"))); // NOI18N
      bighealthPotionLabel.setToolTipText("");
      bighealthPotionLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Groß", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 12), java.awt.Color.white)); // NOI18N

      mediumhealthPotionLabel.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
      mediumhealthPotionLabel.setForeground(new java.awt.Color(255, 255, 255));
      mediumhealthPotionLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/medium-potion.png"))); // NOI18N
      mediumhealthPotionLabel.setToolTipText("");
      mediumhealthPotionLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mittel:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 12), java.awt.Color.white)); // NOI18N

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(mediumhealthPotionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
         .addComponent(bighealthPotionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(smallhealthPotionLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(smallhealthPotionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
            .addComponent(mediumhealthPotionLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(bighealthPotionLabel)
            .addContainerGap())
      );

      jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Waffe", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24), java.awt.Color.white)); // NOI18N
      jPanel2.setOpaque(false);

      weaponLabel.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
      weaponLabel.setForeground(new java.awt.Color(255, 255, 255));
      weaponLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      weaponLabel.setText("Keine Waffe");
      weaponLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(weaponLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(42, 42, 42))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(weaponLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
      );

      jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rüstung", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 24), java.awt.Color.white)); // NOI18N
      jPanel3.setMaximumSize(new java.awt.Dimension(250, 400));
      jPanel3.setOpaque(false);
      jPanel3.setPreferredSize(new java.awt.Dimension(250, 241));

      bodyArmorLabel.setForeground(new java.awt.Color(255, 255, 255));
      bodyArmorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      bodyArmorLabel.setText("Keine Rüstung");
      bodyArmorLabel.setToolTipText("");
      bodyArmorLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
      bodyArmorLabel.setMaximumSize(new java.awt.Dimension(150, 150));

      helmetLabel.setForeground(new java.awt.Color(255, 255, 255));
      helmetLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      helmetLabel.setText("Kein Helm");
      helmetLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
      helmetLabel.setMaximumSize(new java.awt.Dimension(150, 150));

      shoesLabel.setForeground(new java.awt.Color(255, 255, 255));
      shoesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      shoesLabel.setText("Keine Schuhe");
      shoesLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
      shoesLabel.setMaximumSize(new java.awt.Dimension(150, 150));

      glovesLabel.setForeground(new java.awt.Color(255, 255, 255));
      glovesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      glovesLabel.setText("Keine Handschuhe");
      glovesLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
      glovesLabel.setMaximumSize(new java.awt.Dimension(150, 150));
      glovesLabel.setMinimumSize(new java.awt.Dimension(90, 14));
      glovesLabel.setName(""); // NOI18N
      glovesLabel.setPreferredSize(new java.awt.Dimension(100, 14));

      shieldLabel.setForeground(new java.awt.Color(255, 255, 255));
      shieldLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      shieldLabel.setText("Kein Schild");
      shieldLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
      shieldLabel.setMaximumSize(new java.awt.Dimension(150, 150));

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(bodyArmorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
               .addComponent(helmetLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(shoesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(shieldLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(glovesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(glovesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(shieldLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addComponent(helmetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(11, 11, 11)
                  .addComponent(bodyArmorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(shoesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(30, Short.MAX_VALUE))
      );

      jLabel2.setForeground(new java.awt.Color(255, 255, 255));
      jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
      jLabel2.setText("i - Fenster schließen");

      defenceLabel.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
      defenceLabel.setForeground(new java.awt.Color(255, 255, 255));
      defenceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
      defenceLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Verteidigung", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14), java.awt.Color.white)); // NOI18N
      defenceLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

      damageLabel.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
      damageLabel.setForeground(new java.awt.Color(255, 255, 255));
      damageLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Schaden", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14), java.awt.Color.white)); // NOI18N
      damageLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

      moneyLable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
      moneyLable.setForeground(new java.awt.Color(255, 255, 255));
      moneyLable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Münzen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 14), java.awt.Color.white)); // NOI18N
      moneyLable.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jScrollPane1)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                           .addComponent(damageLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(defenceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                     .addComponent(moneyLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGap(23, 23, 23)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                     .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))))
            .addContainerGap())
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(headLineLabel)
            .addGap(281, 281, 281))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(headLineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(damageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(defenceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(moneyLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jLabel2)
                  .addGap(18, 18, 18)
                  .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
   }// </editor-fold>//GEN-END:initComponents
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel bighealthPotionLabel;
   private javax.swing.JLabel bodyArmorLabel;
   private javax.swing.JLabel damageLabel;
   private javax.swing.JLabel defenceLabel;
   private javax.swing.JLabel glovesLabel;
   private javax.swing.JLabel headLineLabel;
   private javax.swing.JLabel helmetLabel;
   private javax.swing.JList itemList;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JLabel mediumhealthPotionLabel;
   private javax.swing.JLabel moneyLable;
   private javax.swing.JLabel shieldLabel;
   private javax.swing.JLabel shoesLabel;
   private javax.swing.JLabel smallhealthPotionLabel;
   private javax.swing.JLabel weaponLabel;
   // End of variables declaration//GEN-END:variables

        @Override
        public void update(transEnum enu, MainModel mm) {
                if (enu==transEnum.playerstats) {
                        this.player=mm.getPlayer();


                        //Aktualisieren der Labels im Fenster
                        if (player.getWeapon()!=null) {
                        this.weaponLabel.setText(player.getWeapon().getName()) ;
                        int weaponx=player.getWeapon().getSubimagex();
                        int weapony=player.getWeapon().getSubimagey();
                        this.weaponLabel.setIcon(singleitem[weaponx][weapony]);
                        this.damageLabel.setText(Integer.toString(((Waffe)player.getWeapon()).getDamage()));

                     }



                        if (player.getArmor(Armortype.BodyArmor)!=null) {
                        this.bodyArmorLabel.setText(player.getArmor(Armortype.BodyArmor).showStat()+" Def");
                        this.bodyArmorLabel.setIcon(armoritem[Armortype.BodyArmor.getValue()] [player.getArmor(Armortype.BodyArmor).getItemlvl()]);
                     }
                        if (player.getArmor(Armortype.Shoes)!=null) {
                        this.shoesLabel.setText(player.getArmor(Armortype.Shoes).showStat()+" Def");
                        this.shoesLabel.setIcon(armoritem[Armortype.Shoes.getValue()] [player.getArmor(Armortype.Shoes).getItemlvl()]);
                     }
                        if (player.getArmor(Armortype.Gloves)!=null) {
                        this.glovesLabel.setText(player.getArmor(Armortype.Gloves).showStat()+" Def");
                        this.glovesLabel.setIcon(armoritem[Armortype.Gloves.getValue()] [player.getArmor(Armortype.Gloves).getItemlvl()]);
                     }
                        if (player.getArmor(Armortype.Shield)!=null) {
                        this.shieldLabel.setText(player.getArmor(Armortype.Shield).showStat()+" Def");
                        this.shieldLabel.setIcon(armoritem[Armortype.Shield.getValue()] [player.getArmor(Armortype.Shield).getItemlvl()]);
                     }
                        if (player.getArmor(Armortype.Helmet)!=null) {
                        this.helmetLabel.setText(player.getArmor(Armortype.Helmet).showStat()+" Def");
                        this.helmetLabel.setIcon(armoritem[Armortype.Helmet.getValue()] [player.getArmor(Armortype.Helmet).getItemlvl()]);
                     }

                        this.defenceLabel.setText(Integer.toString(player.getDefence()));
                        this.smallhealthPotionLabel.setText(Integer.toString(player.getSmallpotions()));
                        this.mediumhealthPotionLabel.setText(Integer.toString(player.getMediumpotions()));
                        this.bighealthPotionLabel.setText(Integer.toString(player.getBigpotions()));
                        this.moneyLable.setText(Integer.toString(player.getCoins()));

                        //Festlegen des Inhalts für die Inventarliste
                        i = itemList.getSelectedIndex();
                        items= (Item[]) player.getInventar().toArray(new Item[player.getInventar().size()]);
                        this.itemList.setListData(items);







                }
        }

        @Override
        public void update(char[][] map) {
        }




        public void focustoItemList(){
                itemList.requestFocus();


        }

        public Player getPlayer() {
                return player;
        }

        public JLabel getWeaponLabel() {
                return weaponLabel;
        }

   @Override
   public void update(sounds s, long delta) {
   }

}
