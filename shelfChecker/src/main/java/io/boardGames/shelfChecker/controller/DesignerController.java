package io.boardGames.shelfChecker.controller;
import io.boardGames.shelfChecker.entity.Designer;
import io.boardGames.shelfChecker.service.DesignerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DesignerController {
    DesignerService designerService;

    // Constructor
    public DesignerController(DesignerService designerService) {
        this.designerService = designerService;
    }

    // Metoder
    @GetMapping ("/designer")
    public Designer getDesignerById(){
        return designerService.getDesignerById(13);
    }

    @GetMapping ("/listdesigners")
    public List <Designer> listDesigner(){
        ArrayList <Designer> listOfDesigner = new ArrayList<>();
        listOfDesigner.addAll(designerService.listOfDesigner());
        return listOfDesigner;
    }
}
