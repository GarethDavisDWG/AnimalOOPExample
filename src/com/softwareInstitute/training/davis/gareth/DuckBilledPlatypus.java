package com.softwareInstitute.training.davis.gareth;

public class DuckBilledPlatypus extends Mammal{


    public DuckBilledPlatypus(String name) {
        super(name);
    }

    @Override
    public void eat(String food) {

    }

    @Override
    public DuckBilledPlatypus reproduce(Animal mother,Animal father)throws Exception{
        return new DuckBilledPlatypus("Egg");
    }

}
