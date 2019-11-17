import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.*;
public class BirdsGreatFrame3000 extends JFrame {
    Scanner in = new Scanner(System.in);
    private Box box;
    public static int size;
    public static int bx;
    public static int by;
    public static ArrayList c = new ArrayList();
    public BirdsGreatFrame3000(Box box) {
        this.box = box;
        System.out.println("Введите ширину окна");
        int ax = in.nextInt();
        System.out.println("Введите высоту окна");
        int ay = in.nextInt();
        System.out.println("Введите размер птицы");
        size = in.nextInt();
        this.setSize(ax, ay);
        bx = (ax - 20) / size;
        by = (ay - 40) / size;
        for (int i = 0; i < bx * by; i++) {
            c.add(0);
        }
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Птицы");
    }

    private int saveplan;

    public void paint(Graphics g) {
        saveplan = saveplan + Box.countOfBirds;
        if (saveplan < Box.countOfBirds + 1) {
            if (bx * by >= Box.countOfBirds) {
                box.draw(g);
                box.drawcase(g);
            } else {
                System.out.println("Птицы не поместятся в данном окне");
            }
        }
    }
}
