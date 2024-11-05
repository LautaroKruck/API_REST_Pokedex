package pokedex.utils;

import pokedex.dto.AtaqueDTO;
import pokedex.dto.PokemonDTO;
import pokedex.dto.TipoDTO;
import pokedex.model.Pokemon;

public class Mapper {

    public static PokemonDTO entityToDTO(Pokemon p) {
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
}
