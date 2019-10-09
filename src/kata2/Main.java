/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Histogram histogram = new Histogram(3,2,5,-1,2,1,3,1,-1,5,4);
        for (int value : histogram) {
            System.out.println(value + " "+ histogram.getCount(value));
        }
    }
    
}
