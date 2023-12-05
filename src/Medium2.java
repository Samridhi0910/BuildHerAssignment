//Second question Medium-2

//Algorithm
//
//        1. Initialising an empty list `list` to store the elements which occur more than n/3.
//        2. Calculating the occurence number `k` for elements which are greater than n/3 : k = length of the input array `nums` divided by 3 + 1.
//        3. Initialising a HashMap `map` to store the frequency of each element.
//        4. Iterating through each element `num` in the input array `nums`:
//              a. Incrementing the count of occurrences `i` for the current element in the HashMap.
//              b. If the count `i` reaches the threshold `k`, then adding the current element to the `list`.
//        5. Returning the `list` containing majority elements.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Medium2 {
    public static void main(String[] args) {
        // Creating an empty list to store the result
        List<Integer> res;
        int[] nums = {3,2,3};
        res = occurence(nums);
        System.out.println(res);
    }

    // Function to find elements that appear more than n/3 times
    public static List<Integer> occurence(int[] nums) {
        // Creating a list to store the result elements
        List<Integer> list = new ArrayList<Integer>();
        // Calculating the threshold number  for more than n/3 occurrences
        int k = nums.length / 3 + 1, i;
        // Creating a HashMap to store the frequency of occurrences for each element
        HashMap<Integer, Integer> map = new HashMap<>();


        for(int num : nums){
            // Incrementing the count of occurrences for the current element if existing otherwise setting frequency as 1
            i = map.containsKey(num) ? map.get(num) + 1 : 1;
            map.put(num, i);

            // If the occurence reaches the threshold, adding the element to the result list
            if(i == k)
                list.add(num);
        }
        // Returning the list of majority elements
        return list;
    }
}
