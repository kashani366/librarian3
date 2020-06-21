/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarian;
import java.util.ArrayList;

public class librarian {
    ArrayList<librarian>librarians = new ArrayList<librarian>();;
     String name;
     String email;
    String  password;
    int mobile;
       public librarian(String name, String email, String password, int mobile) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
    }
public String getDetails(){
    return name+":"+email+":"+mobile+":"+password;
}

    @Override
    public String toString() {
       
             return name+":"+email+":"+mobile+":"+password;
    }
  
}
    
