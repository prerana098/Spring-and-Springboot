package com.nayakprerana.learnspringframework;

import com.nayakprerana.learnspringframework.game.GameRunner;
import com.nayakprerana.learnspringframework.game.GamingConsole;
import com.nayakprerana.learnspringframework.game.MarioGame;
import com.nayakprerana.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

            GamingConsole superContraGame = new SuperContraGame();
            GamingConsole marioGame = new MarioGame();
            GameRunner gameRunner = new GameRunner(superContraGame);
            gameRunner.run();
    }
}
