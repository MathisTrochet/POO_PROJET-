
import java.util.ArrayList;
import java.util.List;

import java.util.HashMap;
import java.util.Map;

public class Position {
    protected String name;
    private List<Character>characters = new ArrayList<>();
    private String description;
    private Town town;
    private List<Object>objects = new ArrayList<>();
    private Map<String,Exit>exits = new HashMap<>();    
    
    public Position (String n, Town t){ //REFAIRE BIEN LES CONSTRUCTEURS
        this.name = n;
        this.town = t;
    }
    public String getDescription(){
        return this.description;
    }
    public Town getTown(){
        return this.town;
    }
    
    public void addCharater (Character c){
        (this.characters).add(c);
    }
    public void addPosition(String n, Position pos){
        exits.put(n, new Exit(pos));
    }    
    public Map<String,Exit> getExits(){
        return this.exits;
}
}
