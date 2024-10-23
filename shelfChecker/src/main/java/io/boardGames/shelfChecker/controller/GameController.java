package io.boardGames.shelfChecker.controller;
import io.boardGames.shelfChecker.DTO.BoardgameDTO;
import io.boardGames.shelfChecker.entity.Game;
import io.boardGames.shelfChecker.repository.DesignerRepository;
import io.boardGames.shelfChecker.repository.GameRepository;
import io.boardGames.shelfChecker.repository.MechanismRepository;
import io.boardGames.shelfChecker.service.DesignerService;
import io.boardGames.shelfChecker.service.GameService;
import io.boardGames.shelfChecker.service.MechanismService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/games")
public class GameController {
    GameService gameService;
    DesignerService designerService;
    MechanismService mechanismService;

    // Constructor
    public GameController(GameService gameService, GameRepository gameRepository, DesignerRepository designerRepository, MechanismRepository mechanismRepository) {
        this.gameService = gameService;
        this.designerService = designerService;
        this.mechanismService = mechanismService;
    }

    // URL
    @GetMapping ("/{id}")
    public Game getGameById(@PathVariable("id") int gameId){
        return gameService.getGameById(gameId);
    }
    @GetMapping ("/all")
    public List<Game> listAllGames(){
        return gameService.getAllGames();
    }
    @GetMapping ("/search/{searchword}")
    public ArrayList <Game> sortListOfGames(@PathVariable ("searchword") String searchWord){
        return gameService.sortListOfGames(searchWord);
    }
    @GetMapping ("/filtergames/{players}")
    public List<Game> filterGames(@PathVariable("players") int players){
        return gameService.filterGames(players);
    }
    @GetMapping ("/boardgame")
    public BoardgameDTO tryBoardGame(){
        return gameService.putTogetherBoardGame();
    }
    @PostMapping ("/newgame")
    public ResponseEntity<String> createGame(@RequestBody Game game){
        try {
            gameService.createGame(game);
            return new ResponseEntity<>("Game was added to database", HttpStatus.OK);
        } catch (Exception e) {
            return  new ResponseEntity<>("There was an error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping ("/update")
    public ResponseEntity<String> updateGame(@RequestBody Game game){
        try {
            gameService.updateGame(game);
            return new ResponseEntity<>("Game was updated!", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Something was not cool!", HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }
    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id){
        try {
            gameService.deleteById(id);
            return new ResponseEntity<>("Game was deleted!", HttpStatus.OK);

        }
        catch (Exception e){
            return new ResponseEntity<>("There was an error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    }
