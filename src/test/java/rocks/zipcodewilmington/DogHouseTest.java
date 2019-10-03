package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    @Test
    public void testAdd(){
        Dog animal = AnimalFactory.createDog("name", new Date());
        DogHouse.clear();

        DogHouse.add(animal);
        long expected = 1;
        long actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveById(){
        Dog dog = new Dog("name", new Date(), 1);
        DogHouse.clear();
        DogHouse.add(dog);

        DogHouse.remove(1);

        Assert.assertEquals(0, DogHouse.getNumberOfDogs(), 0.001);
    }

    @Test
    public void testRemoveByDog(){
        Dog dog = new Dog("name", new Date(), 1);
        DogHouse.clear();
        DogHouse.add(dog);

        DogHouse.remove(dog);

        Assert.assertEquals(0, DogHouse.getNumberOfDogs(), 0.001);
    }

    @Test
    public void testGetDogById(){
        Dog dog = new Dog("name", new Date(), 1);
        DogHouse.clear();
        DogHouse.add(dog);

        Dog expectedDog = dog;
        Dog actualDog = DogHouse.getDogById(1);

        Assert.assertEquals(expectedDog, actualDog);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        Assert.assertEquals(1, DogHouse.getNumberOfDogs(), 0.001);
    }
}
