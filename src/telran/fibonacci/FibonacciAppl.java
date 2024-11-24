package telran.fibonacci;

import telran.fibonacci.model.Fibonacci;
import telran.fibonacci.model.FibonacciIterator;

public class FibonacciAppl {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(8);
        //TODO homework
        // print all numbers and reduce sum,
        // 1, 1, 2, 3, 5, 8, 13, 21
        // sum = 54
        int[] resArr = new int[fibonacci.getQuantity()];
        FibonacciIterator iterator = new FibonacciIterator(resArr.length);

        int prevNum1 = 0;
        int prevNum2 = 1;
        int sum = 0;
        while (iterator.hasNext()){
            int index = iterator.next();
            resArr[index] = prevNum1 + prevNum2;
            prevNum2 = prevNum1;
            prevNum1 = resArr[index];
            sum += resArr[index];
        }

        for (int i = 0; i < resArr.length; i++) {
            if (i == resArr.length - 1){
                System.out.println(resArr[i]);
            } else {
                System.out.print(resArr[i] + ",");
            }
        }

        System.out.println("Total sum of elements: " + sum);
    }
}
