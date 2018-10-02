package za.co.game.tictactoe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.co.game.tictactoe.domain.Game;
import za.co.game.tictactoe.domain.Move;
import za.co.game.tictactoe.domain.Player;

import java.util.List;

@Repository
public interface MoveRepository extends CrudRepository<Move, Long> {

    List<Move> findByGame(Game game);
    List<Move> findByGameAndPlayer(Game game, Player player);
    int countByGameAndPlayer(Game game, Player player);
}
