import java.awt.*;
public abstract class Birds {

    public Birds() {
        System.out.println("Я птица");
    }
    public void fly() {
        System.out.println("Я летаю!");
    }


    public void draw(Graphics g) {
        g.setColor(Box.color);
        g.fillOval(Box.ox, Box.oy, BirdsGreatFrame3000.size, BirdsGreatFrame3000.size);
    }

    public void tellTimeis() {
        if (GetTime.hour() >= 6 && GetTime.hour() < 12) {
            System.out.println("Доброе утро");
        }
        if (GetTime.hour() >= 12 && GetTime.hour() < 18) {
            System.out.println("Добрый день");
        }
        if (GetTime.hour() >= 18 && GetTime.hour() <= 23) {
            System.out.println("Добрый вечер");
        }
        if (GetTime.hour() >= 0 && GetTime.hour() < 6) {
            System.out.println("Доброй ночи");
        }
    }
}