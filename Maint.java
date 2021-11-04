import java.lang.*;
import java.io.*; 
import java.util.*; 
import java.lang.Math;
import java.util.Random;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;


public class Maint {
    public static void main(String args[]) {
        boolean gt = true;
        int id = 1;
        Person[] personobject = new Person[50];

        while (gt){
            Scanner input = new Scanner(System.in);
            System.out.println("Please choose one of these commands to execute.");
            String t = input.nextLine();
            String[] templist = t.split(" ");
            if (templist[0].equals("register")){
                id++;
                Person standard = new Person(id);
            }else if(templist[0].equals("suggestions")){
                for (int i = 0; i < personobject.length;i++){
                    System.out.println(personobject[i]);}
                    System.out.println("Pick one of these people");
                

            }
            else if(templist[0].equals("connect")){

            }
            else if (templist[0].equals("exit")){

            }
            else if (templist[0].equals("delete")){

            }
            

        
    
    
    
    
    
        }
    





    
    
    
    
    
    
    
    }




}