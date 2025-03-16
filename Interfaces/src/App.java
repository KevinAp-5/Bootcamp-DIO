import java.util.function.Consumer;

import entities.MusicPlayer;
import entities.User;

public class App {
    public static void main(String[] args) throws Exception {

        var musicPlayer = new MusicPlayer() {
            // Dessa forma a gente tem uma classe anonima, onde temos um objeto implementando
            // os métodos abstrados da nossa interface
            @Override
            public void playMusic() {
                System.out.println("Tocando música");
            }

            @Override
            public void pauseMusic() {
                System.out.println("Musica pausada");
            }

            @Override
            public void stopMusic() {
                System.out.println("Musica parou.");
            }
            
        };
        musicPlayer.playMusic();

        var consumer = new Consumer<User>
    }
}
