package movingobject;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

class TrainCanvas extends MovingObject {

    private int lastX = 0;

    public TrainCanvas() {
        Thread animationThread = new Thread(() -> {
            while (true) {
                paintComponent(Graphics g);
                try {Thread.sleep(10);} catch (Exception ex) {}
            }
        });

        animationThread.start();
    }

    public void paintComponent(Graphics g) {
        Graphics2D gg = (Graphics2D) g;

        int w = getWidth();
        int h = getHeight();

        int trainW = 100;
        int trainH = 10;
        int trainSpeed = 3;

        int x = lastX + trainSpeed;

        if (x > w + trainW) {
            x = -trainW;
        }

        gg.setColor(Color.BLACK);
        gg.fillRect(x, h/2 + trainH, trainW, trainH);

        lastX = x;
    }

    private int getWidth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
