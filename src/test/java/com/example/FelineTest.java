package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getFoodOfFelineCorrect() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFoodOfFeline = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFoodOfFeline = feline.eatMeat();
        assertEquals("feline.eatMeat() need help", expectedFoodOfFeline, actualFoodOfFeline);
    }

    @Test
    public void getFamilyOfFelineCorrect() {
        Feline feline = new Feline();
        String expectedFamilyOfFeline = "Кошачьи";
        String actualFamilyOfFeline = feline.getFamily();
        assertEquals("feline.getFamily() need help", expectedFamilyOfFeline, actualFamilyOfFeline);
    }

    @Test
    public void getKittensOfFelineCorrect() {
        Feline feline = new Feline();
        int expectedKittensOfFeline = 1;
        int actualKittensyOfFeline = feline.getKittens();
        assertEquals("feline.getKittens() need help", expectedKittensOfFeline, actualKittensyOfFeline);
    }
}
