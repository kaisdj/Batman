package g24;


import battleship.interfaces.BattleshipsPlayer;
import tournament.player.PlayerFactory;


public class G24 implements PlayerFactory<BattleshipsPlayer>
{

    @Override
    public BattleshipsPlayer getNewInstance()
    {
       return new GreenChai();
    }

    @Override
    public String getID()
    {
        return "G24";
    }

    @Override
    public String getName()
    {
        return "GreenChai";
    }

    @Override
    public String[] getAuthors()
    {
         String[] name = {"Kais Al Kaisy"};
        return name;
    }
    
}
