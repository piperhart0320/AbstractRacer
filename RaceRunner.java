public class RaceRunner 
{

    public static void main(String [] args)
    {
        Race race = new Race(100); 
        Hare hare = new Hare("hoppy"); 
        Tortoise tort = new Tortoise("dylan"); 
        Robot robot = new Robot("rob"); 
        race.addRacer(hare); 
        race.addRacer(tort); 
        race.addRacer(robot); 

        System.out.println("There are "+ race.getMembers() + " races in the race: "); 
        System.out.println(race.getConstestants()); 
        
        System.out.println("running the race: on your marks, get set, GO!!!"); 

        race.update(); 
        while (race.getWin() == false)
        {
            System.out.println(race.toString()); 
            race.update(); 
            
        }
        race.raceOver(); 
        System.out.println("Race is over."); 
        
     
    }
    
}
