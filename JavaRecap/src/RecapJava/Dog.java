package RecapJava;

import RecapJava.Animal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sizwe.nxele
 */
public class Dog extends Animal{

    public Dog() {
    }
    /**
     *
     * @return
     */
    @Override
   public String makeSound(){
       return "Woof";
   }
}
