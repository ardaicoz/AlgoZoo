package algoZoo.game;

/**
 * Flower class to represent flowers with a boolean pollenGathered property
 * @author Görkem, Ayberk
 * @version 1.0
 */
public class Flower {
   // properties
   final int       TILE_WIDTH = 64;
   final int       TILE_HEIGHT = 64;
   final int       SPACE_WIDTH= 8;
   final int       SPACE_HEIGHT = 12;
   private int     x;
   private int     y;
   private boolean pollenGathered;

   // constructor
   /**
    * Creates a flower object in the specified x and y location.
    * @param x The location of the flower with respect to x-axis.
    * @param y The location of the flower with respect to y-axis.
    */
   public Flower(int x, int y) {
      //set location units
      this.x = (TILE_WIDTH * (x - 1)) + SPACE_WIDTH;
      this.y = (TILE_HEIGHT * (y - 1)) + SPACE_HEIGHT;
      //set pollenGathered
      pollenGathered = false;
   }
   
   // methods
   /**
    * Returns x which is the x location of the flower
    * @return x The x location of the flower.
    */
   public int getX() {
      return x;
   }

   /**
    * Returns y which is the y location of the flower
    * @return y The y location of the flower.
    */
   public int getY() {
      return y;
   }
   
   /**
    * Sets pollenGathered property
    * @param gathered represent if the pollen was gathered or not.
    */
   public void setPollenGathered(boolean gathered) {
      pollenGathered = gathered;
   }
   
   /**
    * Returns pollenGathered property
    * @return Returns true if pollen was gathered. Returns false if pollen was not gathered.
    */
   public boolean getPollenGathered(){
      return pollenGathered;
   }
}
