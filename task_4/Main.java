package task_4;

/*Создать программу, которая будет вычислять и выводить
 на экран простые множители из которых состоит целое число,
 введенное пользователем. Если введено не целое число, то
 сообщать ему об ошибке.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void factorize(int number, int primeNumber) {
        if (primeNumber > number) return;
        if (number % primeNumber == 0) {
            while (number % primeNumber == 0) {
                number = number / primeNumber;
                System.out.print(primeNumber + " ");
            }
        }
        factorize(number, primeNumber + 1);
    }

    public static void main(String[] args) {
        try {
            System.out.println("Введите целое число: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            factorize(num, 2);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Введенное число не является целым!");
        }
    }
}
