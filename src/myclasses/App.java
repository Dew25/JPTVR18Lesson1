/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class App {
    public void run(){
        
            System.out.println("Привеееет, группа JPTVR18!");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Напишите свое имя латинскими буквами: ");
            String myName = scanner.nextLine();
            System.out.println("Hi, "+myName);
            Random random = new Random();
        do{   
            int randomNumber = random.nextInt(5);
            System.out.println("Задумано число от 0 до 4. Угадай?");
            int userNumber = scanner.nextInt();
            if(userNumber == randomNumber){
                System.out.println("Ты угадал, молодец!");
                break;
            }else{
                System.out.println("Не повезло :(, задумано число: "+randomNumber);
            }
            
        }while(true);
    }
}
