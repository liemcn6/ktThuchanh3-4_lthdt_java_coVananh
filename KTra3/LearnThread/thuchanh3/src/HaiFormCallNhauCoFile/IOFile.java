/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HaiFormCallNhauCoFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class IOFile {
    
    public static <T> List<T> docra(String file) {
        List<T> list=new ArrayList<>();
        try {
            
            ObjectInputStream i=new ObjectInputStream(new FileInputStream(file));
            list=(List<T>) i.readObject();
            i.close();
        } catch (IOException e) {
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        return list;
        
    }
    public static <T> void viet(String file,List<T> arr) {
       
        try {
            
            ObjectOutputStream i=new ObjectOutputStream(new FileOutputStream(file));
             i.writeObject(arr);
             i.close();
        } catch (IOException e) {
            System.out.println(e);
        
        }
        
        
    }
}
