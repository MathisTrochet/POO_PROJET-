/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.HashMap;
import java.util.Map;

public class World {
    private Map<String,Town>towns = new HashMap<>();

    public void addTown(String n){
        towns.put(n, new Town(n));
    }
    public Map<String,Town> getTowns(){
        return this.towns;
    }
}
