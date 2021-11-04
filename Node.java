import java.util.*; 

public class Node {
    private String name;
    public List<Node> neighbours = new ArrayList<Node>();
    public int id;

    public Node(int id){

        this.id= id;
    }


    public int  getNodeId() {
        return this.id;
    }

    public void addNeighbour(Node  node) {
        if(this.neighbours.contains(node)) {
            System.out.println("This node  has already been connected.");
        } else {
            System.out.println("Successfully added " + node.getNodeId());
            this.neighbours.add(node);
        }
    }
    public void getNeighbours() {
        System.out.println("List of all neigbours: connected to "+ this.id);
        for (int i = 0; i < this.neighbours.size(); i++ ){
            System.out.println(neighbours.get(i)+"\n:");
        
    }}

    public void removeFriend(Node node){
        if(this.neighbours.contains(node)){
            neighbours.remove(node);
            System.out.println("User has Successfully been removed");
        }else{
            System.out.println("This user does not exist");
        }
}


}