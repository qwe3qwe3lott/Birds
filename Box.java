import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Box {
    ArrayList<Birds> box = new ArrayList<>();
    Random r = new Random();
    public static int countOfBirds = 0;
    public static int fake;
    public static int ox;
    public static int oy;
    public static Color color;
    static int constox = 15;
    static int constoy = 35;

    public Box() {
        Scanner in = new Scanner(System.in);
        String s;
        for (;true;) {
            System.out.println("Введите единицу для создания попугая, двойку для создания пингвина, тройку для создания воробья, четвёрку для создания дятла, любой другой символ для завершения");
            s = in.next();
            if (s.equals("1")) {
                box.add(new Macaw());
                countOfBirds++;
            } else if (s.equals("2")) {
                box.add(new Penguin());
                countOfBirds++;
            } else if (s.equals("3")) {
                box.add(new Sparrow());
                countOfBirds++;
            } else if (s.equals("4")) {
                box.add(new Woodpeaker());
                countOfBirds++;
            } else {
                break;
            }
        }
    }
    public void fly() {
        for (int i = 0; i < box.size(); i++) {
            box.get(i).fly();
        }
    }
    public void draw(Graphics g) {
        for (int i = 0; i < box.size(); i++) {
            box.get(i).tellTimeis();
            for (;true;) {
                fake = r.nextInt(BirdsGreatFrame3000.bx * BirdsGreatFrame3000.by);
                if (BirdsGreatFrame3000.c.get(fake).equals(0)) {
                    ox = constox + BirdsGreatFrame3000.size * (fake % BirdsGreatFrame3000.bx);
                    oy = constoy + BirdsGreatFrame3000.size * (fake / BirdsGreatFrame3000.bx);
                    if (box.get(i) instanceof Macaw) {
                        BirdsGreatFrame3000.c.set(fake,1);
                        color = Color.red;
                        box.get(i).draw(g);
                    }
                    if (box.get(i) instanceof Penguin) {
                        BirdsGreatFrame3000.c.set(fake,2);
                        color = Color.blue;
                        box.get(i).draw(g);
                    }
                    if (box.get(i) instanceof Sparrow) {
                        BirdsGreatFrame3000.c.set(fake,3);
                        color = Color.green;
                        box.get(i).draw(g);
                    }
                    if (box.get(i) instanceof Woodpeaker) {
                        BirdsGreatFrame3000.c.set(fake,4);
                        color = Color.ORANGE;
                        box.get(i).draw(g);
                    }
                    break;
                }
            }
        }
    }
    public void drawcase(Graphics g) {
        Case cases = new Case(g);
    }
}
