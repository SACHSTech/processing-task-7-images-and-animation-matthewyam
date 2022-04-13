import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
	float circle = 0;
  float cirSpeed = 1;
  PImage bgImage;
  PImage nana;
  float bNana = 0;
  float nanaSped = 1;
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
    
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 0, 0);
    bgImage = loadImage("backG.jpg");
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    image(bgImage,0, 0);
    ellipse(200, circle, 50, 50);

    circle = circle+cirSpeed;
 
    if(circle < 0 || circle > height){
      cirSpeed = cirSpeed * -1;
    }
    nana = loadImage("nana.png");
    image(nana, 0, 0);
    bNana = bNana + nanaSped;
    
    if(bNana < 0 || bNana > width){
      nanaSped = nanaSped * -1;
    }


  }
  
  // define other methods down here.
}