import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  //universal variables for my objects
  PImage bgImage;
  PImage nana;
  float bNana = 0;
  float nanaSped = 1;
  float rotate = 0;
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 600);
    
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
   //load images
    background(0, 0, 0);
    bgImage = loadImage("backG.jpg");
    nana = loadImage("nana.png");
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    //draw background
    image(bgImage,0, 0);
    
    //draw banana and makes it move with collision
    image(nana, bNana, width/2);
      bNana = bNana+ nanaSped;

    if(bNana < 0 || bNana > width){
      nanaSped = nanaSped * -1;
    }
    	  
    //Draw square and makes it rotate
    translate(400, 300);
    rotate(radians(rotate));
    rect(-10, 0, 50, 50);
    rotate += 1;




  }
  
  // define other methods down here.
}