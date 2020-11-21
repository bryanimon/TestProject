package com.company.Pokemons;

import com.company.Interfaces.GrassPokemon;
import com.company.Interfaces.StarterPokemon;

public class Bulbasaur extends Pokemon implements StarterPokemon, GrassPokemon {

    public Bulbasaur() {
    }

    @Override
    public boolean canBeSelected() {
        return false;
    }

    @Override
    public void doGrassMove() {
        System.out.println("Bulbasaur grass attack");
    }

    @Override
    void attack() {

    }

    @Override
    void talk() {

    }
}
