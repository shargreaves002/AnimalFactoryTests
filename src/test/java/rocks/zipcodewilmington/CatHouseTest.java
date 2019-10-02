package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    @Test
    public void testAdd(){
        Cat animal = AnimalFactory.createCat("name", new Date());
        CatHouse.clear();

        CatHouse.add(animal);
        long expected = 1;
        long actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveById(){
        Cat cat = new Cat("name", new Date(), 1);
        CatHouse.clear();
        CatHouse.add(cat);

        CatHouse.remove(1);

        Assert.assertEquals(0, (long) CatHouse.getNumberOfCats());
    }

    @Test
    public void testRemoveByCat(){
        Cat cat = new Cat("name", new Date(), 1);
        CatHouse.clear();
        CatHouse.add(cat);

        CatHouse.remove(cat);

        Assert.assertEquals(0, (long) CatHouse.getNumberOfCats());
    }

    @Test
    public void testGetCatById(){
        Cat cat = new Cat("name", new Date(), 1);
        CatHouse.clear();
        CatHouse.add(cat);

        Cat expectedCat = cat;
        Cat actualCat = CatHouse.getCatById(1);

        Assert.assertEquals(expectedCat, actualCat);
    }

    @Test
    public void testGetNumberOfCats() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        Assert.assertEquals(1, (long) CatHouse.getNumberOfCats());
    }
}
