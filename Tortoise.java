public class Tortoise extends AbstractRacer
{
    public Tortoise(String name)
    {
        super(name);
    }
    public void move()
    {
        setPosition(getPosition() + 1); 
    }
    
}
