public class RaceRunner 
{

    public static void main(String [] args)
    {
        Race race = new Race(50); 
        Hare hare = new Hare("hoppy"); 
        Tortoise tort = new Tortoise("dylan"); 
        race.addRacer(hare); 
        race.addRacer(tort); 
        for (int i = 0; i < race.getDistance(); i++)
        {
            race.update();
            System.out.println(race.toString()); 
            System.out.println(tort.toString()); 
            System.out.println(hare.toString()); 
            race.raceOver(); 
        }
        
        System.out.println(race.toString()); 
        System.out.println(tort.toString()); 
        System.out.println(hare.toString()); 
    }
    
}
