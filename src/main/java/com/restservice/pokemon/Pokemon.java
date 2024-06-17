package com.restservice.pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Pokemon {
    long id;
    String name;
    PokeTypes[] types;
    String[] counters;
    
    public Pokemon (long id, String name, PokeTypes[] types) {
        this.id = id;
        this.name = name;
        this.types = types;
        this.counters = this.allCounters(this.types);
    }

    public long getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public PokeTypes[] getTypes() {
        return this.types;
    }

    public String[] getCounters() {
        return this.counters;
    }

    public String[] allCounters(PokeTypes[] types) {
        if(this.types.length == 1) {
            return isCounteredBy(types[0].type().name());
        }
        
        String[] counter = null;

        for(PokeTypes item : types) {
            String currentType = item.type().name();
            counter = isCounteredBy(currentType);
            // String[] allCounters += counter ;
        }
        return counter;

    }

    public String[] isCounteredBy(String type) {
        String[] counter;
        switch (type) {
            case "normal":
                counter = new String[1];
                counter[0] = "fighting";
                break;

            case "fire":
                counter = new String[3];
                counter[0] = "water";
                counter[1] = "ground";
                counter[2] = "rock";
                break;

            case "water":
                counter = new String[2];
                counter[0] = "grass";
                counter[1] = "electric";
                break;

            case "grass":
                counter = new String[5];
                counter[0] = "fire";
                counter[1] = "ice";
                counter[2] = "poison";
                counter[3] = "flying";
                counter[4] = "bug";
                break;

            case "electric":
                counter = new String[1];
                counter[0] = "ground";
                break;

            case "ice":
                counter = new String[4];
                counter[0] = "fire";
                counter[1] = "fighting";
                counter[2] = "rock";
                counter[3] = "steel";
                break;

            case "fighting":
                counter = new String[3];
                counter[0] = "flying";
                counter[1] = "psychic";
                counter[2] = "fairy";
                break;

            case "poison":
                counter = new String[2];
                counter[0] = "ground";
                counter[1] = "psychic";
                break;

            case "ground":
                counter = new String[3];
                counter[0] = "water";
                counter[1] = "grass";
                counter[2] = "ice";
                break;

            case "flying":
                counter = new String[3];
                counter[0] = "electric";
                counter[1] = "ice";
                counter[2] = "rock";
                break;

            case "psychic":
                counter = new String[3];
                counter[0] = "bug";
                counter[1] = "ghost";
                counter[2] = "dark";
                break;

            case "bug":
                counter = new String[3];
                counter[0] = "flying";
                counter[1] = "rock";
                counter[2] = "fire";
                break;

            case "rock":
                counter = new String[5];
                counter[0] = "water";
                counter[1] = "grass";
                counter[2] = "fighting";
                counter[3] = "ground";
                counter[4] = "steel";
                break;

            case "ghost":
                counter = new String[2];
                counter[0] = "ghost";
                counter[1] = "dark";
                break;

            case "dragon":
                counter = new String[3];
                counter[0] = "ice";
                counter[1] = "dragon";
                counter[2] = "fairy";
                break;

            case "dark":
                counter = new String[3];
                counter[0] = "fighting";
                counter[1] = "bug";
                counter[2] = "fairy";
                break;

            case "steel":
                counter = new String[3];
                counter[0] = "fire";
                counter[1] = "fighting";
                counter[2] = "ground";
                break;

            case "fairy":
                counter = new String[2];
                counter[0] = "poison";
                counter[1] = "steel";
                break;

            default: throw new Error("invalid type");
        }
        System.out.println(counter);
        
        return counter;
    }
}
