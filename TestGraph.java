import java.util.*;
public class TestGraph implements Graph{
    public static void main(String[] args){
        String[] vertices = {"Kofi", "Ama", "Kwesi", "Wendy", 
        "Andrea", "Chief", "Fred", "Velma", 
        "Scooby doo", "Nana", "Ohemaa", "Kobby"};


        int[][] edges ={
            {0,1},{0,3},{0,5},
            {1, 0}, {1, 2}, {1, 3},
            {2, 1}, {2, 3}, {2, 4}, {2, 10},
            {3, 0}, {3, 1}, {3, 2}, {3, 4}, {3, 5},
            {4, 2}, {4, 3}, {4, 5}, {4, 7}, {4, 8}, {4, 10},
            {5, 0}, {5, 3}, {5, 4}, {5, 6}, {5, 7},
            {6, 5}, {6, 7},
            {7, 4}, {7, 5}, {7, 6}, {7, 8},
            {8, 4}, {8, 7}, {8, 9}, {8, 10}, {8, 11},
            {9, 8}, {9, 11},
            {10, 2}, {10, 4}, {10, 8}, {10, 11},
            {11, 8}, {11, 9}, {11, 10}
        };
        Graph<String> network = new UnwieghtedGraph<>(vertices, edges);
        System.out.println("The number of vertices in network " + network.getsize());
        System.out.println("The index for Wendy is "+ network.getIndex("Wendy"));
        System.out.println("The edges for network: "+network.printEdges());

    }
}