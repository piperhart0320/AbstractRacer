public class Robot extends AbstractRacer
{
    private boolean isBroken; 

    public Robot(String name)
    {
        super(name);
        isBroken = false; 
    }
    public void move()
    {
        int num = (int) Math.random() * 2; 
        if (num == 0)
        {
            isBroken = false; 
        }
        else 
        {
            isBroken = true; 
        }
        if (isBroken == false)
        {
            setPosition(getPosition() + 10); 
        }
        if (isBroken == true)
        {
            System.out.println("sorry, the robot broke. unable to finish the race"); 
        }
    }
    
}