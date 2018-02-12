package com.company;

import java.util.Scanner;

public class ThreeIntsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\s+");
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        if(intArr[0] == intArr[1] + intArr[2]){
            System.out.printf("%d + %d = %d", Math.min(intArr[1],intArr[2]), Math.max(intArr[1],intArr[2]), intArr[0]);
        }else if(intArr[1] == intArr[0] + intArr[2]) {
            System.out.printf("%d + %d = %d", Math.min(intArr[0],intArr[2]), Math.max(intArr[0],intArr[2]), intArr[1]);
        }else if(intArr[2] == intArr[0] + intArr[1]) {
            System.out.printf("%d + %d = %d", Math.min(intArr[0],intArr[1]), Math.max(intArr[0],intArr[1]), intArr[2]);
        }else{
            System.out.println("No");
        }
    }
}
