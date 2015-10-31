
package task.pkg1;

import java.io.*;
import java.lang.*;

public class Binary {
    
    public static void main(String[] args) {
           
        String name = "Name:Rafi Faizal Zainal Abidin"
                + "Matrix no:2014854008" + "Gender: Male"
                + "Age: 35" + "Emails: roughfee89@gmail.com" 
                + "Mobile Phone: 0192532985";
        String fileName = "Rafi.bin";
        String textToWrite;
        
        PrintWriter pw = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
                        
              
        try {
            fw = new FileWriter(fileName);
            pw = new PrintWriter(new BufferedWriter(fw));
            } catch (IOException ex) {
            ex.printStackTrace();
        }
                 
            byte[] bytes = name.getBytes();
          
            for (byte b : bytes) {
                textToWrite = Integer.toBinaryString(b & 255 | 256).substring(1);
                pw.print(textToWrite);
                                
            }
            pw.close();   
            }
}
