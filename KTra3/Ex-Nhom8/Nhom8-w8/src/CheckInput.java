/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class CheckInput {
    public static void validateMa(String id)
            throws ValidateException{
   if(!id.matches("^[Bb]{1}\\d{2}[A-Za-z]{4}\\d{3}$"))                          
      throw new ValidateException("Ma \""+id+"\"khong dung dinh dang");
    }
public static void validateNgaySinh(String ngaysinh)
         throws ValidateException{
   if(!ngaysinh.matches("\\d{1,2}-\\d{1,2}-\\d{4}"))            
       throw new ValidateException("Ngay sinh \""+ngaysinh+"\"khong dung dinh dang"); 
    }
}
