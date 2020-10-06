/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex.no.pkg10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author asus
 */
public class ch {
    public static void main(String args[]) throws Exception{
        FileInputStream fio=null;
        FileOutputStream fou=null;
        FileReader fr=null;
        FileWriter fw=null;
        fio=new FileInputStream ("pht.jpg");
        fou=new FileOutputStream("pht1.jpg");
        int i;
        while((i=fio.read())!=-1)
        {
            fou.write(i);
        }
        fou.close();
        
        fr=new FileReader ("pht.jpg");
        fw=new FileWriter("pht2.jpg");
        int j;
        while((j=fr.read())!=-1)
        {
            fw.write(j);
        }
        fw.close(); 
}
}
