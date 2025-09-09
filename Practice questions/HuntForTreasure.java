import java.util.Random;

class clueMaster
{
    void generateClue()
    {
        Random numberGenerator = new Random();
        int number = numberGenerator.nextInt(5)+1;
        if(number == 1) System.out.println("For something that has a spine but no bones");
        else if(number == 2) System.out.println("For a place where food is kept cold");
        else if(number == 3) System.out.println("For a television remote");
        else if(number == 4) System.out.println("For a pair of shoes");
        else if(number == 5) System.out.println("For a mirror");
    }
}

class TreasureHunt
{
    clueMaster c = new clueMaster();
    void call() {c.generateClue();}
}


public class HuntForTreasure
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the Treasure Hunt!\nHere's a clue to start your journey.");
        TreasureHunt t = new TreasureHunt();
        t.call();
    }
}
