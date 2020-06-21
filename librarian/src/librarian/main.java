/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarian;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
private  static ArrayList<librarian> librarians=new ArrayList<librarian>();
	private static Scanner sc = new Scanner(System.in);
	private static boolean isAlive = true;
      private static   boolean isAlive2=true;
	// add
	// remove
	// edit
	// list
	// search
	// exit
	// help  
        public static void main(String[] args) {
            System.out.println("WELCOME TO elibrari");
            System.out.println("/help to start");
           // librarian librarian1=new librarian();
            while(isAlive){
                System.out.println("are you admin?y/n");
                String input = sc.nextLine();
               if (input.equals("y")){
                   checkAdmin(input);
                   
               }
             //  else{
               //    librarianPanel();
            //p   }
                  
            }
           
                       
            }

    private static void checkAdmin(String input) {
        System.out.println("enter AdminEmail");
        String input2=sc.next();
          System.out.println("enter password");
String input3=sc.next();
if(input2.equals("admin")&& input3.equals("admin")){
 
  while(isAlive2){
  String result=  rout(input2);
      System.out.println(""+result);
    isAlive=false;}
}else
{System.out.println("wrong admin");
    }

}
    
    public static String rout(String input){
      
        System.out.println("enter your chosse./help to help you");
  
       
        String input2=sc.next();
        input2=input2.toLowerCase();
        switch (input2) {
            case "/add":
	 
	      return AddLibrarian();
              
	      case "/list":
                  
	  return   showList();
				
	       case "/edit":
                   
		return	editList();
				
		case "/delet":
				// editUser();
	       return delet();
               
                case "/help":
                     return help();
                      case "/exit":
                     return exit();
                       case "/search":
                     return search();
			default:
			return	wrongInput();
				
        }
        
    }
   
    private static String AddLibrarian() {
        System.out.println("enter usernam");
        String name=sc.next();
         System.out.println("enter Email");
        String email=sc.next();
         System.out.println("enter password");
        String password=sc.next();
         System.out.println("enter mobile");
        int mobile=sc.nextInt();
        librarian l=new librarian(name,email,password,mobile);
        librarians.add(l);
   
      
        return "  librarian added";
    }

    private static String showList() {
        String result="";
        for(int i=0;i<librarians.size();i++){
            librarian l=librarians.get(i);
            result+=l.getDetails()+"\n";
        }
        if(librarians.size()==0){
            result="no youser found";
        }
        return result;
       
    }

    private static String editList() {
         System.out.println("enter name ");
        String name=sc.nextLine();
        int toEditeIndex=-1;
         for(int i=0;i<librarians.size();i++){
            librarian l=librarians.get(i);
            if(l.name.equals(name)){
                 toEditeIndex=i;
                break;
            }
         }
         if( toEditeIndex==-1){
             return "user not found";
         }else{
            System.out.println("enter usernam");
        String newName=sc.next();
         System.out.println("enter Email");
        String newEmail=sc.next();
         System.out.println("enter password");
        String newPassword=sc.next();
         System.out.println("enter mobile");
        int newMobile=sc.nextInt();
        librarians.get(toEditeIndex).name=newName;
        librarians.get(toEditeIndex).email=newEmail;
        librarians.get(toEditeIndex).password=newPassword;
        librarians.get(toEditeIndex).mobile=newMobile;
        
        return" user edited";
    }
    }
    

    private static String wrongInput() {
       
       return"";
}

    private static String delet() {
        System.out.println("enter name ");
        String name2=sc.nextLine();
        int toRemoveIndex=-1;
         for(int i=0;i<librarians.size();i++){
            librarian l=librarians.get(i);
            if(l.name.equals(name2)){
                toRemoveIndex=i;
                 librarians.remove(toRemoveIndex);
                break;
            }
         }
         if(toRemoveIndex==-1){
             return "user not found";
         }else{
             librarians.remove(toRemoveIndex);
        return" user removed";
    }
    }
    private static String help() {
       return "/add ---add new librarian\n"
               + "/viewList--to show librarians\n"
               + ""
               + "" ;
    }

    private static String exit() {
        isAlive2=false;
   return "==goodby==";
    }

    private static String search() {
          System.out.println("enter name ");
        String name=sc.nextLine();
        int toShowIndex=-1;
         for(int i=0;i<librarians.size();i++){
            librarian l=librarians.get(i);
            if(l.name.equals(name)){
               toShowIndex=i;
                break;
            }
         }
    if(toShowIndex==-1)
    {
        return "user not found";
    }
else
    {
         return librarians.get(toShowIndex).toString();
    }
    }
}