package io.boardGames.shelfChecker.service;
import io.boardGames.shelfChecker.entity.Mechanism;
import io.boardGames.shelfChecker.repository.MechanismRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class MechanismService {
    MechanismRepository mechanismRepository;

    // Constructor
    public MechanismService(MechanismRepository mechanismRepository){
        this.mechanismRepository = mechanismRepository;
    }

    // Metoder
    public Mechanism getMechanismById(int id){
        return mechanismRepository.findById(id).get();
    }
    public ArrayList<Mechanism> listOfMechanism(){
        ArrayList <Mechanism> listOfMechanism = new ArrayList<>();
        for (Mechanism mechanism: mechanismRepository.findAll()){
            listOfMechanism.add(mechanism);
        }
        return listOfMechanism;
    }
}
