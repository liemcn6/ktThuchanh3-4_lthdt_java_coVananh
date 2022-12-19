/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HaiFormCallNhauCoFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class IOFile2 {
    public static <T> List<T> docra(String file){
        List<T> list=new ArrayList<>();
        try {
            ObjectInputStream o=new ObjectInputStream(new FileInputStream(file));
            list=(List<T>) o.readObject();
            o.close();
        } catch (Exception e) {
        }
        return list;
    }
    public static <T> void viet(String file,List<T> arr){
        
        try {
            ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(file));
             o.writeObject(arr);
            o.close();
        } catch (Exception e) {
        }
        
    }
}
