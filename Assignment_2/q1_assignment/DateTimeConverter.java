import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;


class DateTimeConverter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day");
        int day = sc.nextInt();

        System.out.println("Enter year");
        int year = sc.nextInt();

        System.out.println("Enter month ");
        int month = sc.nextInt();

        System.out.println("Enter hr");
        int hr = sc.nextInt();

        System.out.println("Enter min");
        int min = sc.nextInt();

        System.out.println("Enter sec");
        int sec = sc.nextInt();

        Calendar c = Calendar.getInstance();

        SimpleDateFormat a_1 = new SimpleDateFormat("dd/MM/yyyy ");
        SimpleDateFormat a_2 = new SimpleDateFormat("MM/dd/yyyy ");
        SimpleDateFormat a_3 = new SimpleDateFormat("yyyy/MM/dd ");

        SimpleDateFormat b_1 = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat b_2 = new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat b_3 = new SimpleDateFormat("HH:mm");

        SimpleDateFormat d_1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
        SimpleDateFormat d_2 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a ");
        SimpleDateFormat d_3 = new SimpleDateFormat("yyyy/MM/dd HH:mm");

        c.set(year,(month+1),day,hr,min,sec);

        System.out.println(a_1.format(c.getTime()));
        System.out.println(a_2.format(c.getTime()));
        System.out.println(a_3.format(c.getTime()));

        System.out.println(b_1.format(c.getTime()));
        System.out.println(b_2.format(c.getTime()));
        System.out.println(b_3.format(c.getTime()));

        System.out.println(d_1.format(c.getTime()));
        System.out.println(d_2.format(c.getTime()));
        System.out.println(d_3.format(c.getTime()));









    }
}

