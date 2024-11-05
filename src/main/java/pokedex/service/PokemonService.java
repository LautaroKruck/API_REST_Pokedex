package pokedex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pokedex.dto.AtaqueDTO;
import pokedex.dto.PokemonDTO;
import pokedex.dto.TipoDTO;
import pokedex.model.Ataque;
import pokedex.model.Pokemon;
import pokedex.model.Tipo;
import pokedex.repository.PokemonRepositoryAPI;
import pokedex.utils.Mapper;

import java.util.ArrayList;
import java.util.List;

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

        List<PokemonDTO> listaDeDTOs = new ArrayList<>();

        List<Pokemon> listaPok = repository.findAll();

        for (Pokemon p: listaPok) {
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

            listaDeDTOs.add(pokemonDTO);
        }

        return listaDeDTOs;
    }

    public PokemonDTO insert(PokemonDTO pokemonDTO) {
        // Mapeamos el DTO a una entidad
        Pokemon pokemon = new Pokemon();
        pokemon.setNombre(pokemonDTO.getNombre());
        pokemon.setVida(pokemonDTO.getVida());

        Tipo tipo = new Tipo();
        tipo.setTipo(pokemonDTO.getTipo().getNombre());
        pokemon.setTipo(tipo);

        // Creación y asignación del ataque
        Ataque ataque = new Ataque();
        ataque.setNombre(pokemonDTO.getAtaque().getNombre());
        ataque.setEspecial(pokemonDTO.getAtaque().isEspecial());
        ataque.setDanioBase(pokemonDTO.getAtaque().getDanioBase());

        Tipo tipoAtaque = new Tipo();
        tipoAtaque.setTipo(pokemonDTO.getAtaque().getTipo().getNombre());
        ataque.setTipo(tipoAtaque);

        List<Ataque> ataques = new ArrayList<>();
        ataques.add(ataque);
        pokemon.setAtaques(ataques);

        // Guardamos el Pokémon en la base de datos
        Pokemon p = repository.save(pokemon);

        // Convertimos la entidad guardada a DTO y la devolvemos
        return Mapper.entityToDTO(p);
    }

    public PokemonDTO update(PokemonDTO pokemonDTO, String id) {
        // Convertimos el id a Long
        Long idEntity = Long.parseLong(id);

        // Buscamos el Pokémon en la base de datos
        Pokemon pokemon = repository.findById(idEntity).orElse(null);

        if (pokemon == null) {
            // Si no existe, devolvemos null o lanzamos una excepción personalizada si prefieres
            return null;
        }

        // Actualizamos los campos con los datos del DTO
        pokemon.setNombre(pokemonDTO.getNombre());
        pokemon.setVida(pokemonDTO.getVida());

        // Actualización del tipo
        pokemon.getTipo().setTipo(pokemonDTO.getTipo().getNombre());

        // Actualización del ataque
        if (!pokemon.getAtaques().isEmpty()) {
            Ataque ataque = pokemon.getAtaques().get(0);
            ataque.setNombre(pokemonDTO.getAtaque().getNombre());
            ataque.setEspecial(pokemonDTO.getAtaque().isEspecial());
            ataque.setDanioBase(pokemonDTO.getAtaque().getDanioBase());
            ataque.getTipo().setTipo(pokemonDTO.getAtaque().getTipo().getNombre());
        }

        // Guardamos los cambios
        Pokemon p = repository.save(pokemon);

        // Convertimos la entidad actualizada a DTO y la devolvemos
        return Mapper.entityToDTO(p);
    }


    public PokemonDTO delete(String id) {

        // Parseo el id a Long
        Long idL = 0L;
        try {
            idL = Long.parseLong(id);
        } catch (NumberFormatException e) {
            System.out.println("Error al parsear el id");
            return null;
        }

        // Compruebo que el pokemon existe en la BDD
        Pokemon p = repository.findById(idL).orElse(null);

        if(p == null) {
            return null;
        } else {
            repository.delete(p);
            return Mapper.entityToDTO(p);
        }
    }
}