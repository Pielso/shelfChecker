package io.boardGames.shelfChecker.controller;
import io.boardGames.shelfChecker.entity.Mechanism;
import io.boardGames.shelfChecker.service.MechanismService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MechanismController {
    MechanismService mechanismService;

    // Constructor
    public MechanismController(MechanismService mechanismService){
        this.mechanismService = mechanismService;
    }

    // Metoder
    @GetMapping ("/mechanism")
    public Mechanism getMechanismById(){
        return mechanismService.getMechanismById(1);
    }

    @GetMapping ("/listmech")
    public List <Mechanism> allMechs(){
        List <Mechanism> list = new ArrayList<>();
        list.addAll(mechanismService.listOfMechanism());
        return list;
    }
}
