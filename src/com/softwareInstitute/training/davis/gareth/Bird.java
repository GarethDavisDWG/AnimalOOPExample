package com.softwareInstitute.training.davis.gareth;

public abstract class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void breathe() {

    }

    @Override
    public Animal reproduce(Animal mother, Animal father) throws Exception {
        return null;
    }
}
