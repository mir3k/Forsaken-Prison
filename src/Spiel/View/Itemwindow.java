/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Spiel.View;

import Spiel.Controller.Game;
import Spiel.model.Entities.Items.Armor;
import Spiel.model.Entities.Items.Item;
import Spiel.model.Entities.Items.Waffe;
import Spiel.model.Entities.Player;
import Spiel.model.MainModel;
import java.awt.Image;
import java.awt.image.BufferedImage;
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
        private final Game game;
        private Item[] items=new Item[1000];
        private BufferedImage allitems;
        public static ImageIcon[][] singleitem= new ImageIcon[8][8];
        /**
         * Creates new form Itemwindow
         */
        public Itemwindow(Game game) {
                this.game=game;
                initComponents();
                try {
                      allitems= ImageIO.read(getClass().getResource("/resources/items1.png"));
                        //Erstellen der Icons für alle Items
                        for (int j = 0; j < 8; j++) {
                                for (int k = 0; k < 8; k++) {
                                Image temp = allitems.getSubimage(j*32,k*32,32,32);
                                temp = temp.getScaledInstance(70, 70, Image.SCALE_DEFAULT);
                                singleitem[j][k] = new ImageIcon(temp);
                                }
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
        itemList = new ItemList(game);
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        smallhealthPotionLabel = new javax.swing.JLabel();
        bighealthPotionLabel = new javax.swing.JLabel();
        mediumhealthPotionLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        weaponLabel = new javax.swing.JLabel();
        damageLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        armorLabel = new javax.swing.JLabel();
        defenceLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(183, 89, 22));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setForeground(new java.awt.Color(255, 255, 255));

        headLineLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        headLineLabel.setForeground(new java.awt.Color(255, 255, 255));
        headLineLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        jLabel1.setText("Drücke \"E\" um ein Item auszurüsten oder zu benutzen!");
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
            .addComponent(mediumhealthPotionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bighealthPotionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(smallhealthPotionLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(smallhealthPotionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mediumhealthPotionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bighealthPotionLabel))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Waffe", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24), java.awt.Color.white)); // NOI18N
        jPanel2.setOpaque(false);

        weaponLabel.setForeground(new java.awt.Color(255, 255, 255));
        weaponLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weaponLabel.setText("Keine Waffe");
        weaponLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        damageLabel.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        damageLabel.setForeground(new java.awt.Color(255, 255, 255));
        damageLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Schaden", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14), java.awt.Color.white)); // NOI18N
        damageLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(damageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weaponLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(weaponLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(damageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rüstung", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 24), java.awt.Color.white)); // NOI18N
        jPanel3.setOpaque(false);

        armorLabel.setForeground(new java.awt.Color(255, 255, 255));
        armorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        armorLabel.setText("Keine Rüstung");
        armorLabel.setToolTipText("");
        armorLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        defenceLabel.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        defenceLabel.setForeground(new java.awt.Color(255, 255, 255));
        defenceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        defenceLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Verteidigung", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14), java.awt.Color.white)); // NOI18N
        defenceLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(armorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(defenceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(armorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(defenceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("i - Fenster schließen");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(headLineLabel)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headLineLabel)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel armorLabel;
    private javax.swing.JLabel bighealthPotionLabel;
    private javax.swing.JLabel damageLabel;
    private javax.swing.JLabel defenceLabel;
    private javax.swing.JLabel headLineLabel;
    private javax.swing.JList itemList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mediumhealthPotionLabel;
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
                        if (player.getArmor()!=null) {
                        this.armorLabel.setText(player.getArmor().getName());
                        int armorx=player.getArmor().getSubimagex();
                        int armory=player.getArmor().getSubimagey();
                        this.armorLabel.setIcon(singleitem[armorx][armory]);
                        this.defenceLabel.setText(Integer.toString(((Armor)player.getArmor()).getDefence()));
                     }
                        this.smallhealthPotionLabel.setText(Integer.toString(player.getSmallpotions()));
                        this.mediumhealthPotionLabel.setText(Integer.toString(player.getMediumpotions()));
                        this.bighealthPotionLabel.setText(Integer.toString(player.getBigpotions()));
                        
                        //Festlegen des Inhalts für die Inventarliste
                        i = itemList.getSelectedIndex();
                        items= (Item[]) player.getInventar().toArray(new Item[0]);
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
        
}
