package com.ifmo.lesson17;

public abstract class Factory {
    public static Factory getFactory(String country){
        if (country.toUpperCase().equals("JAPAN")){
            return new JanapFactory();
        }
        else if (country.toUpperCase().equals("USA")){
            return new UsaFactory();
        }
            return new UsaFactory();
    }
    public abstract Car createCar();

}
