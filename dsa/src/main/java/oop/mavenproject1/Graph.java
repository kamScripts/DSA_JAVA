/*
    An undirected and weighted 4-directional graph presented as rectangular grid.
    Each cell stores outgoing edge weights: [right_cost, down_cost].
    A weight of 0 means no edge between vertex a and b (blocked).    
    Internal representation: 1D list indexed by y * width + x
    External representation: 2D grid indexed by (x, y).
 */
package oop.mavenproject1;

/**
 *
 * @author KamScripts
 */
public class Graph {
    private int width, height;
    private int [][] weights;
    
    public Graph (int w, int h) {
        width = w;
        height = h;
        weights = new int [width*height][2];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getWeights() {
        return weights;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeights(int[][] weights) {
        this.weights = weights;
    }
    public int index(int x, int y){
        return y * width +1;    // Returns index of flat array
    }
    public void printer(){
        
        for (int i=0; i<getHeight(); i++){
            for (int j=0; j<getWidth(); j++) {
                System.out.print(' ');
                System.out.print('O');
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    
}
