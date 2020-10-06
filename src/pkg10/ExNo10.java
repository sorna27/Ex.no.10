/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex.no.pkg10;

import java.io.File;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class ExNo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fn=obj.next();
        File f=new File(fn);
        int a=0;
        if(f.exists())
        {
            System.out.println("The file is Available...");
            if(f.canWrite())
            {
                System.out.println("->Writeable");
                a++;
            }
            if(f.canRead())
            {
                System.out.println("->Readable");
                a++;
            }
            if(a==2)
            {
                System.out.println("->Both readable and writeable");
            }
            System.out.println( "Length of the file is "+f.length()+" bytes");
            System.out.print("Type of the file is:");
            int l=fn.length();
            char c[]=fn.toCharArray();
            for(int i=0;i<c.length;i++)
            {
                if(c[i]=='.')
                {
                    for(int j=i+1;j<c.length;j++)
                    {
                        System.out.print(c[j]);
                        
                    }
                    break;
                }
            }
                
        }
        else
        {
            System.out.println("The file is not Available...");
        }
    }
    
}
