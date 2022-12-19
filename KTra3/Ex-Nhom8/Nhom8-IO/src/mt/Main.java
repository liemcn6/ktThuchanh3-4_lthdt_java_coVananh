/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mt;

/**
 *
 * @author ADMIN
 */
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        MaTran m=new MaTran();
        int[][] a=m.read();
        int[][] b=m.read();
        m.display(a);
        m.display(b);
        int[][] t=m.tong(a, b);
        int[][] h=m.hieu(a, b);
        String file="src/mt/kqua.dat";
        try{
            PrintWriter out=new PrintWriter(file);
            for (int i = 0; i < t.length; i++) {
                String line="";
                for (int j = 0; j < t[0].length; j++) {
                    line+=t[i][j]+" ";
                }
                out.write(line+"\n");
            }
            for (int i = 0; i < h.length; i++) {
                String line="";
                for (int j = 0; j < h[0].length; j++) {
                    line+=h[i][j]+" ";
                }
                out.write(line+"\n");
            }
            out.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
