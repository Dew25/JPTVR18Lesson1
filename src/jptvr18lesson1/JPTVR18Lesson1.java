/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr18lesson1;

import java.util.Scanner;
import myclasses.App;
import myclasses.Task2;
import myclasses.Task4;

/**
 *
 * @author Melnikov
 */
public class JPTVR18Lesson1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите здадачу:");
        System.out.println("1. Игра - угадай задуманное число");
        System.out.println("2. Разбор трехзначного числа");
        System.out.println("3. Вывести массив\n\tиз указанного количества елементов\n\tв виде матрицы указанного размера");
        System.out.println("Введите номер задачи: ");
        int numberTask = scanner.nextInt();
        switch (numberTask) {
            case 1:
                App app = new App();
                app.run();
                break;
            case 2:
                Task2 task2 = new Task2();
                task2.run();
                break;
            case 3:
                Task4 task4 = new Task4();
                task4.run();
                break;    
            
        }
        
    }
    
}
