package entities;

public class Computador implements VideoPlayer, MusicPlayer{

    @Override
    public void playMusic() {
        System.out.println("o computador está tocando musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("o computador pausou a musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("o computador parou a musica");
    }

    @Override
    public void playVideo() {
        System.out.println("o computador está reproduzindo o vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("o computador pausou o vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("o computador parou o vídeo");
    }


}
