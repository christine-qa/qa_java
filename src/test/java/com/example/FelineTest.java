package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {

    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithDefaultValue() {
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens(1));
    }

    @Test
    public void testGetKittensWithBigValue() {
        Feline feline = new Feline();
        Assert.assertEquals(10, feline.getKittens(10));
    }
}