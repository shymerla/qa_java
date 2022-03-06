package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest2 {

    private Lion lion;

    @Mock
    Feline feline;

    @Before
    public void setUps() throws Exception {
        lion = new Lion("Самец", feline);
    }

    @Test
    public void getKittensOfLionCorrect() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualKittensOfLion = lion.getKittens();
        int expectedKittensOfLion = 1;
        assertEquals(expectedKittensOfLion, actualKittensOfLion);

    }

    @Test
    public void checkGetFoodLionCorrect () throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }
}
