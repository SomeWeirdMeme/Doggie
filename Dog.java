import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog
{
    // instance variables - replace the example below with your own
    private ArrayList<Dog> pack;
    private String color;
    private int yearOfBirth;
    /**
     * Constructor for objects of class wfe
     */
    public Dog()
    {
        // initialise instance variables
        color = "black";
        yearOfBirth = 2026;
        pack = new ArrayList<>();
    }
    
    
    public Dog(String color, int yearOfBirth){
        this.color = color;
        this.yearOfBirth = yearOfBirth;
        pack = new ArrayList<>();
    }
    
    public void listAllDogColors(){
        for(Dog d : pack){
            System.out.println(d.getcolor());
        }
    }
    
    /**
     *QUESTION 7
     */
    public void count(){
        int i = 0;
        while(i<10 && i>=0){
            System.out.println(i+1);
            i++;
        }
    }
     
    public String getcolor(){
        return color;
    }
    
    /**
     * question 9
     */
    public int countDogsByColor(String color){
        int count = 0;
        for (Dog d : pack){
            if(d.getcolor().equals(color)){
                count++;
            }
        }
        return count;
    }
    
    public void addDogToPack(Dog d){
        pack.add(d);
    }
    
    /**
     * this one is technivally wrong causes index's are gay for q11 IT WRONG THO
     * youll skip stuff to
     * Based on standard while loop
     * 
     */
    public void removeDogsByColorWhileLoop(String color){
      int i = 0;
      while(i<pack.size()){
          if(pack.get(i).getcolor().equals(color)){
              pack.remove(i);
              i--;
          }
          
      }
    }
    
    /**
     * Not RECOMMENDED as u might skip elemnts
     * based on standard for loop
     */
    public void RemoveDogsByColorForLoop(String color){
       for(int i = 0; i < pack.size(); i++){
           if(pack.get(i).getcolor().equals(color)){
               pack.remove(i);
           }
       }
    }
    
    /**
     * This is the right anwerfor 11 RECOMMENDED ALWAYS FOR THSI SCENARIO
     */
    public void removeDogByColorIterator(String color){
        Iterator<Dog> it = pack.iterator();
        while (it.hasNext()){
            if(it.next().getcolor().equals(color)){
                pack.remove(it);
            }
        }
    }
    /**
     * This is an example of a foreachLoop that woudlnt work for this proving
     * iterator is the only answer RUNTIME ERRORNEVER WORK
     */
    public void removeDogsByColorForEachLoop(){
        for(Dog d :pack){
            if(d.getcolor().equals(color)){
                pack.remove(d);
            }
        }
    }

    /**
     * Question 12../
     */
    public  HashMap<String, Integer> getColorAmounts(){
        HashMap<String,Integer> colorAmounts = new HashMap<>();
        for(Dog d : pack){
            String color = d.getcolor();
            colorAmounts.putIfAbsent(color,0);
            int amount = colorAmounts.get(color);
            colorAmounts.put(color, amount + 1);
        }

        for(String color: colorAmount.keySet()){
            System.out.println(color + " : " + colorAmount.get(color));
    }
         return colorAmounts;
}
