package io.boardGames.shelfChecker.DTO;
import io.boardGames.shelfChecker.entity.Designer;
import io.boardGames.shelfChecker.entity.Game;
import io.boardGames.shelfChecker.entity.Mechanism;
import java.util.ArrayList;
import java.util.List;

//
public class BoardgameDTO extends Game {
    public List <Designer> designedBy = new ArrayList<>();
    public List <Mechanism> gameMechanisms = new ArrayList<>();

    // Constructor
    public BoardgameDTO(String gameName, int minPlayers, int maxPlayers, List <Designer> designedBy, List <Mechanism> gameMechanisms){
        this.designedBy = designedBy;
        this.gameMechanisms = gameMechanisms;
    }

    // Tom Constructor
    public BoardgameDTO(){
    }

    // Getters
    public List<Designer> getDesignedBy() {
        return designedBy;
    }
    public List<Mechanism> getGameMechanisms() {
        return gameMechanisms;
    }

    // Setters
    public void setDesignedBy(List<Designer> designedBy) {
        this.designedBy = designedBy;
    }
    public void setGameMechanisms(List<Mechanism> gameMechanisms) {
        this.gameMechanisms = gameMechanisms;
    }

    // Metoder


}
