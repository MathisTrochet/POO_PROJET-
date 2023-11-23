/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.HashMap;
import java.util.Map;

public class Town {
    protected String name;
    private World world;
    private Map<String,Position>positions = new HashMap<>();

    public Town (String n){ // Ajouter la liste de Pos
        this.name = n;
        
    }
    public World getWorld(){
        return this.world;
    }
    public Map<String,Position> getPositions(){
        return this.positions;
}
    public void addPosition(String n, Town t){
        positions.put(n, new Position(n,t));
    }
}