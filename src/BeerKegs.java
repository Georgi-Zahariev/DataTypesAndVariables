import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); //брой на кеговете
        //за всеки кег чета: модел, радиус, височина
        double maxVolume = Double.MIN_VALUE;
        String maxModelKeg = ""; //Моделът на кега, който е с най-голям обем
        for (int keg = 1; keg <= n; keg++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            //oбем = пи * радиус ^ 2 * височина
            double volume = Math.PI * Math.pow(radius, 2) * height;
            //проверка дали е максимален
            if (volume > maxVolume) {
                maxVolume = volume;
                maxModelKeg = model;
            }
        }
        System.out.println(maxModelKeg);
    }
}
