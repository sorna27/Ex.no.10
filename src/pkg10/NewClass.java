/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex.no.pkg10;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author meena
 */
public class NewClass {
    public static void main(String[] args) throws Exception
    {
      Scanner obj=new Scanner(System.in);
      FileWriter fw=new FileWriter("f.txt");
      String str[]={"aaa","12345","bbb","67890","ccc","24680","ddd","13579"};
      for(String i:str)
      {
        fw.write(i);
        fw.write(10);
      }
      fw.close();
      System.out.println("Enter the name : ");
      String name=obj.next();
      int i,d=0;
      for(i=0;i<str.length;i++)
      {
        if(str[i].contains(name))
        {
            System.out.println("Phone number : "+str[i+1]);
            d=1;
            return;
        }
      }
      if(d==0)
          System.out.println("Name not found...");
    }
   
}

    
        
  