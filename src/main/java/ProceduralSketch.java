import processing.core.PApplet;

public class ProceduralSketch extends PApplet {

    public static final int HEIGHT=60;
    public static final int WIDTH=20;
    public static final int DIAMETER=10;
    int firstX=0,secondX=0,thirdX=0,fourthX=0;
    public static void main(String[] args){
        PApplet.main("ProceduralSketch", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(500, 500);
    }

    @Override
    public void draw() {

            drawCircle1();
            drawCircle2();
            drawCircle3();
            drawCircle4();

    }

    public void drawCircle1(){
        ellipse(firstX,20,HEIGHT/5,DIAMETER);
        firstX+=1;

    }

    public void drawCircle2(){
        ellipse(secondX,50,HEIGHT*2/5,DIAMETER);
        secondX+=2;

    }
    public void drawCircle3(){
        ellipse(thirdX,100,HEIGHT*3/5,DIAMETER);
        thirdX+=3;

    }
    public void drawCircle4(){
        ellipse(fourthX,200,HEIGHT*4/5,DIAMETER);
        fourthX+=4;

    }



}

