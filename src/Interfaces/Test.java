package Interfaces;

public abstract class Test implements Main {

    @Override
    public int value3() {
        return 0;
    }
}

class TestStub extends Test{
    @Override
    public int value3(){
        return 5;
    }
}
