package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    @Test
    public void setNameTest(){
        //Given
        Cat cat = new Cat("name", new Date(), 1);
        //When
        cat.setName("billy");
        //Then
        Assert.assertEquals("billy", cat.getName());
    }

    @Test
    public void speakTest() {
        Cat cat = new Cat("name", new Date(), 1);
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest() {
        //Given
        Cat cat = new Cat("name", new Date(), 1);
        //When
        cat.setBirthDate(new Date(0));
        //Then
        Assert.assertEquals(new Date(0), cat.getBirthDate());
    }

    @Test
    public void eatTest(){
        Cat cat = new Cat("name", new Date(), 1);
        long expected = 1;
        int start = cat.getNumberOfMealsEaten();
        cat.eat(new Food());
        int end = cat.getNumberOfMealsEaten();
        long actual = end - start;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest(){
        Cat cat = new Cat("name", new Date(), 1);
        int expected = 1;
        int actual = cat.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inheritAnimalTest(){
        Cat cat = new Cat("name", new Date(), 1);
        boolean expected = true;
        boolean actual = false;
        if (cat instanceof Animal) actual = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inheritMammalTest(){
        Cat cat = new Cat("name", new Date(), 1);
        boolean expected = true;
        boolean actual = false;
        if (cat instanceof Mammal) actual = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
