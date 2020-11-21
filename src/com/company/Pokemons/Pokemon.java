package com.company.Pokemons;

public abstract class Pokemon {

    private String name;
    private String type;

    abstract void attack();
    abstract void talk();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void faint(){
        System.out.println("Pokemon fainted");
    }
}
