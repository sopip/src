import processing.core.*;
public class GUIbase {
    protected float width, height; //protected fordi de også bruges i underklasser
    protected float posx, posy;
    private float xoff;
    private boolean locked = false;
    protected PApplet p;
  
    public GUIbase(PApplet pin, int xin, int yin, int win, int hin) {
      p = pin;
      posx = xin;
      posy = yin;
      width = win; //skal være 30
      height = hin; //skal være 20

      
    }
  public void draw() {
  }
//her var sliderdraw
  public boolean isOver(){ //skal der så stå boolean i stedet for void?
    return ((p.mouseX<posx+width/2) && (p.mouseX>posx-width/2) && (p.mouseY<posy+height/2) && (p.mouseY>posy-height/2));
  }

  public void pressed() {
      if (isOver()) {
        locked = true;
        xoff = p.mouseX-posx;
      }
    }

    public void dragged() {
      if (locked) {
        posx = p.mouseX-xoff;
      }
    }

    public void released() {
      locked = false;
    }

  //her var vari og textdraw
  }