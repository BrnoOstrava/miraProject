import java.util.ArrayList;
import java.util.Random;

public class Algoritmus{
    
   private final ArrayList<Integer> poleIntu = new ArrayList<>();
   private final Random rnd = new Random();
   
   public void naplnList(){
       for(int i = 0; i < 1000; i++){
           poleIntu.add(rnd.nextInt(1000));
        }
       
   }
   
   public ArrayList<Integer> getPole(){
       return poleIntu;
    }
    
    public static void test(){
        Algoritmus alg = new Algoritmus();
        alg.naplnList();
        for(int i = 0; i < alg.getPole().size(); i++ ){
            System.out.println((i+1) + "|" + alg.getPole().get(i));
        }
       
    }
}
