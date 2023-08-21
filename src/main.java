import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*public class Main {
    public static void main(String[] args) {
       String[] daysofWeek = {"Duishombu","Sheishembi","Sharshenbi","beishembi","Juma","Ishembi","jekshembi"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kundu tandanyz: ");
        String inputDate = scanner.nextLine();

        Calendar calendar = Calendar.getInstance();
        String today = daysofWeek[calendar.get(Calendar.DAY_OF_WEEK) -1];
        String lessson = " ";
        String lesson;
        switch (today) {
            case "понедельник":
                lesson = "Java";
                break;
            case "вторник":
                lesson = "английский язык";
                break;
            // Добавьте кейсы для остальных дней недели
            default:
                lesson = "нет урока";
                break;
        }

        System.out.println("Сегодня " + today + ", вы будете изучать " + lesson);
    }
}*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату ДД: ");
        String dateString = scanner.nextLine();

        int dayOfWeekValue = Integer.parseInt(dateString) % 7;
        Day dayOfWeek = Day.values()[dayOfWeekValue];
        String lesson = null;

        switch (dayOfWeek) {
            case DUISHOMBU:
                lesson = "men duishombu kunu java tilin uironom";
                break;
            case SHEISHEMBI:
                lesson = "Men sheishembi kunu anglis tilin uironom";
                break;
            case SHARSHEMBI:
                lesson = "Men sharshembi kunu orus tilin uironom";
                break;
            case BEISHEMBI:
                lesson = "Men sheishembi kunu sport menen mashygam";
                break;
            case JUMA:
                lesson = "Men juma kunu diniy sabaktardy ugam";
                break;
            case ISHEMBI:
                lesson = "Men ishembi kunu uido jumush kylam";
                break;
            case JEKSHEMBI:
                lesson = "Men jekshembi kunu es alam";
                break;
            default:
                lesson = "У меня нет урока на этот день";
        }

        System.out.println(lesson);
    }
}