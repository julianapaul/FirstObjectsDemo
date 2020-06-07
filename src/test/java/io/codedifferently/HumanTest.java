package io.codedifferently;

import org.junit.Assert;
import org.junit.Test; //Testing suit, Java doesnt have testing by default

public class HumanTest {

    @Test
    public void constructorTest() {

        //given - set up stage 
        String first = "Julie";
        String last = "Paulie";
        int energy = 100;

        // when - the actual using of funcionality
        Human testHuman = new Human(first, last);
        String actualFirst = testHuman.getFirstName();
        String actualLast = testHuman.getLastName();
        int actualEnergy = testHuman.getEnergy();

        // then - did the result match what we expected
        Assert.assertEquals(first, actualFirst);
        Assert.assertEquals(last, actualLast);
        Assert.assertEquals(energy, actualEnergy);
    }

    @Test
    public void eatTest() { // the more a human eats the more energy gained

        // given
        Fruit apple = new Fruit("Apple", 10);
        int expectedEnergy = 110;
        Human testHuman = new Human("Skai", "Jackson");

        // then
        testHuman.eat(apple);
        final int actualEnergy = testHuman.getEnergy();

        // when
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void workTest() { // as work is done energy is taken away

        // given
        Human testhHuman = new Human("Ash", "McCain");
        int expectedEnergy = 80;

        // when
        testhHuman.work(2);
        int actualEnergy = testhHuman.getEnergy();

        // then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void energyMaxTest(){

        //given
        Human testHuman = new Human("Chase", "Witherspoon");
        Fruit testFruit1 = new Fruit("Peach", 20);
        Fruit testFruit2 = new Fruit("Orange", 20);
        Fruit testFruit3 = new Fruit("Mango", 20);
        
        //when 
        testHuman.eat(testFruit1);
        testHuman.eat(testFruit2);
        testHuman.eat(testFruit3);
        int actualEnergy = testHuman.getEnergy();

        //then
        Assert.assertEquals(160, actualEnergy);
    }   

    @Test
    public void workMinTest(){
        //given
        Human testhHuman = new Human("That", "Chick");

        //then
        testhHuman.work(19);
        int actualEnergy = testhHuman.getEnergy();

        //when
        Assert.assertEquals(100, actualEnergy);
    }

    @Test
    public void maxEnergyChangeTest(){

        Human h1 = new Human("James", "Baldwin");
        Fruit testFruit1 = new Fruit("Peach", 20);
        Fruit testFruit2 = new Fruit("Orange", 20);
        Fruit testFruit3 = new Fruit("Mango", 20);

        Human.maxEnergy = 200;

        h1.eat(testFruit1);
        h1.eat(testFruit2);
        h1.eat(testFruit3);
        
        int actualEnergy = h1.getEnergy();
        
        Assert.assertEquals(160, actualEnergy);
    }
}