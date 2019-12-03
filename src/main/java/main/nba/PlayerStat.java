package main.nba;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlayerStat {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private double ptsPerGame;
    private double assistPerGame;
    private double turnoversPerGame;
    private double reboundsPerGame;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPtsPerGame() {
        return ptsPerGame;
    }

    public void setPtsPerGame(double ptsPerGame) {
        this.ptsPerGame = ptsPerGame;
    }

    public double getAssistPerGame() {
        return assistPerGame;
    }

    public void setAssistPerGame(double assistPerGame) {
        this.assistPerGame = assistPerGame;
    }

    public double getTurnoversPerGame() {
        return turnoversPerGame;
    }

    public void setTurnoversPerGame(double turnoversPerGame) {
        this.turnoversPerGame = turnoversPerGame;
    }

    public double getReboundsPerGame() {
        return reboundsPerGame;
    }

    public void setReboundsPerGame(double reboundsPerGame) {
        this.reboundsPerGame = reboundsPerGame;
    }
}
