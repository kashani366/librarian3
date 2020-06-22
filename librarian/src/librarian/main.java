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
private  static ArrayList<book> books=new ArrayList<book>();
	private static Scanner sc = new Scanner(System.in);
	private static boolean isAlive = true;
      private static   boolean isAlive2=true;

        public static void main(String[] args) {
            System.out.println("==WELCOME TO elibrary==");
          //  System.out.println("/help to start");
       
            while(isAlive){
                System.out.println("are you admin?y/n");
                String input = sc.next();
               if (input.equals("y")){
                   checkAdmin(input);
                   
               }
              else{
                   if(input.equals("n"))
                  
            
                   
        librarianpanel(input);
                
              }
                 break; 
            }
        }
           
                       
          

    private static void checkAdmin(String input) {
        System.out.println("enter adminEmail");
        String input2=sc.next();
          System.out.println("enter password");
String input3=sc.next();
if(input2.equals("admin@yahoo.com")&& input3.equals("admin")){
 
  while(isAlive2){
  String result=  rout(input2);
      System.out.println(""+result);
    isAlive=false;}
}else
{System.out.println("Wrong input");
    }

}
     private static void librarianpanel(String input){
    
              String result= showmenu();
              System.out.println(""+result);
    
     }
    
    public static String rout(String input){
      
        System.out.println("enter your Selection.press 5  to help you");
  
       
        int input2=sc.nextInt();
       // input2=input2.toLowerCase();
        switch (input2) {
            case 1:
	 
	      return AddLibrarian();
              
	      case 2:
                  
	  return   showLibrarianList();
				
	       case 3:
                   
		return	editLibrarian();
				
		case 4:
				// editUser();
	       return deletLibrarian();
               
                case 5:
                     return help();
                      case 6:
                     return exit();
                       case 7:
                     return searchLibrarian();
                       case 8:
                           return addBook();
                       case 9:
                           return showBookList();
                           case 10:
                           return editBook(); 
                           case 11:
                               return searchbook();
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

    private static String   showLibrarianList() {
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

    private static String editLibrarian() {
         System.out.println("enter name ");
        String name=sc.next();
        int toEditeIndex=-1;
         for(int i=0;i<librarians.size();i++){
            librarian l=librarians.get(i);
            if(l.name.equals(name)){
                 toEditeIndex=i;
               // break;
            }
         }
         if( toEditeIndex==-1){
             return "user not found";
         }else{
            System.out.println("enter newName");
        String newName=sc.next();
         System.out.println("enter newEmail");
        String newEmail=sc.next();
         System.out.println("enter newPassword");
        String newPassword=sc.next();
         System.out.println("enter newMobile");
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

    private static String deletLibrarian() {
        System.out.println("enter name ");
        String name2=sc.next();
          System.out.println("enter name "+name2);
        int toRemoveIndex=-1;
         for(int i=0;i<librarians.size();i++){
            librarian l=librarians.get(i);
            if(l.name.equals(name2)){
                toRemoveIndex=i;
                // librarians.remove(toRemoveIndex);
                break;
            }
         }
         if(toRemoveIndex==-1)
         {
            return "user not found";
         }else{
             librarians.remove(toRemoveIndex);
            return " user removed";
    }
    }
    private static String help() {
       return   "1.--add new librarian\n"
               + "2.-- show librarians\n"
               + "3.--edit librarian\n"
               + "4.--delet librarian\n"
               + "5.--help you\n"
               + "6.--to exit\n"
               + "7--search librarian\n"
               + "8.--addbook\n"
               + "9.--showbooklist\n"
               + "10.--editbook" ;
    }

    private static String exit() {
        isAlive2=false;
   return "==goodby==";
    }

    private static String searchLibrarian() {
          System.out.println("enter name ");
        String name=sc.next();
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

    private static String addBook() {
          System.out.println("enter bookName");
        String bookName=sc.next();
         System.out.println("enter author");
        String author=sc.next();
         System.out.println("enter publisher");
        String publisher=sc.next();
         System.out.println("enter ouantity");
        int ouantity=sc.nextInt();
        book b=new book(bookName,author,publisher,ouantity);
       books.add(b);
   
      
        return "  book added";
    }

    private static String showBookList() {
          String result="";
        for(int i=0;i<books.size();i++){
           book l=books.get(i);
            result+=l.getDetails()+"\n";
        }
        if(books.size()==0){
            result="no book found";
        }
        return result;
      
    }

    private static String editBook() {
         System.out.println("enter name ");
        String name=sc.next();
        int toEditeIndex=-1;
         for(int i=0;i<books.size();i++){
          book b=books.get(i);
            if(b.name.equals(name)){
                 toEditeIndex=i;
               // break;
            }
         }
         if( toEditeIndex==-1){
             return "book not found";
         }else{
            System.out.println("enter newName");
        String newName=sc.next();
         System.out.println("enter newAuthor");
        String newAuthor=sc.next();
         System.out.println("enter newpublisher");
        String newpublisher=sc.next();
         System.out.println("enter newquantity");
        int newquantity=sc.nextInt();
        books.get(toEditeIndex).name=newName;
         books.get(toEditeIndex).author=newAuthor;
         books.get(toEditeIndex).publisher=newpublisher;
         books.get(toEditeIndex).quantitiy=newquantity;
        
        return" book edited";
    }
    }

    private static String checklibrarian() {
   isAlive=false;
    System.out.println("enter yournameeeeee");
   String input4 = sc.next();
        int toShowIndex=-1;
         for(int i=0;i<librarians.size();i++){
            librarian l=librarians.get(i);
            if(l.name.equals(input4)){
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

    private static String showmenu() {
    isAlive=false;
        System.out.println("/showlist:viw list book");
       System.out.println("/issu:to issu book");
        
        String input6=sc.next();
        input6=input6.toLowerCase();
         switch (input6) {
             case "/showlist":
                 return showlist();
             case "/issu":
                 return issu();
         }
        return "";
    }

    private static String showlist() {
    book c=new book("golestan","saadi","ghoghnos",12);
       books.add(c);
        book a=new book("bostan","saadi","ghoghnos",50);
       books.add(a);
      String result="";
        for(int i=0;i<books.size();i++){
           book l=books.get(i);
            result+=l.getDetails()+"\n";
        }
      
        
       return result;
    }

   

    private static String searchbook() {
   System.out.println("enter name ");
        String name=sc.next();
        int toShowIndex=-1;
         for(int i=0;i<books.size();i++){
           book l=books.get(i);
            if(l.name.equals(name)){
               toShowIndex=i;
                break;
            }
         }
    if(toShowIndex==-1)
    {
        return "book not found";
    }
else
    {
         return books.get(toShowIndex).toString();
    }
    }

}