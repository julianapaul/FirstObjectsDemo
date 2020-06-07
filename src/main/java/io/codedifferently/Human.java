package io.codedifferently;

public class Human {

    private String firstName;
    private String lastName;
    static int maxEnergy = 200;
    private int energy;

    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.energy = 100;
    }

    public void eat(Fruit fruit){
        if (this.energy + fruit.getEnergy() <= maxEnergy){ //checks if energy is less than or equal to max energy
            this.energy = this.energy + fruit.getEnergy();
        } else {
            this.energy = maxEnergy; 
            System.out.println("We are full of energy!");
        }
    }

    public void work(int hours){
       int energySpent = hours * 10;

       if(this.energy - energySpent < 0){
           System.out.println("Couldnt work, energy too low!");
       } else {
        this.energy = this.energy - energySpent;
       }
    }

    public int getEnergy(){
        return this.energy;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }


}