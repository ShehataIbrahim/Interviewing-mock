package com.streams.interviews;

public class StringReverseWord {
    public static void main(String[] args) {
        char[] statement= {'p', 'e', 'r', 'f', 'e', 'c', 't', ' ', 'm', 'a', 'k', 'e', 's', ' ', 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e'};
        reverseWord(statement);
        System.out.println(statement);
    }
    static void reverseWord(char[] statement)
    {
        swapRange(statement,0,statement.length-1);
        int start=0;

        for (int i = 1; i <statement.length ; i++) {
            if(statement[i]==' ')
            {
                swapRange(statement,start,i-1);
                start=i+1;
            }
        }
        swapRange(statement,start,statement.length-1);
    }
    static void swapRange(char[] arr,int start,int end)
    {
        while(start<=end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(char[] source,int i,int j)
    {
        char temp=source[i];
        source[i]=source[j];
        source[j]=temp;
    }
}
