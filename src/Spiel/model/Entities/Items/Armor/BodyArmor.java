/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Spiel.model.Entities.Items.Armor;

/**
 *
 * @author Lukas
 */
public abstract class BodyArmor extends Armor {
   private final int BODYARMORBASEPRICE=25;
    public BodyArmor(String name,int def,double droprate,int lvl){
        super(name,def,droprate);
        setType(Armortype.BodyArmor);
        setItemlvl(lvl);
        setSubimagey(lvl);
        setSubimagex(getType().getValue());
    }
   @Override
   public int itemPrice(){
      return getItemlvl()*BODYARMORBASEPRICE;



   }

      public static class LHemd extends BodyArmor {
           public LHemd(){
                   super("Leichtes Hemd", 1,500,1);

           }
      }
      public static class DHemd extends BodyArmor {
           public DHemd(){
                   super("Dickes Hemd", 2,400,2);

           }
      }
      public static class Lederruestung extends BodyArmor {
           public Lederruestung(){
                   super("Lederrüstung", 4,200,3);

           }
      }
      public static class Eisenruestung extends BodyArmor {
           public Eisenruestung(){
                   super("Eisenrüstung", 6,100,4);

           }
      }
      public static class Bronzeruestung extends BodyArmor {
           public Bronzeruestung(){
                   super("Bronzerüstung", 8,50,5);

           }
      }
      public static class Silberruestung extends BodyArmor {
           public Silberruestung(){
                   super("Silberrüstung", 10,20,6);

           }
      }
      public static class Goldruestung extends BodyArmor {
           public Goldruestung(){
                   super("Goldrüstung", 12,10,7);

           }
      }

}
