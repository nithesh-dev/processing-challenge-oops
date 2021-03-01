import com.ballsChallenge.model.Ball;
import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;

    public Ball ball1;
    public Ball ball2;
    public Ball ball3;
    public Ball ball4;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

        ball1 = new Ball();
        ball1.setxPosition(0);
        ball1.setyPosition(HEIGHT / 5);
        ball1.setDiameter(20);
        ball1.setSpeed(1);

        ball2 = new Ball();
        ball2.setxPosition(0);
        ball2.setyPosition(2 * (HEIGHT / 5));
        ball2.setDiameter(20);
        ball2.setSpeed(2);

        ball3 = new Ball();
        ball3.setxPosition(0);
        ball3.setyPosition(3 * (HEIGHT / 5));
        ball3.setDiameter(20);
        ball3.setSpeed(3);

        ball4 = new Ball();
        ball4.setxPosition(0);
        ball4.setyPosition(4 * (HEIGHT / 5));
        ball4.setDiameter(20);
        ball4.setSpeed(4);
    }

    @Override
    public void draw() {

        makeCircle(ball1.getxPosition(), ball1.getyPosition(), ball1.getDiameter());
        ball1.setxPosition(ball1.getxPosition()+ball1.getSpeed());

        makeCircle(ball2.getxPosition(), ball2.getyPosition(), ball2.getDiameter());
        ball2.setxPosition(ball2.getxPosition()+ball2.getSpeed());

        makeCircle(ball3.getxPosition(), ball3.getyPosition(), ball3.getDiameter());
        ball3.setxPosition(ball3.getxPosition()+ball3.getSpeed());

        makeCircle(ball4.getxPosition(), ball4.getyPosition(), ball4.getDiameter());
        ball4.setxPosition(ball4.getxPosition()+ball4.getSpeed());
    }

    private void makeCircle(int ballXPosition, int ballYPosition, int ballDiameter) {
        ellipse(ballXPosition, ballYPosition, ballDiameter, ballDiameter);
    }


}
