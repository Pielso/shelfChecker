package io.boardGames.shelfChecker.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Designer {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;

    // Constructor
    public Designer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Tom Constructor
    public Designer(){}

    // Getters
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
