/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.challenge;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author gorke
 */
public class ChallengeLevelsSave{

   public static final String fileName = "/ChallengeModeSave.sav";
   public static final String root = "/ChallengeMode";

   public static void save(Serializable objectToSerialise) {         

      try(FileOutputStream fos = new FileOutputStream(createDataFolder() + fileName);) {
         
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

   private static String createDataFolder() {
      String home = System.getProperty("user.home");
      String OS = System.getProperty("os.name").toLowerCase();

      if (OS.contains("win")) {
         home = System.getenv("appdata");
         //home = home + "/Desktop";
      } else if (OS.contains("mac")) {
         home = home + "~/Library/Application Support";
      } else if (OS.contains("nix") || OS.contains("nux") || OS.contains("aix")) {
         home = home + "~/.";
      }

      // Parent folder
      File dir = new File(home);

      // Sub-folder in Parent Folder
      dir = new File(dir, root);

      if (!dir.exists()) {
         dir.mkdir(); // mkdir means making directory
         //System.out.println("Creating Directory...");
      }

      return dir.getAbsolutePath();
   }

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

   public static boolean checkFileExists() {
      return new File(createDataFolder() + fileName).isFile();
      // the isFile method rerturns true only if valid file is located in the directory folder specified.
      // It will not return true if the directory itself is named after the filename.
   }

}
