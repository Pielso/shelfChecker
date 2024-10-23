package io.boardGames.shelfChecker.repository;
import io.boardGames.shelfChecker.entity.Mechanism;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechanismRepository extends JpaRepository <Mechanism, Integer> {
}
