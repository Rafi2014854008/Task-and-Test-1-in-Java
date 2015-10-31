/*
 * ITT786: Create txt file 
 * Author: Rafi Faizal Bin Zainal Abidin
 * Matrix No: 2014854008
 * Email Address: roughfee89@gmail.com
 * Github Account: https://github.com/rafi2014854008 
 */
package task.pkg1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Task1 {
 
  
    public static void main(String[] args) {
           
        String fileName = "Rafi.txt";
                        
        PrintWriter writer = null;
        
        try {
            writer = new PrintWriter(fileName);
            } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
                
        writer.println("Name: Rafi Faizal Zainal Abidin");
        writer.println("Matrix no: 2014854008");
        writer.println("Gender: Male");
        writer.println("Age: 35");
        writer.println("Emails: roughfee89@gmail.com");
        writer.println("Mobile Phone: 0192532985");
                        
        writer.close();
        
    }
    
}

