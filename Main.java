import java.lang.*;
import java.util.Enumeration;
import java.util.Hashtable;
public class Main {
public static void main(String args[]) {
        Graph graph = new Graph();
        Hashtable<Integer,Person> info = new Hashtable<>();
        int count = 001;

        Person person1 = new Person("Kwesi", count);
        count++;
        person1.setLevelofeductaion("400");
        person1.setAffluentcodinglanguages("Pyhton, Java, C");
        person1.setOngoingprojects("Building a self driving car");
        person1.setCompletedprojects("Water Dispenser System");
        person1.setFieldofmastery("AI, MobileApp Development");
        person1.setInterestedareaofstudy("Data Science");
        info.put(person1.getId(),person1);
        Node node1 = new Node(person1.getId());

        Person person2 = new Person("Ama", count);
        count++;
        person2.setLevelofeductaion("300");
        person2.setAffluentcodinglanguages("Pyhton");
        person2.setOngoingprojects("building a dc motor");
        person2.setCompletedprojects("robotic arm");
        person2.setFieldofmastery("Networks");
        person2.setInterestedareaofstudy("Music and dance");
        info.put(person2.getId(),person2);
        Node node2 = new Node(person2.getId());
        Person temp = info.get(001);
        temp.getId();

        
        Enumeration values = info.elements();
        Enumeration keys = info.elements();

        // System.out.println(values.hashCode()) ;

        Person person3 = new Person("Adwoa", count);
        count++;
        person3.setLevelofeductaion("100");
        person3.setAffluentcodinglanguages("Html");
        person3.setOngoingprojects("Building wall following robot");
        person3.setCompletedprojects("robotic car");
        person3.setFieldofmastery("Physics");
        person3.setInterestedareaofstudy("Reasearch");
        info.put(person3.getId(),person3);
        Node node3 = new Node(person3.getId()); 
    

         Person person4 = new Person("Maison", count);
        count++;
        person4.setLevelofeductaion("300");
        person4.setAffluentcodinglanguages("Html,Python");
        person4.setOngoingprojects("Building wall");
        person4.setCompletedprojects("go kart");
        person4.setFieldofmastery("Biology");
        person4.setInterestedareaofstudy("Fashion");
        info.put(person4.getId(),person4);
        Node node4 = new Node(person4.getId());
       
        Person person5 = new Person("Andrew", count);
        count++;
        person5.setLevelofeductaion("200");
        person5.setAffluentcodinglanguages("groovy");
        person5.setOngoingprojects("Building an AI");
        person5.setCompletedprojects("Motorcycle");
        person5.setFieldofmastery("Social studies");
        person5.setInterestedareaofstudy("Home Economics");
        info.put(person5.getId(),person5);
        Node node5 = new Node(person5.getId());

        Person person6 = new Person("Joshua", count);
        count++;
        person6.setLevelofeductaion("100");
        person6.setAffluentcodinglanguages("Html");
        person6.setOngoingprojects("Building wall following robot");
        person6.setCompletedprojects("robotic car");
        person6.setFieldofmastery("Physics");
        person6.setInterestedareaofstudy("Pretech");
        info.put(person6.getId(),person6);
        Node node6 = new Node(person6.getId());

        Person person7 = new Person("Gasu", count);
        count++;
        person7.setLevelofeductaion("100");
        person7.setAffluentcodinglanguages("Html");
        person7.setOngoingprojects("Building wall following robot");
        person7.setCompletedprojects("robotic car");
        person7.setFieldofmastery("Physics");
        person7.setInterestedareaofstudy("Reasearch");
        info.put(person3.getId(),person7);
        Node node7 = new Node(person7.getId());

        Person person8 = new Person("Chris", count);
        count++;
        person8.setLevelofeductaion("100");
        person8.setAffluentcodinglanguages("Dart");
        person8.setOngoingprojects("Statistical Analysis");
        person8.setCompletedprojects("CALCULATOR");
        person8.setFieldofmastery("Physics");
        person8.setInterestedareaofstudy("Catch the flag");
        info.put(person3.getId(),person8);
        Node node8 = new Node(person8.getId());

        Person person9 = new Person("Obira", count);
        count++;
        person9.setLevelofeductaion("100");
        person9.setAffluentcodinglanguages("Fotran");
        person9.setOngoingprojects("Face Detection");
        person9.setCompletedprojects("Algorithm to fins shortest path");
        person9.setFieldofmastery("OpenCv");
        person9.setInterestedareaofstudy("Computer Vision Analysis");
        info.put(person3.getId(),person9);
        Node node9 = new Node(person9.getId());

        Person person10 = new Person("Andrea", count);
        count++;
        person10.setLevelofeductaion("400");
        person10.setAffluentcodinglanguages("CoffeScript");
        person10.setOngoingprojects("Creating an app like Uber");
        person10.setCompletedprojects("water sprinkler");
        person10.setFieldofmastery("Material Science");
        person10.setInterestedareaofstudy("Sports");
        info.put(person10.getId(),person10);
        Node node10 = new Node(person10.getId());


        Person person11 = new Person("Otema", count);
        count++;
        person11.setLevelofeductaion("200");
        person11.setAffluentcodinglanguages("JavaScript");
        person11.setOngoingprojects("wall following robot");
        person11.setCompletedprojects("race track");
        person11.setFieldofmastery("Math");
        person11.setInterestedareaofstudy("Pestology");
        info.put(person11.getId(),person11);
        Node node11 = new Node(person11.getId());

        Person person12 = new Person("Akua", count);
        count++;
        person12.setLevelofeductaion("300");
        person12.setAffluentcodinglanguages("Flutter");
        person12.setOngoingprojects("Building wall ");
        person12.setCompletedprojects("car");
        person12.setFieldofmastery("Chemistry");
        person12.setInterestedareaofstudy("Art");
        info.put(person12.getId(),person12);
        Node node12 = new Node(person12.getId());
     


        graph.addNode(node1); 
        graph.addNode(node2); 
        graph.addNode(node3); 
        graph.addNode(node4);
        graph.addNode(node5);
        graph.addNode(node6);
        graph.addNode(node7);
        graph.addNode(node8);
        graph.addNode(node9);
        graph.addNode(node10);
        graph.addNode(node11);
        graph.addNode(node12);
      
        System.out.println("The number of nodes present in the network are"+" " +graph.getNumberOfNodes());


        node1.addNeighbour(node3);
        node3.addNeighbour(node8);
        node4.addNeighbour(node1);
        node7.addNeighbour(node3);
        node10.addNeighbour(node3);
        node9.addNeighbour(node10);
        node12.addNeighbour(node5);
        node12.addNeighbour(node6);
        node12.addNeighbour(node5);
        node12.addNeighbour(node1);
        node12.addNeighbour(node4);
        node12.addNeighbour(node3);

       // System.out.print(graph.is_connected(node1,node3));

        
       // node1.PopularityStatus

        System.out.println("The individual's popularity status is" + " " +graph.PopularityStatus(node1)+"%");
        System.out.println("The individual's popularity status is" + " " +graph.PopularityStatus(node8)+"%");
        System.out.println("The individual's popularity status is" + " " +graph.PopularityStatus(node9)+"%");
        System.out.println("The individual's popularity status is" + " " +graph.PopularityStatus(node10)+"%");
        System.out.println("The individual's popularity status is" + " " +graph.PopularityStatus(node12)+"%");
        System.out.println("The individual's popularity status is" + " " +graph.PopularityStatus(node6)+"%");
        System.out.println("The individual's popularity status is" + " " +graph.PopularityStatus(node7)+"%");
        System.out.println("The individual's popularity status is" + " " +graph.PopularityStatus(node5)+"%");
        System.out.println("The individual's popularity status is" + " " +graph.PopularityStatus(node11)+"%");


        System.out.println("The most popular person in this network is " + " " +graph.MostPopular().getNodeId());
        System.out.println("The least popular person in this network is " + " " +graph.LeastPopular().getNodeId());

    }
}