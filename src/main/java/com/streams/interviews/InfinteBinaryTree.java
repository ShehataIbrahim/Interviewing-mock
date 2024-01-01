package com.streams.interviews;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class InfinteBinaryTree {
    private static final Executor executor= Executors.newCachedThreadPool();
    public static void main(String[] args) {
        /*
        int i=0;
        while(true)
        {
            decimalToBinary(i++);
        }*/
       /* Queue<String> queue=new LinkedList<>();
        queue.add("0");
        queue.add("1");
        for (int i = 0; i <100 ; i++) {
            String peek=queue.poll();
            System.out.println(peek);
            queue.add(peek+"0");
            queue.add(peek+"1");
        }*/
        recursiveBinartyPrint("");

    }
    private static void recursiveBinartyPrint(String previous)
    {
        System.out.println(previous+"0");
        System.out.println(previous+"1");
        executor.execute(()->recursiveBinartyPrint(previous+"0"));
        executor.execute(()->recursiveBinartyPrint(previous+"1"));
    }

    static int maxArraySize=2;
    @SuppressWarnings("unused")
    public static void decimalToBinary(int num)
    {
        if(num==0)
        {
            System.out.println("0");
            return;
        }
        // Creating and assigning binary array size
        int[] binary = new int[maxArraySize];
        int id = 0;

        // Number should be positive
        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
            if(id==maxArraySize)
            {
                maxArraySize*=2;
                int[] temp = binary;
                binary=new int[maxArraySize];
                System.arraycopy(temp,0,binary,0,temp.length);
            }
        }

        // Print Binary
        printBinary(binary,id);
    }

    private static void printBinary(int[] binary, int id) {
        for (int i = id-1; i >=0 ; i--) {
            System.out.print(""+binary[i]);
        }
        System.out.println();
    }

}
