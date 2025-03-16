package entities;

public class SmartPhone implements VideoPlayer, MusicPlayer{

    @Override
    public void playMusic() {
        System.out.println("o smartphone está tocando musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("o smartphone pausou a musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("o smartphone parou a musica");
    }

    @Override
    public void playVideo() {
        System.out.println("o smartphone está reproduzindo o vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("o smartphone pausou o vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("o smartphone parou o vídeo");
    }


}
