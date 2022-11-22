package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean expectedResult;

    public AccountTest(String name, boolean expectedResult) {
        this.name = name;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[] getTestData(){
        return new Object[][]{
                {"Knight Rider", true},
                {" StartSpace", false},
                {"The Two Spaces", false},
                {"EndSpace ", false},
                {"NoSpace", false},
                {"O k", true},
                {"Tooooooooo loooooong", false},
        };
    }

    @Test
    public void testEmbossing(){
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        assertEquals(actualResult, expectedResult);
    }

}