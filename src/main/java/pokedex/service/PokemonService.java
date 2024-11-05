package pokedex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pokedex.dto.AtaqueDTO;
import pokedex.dto.PokemonDTO;
import org.springframework.web.bind.annotation.*;
import pokedex.dto.TipoDTO;
import pokedex.model.Ataque;
import pokedex.model.Pokemon;
import pokedex.model.Tipo;
import pokedex.repository.PokemonRepositoryAPI;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepositoryAPI repository;

    public PokemonDTO getById(String id) {

        Long idEntity = Long.parseLong(id);

        Pokemon p = repository.findById(idEntity).orElse(null);

        PokemonDTO pokemonDTO = new PokemonDTO();
        pokemonDTO.setNombre(p.getNombre());
        pokemonDTO.setVida(p.getVida());

        TipoDTO tipoDTO = new TipoDTO();
        tipoDTO.setNombre(p.getTipo().getTipo());
        pokemonDTO.setTipo(tipoDTO);

        AtaqueDTO ataqueDTO = new AtaqueDTO();
        TipoDTO tipoAtaqueDTO = new TipoDTO();
        tipoAtaqueDTO.setNombre(p.getAtaques().get(0).getTipo().getTipo());
        ataqueDTO.setNombre(p.getAtaques().get(0).getNombre());
        ataqueDTO.setEspecial(p.getAtaques().get(0).isEspecial());
        ataqueDTO.setDanioBase(p.getAtaques().get(0).getDanioBase());
        ataqueDTO.setTipo(tipoAtaqueDTO);
        pokemonDTO.setAtaque(ataqueDTO);

        return pokemonDTO;
    }

    public List<PokemonDTO> getAll() {
        List<Pokemon> pokemonList = repository.findAll();

        return pokemonList.stream().map(p -> {
            PokemonDTO pokemonDTO = new PokemonDTO();
            pokemonDTO.setNombre(p.getNombre());
            pokemonDTO.setVida(p.getVida());

            TipoDTO tipoDTO = new TipoDTO();
            tipoDTO.setNombre(p.getTipo().getTipo());
            pokemonDTO.setTipo(tipoDTO);

            if (!p.getAtaques().isEmpty()) {
                Ataque ataque = p.getAtaques().get(0);
                AtaqueDTO ataqueDTO = new AtaqueDTO();
                TipoDTO tipoAtaqueDTO = new TipoDTO();
                tipoAtaqueDTO.setNombre(ataque.getTipo().getTipo());
                ataqueDTO.setNombre(ataque.getNombre());
                ataqueDTO.setEspecial(ataque.isEspecial());
                ataqueDTO.setDanioBase(ataque.getDanioBase());
                ataqueDTO.setTipo(tipoAtaqueDTO);
                pokemonDTO.setAtaque(ataqueDTO);
            }

            return pokemonDTO;
        }).collect(Collectors.toList());
    }


    public PokemonDTO insert(PokemonDTO pokemonDTO) {
        Pokemon pokemon = new Pokemon();
        pokemon.setNombre(pokemonDTO.getNombre());
        pokemon.setVida(pokemonDTO.getVida());

        Tipo tipo = new Tipo();
        tipo.setTipo(pokemonDTO.getTipo().getNombre());
        pokemon.setTipo(tipo);

        Ataque ataque = new Ataque();
        ataque.setNombre(pokemonDTO.getAtaque().getNombre());
        ataque.setEspecial(pokemonDTO.getAtaque().isEspecial());
        ataque.setDanioBase(pokemonDTO.getAtaque().getDanioBase());

        Tipo tipoAtaque = new Tipo();
        tipoAtaque.setTipo(pokemonDTO.getAtaque().getTipo().getNombre());
        ataque.setTipo(tipoAtaque);
        ataque.setPokemon(pokemon);

        pokemon.setAtaques(Collections.singletonList(ataque));

        Pokemon savedPokemon = repository.save(pokemon);

        return pokemonDTO;
    }


    public PokemonDTO update(PokemonDTO pokemonDTO, String id) {
        return null;
    }

}