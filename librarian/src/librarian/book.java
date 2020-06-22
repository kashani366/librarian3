/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarian;

/**
 *
 * @author Kashani
 */
public class book {

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getQuantitiy() {
        return quantitiy;
    }
    String name;
    String author;
    String publisher;
    int quantitiy;
    public book(String name, String author, String publisher, int quantitiy) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantitiy = quantitiy;
    }
    public String getDetails(){
    return name+": "+author+": "+publisher+": "+publisher+": "+quantitiy;
}

    @Override
    public String toString() {
       
             return name+":"+author+":"+publisher+":"+publisher+":"+quantitiy;
    }
  

    
}

