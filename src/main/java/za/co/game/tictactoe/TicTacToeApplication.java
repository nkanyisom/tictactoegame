package za.co.game.tictactoe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import za.co.game.tictactoe.domain.Player;
import za.co.game.tictactoe.repository.PlayerRepository;

@SpringBootApplication
public class TicTacToeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicTacToeApplication.class, args);
	}

	@Bean
    public CommandLineRunner demo(PlayerRepository playerRepository) {
        return (args) -> {

            //save a couple of players
            playerRepository.save(new Player("dev1", "dev1@dev1.com", new BCryptPasswordEncoder().encode("dev1")));
            playerRepository.save(new Player("dev2", "dev2@dev2.com",  new BCryptPasswordEncoder().encode("dev2")));

        };
    }
}
