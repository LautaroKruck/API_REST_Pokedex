package pokedex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pokedex.model.Pokemon;

public interface PokemonRepositoryAPI extends JpaRepository<Pokemon, Long> {
}
