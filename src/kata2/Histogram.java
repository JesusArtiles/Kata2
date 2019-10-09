/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Histogram implements Iterable<Integer>{
    private final Map<Integer,Integer> counts = new HashMap<>();
    
    public Histogram(int... values) {
        for (int value : values) {
            counts.put(value, counts.getOrDefault(value,0)+1);                                                       
        }
        
    }
    
    public int getCount(int value){
        return counts.get(value);
    }

    @Override
    public Iterator<Integer> iterator() {
        return counts.keySet().iterator();
    }
}
