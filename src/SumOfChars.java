import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //прочитам -> взимаме ascii code -> сумираме
        int n = Integer.parseInt(scanner.nextLine()); //брой на символите
        int sum = 0; //сума от кодовете на символите
        for (int count = 1; count <= n; count++) {
            //1. прочитам символ
            char symbol = scanner.nextLine().charAt(0);
            //2. взимам аски кода
            //3. добавям аски кода към сумата
            sum += (int)symbol; //sum = sum + symbol
        }

        System.out.println("The sum equals: " + sum);
    }
}
