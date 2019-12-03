package main.nba;

import org.springframework.data.repository.CrudRepository;

public interface PlayerStatRepository extends CrudRepository<PlayerStat, Long> {
    PlayerStat findByName(String name);
}
