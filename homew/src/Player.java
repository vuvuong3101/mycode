import java.awt.*;

/**
 * Created by admin on 4/13/17.
 */
public class Player {
    private  int x;
    private  int y;
    private  int w;
    private  int h;
    private Image image;
    private int dx;
    private  int dy;
    private int screenW = 600;
    private int screenH = 700;

    public Player(int x, int y, Image image) {
        this.x = x;
        this.y = y;
        this.w = 70;
        this.h = 60;
        this.image = image;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void draw(Graphics graphics) {
        graphics.drawImage(image, x, y, null);
    }

    public  void processInput(boolean isUpPressed, boolean isDownPressed, boolean isLeftPressed, boolean isRightPressed, boolean isSpacePressed){
        dx = 0;
        dy = 0;
        if (isUpPressed) {
            if (y > 20) {
                dy -= 10;
            }
        }
        if (isDownPressed) {
            if (y <= screenH - h) {
                dy += 10;
            }
        }
        if (isLeftPressed) {
            if (x >= 0) {
                dx -= 10;
            }
        }
        if (isRightPressed) {
            if (x <= screenW - w) {
                dx += 10;
            }
        }

    }
    public  void update() {
        this.x += dx;
        this.y += dy;
    }
}
