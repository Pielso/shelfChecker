package io.boardGames.shelfChecker.entity;
import jakarta.persistence.*;

// En klass som motsvarar tabellen game i mysql.
@Entity
public class Game {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String gamename;
    private int minplayers;
    private int maxplayers;

    // Constructor
    public Game(String gamename, int minplayers, int maxplayers) {
        this.gamename = gamename;
        this.minplayers = minplayers;
        this.maxplayers = maxplayers;
    }

    // Tom Constructor
    public Game(){}

    // Getters
    public int getId() {
        return id;
    }
    public String getGamename() {
        return gamename;
    }
    public int getMinplayers() {
        return minplayers;
    }
    public int getMaxplayers() {
        return maxplayers;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setGamename(String gamename) {
        this.gamename = gamename;
    }
    public void setMinplayers(int minplayers) {
        this.minplayers = minplayers;
    }
    public void setMaxplayers(int maxplayers) {
        this.maxplayers = maxplayers;
    }


}
