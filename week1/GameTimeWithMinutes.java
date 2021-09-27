import java.io.IOException;
import java.util.*;
public class GameTimeWithMinutes{

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int startHour = s.nextInt();
        int startMinute= s.nextInt();
        int endHour = s.nextInt();
        int endMinute = s.nextInt();
        int minute= 0;
        int hour= 0;

        if (startHour == endHour && startMinute == endMinute && startHour == endMinute) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else {
            if (startHour > endHour) {
                hour= 24 - startHour + endHour;
            }
            else if (startHour < endHour) {
                hour= 24 - (24 - endHour + startHour);
            }
            if (startMinute > endMinute) {
                minute= 60 + endMinute - startMinute;
                if (startHour == endHour) {
                    hour= 24 + hour - 1;
                }
                else {
                    hour= hour - 1;
                }
            }
            else {
                minute= endMinute - startMinute;
            }
            System.out.println("O JOGO DUROU " + hour + " HORA(S) E " + minute + " MINUTO(S)");
        }
    }
}