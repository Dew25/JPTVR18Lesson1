/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class Task2 {
    public void run(){
        System.out.println("Задача 2");
        System.out.println("Пользователь вводит трехзначное число.");
        System.out.println("Найдите: Число единиц, десятков."); 
        System.out.println("Сумму цифр");
        System.out.println("Для решения можно использовать арифметический оператор % - остаток от деления ");
        System.out.println("Решение:");
        System.out.println("Введите трехзначное число: ");
        int decimalNum=0, hundredNum=0, sum=0;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        System.out.println("В этом числе:");
        System.out.println("Десятков: "+ decimalNum);
        System.out.println("Сотен: "+ hundredNum);
        System.out.println("Сумма чисел: "+ sum);
    }
}
