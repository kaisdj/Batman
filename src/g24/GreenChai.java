package g24;


import battleship.interfaces.BattleshipsPlayer;
import battleship.interfaces.Board;
import battleship.interfaces.Fleet;
import battleship.interfaces.Position;
import battleship.interfaces.Ship;
import java.util.ArrayList;
import java.util.Random;


class GreenChai implements BattleshipsPlayer
{
    private int sizeX;
    private int sizeY;
    private Board Shipboard;  
    
    private int nextX;
    private int nextY;
            
    
    
  private final static Random random = new Random();
    
    private ArrayList<Ship> listofShips = new ArrayList<Ship> ();
    
    
    
    public GreenChai()
    {
    }

    @Override
    public void startMatch(int rounds, Fleet ships, int sizeX, int sizeY)
    {
       
       
        
        
        
    }

    @Override
    public void startRound(int round)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void
   placeShips(Fleet fleet, Board board )
   
            
    {

        {
            
            boolean vertical = random.nextBoolean();
            
            Position pos = null;
            pos = new Position(2, 1);
            Ship shipone = fleet.getShip(0);
            vertical=random.nextBoolean();
            
            
            vertical = false;
            board.placeShip(pos, shipone, vertical);
            

            pos = new Position(4, 7);
            Ship shiptwo = fleet.getShip(1);
            vertical=random.nextBoolean();
            vertical = false;
            board.placeShip(pos, shiptwo, vertical);

            pos = new Position(7, 3);
            Ship shipthree = fleet.getShip(2);
            vertical=random.nextBoolean();
            vertical = false;
            board.placeShip(pos, shipthree, vertical);

            pos = new Position(4, 0);
            Ship shipfour = fleet.getShip(3);
            vertical=random.nextBoolean();
            vertical = false;
            board.placeShip(pos, shipfour, vertical);

            pos = new Position(0, 5);
            
            Ship shipfive = fleet.getShip(4);
            vertical=random.nextBoolean();
            vertical = true;
            board.placeShip(pos, shipfive, vertical);

           
            

            
            
            }
                
    }

    @Override
    public void incoming(Position pos)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Position getFireCoordinates(Fleet enemyShips)
    {
         Position shot = new Position(nextX, nextY);
        ++nextX;
        if(nextX >= sizeX)
        {
            nextX = 0; 
            ++nextY;
            if(nextY >= sizeY)
            {
                nextY = 0;
            }
        }
        return shot;
        
        
        
    }

    @Override
    public void hitFeedBack(boolean hit, Fleet enemyShips)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void endRound(int round, int points, int enemyPoints)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void endMatch(int won, int lost, int draw)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
