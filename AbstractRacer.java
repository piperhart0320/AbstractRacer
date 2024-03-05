
public abstract class AbstractRacer
{
 // instance variables
 private String name;
 private int position;

 public AbstractRacer(String name)
 {
 this.name = name;
 position = 0;
 }
 
 public abstract void move();
 
 public String toString()
 {
  String result = super.toString() + "[Name=" + name + ", position=" + position + "]";
  return result;
 }
 
    public int getPosition()
    {
        return position;
    }
public void setPosition(int newPosition)
    {
        newPosition = position;
    }   
}
