package algoZoo.challenge;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * The class created for the creation and editing of the Test Mode's save files.
 * @author Görkem
 * @version 1.0
 */
public class ChallengeLevelsSave {

   // properties
   private static final String fileName = "/ChallengeModeSave.sav";
   private static final String root = "/AlgoZooSave";

   // methods
   /**
    * Saving the objects to the file that has specific location.
    * @param objectToSerialise The object that will be serialised
    */
   public static void save(Serializable objectToSerialise) {

      try (FileOutputStream fos = new FileOutputStream(createDataFolder() + fileName);) {

         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(objectToSerialise);
         // flush (write) the stream
         oos.flush();
         // close the oos
         oos.close();

      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   /**
    * Reading the objects from the file that has specific location.
    * @return LearnLevelsSaveContainer The objects that containing boolean
    * values of the Learn Mode Levels.
    */
   public static ChallengeLevelsSaveContainer load() {
      // check that the file we want to load exists
      if (checkFileExists()) {
         FileInputStream fis = null;
         ChallengeLevelsSaveContainer loadedObject = null;
         try {

            // initialize the FileInputStream
            fis = new FileInputStream(createDataFolder() + fileName);
            // create an ObjectInputStream from the FileInputStream
            ObjectInputStream ois = new ObjectInputStream(fis);

            //create the object itself from the stream            
            loadedObject = (ChallengeLevelsSaveContainer) ois.readObject();
            ois.close();
         } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
         }
         return loadedObject;
      }
      return null;
   }

   /**
    * Creates the data folder according to Operating System.
    * @return String The filepath
    */
   private static String createDataFolder() {
      String home = System.getProperty("user.home");
      String OS = System.getProperty("os.name").toLowerCase();

      // for windows
      if (OS.contains("win")) {
         home = System.getenv("appdata");
         //home = home + "/Desktop";
      } 
      // for macOS
      else if (OS.contains("mac")) {
         home = home + "~/Library/Application Support";
      } 
      // for linux
      else if (OS.contains("nix") || OS.contains("nux") || OS.contains("aix")) {
         home = home + "~/.";
      }

      // Parent folder
      File dir = new File(home);

      // Sub-folder in Parent Folder
      dir = new File(dir, root);

      if (!dir.exists()) {
         dir.mkdir();         
      }
      return dir.getAbsolutePath();
   }

   /**
    * Deletes the created save file.
    * @return boolean. Returns true when the file was deleted. Returns false the
    * file was not deleted.
    */
   public static boolean deleteSaveFile() {
      // checks the whether the file exists or not
      if (!checkFileExists()) {
         System.err.println("File: " + createDataFolder() + fileName + " does not exist!");
         return new File(createDataFolder()).delete();
      }
      File toDelete = new File(createDataFolder() + fileName);

      if (toDelete.canWrite()) {
         return toDelete.delete();
      }
      System.err.println("File: " + createDataFolder() + fileName + " is write protected!");
      return false;
   }

   /**
    * Checks whether the file exists or not.
    * @return boolean. Returns true when the file exists. Returns false the file
    * does not exists.
    */
   public static boolean checkFileExists() {
      return new File(createDataFolder() + fileName).isFile();     
   }
}
