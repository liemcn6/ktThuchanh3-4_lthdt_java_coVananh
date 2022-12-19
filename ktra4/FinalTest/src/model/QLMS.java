/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class QLMS implements Serializable{
    private Reader reader;
    private Book book;
    private int sl;
    private String tt;

    public QLMS() {
    }

    public QLMS(Reader reader, Book book, int sl, String tt) {
        this.reader = reader;
        this.book = book;
        this.sl = sl;
        this.tt = tt;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getTt() {
        return tt;
    }

    public void setTt(String tt) {
        this.tt = tt;
    }
    public Object[] toObject(){
        return new Object[]{
          reader.getMa(),reader.getHoTen(),book.getMa(),sl,tt  
        };
    }
    
    
}
