import java.util.ArrayList;
import java.util.List;

public class Exit {
    private Position destination;
    private List<Position> positionsExit = new ArrayList<>(); // mathis | liste contenant les positions possible de sortie
    
    public Exit (Position pos){ // mathis | de ce que j'ai compris on a pas besoin de constructeurs (pour se deplacer seulement utiliser GO)
        this.destination = pos;                         //
    }
    public Position getDestination (){
        return this.destination;
    }

    public List<Position> getPositionsExit() { // mathis | pour acceder à la liste de sorties
        return positionsExit;
    }
}