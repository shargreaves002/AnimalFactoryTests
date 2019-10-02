package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    @Test
    public void constructorTest(){
        String expectedName = "name";
        Date expectedDate = new Date();
        int expectedId = 1;
        Dog dog = new Dog(expectedName, expectedDate, expectedId);

        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();
        int actualId = dog.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void speakTest(){
        Dog dog = new Dog("name", new Date(), 1);
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest(){
        Dog dog = new Dog("name", new Date(), 1);
        Date expected = new Date(0);
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        Dog dog = new Dog("name", new Date(), 1);
        long expected = 1;
        int start = dog.getNumberOfMealsEaten();
        dog.eat(new Food());
        int end = dog.getNumberOfMealsEaten();
        long actual = end - start;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest(){
        Dog dog = new Dog("name", new Date(), 1);
        long expected = 1;
        long actual = dog.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inheritAnimalTest(){
        Dog dog = new Dog("name", new Date(), 1);
        boolean expected = true;
        boolean actual = false;
        if (dog instanceof Animal) actual = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inheritMammalTest(){
        Dog dog = new Dog("name", new Date(), 1);
        boolean expected = true;
        boolean actual = false;
        if (dog instanceof Mammal) actual = true;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
