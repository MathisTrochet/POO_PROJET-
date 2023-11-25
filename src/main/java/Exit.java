import java.util.ArrayList;
import java.util.List;

public class Exit {
    private Position destination;
    //private List<Position> positionsExit = new ArrayList<>(); 
    
    public Exit (Position pos){
        this.destination = pos;                         
    }
    public Position getDestination (){
        return this.destination;
    }
/*
    public List<Position> getPositionsExit() { // mathis | pour acceder à la liste de sorties
        return positionsExit;
    }
*/
}