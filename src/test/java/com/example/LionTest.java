package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

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
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
        public void getDoesHaveManeCorrect() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actualManeOfLion = lion.doesHaveMane();
        Assert.assertEquals(isHaveMane, actualManeOfLion);

        }
}
