
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Hero extends Character{
    private int atk;
    private List<Object>inventory = new ArrayList<>();
    private Weapon weapon;
    public Hero (){ // Revoir les valeurs
        super();
        
        this.maxHealth = 25;
        this.currentHealth = 25;
        this.atk = 0;
    }

    public int getAtk(){
        return this.atk;
    }
    public void look(){
        System.out.println(this.pos.getDescription());
    }
    public void look (Object o){
        System.out.println(o.getDescription());
    }
    public void attack (Character target){
        // faire une exeption avec les pnj
        target.currentHealth -= this.atk;
        System.out.println(target.name +" LP = " + target.currentHealth);
    }

    
    /*public int indexOfTown (){
        return this.pos.town.world.getTownList().indexOf(this.pos.town); //return the index of the town in the world's list
    }
    
    public List<Position> getPositions (){
        return this.pos.getTown().getPositions(); //Return the list of positions based on the hero's actual town
    }
    public int indexOfPos(){
        return this.pos.getTown().getPositions().indexOf(this.pos);//Look where the pos is on the list
    }
    public int posSize(){
        return this.getPositions().size(); //return the number of locations of the hero's actual town
    }
    public void walk (Position pos){
        if (this.pos.getTown().getPositions().indexOf(pos) == -1)
            System.out.println("Unknow position"); // If pos is not found in the town 
        if (this.indexOfPos() == (this.pos.getTown().getPositions().indexOf(pos) + 1) || this.indexOfPos() == (this.pos.getTown().getPositions().indexOf(pos) - 1))
            // if the cell next or previous this.pos is equal to pos 
            this.pos = pos;
  
    }
    public void map (){ //Print toute la liste
        for(int i = 0; i < this.pos.getTown().getPositions().size() ; i++){
            System.out.println(this.getPositions().get(i) + "\n");
        }
    }*/
    public void printMap(){ // Print les exits des pos
        //Prendre le keySet(), puis print les éléments 1 par 1
        Set <String>myKeySet = this.pos.getExits().keySet();
        System.out.println("Exits : " + myKeySet);
    }
    
    public void walk (String pos){
        if (this.pos.getExits().containsKey(pos)) //On regarde si l'une des exits est la pos demandé
            this.pos = this.pos.getTown().getPositions().get(pos);//Si c'est le cas, on change de pos
        else System.out.println ("It seems like this destination is too far away.");
    }
    
    public void go (String town){ //Ajouter les conditions, peut êtres créer une autre classe Exittown
        this.pos.getTown().getWorld().getTowns().get(town);
    }
}
