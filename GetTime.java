import java.util.GregorianCalendar;
public class GetTime {

    static GregorianCalendar gcalendar = new GregorianCalendar();
    private boolean f = false;
    private int k = 0;

    public static int day() {
        return (gcalendar.get(gcalendar.DAY_OF_WEEK));
    }
    public static int hour() {
        return (gcalendar.get(gcalendar.HOUR_OF_DAY));
    }
    public static int minute() {
        return (gcalendar.get(gcalendar.MINUTE));
    }

    private void para1() {
        if (hour() == 9) {
            System.out.println("До конца пары " + (90 - minute()) + " минут");
        } else if (hour() == 10 && minute() < 30) {
            System.out.println("До конца пары " + minute() + " минут");
        } else {
            k++;
        }
    }

    private void para2() {
        if (hour() == 10 && minute() >= 40) {
            System.out.println("До конца пары " + (130 - minute()) + " минут");
        } else if (hour() == 11) {
            System.out.println("До конца пары " + (70 - minute()) + " минут");
        } else if (hour() == 12 && minute() < 10) {
            System.out.println("До конца пары " + (10 - minute()) + " минут");
        } else {
            k++;
        }
    }

    private void para3() {
        if (hour() == 12 && minute() >= 20) {
            System.out.println("До конца пары " + (110 - minute()) + " минут");
        } else if (hour() == 13 && minute() < 50) {
            System.out.println("До конца пары " + (50 - minute()) + " минут");
        } else {
            k++;
        }
    }

    private void para4() {
        if (hour() == 14 && minute() >= 30) {
            System.out.println("До конца пары " + (120 - minute()) + " минут");
        } else if (hour() == 15) {
            System.out.println("До конца пары " + (60 - minute()) + " минут");
        } else {
            k++;
        }
    }

    private void para5() {
        if (hour() == 16 && minute() >= 10) {
            System.out.println("До конца пары " + (100 - minute()) + " минут");
        } else if (hour() == 17 && minute() < 40) {
            System.out.println("До конца пары " + (40 - minute()) + " минут");
        } else {
            k++;
        }
    }
    public void getTime() {
        if (day() == 1) {
            f = true;
        }
        if (day() == 2) {
            para1();
            para2();
            if (k == 2) {
                f = true;
            }
        }
        if (day() == 3) {
            para1();
            para2();
            para3();
            if (k == 3) {
                f = true;
            }
        }
        if (day() == 4) {
            para3();
            if (k == 1) {
                f = true;
            }
        }
        if (day() == 5) {
            para3();
            para4();
            para5();
            if (k == 3) {
                f = true;
            }
        }
        if (day() == 6) {
            para1();
            para2();
            para3();
            para4();
            if (k == 4) {
                f = true;
            }
        }
        if (day() == 7) {
            para1();
            para2();
            para4();
            if (k == 3) {
                f = true;
            }
        }
        if (f) {
            System.out.println("В данный момент занатие не проводится");
        }
    }
}
