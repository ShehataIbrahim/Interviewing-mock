package com.streams.interviews;
//This one is solved in a constant space and time of o(n)
public class FindUniqueValue {
    public static void main(String[] args) {
        Integer[] input = {1, 2, 3, 4, 1, 2, 3, 5, 4, 6, 7, 8, 6, 7, 8,5,11,10,11};
        System.out.println(findUniqueValue(input));
    }
    public static int findUniqueValue(Integer[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) { 
            xor ^= arr[i];
        }
        return xor;
    }
}
