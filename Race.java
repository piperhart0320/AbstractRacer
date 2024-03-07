import java.util.ArrayList; 
public class Race 
{
    private ArrayList<AbstractRacer> members; 
    private int DISTANCE; 
    private boolean win; 

    public Race(int distance)
    {
       this.DISTANCE = distance; 
       members = new ArrayList<AbstractRacer>(); 
       win = false; 
    }
    public void addRacer(AbstractRacer racer)
    {
        members.add(racer); 
    }
    public boolean update()
    {
        win = false; 
        for (int i = 0; i < members.size(); i++)
        {
            if (members.get(i).getPosition() >= DISTANCE)
            {
                System.out.println("Winner is " + members.get(i).getName()); 
                win = true; 
                
            }
            if (members.get(i).getPosition() < DISTANCE)
            {
                for (int m = 0; m < members.size(); m++)
                {
                    members.get(m).move(); 
                }
            }
        }
        return win; 
    }
    public ArrayList<AbstractRacer> getConstestants()
    {
        return members; 
    }
    public void tick()
    {
        for (AbstractRacer r : members)
        {
            r.move(); 
        }
    }
    public String toString()
    {
        String result = "------------ \n CURRENT RACE STATS\n"; 
        for (AbstractRacer r : members)
        {
            result += r + "\n"; 

        }
        return result; 
    }
    public boolean raceOver()
    {
        boolean t = false; 
        for (AbstractRacer r : members)
        {
            if (r.getPosition() >= DISTANCE)
            {
                t = true; 
            } 
            
        }
        return t; 
    }
    public int getDistance()
    {
        return DISTANCE; 
    }
    public int getMembers()
    {
        return members.size(); 
    }
    public boolean getWin()
    {
        return win; 
    }
}
