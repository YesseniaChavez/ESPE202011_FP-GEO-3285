
package ec.edu.espe.print.controller;

import Utils.FileManager;
import ec.edu.espe.print.model.Print;


public class PrintController {
    
     public static void save(Print print){
         String data = print.isTheodolite() + ";" + print.getColor() 
                 + ";" + print.getMaterial() + ";" + print.getHeight() + ";" + print.getPrice();
   FileManager.save(data, "Print");
     }

}
