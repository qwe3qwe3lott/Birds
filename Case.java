import java.awt.*;
public class Case {
    //массив, отвечающий за хранения координат рамки и флага, оповещающем о том, что все координаты получены и можно рисовать рамку
    static int[] birdData = new int[5];
    //переменная оптеделяющая класс птицы на основе массива, содржащего информацию, о распределении птиц на поле(BirdsGreatFrame3000.c)
    static int birdNumber = 0;
    //переменная отвечающая за цвет рамки, рисуемой в данный момент
    private static Color color;
    //конструктор
    public Case(Graphics g) {
        for (int i = 0; i < 4; i++) {
            birdNumber++;
            resetBirdData();
            createCase(g);
        }
    }
    //метод, обновляющий переменные, для отрисовки следующей рамки
    private void resetBirdData() {
        birdData[0] = 0;
        birdData[1] = BirdsGreatFrame3000.bx;
        birdData[2] = 0;
        birdData[3] = BirdsGreatFrame3000.by;
        birdData[4] = 0;
    }
    //метод, выбирающий цвет для рамки на основе переменной, определяющей класс птицы(birdNumber)
    private Color whatColor() {
        if (birdNumber == 1) {
            color = Color.red;
        }
        if (birdNumber == 2) {
            color = Color.blue;
        }
        if (birdNumber == 3) {
            color = Color.green;
        }
        if (birdNumber == 4) {
            color = Color.ORANGE;
        }
        return(color);
    }
    //метод, рисующий рамки
    private void createCase(Graphics g) {
        for (int i = 0; i < BirdsGreatFrame3000.bx * BirdsGreatFrame3000.by; i++) {
            if (BirdsGreatFrame3000.c.get(i).equals(birdNumber)) {
                birdData[0] = 1;
                if (i % BirdsGreatFrame3000.bx < birdData[1]) {
                    birdData[1] = i % BirdsGreatFrame3000.bx;
                }
                if ((i % BirdsGreatFrame3000.bx) + 1 > birdData[2]) {
                    birdData[2] = (i % BirdsGreatFrame3000.bx) + 1;
                }
                if (i / BirdsGreatFrame3000.bx < birdData[3]) {
                    birdData[3] = i / BirdsGreatFrame3000.bx;
                }
                if ((i / BirdsGreatFrame3000.bx) + 1 > birdData[4]) {
                    birdData[4] = (i / BirdsGreatFrame3000.bx) + 1;
                }
            }
        }
        birdData[2] = birdData[2] - birdData[1];
        birdData[4] = birdData[4] - birdData[3];
        if (birdData[0] == 1) {
            g.setColor(whatColor());
            g.drawRect(Box.constox + birdNumber + birdData[1] * BirdsGreatFrame3000.size - 2, Box.constoy + birdNumber + birdData[3] * BirdsGreatFrame3000.size - 2, birdData[2] * BirdsGreatFrame3000.size, birdData[4] * BirdsGreatFrame3000.size);
        }
    }
}

