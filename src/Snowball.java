import java.util.Scanner;

public class Snowball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countSnowballs = Integer.parseInt(scanner.nextLine());
        double maxSnowballValue = Double.MIN_VALUE; //най-голямото value
        int snowballSnowHighestBall = 0;
        int snowballTimeHighestBall = 0;
        int snowballQualityHighestBall = 0;
        for (int snowball = 1; snowball <= countSnowballs; snowball++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality); // цяло число
            //проверка дали value-то е най-голямо (максимално)
            if (snowballValue > maxSnowballValue) {
                //тази топка е най-голямата
                maxSnowballValue = snowballValue;
                snowballSnowHighestBall = snowballSnow;
                snowballTimeHighestBall = snowballTime;
                snowballQualityHighestBall = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", snowballSnowHighestBall, snowballTimeHighestBall, maxSnowballValue, snowballQualityHighestBall);
    }
}
