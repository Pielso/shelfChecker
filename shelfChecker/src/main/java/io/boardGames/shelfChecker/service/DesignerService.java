package io.boardGames.shelfChecker.service;
import io.boardGames.shelfChecker.entity.Designer;
import io.boardGames.shelfChecker.repository.DesignerRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DesignerService {
    DesignerRepository designerRepository;

    // Constructor
    public DesignerService(DesignerRepository designerRepository) {
        this.designerRepository = designerRepository;
    }

    // Metoder
    public Designer getDesignerById(int id){
        return designerRepository.findById(id).get();
    }
    public List <Designer> listOfDesigner(){
        return designerRepository.findAll();
    }
}
