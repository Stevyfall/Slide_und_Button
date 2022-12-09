import controlP5.*;
import processing.core.PApplet;

public class BView extends PApplet {
    public static void main(String [] args){
        PApplet.main(BView.class);
    }
    CallbackListener con;
    Dbutton db;
    ControlP5 cp5;
    @Override
    public void draw(){
        background(255);

        text("ok",22,33);

     con = new CallbackListener() {
         @Override
         public void controlEvent(CallbackEvent callbackEvent) {

         }

     };
        // slider.addListener(tint);
        // tint.controlEvent(null);
    }
    @Override
    public void settings(){size(500,500);
    }
    public void setup(){
        maked();
    }
    public void maked(){
        cp5 = new ControlP5(this);
        Button b1 = new Button(cp5,"Button").setLabel("Button").setSize(100,100).setPosition(100,100);

         db = new Dbutton(b1,con);

    }
    public void keyPressed(){
        db.setDisabled(db.isEnable());
    }
}
