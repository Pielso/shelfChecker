package io.boardGames.shelfChecker.service;
import io.boardGames.shelfChecker.DTO.BoardgameDTO;
import io.boardGames.shelfChecker.entity.Game;
import io.boardGames.shelfChecker.repository.GameRepository;
import org.springframework.stereotype.Service;
import java.util.*;
import io.boardGames.shelfChecker.DTO.GameDTO;

@Service
public class GameService {
    GameRepository gameRepository;
    DesignerService designerService;
    MechanismService mechanismService;

    // Constructor
    public GameService(GameRepository gameRepository, DesignerService designerService, MechanismService mechanismService) {
        this.gameRepository = gameRepository;
        this.designerService = designerService;
        this.mechanismService = mechanismService;
    }

    // Metoder för CRUD.
    public void createGame(Game game){
        gameRepository.save(game);
    }
    public Game getGameById(int id){
        return gameRepository.findById(id).get();
    }
    public List <Game> getAllGames(){
        return gameRepository.findAll();
    }
    public void updateGame(Game newGame){
        Game oldGame = getGameById(newGame.getId());
        oldGame.setId(newGame.getId());
        oldGame.setGamename(newGame.getGamename());
        oldGame.setMinplayers(newGame.getMinplayers());
        oldGame.setMaxplayers(newGame.getMaxplayers());
        gameRepository.save(oldGame);
    }
    public void deleteById(int id){
        gameRepository.delete(getGameById(id));
    }

    // Feature för att söka efter ett spel i hyllan.
    public ArrayList <Game> sortListOfGames(String searchWord){
        ArrayList <Game> tempList = new ArrayList<>();
        for (Game game: gameRepository.findAll()){
            if (game.getGamename().toUpperCase().contains(searchWord.toUpperCase())){
                tempList.add(game);
            }
        }
        return tempList;
    }

    public List <Game> filterGames(int players){
        ArrayList <Game> games = new ArrayList<>();
        for (Game game: gameRepository.findAll()){
            if (players <= game.getMaxplayers() && players >= game.getMinplayers()){
                games.add(game);
            }
        }
        return games;
    }
    public BoardgameDTO putTogetherBoardGame(){
        BoardgameDTO x1822 = new BoardgameDTO();
        x1822.setGamename(getGameById(1).getGamename());
        x1822.setMinplayers(getGameById(1).getMinplayers());
        x1822.setMaxplayers(getGameById(1).getMaxplayers());
        x1822.designedBy.add(designerService.getDesignerById(109));
        x1822.gameMechanisms.add(mechanismService.getMechanismById(1));
        x1822.gameMechanisms.add(mechanismService.getMechanismById(3));
        x1822.gameMechanisms.add(mechanismService.getMechanismById(8));
        return x1822;
    }


}
