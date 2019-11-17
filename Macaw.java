import java.awt.*;
public class Macaw extends Birds {
    private String name = "Петя";
    private static int countMacaw = 0;

    public Macaw() {
        countMacaw++;
        System.out.println("Я попугай № " + countMacaw);
    }

    public Macaw(String Name) {
        countMacaw++;
        name = Name;
        System.out.println("Я попугай № " + countMacaw);
    }

    public void speak() {
        System.out.println("Меня зовут " + this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void dialog(Macaw name) {
        System.out.println("Привет, " + name.getName());
    }

    public void answer(Macaw name) {
        System.out.println("И тебе привет, " + name.getName());
    }

    public void dialogPenguin() {
        System.out.println("Привет, пингвин!");
    }

    public void draw(Graphics g) {
        g.setColor(Box.color);
        g.fillOval(Box.ox, Box.oy, BirdsGreatFrame3000.size, BirdsGreatFrame3000.size);
        Box.color = Color.yellow;
        g.setColor(Box.color);
        g.fillOval(Box.ox + BirdsGreatFrame3000.size/5, Box.oy + BirdsGreatFrame3000.size/5, BirdsGreatFrame3000.size/5*2, BirdsGreatFrame3000.size/5*2);
    }
}