/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv;

/**
 *
 * @author ADMIN
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String file="src/sv/sv.txt";
        List<SinhVien> list=new ArrayList<>();
        BufferedReader br;
        try{
            br=new BufferedReader(new FileReader(file));
            String line="";
            while((line=br.readLine())!=null){
                String[] s=line.split(";");
                SinhVien sv=new SinhVien(s[0], s[1],
                        Integer.parseInt(s[2]));
                list.add(sv);
            }
            br.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
        for(SinhVien i:list){
            System.out.println(i.toString());
        }
    }
}
