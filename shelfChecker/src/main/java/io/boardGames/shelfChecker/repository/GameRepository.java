package io.boardGames.shelfChecker.repository;
import io.boardGames.shelfChecker.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository <Game, Integer> {
}
