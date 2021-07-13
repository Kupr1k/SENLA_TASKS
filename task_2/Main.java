package task_2;

/*Напишите программу, которая возвращает сумму цифр,
 присутствующих в данной строке. Если цифр нет,
  возвращаемая сумма равна 0.*/

public class Main {

    public static int sumOfNumbers(String str) {
        int sum = 0;
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                temp += str.charAt(i);
                sum += Integer.parseInt(temp);
                temp = "";
            }
        }
        if (sum == 0) {
            return 0;
        } else return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumbers("weqr23sd3"));
        System.out.println(sumOfNumbers("dsaddsa"));
    }
}
