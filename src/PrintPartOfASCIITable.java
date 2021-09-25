import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        //всеки код от първия до последния
        //печатам символа срещу кода
        for (int code = startNumber; code <= endNumber; code++) {
            System.out.print((char)code + " ");
        }
    }
}
