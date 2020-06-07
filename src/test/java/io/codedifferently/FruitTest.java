package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class FruitTest {

    @Test
    public void constructerTest(){
        
        //given
        String type = "Avacado";
        int energy = 10;

        //then
        Fruit testFruit = new Fruit(type,energy);
        String actualType = testFruit.getType();
        int actualEnergy = testFruit.getEnergy();

        //when 
        Assert.assertEquals(type, actualType);
        Assert.assertEquals(energy, actualEnergy);
    }
    

    
}