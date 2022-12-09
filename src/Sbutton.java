import controlP5.CColor;
import processing.core.PApplet;
import controlP5.*;
import java.awt.*;

import static controlP5.ControlP5Constants.ACTION_RELEASE;

public class Sbutton extends PApplet {
    Slider s;
    private int stint = 100;

public static void main(String[] args){
    PApplet.main(Sbutton.class);
}
    ControlP5 cp5;
public void settings(){
    size(400, 400);
}
    public void setup() {
        cp5 = new ControlP5(this);
        cp5.addSlider("s1")
                .setPosition(20, 100)
                .setSize(200, 20);
    }

    public void draw() {
        background(20);
    }
public String toString(){
    var tint = new ControlListener(){
        @Override
        public void controlEvent(ControlEvent controlEvent) {
            stint = (int)s.getValue();
        }
    };
    s.addListener(tint);
    tint.controlEvent(null);
    return " "+ s.getValue() ;
}
}
