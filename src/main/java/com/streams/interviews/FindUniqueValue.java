package com.streams.interviews;
//This one is solved in a constant space and time of o(n)
public class FindUniqueValue {
    public int findUniqueValue(Integer[] arr) {
        int xor = 0;
        for (Integer integer : arr) {
            xor ^= integer;
        }
        return xor;
    }
}
