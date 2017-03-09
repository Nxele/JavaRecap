package RecapJava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sizwe.nxele
 */
import java.util.*;

public class Animal {
   
    public static final double FAVNUMBER = 1.6180;
    protected static int numberOfAnimals = 0;
    static Scanner userInput = new Scanner(System.in);
    
    private String name;
    private int weight;
    private boolean hasOwner = false;
    private byte age;
    private long uniqueID;
    private char favoriteChar;
    private double speed;
    private float height;
    
    public Animal() {
        numberOfAnimals++;
        
        System.out.println("Enter Animal name");
        
        /*checking for other data type
        hasNextInt, hasNextFloat, hasNextDoule, hadNextLong, hasNextByte
        */
        if(userInput.hasNextLine()){
            this.setName(userInput.nextLine());
            /*for returning correct data type
            nextInt, nextFloat, nextDoule, nextLong, nextByte
            */
            this.setFavoriteChar();
            this.setUniqueID();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     *
     * @return
     */
    public boolean HasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public long getUniqueID() {
        return uniqueID;
    }
    //implementing overloading
    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
        System.out.println("Unique ID set to: "+this.uniqueID);
    }
    public void setUniqueID() {
        this.uniqueID = uniqueID;
        int minNumber = 1;
        int maxNumber = 100000;
        this.uniqueID = minNumber + (long) (Math.random()*((maxNumber - minNumber)+1));
        //used of (long) it's casting. for other data type (int), (double), (float), (byte)
        
        String stringNumber = Long.toString(maxNumber);
        //converting from primitive to a String Double.toString(Maxnum),String Byte.toString(Maxnum),String Integer.toString(Maxnum)
        
        int numberString = Integer.parseInt(stringNumber);
        //converting from String to primitive Ingeger.parseInt(stringNumber), Double.parseDouble(stringNumber)
        
        System.out.println("Unique ID set to: "+this.uniqueID);
    }
    public char getFavoriteChar() {
        return favoriteChar;
    }

    public void setFavoriteChar(char favoriteChar) {
        this.favoriteChar = favoriteChar;
    }
    //implementing method overloading of setFavoriteChar
    public void setFavoriteChar() {
        int randomNumber = (int)(Math.random()*126)+1;
        this.favoriteChar = (char) randomNumber;
        
        if(randomNumber==32){
            //number 32 represent a space
            System.out.println("Favorite character set to space");
        }else if (randomNumber==10){
            //number 10 is a new line \n
            System.out.println("Favorite character set to newline");
        }else{
            System.out.println("Favorite caharacter set to :"+this.favoriteChar);
        }
        if((randomNumber > 97) && (randomNumber < 122)){
            System.out.println("Favorite character is a lowercase latter");
        }
        if(((randomNumber > 97) && (randomNumber < 64)) || ((randomNumber > 91) && (randomNumber < 122))){
            System.out.println("Favorite character is a latter");
        }
        //turning false to return true !false | true to return false !true
        
        int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;
        
        switch(randomNumber){
            case 8:
                System.out.println("Favorite character is set to backspace");break;
                
            default: //if non of the above you can use defaut
                System.out.println("Favorite character is set to default");break;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    protected static void countTo(int StartingNumber){
        for(int i = StartingNumber; i < StartingNumber; StartingNumber++){
            
            //when i=90 we want to skip the loop iratation
            if(i==90)continue;
            System.out.println(i);
        }
    }
    
    protected static String printNumbers(int maxNumbers){
        int i = 0;
        while( i < (maxNumbers / 2))
        {
            System.out.println(i);
            i++;
            
            if(i==(maxNumbers / 2)) break;
        }
        Animal.countTo( maxNumbers / 2);
        
        return "End of printNumbers";
    }
    protected static void gueesMyNumber(){
        
        int number;
        
        do{
            System.out.println("Guees Numbers up to 100");
            
            while(!userInput.hasNextInt()){
                
                String numberEntered = userInput.next();
                System.out.printf("%s is not a number ",numberEntered);
            }
            
            number = userInput.nextInt();
            
        }while(number !=50);
    }
    //implenting Poymophism 
    public String makeSound(){
        return "Grrrr";
    }
    
    public static void speakAnimal(Animal randAnimal){
        System.out.println("Animal says "+randAnimal.makeSound());
    }
}
