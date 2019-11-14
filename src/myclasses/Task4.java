/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jvm
 */
public class Task4 {
    public void run(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер стороны квадрата чисел");
        int size = scanner.nextInt();
        System.out.println("Укажите min и max диапазона генерации\nслучайных чисел для заполнения массива.");
        System.out.print("min = ");
        int min = scanner.nextInt();
        System.out.print("max = ");
        int max = scanner.nextInt();
        int countNumbers = size * size;
        Integer[] numberArray = new Integer[countNumbers];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt(max - min +1)+min;
        }
        
        //----------
        
        for (int j = 0; j < 3; j++) {
            System.out.println("");
            System.out.println("-----------------------------------------");
            switch (j) {
                case 0:
                    System.out.println("Массив случайных чисел");
                    break;
                case 1:
                    Arrays.sort(numberArray);
                    System.out.println("Отсортированный по возрастанию массив чисел");
                    break;
                case 2:
                    System.out.println("Отсортированный по убыванию тот же массив чисел");
                    Arrays.sort(numberArray, Collections.reverseOrder());
                    break;
                
            }

            int rightDiagonalCounter=0;
            int leftDiagonalCounter=size-1;
            int sumLeft = 0;
            int sumRight = 0;
            for (int i = 0; i < numberArray.length; i++) {
                System.out.printf("%-3d",numberArray[i]);

                if(leftDiagonalCounter > numberArray.length-1){
                    leftDiagonalCounter = numberArray.length-1;
                }
                if(i==leftDiagonalCounter){
                    sumLeft += numberArray[leftDiagonalCounter];
                }
                if(i==rightDiagonalCounter){
                    sumRight += numberArray[rightDiagonalCounter];
                }
                if((i+1)%size == 0 ){
                   System.out.println("");
                   rightDiagonalCounter += size+1; 
                   leftDiagonalCounter += size-1;
                }

            }
            System.out.println("Сумма правой диагонали:"+sumRight);
            System.out.println("Сумма левой диагонали:"+sumLeft);
        }

    }
}
