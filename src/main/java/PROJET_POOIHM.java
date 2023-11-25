import java.util.Scanner;

public class PROJET_POOIHM {

    public static void main(String[] args) {
        World w = new World();
        Hero h = new  Hero();
        
        w.addTown("Peur");

        //Town t1 = getTown("Peur"); // mathis | fonction getTown non créée
        //w.t1.addTown("Spawn", "Peur");

        //addTown("Spawn", w.getTowns().get("Peur"));

        w.getTowns().get("Peur").addPosition("Spawn"); // mathis | ce que je propose (donc changement du addPosition dans Town)
        
        h.go("Spawn");




        System.out.println("Salut je suis dans la ville de " + w.getTowns().get("Peur").name);
        System.out.println("Ma position est : " + h.pos.name);

        

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un entier : ");
        int entier = scanner.nextInt();
        System.out.println(entier);
        scanner.close();
    }
    
}
