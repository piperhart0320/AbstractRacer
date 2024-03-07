public class Hare extends AbstractRacer
{
    private int energy; 

    public Hare(String name)
    {
        super(name);
        energy = 100; 
    }
    public void move()
    {
        int num1 = (int)(Math.random() * 2);
        int num2 = (int)(Math.random() * 5) + 1;
        if (num1 == 0 && energy > 0)
        {
            setPosition(getPosition()+num2);
            energy = energy - 5; 
        }
        else if (num1 == 1 && energy > 0)
        {
            setPosition(getPosition()+0);
            
        }
    
        else
        {
            System.out.println(super.getName() + "'s out of energy.");
            
    }
}
    public int getEnergy()
    {
        return energy; 
    }
    public String toString()
    {
        String result = super.toString() + "[energy=" + energy + "]";
        return result;
    }
}
