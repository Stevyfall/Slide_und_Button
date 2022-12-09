import controlP5.*;
import processing.core.PApplet;

import java.awt.event.ActionListener;

import static controlP5.ControlP5Constants.ACTION_RELEASE;

public class View extends PApplet {
    public static void main(String [] args){
PApplet.main(View.class);
    }
    Slider s1;
    DSlider ds;
   ControlP5 cp5;
    private int s = 50;

    @Override
    public void draw(){
        background(255);

        text("ok",22,33);

    }
    @Override
    public void settings(){size(500,500);
    }
    public void setup(){
        make();
    }
    public void make(){
        cp5 = new ControlP5(this);
        s1 = new Slider(cp5,"Slider");

        s1.setLabel("test");
        s1.setValue(s);
        Slider finalS = s1;
        s1.addListener(controlEvent -> s = (int) finalS.getValue()).setSize(300,100).setRange(1,200).setPosition(100,200);
        s1.setColorBackground(255);

      ds = new DSlider(s1,controlEvent -> System.out.println("first"));
        ds.toString();
       s1.addListenerFor(ACTION_RELEASE, controlEvent ->{System.out.println("last saved number: "+s1.getValue());}) ;


    }
public void keyPressed(){

        ds.setDisabled(ds.isEnable());}
}
