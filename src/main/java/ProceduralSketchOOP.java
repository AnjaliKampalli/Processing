import processing.core.PApplet;

import java.util.HashSet;
import java.util.Iterator;

class Ball{
    int Diameter,xPosition,yPosition;
    Ball(int x,int y){
        this.Diameter=20;
        this.xPosition=x;
        this.yPosition=y;
    }

}
public class ProceduralSketchOOP extends PApplet {

    public static final int HEIGHT=60;
    public static HashSet<Ball>map=new HashSet<>();
    

    
    public static void main(String[] args){
        PApplet.main("ProceduralSketchOOP", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(640, 480);
        for(int i=1;i<=4;i++){
            map.add(new Ball(0,i));
        }
    }

    @Override
    public void draw() {

        Iterator<Ball> i = map.iterator();
        while (i.hasNext())
            drawCircle(i.next());

    }

    public void drawCircle(Ball ball){
        ellipse(ball.xPosition,HEIGHT* ball.yPosition/5,DIAMETER,DIAMETER);
        ball.xPosition+= ball.yPosition;

    }

}

