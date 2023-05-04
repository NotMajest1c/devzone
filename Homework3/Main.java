package Homework3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // task 1
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        for(int i = 1; i < n; i++) {
            System.out.printf("%d ",(int)Math.pow(i, 2));
        }
        System.out.println();
        
        // task 2
        System.out.println("Enter the number of terms in Fibonacci series: ");
        int count = sc.nextInt();
        int a = 0, b = 1, i =1;
        while (i <= count) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
            i++;
        }
        System.out.println();
        
        // task 3
        System.out.println("Enter the start number: ");
        int start = sc.nextInt();
        System.out.println("Enter the end number: ");
        int end = sc.nextInt();
        
        for(int num = start; num <= end; num++) {
            boolean isPrime = true;
            for(int j = 2; j <= num/2; j++) {
                if(num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && num != 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        
        // task 4
        int[][] arr = {{1, 2, 5}, 
        			   {10, 23, 4}, 
        			   {56, 22, 43}
        			  };
        
        int min = arr[0][0];
        int max = arr[0][0];
        
        for(int j = 0;j<arr.length;j++) {
        	for(int k = 0;k<arr[j].length;k++) {
        		if(arr[j][k]<min) {
        			min = arr[j][k];
        		}
        		if(arr[j][k]>max) {
        			max = arr[j][k];
        		}
        	}
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        
        sc.close();
    }
}
