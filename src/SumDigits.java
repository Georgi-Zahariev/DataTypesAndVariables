import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0; //сума от цифрите
        //number % 10 -> последната цифра на числото
        //повтаряме: while
        //1. взимаме последната цифра
        //2. сумираме цифрата
        //3. премахвам последната цифра от числото -> number / 10
        //stop: number == 0
        //continue: number != 0
        while (number != 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10; //number /= 10;
        }

        System.out.println(sum);
    }
}
