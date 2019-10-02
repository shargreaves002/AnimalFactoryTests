package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    @Test
    public void testCreateDog(){
        String expectedName = "dog";
        Date expectedDate = new Date();
        Dog dog = AnimalFactory.createDog(expectedName, expectedDate);
        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();
        
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }

    @Test
    public void testCreateCat(){
        String expectedName = "cat";
        Date expectedDate = new Date();
        Cat cat = AnimalFactory.createCat(expectedName, expectedDate);
        String actualName = cat.getName();
        Date actualDate = cat.getBirthDate();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }
}
