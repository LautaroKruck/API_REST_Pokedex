package pokedex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pokedex.dto.PokemonDTO;
import pokedex.service.PokemonService;

import java.util.List;

@RestController
@RequestMapping("/pokemon") // URI hasta este punto es: localhost:8080/pokemon
public class PokemonController {

    @Autowired
    private PokemonService service;

    @GetMapping("/{id}") // URI -> GET localhost:8080/pokemon/{id}
    public PokemonDTO getById(
            @PathVariable String id
    ) {
        return service.getById(id);
    }

    @GetMapping("/") // URI -> GET localhost:8080/pokemon/
    public List<PokemonDTO> getAll() {
        return service.getAll();
    }

    @PostMapping("/") // URI -> POST localhost:8080/pokemon/
    public PokemonDTO insert(
            @RequestBody PokemonDTO pokemonDTO
    ) {
        return service.insert(pokemonDTO);
    }

    @PutMapping("/{id}") // URI -> PUT localhost:8080/pokemon/{id}
    public PokemonDTO update(
            @RequestBody PokemonDTO pokemonDTO,
            @PathVariable String id
    ) {
        return null;
    }

}