package Interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestStubTest {

    @Test
    public void value3(){

        int number = 4;
        TestStub ts = new TestStub();
        assertEquals(number, ts.value3());
    }

}