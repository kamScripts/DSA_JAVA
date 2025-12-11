/*
    An undirected and weighted 4-directional graph presented as rectangular grid.
    Each cell stores outgoing edge weights: [right_cost, down_cost].
    A weight of 0 means no edge between vertex a and b (blocked).    
    Internal representation: 1D list indexed by y * width + x
    External representation: 2D grid indexed by (x, y).
 */
package oop.mavenproject1;

import java.util.Random;

/**
 *
 * @author KamScripts
 */
public class Graph {
    private int width, height;
    private int [][] weights; // weights [[cost_right,cost_down],]
    static int [] COSTS = {1, 2, 3, 9};
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
        return y * width +x;    // Returns index of flat array
    }
    public void add_random_weights(){
        
        System.out.println(weights[0][0]);
        Random rnd = new Random();
        for (int i=0; i<width*height; i++){
            
            weights[i][0] = COSTS[rnd.nextInt(COSTS.length)];
            weights[i][1] = COSTS[rnd.nextInt(COSTS.length)];
        }
    }
    public int[] adj_list(int x, int y) {
        // Adjacency list of cell[x][y]
        // Return: [left,right,up,down]
        int idx = index(x,y);
        int[]adj = new int [4];
        int []weight = weights[idx];
        if (x > 0 || weights[index(x-1,y)][0] < 9){ //left
            adj[0] = weights[index(x-1,y)][0];
        }        
        if (x+1 < width || weight[0] < 9) { //right
           adj[1] = weight[0];
        }
        if (y > 0 || weights[index(x,y-1)][1] < 9) { //up
            adj[2] = weights[index(x,y-1)][1];
        }
        if(y+1 < height || weight[1] < 9) { //down
            adj[3] = weight[1];
        }
        return adj;

        
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
