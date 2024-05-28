package com.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.restservice.pokemon.Pokemon;

@RestController
public class PokeController {
    private final RestTemplate restTemplate;

    public PokeController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    @GetMapping("/get-pokemon")
    public Pokemon getPokemon(@RequestParam(value = "pokemonName") String pokemonName) {
        String url = String.format("https://pokeapi.co/api/v2/pokemon/%s/", pokemonName);
        Pokemon response = restTemplate.getForObject(url, Pokemon.class);

        return response;
    }
}
