

package oop.mavenproject1;


public class dsa {

    public static void main(String[] args) {
        Graph g = new Graph(10,10);
        g.add_random_weights();
        int [] adjOfPoint = g.adj_list(0,0);
        g.printer();
        System.out.println("available moves for cell x=1,y=1");
        for (int i : adjOfPoint) { //left>right>up>down
            System.out.println(i);
        }
    }
}
