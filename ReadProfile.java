/*
 * ITT786: Read txt file 
 * Author: Rafi Faizal Bin Zainal Abidin
 * Matrix No: 2014854008
 * Email Address: roughfee89@gmail.com
 * Github Account: https://github.com/rafi2014854008 
 */
package task.pkg1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class ReadProfile {
    
   public static void main(String[] args) {
       
       BufferedReader br = null;
       
       String line;
       
       try {
           
           br = new BufferedReader(new FileReader("Rafi.txt"));
           
           while((line = br.readLine()) != null){
               System.out.println(line);
           }
       } catch (IOException e) {
           e.printStackTrace();
           
       }
   }
    
}
