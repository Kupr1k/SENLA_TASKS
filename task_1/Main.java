package task_1;

/* Напишите программу, которая возвращает количество
 "троек" в заданной строке. Тройка - это символ,
 появляющийся три раза подряд в строке.*/

public class Main {

    public static int numOfTriples(String str) {
        int len = str.length();
        int result = 0;
        for (int i = 0; i < len - 2; i++) {
            char temp = str.charAt(i);
            if (temp == str.charAt(i + 1) && temp == str.charAt(i + 2))
                result++;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "Heeellooo wwwwworlddd";
        System.out.println(numOfTriples(s));
    }
}
