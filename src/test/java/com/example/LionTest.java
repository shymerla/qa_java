package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {

    private final String sex;
    private final boolean isHaveMane;

    @Mock
    Feline feline;

    public LionTest(String sex, Boolean isHaveMane) {
        this.sex = sex;
        this.isHaveMane = isHaveMane;
    }

    @Parameterized.Parameters
    public static Object[][] getMane() {
        return new Object[][]{{"Самец", true}, {"Самка", false},};
    }

    @Test
    public void getDoesHaveManeCorrect() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actualManeOfLion = lion.doesHaveMane();
        Assert.assertEquals("lion.doesHaveMane() need help", isHaveMane, actualManeOfLion);
    }

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getKittensOfLionCorrect() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualKittensOfLion = lion.getKittens();
        int expectedKittensOfLion = 1;
        assertEquals("lion.getKittens() need help", expectedKittensOfLion, actualKittensOfLion);
    }

    @Test
    public void checkGetFoodLionCorrect() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals("lion.getFood() need help", expected, actual);
    }
}
