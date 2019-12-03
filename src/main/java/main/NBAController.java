package main;

import main.nba.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NBAController {
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private PlayerStatRepository playerStatRepository;

    @RequestMapping("/getPlayers")
    public Iterable<Player> getPlayers(){
        return playerRepository.findAll();
    }

    @RequestMapping("/getStat")
    public PlayerStat getStat(@RequestParam String name) {
        return playerStatRepository.findByName(name);
    }

    @RequestMapping(value = "/addPlayer", method = RequestMethod.POST)
    public void addPlayer(@RequestBody Player player) {
        playerRepository.save(player);
    }

    @RequestMapping(value = "/addStat", method = RequestMethod.POST)
    public void addPlayerStat(@RequestBody PlayerStat playerStat) {
        playerStatRepository.save(playerStat);
    }
}
