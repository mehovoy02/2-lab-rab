/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgenerator;
import java.util.Random; 
import java.util.Scanner; 

public class PasswordGenerator {static private String[] data = 
{ "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", 
"a", "s", "d", "f", "g", "h", "j", "k", "l", 
"z", "x", "c", "v", "b", "n", "m", 
"1", "2", "3", "4", "5", "6", "7", "8", "9", "0" 
}; 

static private int randomNum(int min, int max) 
{ 
Random r = new Random(); 
return r.nextInt(max) + min; 
}   /**
} 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
         String S = sc.nextLine();
         int length = randomNum(4, 10);
         
         String[] p = new String[length];
         
         for(int i = 0; i < length ; i++){
             p[i]= data[randomNum(0, data.length)];
         }
         String password = "";
         
         for (String s : p){
             password +=s;
         }
         System.out.println(password);
     }
         
    } 
}
