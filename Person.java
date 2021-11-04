import java.lang.*;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.ArrayList;
public class Person{
private int fd = 0;
public int size  = 2;
// private String[] friends;
private String Name;
private String Level_of_education;
private String Affluent_coding_languages;
private String Ongoing_Projects;
private String Completed_Projects;
private String Field_of_mastery;
private String Interested_area_of_study;
private int ID;
public Person(int id){
    System.out.println("enter name");
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your name ");
    this.Name = input.nextLine();
    Scanner input2 = new Scanner(System.in);
    System.out.println("Please enter your university level ");
    this.Level_of_education = input2.nextLine();
    Scanner input3 = new Scanner(System.in);
    System.out.println("Please enter your strongest coding language ");
    this.Affluent_coding_languages = input3.nextLine();
    Scanner input4 = new Scanner(System.in);
    System.out.println("Please enter your interested area of study ");
    this.Interested_area_of_study = input4.nextLine();
    Scanner input5 = new Scanner(System.in);
    System.out.println("Please enter your ongoing project");
    this.Ongoing_Projects = input5.nextLine();
    Scanner input6 = new Scanner(System.in);
    System.out.println("Please enter your completed projects ");
    this.Completed_Projects = input6.nextLine();
    Scanner input7 = new Scanner(System.in);
    System.out.println("Please enter your field of interest ");
    this.Field_of_mastery = input7.nextLine();
    this.ID = id;
}
public Person(String Name,String Level_of_education,String Affluent_coding_languages,String Ongoing_Projects,String Completed_Projects,String Field_of_mastery,String Interested_area_of_study){
    this.Name = Name;
    this.Level_of_education = Level_of_education;
    this.Affluent_coding_languages = Affluent_coding_languages;
    this.Interested_area_of_study = Interested_area_of_study;
    this.Ongoing_Projects = Ongoing_Projects;
    this.Completed_Projects = Completed_Projects;
    this.Field_of_mastery = Field_of_mastery;
}
public String getname(){
    return Name;
}

public String getLevelofeductaion(){
    return Level_of_education;
}
public String getAffluentcodinglanguages(){
    return Affluent_coding_languages;
}
public String getOngoingProjects(){
    return Ongoing_Projects;
}
public String getCompletedProjects(){
    return Completed_Projects;
}
public String getFieldofmastery(){
    return Field_of_mastery;
}
public String getInterestedareaofstudy(){
    return Interested_area_of_study;
}
// public void setLevelofeductaion(String infor){
//     this.Level_of_education = infor;
// }
// public void setAffluentcodinglanguages(String ifor){
//     this.Affluent_coding_languages = ifor;
// }
// public void setOngoingprojects(String nfor){
//     this.Ongoing_Projects = nfor;
// }
// public void setCompletedprojects(String fori){
//     this.Completed_Projects = fori;
// }
// public void setFieldofmastery(String tori){
//     this.Field_of_mastery = tori;
// }
// public void setInterestedareaofstudy(String riri){
//     this.Interested_area_of_study = riri;
// }
// public void addFriend(String name){
//     friends[fd] = name;
//     fd += 1;
// }
// public String getFriends(){
//     String temp = "";
//     //System.out.println(Arrays.toString(friends));
//     return temp;
// }

@Override
public String toString() {
    String personDetails = " ";
    // name and age of driver
    // number of passengers
    personDetails = "\n "+Name +"\n" +" Person details are: " + "\n Level of education: " + Level_of_education + "\n Affluent coding languages: " + Affluent_coding_languages+
            "\n Ongoing projects: " + Ongoing_Projects + "\n Completed projects: " + Completed_Projects +
            "\n Field of mastery: " + Field_of_mastery + "\n Interested area of study: " +Interested_area_of_study +"\n";
    return personDetails;
}







public static void main(String[] args){
    
}
public static char[] toString(Person person) {
	return null;
}
}