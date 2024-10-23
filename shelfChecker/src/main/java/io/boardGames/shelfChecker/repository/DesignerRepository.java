package io.boardGames.shelfChecker.repository;
import io.boardGames.shelfChecker.entity.Designer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignerRepository extends JpaRepository <Designer, Integer> {
}
