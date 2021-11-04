import java.lang.*;
import java.util.Hashtable;

public class Information{


    public static void main(String args[]){
        
        Hashtable<Integer,Person> info = new Hashtable<>();
        Person person1 = new Person("Kwesi", 123);
        person1.setLevelofeductaion("400");
        person1.setAffluentcodinglanguages("Pyhton, Java, C");
        person1.setOngoingprojects("Building a self driving car");
        person1.setCompletedprojects("Water Dispenser System");
        person1.setFieldofmastery("AI, MobileApp Development");
        person1.setInterestedareaofstudy("Data Science");
        info.put(person1.getId(),person1);
        


        Person person2 = new Person("Ama", 2);
        person2.setLevelofeductaion("300");
        person2.setAffluentcodinglanguages("Pyhton");
        person2.setOngoingprojects("building a dc motor");
        person2.setCompletedprojects("robotic arm");
        person2.setFieldofmastery("Networks");
        person2.setInterestedareaofstudy("Music and dance");
        info.put(person2.getId(),person2);

        //graph.search("PYTHON",info)

        Person person3 = new Person("Adwoa", 3);
        person3.setLevelofeductaion("100");
        person3.setAffluentcodinglanguages("Html");
        person3.setOngoingprojects("Building wall following robot");
        person3.setCompletedprojects("robotic car");
        person3.setFieldofmastery("Physics");
        person3.setInterestedareaofstudy("Reasearch");
        info.put(person3.getId(),person3);
    

        System.out.println(info);

    
    }
}
