/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find_the_number;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sergio
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //List<Integer>arr = new ArrayList<>();
        List<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        
        int k = 6;
        
        System.out.println(findNumber(arr, k));
    }
    
    
    
      // Complete the findNumber function below.
    static String findNumber(List<Integer> arr, int k) {
        String res = "NO";
        
        if(arr.contains(k)) res = "YES";
        
        
        return res;
        

    }

    
}
