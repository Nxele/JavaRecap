package RecapJava;
import java.util.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sizwe.nxele
 */
import java.util.Arrays;

public class RunProgram {
   public static void main(String[]args){
       
       Animal fido = new Dog();
       Animal fluffy = new Cat();
       
       //implementing arrays of object
       Animal[] theAnimals = new Animal[10];
       
       theAnimals[0]=fido;
       theAnimals[1]=fluffy;
       
       System.out.println("Fido says "+theAnimals[0].makeSound()+" "+theAnimals[0].getName());
       System.out.println("fluffy says "+theAnimals[1].makeSound()+" "+theAnimals[1].getName());
       
       Animal.speakAnimal(fido);
       Animal.speakAnimal(fluffy);
       
       //implementing arrays
       int[] randomNumbers; 
       
       randomNumbers = new int[(int)((Math.random()*10)+1)];
       
       for(int i = 0;i < randomNumbers.length; i++){
           randomNumbers[i]=(int)((Math.random()*200-1)+1);
       }
       
       for(int numbers : randomNumbers){
           System.out.println("random number is :"+numbers);
       }
       //copying array 
       int[] cloneOfArray = Arrays.copyOf(randomNumbers,randomNumbers.length);
       
       //print copied array
       System.out.println(Arrays.toString(cloneOfArray));
       
       // quick search in the array
       System.out.println("searched number: "+Arrays.binarySearch(cloneOfArray,2));
       
       //working with list Arrays
       ArrayList<Integer> array = new ArrayList<Integer>();
       
       //while loop to enter multiples numbers into the array
       int arrayNum = Integer.parseInt(JOptionPane.showInputDialog(null,"please enter a number & zero to exit and display numbers"));
       while(arrayNum !=0){
           array.add(arrayNum);
           arrayNum = Integer.parseInt(JOptionPane.showInputDialog(null,"please enter a number & zero to exit and display numbers"));
       }
       //for loop for diplaying numbers in the array 
       for(int index: array){
           System.out.println(index);
       }
       
       //get the arra size and diplay it
       int arraySize = array.size();
       JOptionPane.showMessageDialog(null,"Your Array Size is: "+ arraySize);
   }
}
