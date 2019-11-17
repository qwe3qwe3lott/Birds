import java.awt.*;
public class Case {
    static int[] birdData = new int[5];
    static int birdNumber = 0;
    private static Color color;

    public Case(Graphics g) {
        for (int i = 0; i < 4; i++) {
            birdNumber++;
            resetBirdData();
            createCase(g);
        }
    }

    private void resetBirdData() {
        birdData[0] = 0;
        birdData[1] = BirdsGreatFrame3000.bx;
        birdData[2] = 0;
        birdData[3] = BirdsGreatFrame3000.by;
        birdData[4] = 0;
    }

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

