

package oop.mavenproject1;


public class dsa {

    public static void main(String[] args) {
        Graph g = new Graph(10,10);
        g.add_random_weights();
        int [] adjOfPoint = g.adj_list(1,0);
        g.printer();
        
        for (int i : adjOfPoint) { //left>right>up>down
            System.out.println(i);
        }
    }
}
