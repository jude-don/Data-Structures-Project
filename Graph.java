import java.util.*;
import java.util.Hashtable;
import java.util.ArrayList;;
public class Graph {
    private List<Node> nodes = new ArrayList<Node>();
    private int numberOfNodes = 0;

    public boolean checkForAvailability() { // will be used in Main.java
        return this.numberOfNodes > 1;
    }

    public void addNode(Node node) {
        this.nodes.add(node);
        this.numberOfNodes++; // a node has been added
    }

    public int getNumberOfNodes() {
        return this.numberOfNodes;
    }

    // public boolean is_connected(Node node1,Node node2){


    //      return node1.getListNeighbours().contains(node2);
    // }

    public double PopularityStatus(Node node){
        return (node.neighbours.size()/15.0)*100;
    }

    public Node MostPopular(){
        Node biggest=null;
        int maxSize = 0;
        for ( int i=0; i<numberOfNodes;i++){
            if (nodes.get(i).neighbours.size()>maxSize){
                biggest = nodes.get(i);
                maxSize=nodes.get(i).neighbours.size();}
        }
        return biggest;
    }

    public Node LeastPopular(){
        Node least = null;
        int leastsize=1<<31 - 1;

        for ( int i=0; i<numberOfNodes; i++){
            if(nodes.get(i).neighbours.size()<leastsize){
                least= nodes.get(i);
                leastsize=nodes.get(i).neighbours.size();
            }
         
        }
           return least;
    }
    // public void hashtoarray(Hashtable h){
        
    // }

     List<Node> BFS(Node s, String courseName,Hashtable hash)
    {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[V];
 
        List Found = new ArrayList();
 
        // Create a queue for BFS
        LinkedList<Node> queue = new LinkedList<Node>();
  
        // Mark the current node as visited and enqueue it
        visited[s.id]=true;
        queue.add(s);
  
        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            for(int i = 1; i < count+1;i++){
                Person t = info.get(i);
                if (courseName.equals(t.getAffluentcodinglanguages())){
                    System.out.println("Name: "+t.getname() + "\n" + "level of education: "+t.getLevelofeductaion()+"\n"+ "Ongoing projects: "+t.getOngoingProjects() );
                } 
                else  {
                    System.out.println("No student found");
                }
            }

                if (courseName.equals()
            System.out.print(s+" ");
  
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            
            for (Node x:s.neighbours){
 
                    if (!visited[s.id]){visited[s.id] = true;
                        queue.add(x)
                    }
 
            }
        }
    }

  

}