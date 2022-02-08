package Animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCat {

    @Test
    public void checkCatSound() {
        //GIVEN
        Cat cat = new Cat("testCat", 3, "pet");
        String expectedSound = "meow meow";
        //WHEN
        String actualSound = cat.makeSound();
        //THEN
        Assertions.assertEquals(expectedSound, actualSound);
    }
    @Test
    public void checkCatClass() {
        //GIVEN
        Cat cat = new Cat("testCat", 3, "pet");
        String expectedSimpleName = "Cat";

        //WHEN
        String actualSimpleName = cat.getClass().getSimpleName();

        //THEN
        Assertions.assertEquals(expectedSimpleName, actualSimpleName);
        String.format("Expected  '%s', but was '%s'", expectedSimpleName, actualSimpleName);
}
@Test
    public void checkCatAge() {
        //GIVEN
        Cat cat = new Cat("testCat", 3, "pet");
    Integer expectedAge = 3;

    //WHEN
    Integer actualAge = cat.getAge();

    //THEN
    Assertions.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void chechCatName() {
        //GIVEN
        Cat cat = new Cat("gattino", 3, "pet");
        String expectedCatName = "gattino";

        //WHEN
        String actualCatName = cat.getName();

        //THEN
        Assertions.assertEquals(expectedCatName, actualCatName);
    }

    @Test
    public void checkCatType () {
        //GIVEN
        Cat cat = new Cat("testCat", 6, "pet");
        String expectedType = "cat";

        //WHEN
        String actualType = cat.getType();

        //THEN
        Assertions.assertEquals(expectedType, actualType);
    }
}