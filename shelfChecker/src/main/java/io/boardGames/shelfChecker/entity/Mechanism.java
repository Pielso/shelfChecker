package io.boardGames.shelfChecker.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mechanism {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String mechanismName;

    // Constructor
    public Mechanism(int id, String mechanismName){
        this.id = id;
        this.mechanismName = mechanismName;
    }

    // Tom constructor
    public Mechanism(){
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getMechanismName() {
        return mechanismName;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setMechanismName(String mechanismName) {
        this.mechanismName = mechanismName;
    }
}
