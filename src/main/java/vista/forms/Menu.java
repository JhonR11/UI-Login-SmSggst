package vista.forms;

import uk.co.caprica.vlcj.factory.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;

import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel {


    private MediaPlayerFactory factory;
    private EmbeddedMediaPlayer mediaPlayer;

    public Menu(){
        init();
    }

    private void init(){
        // Metodo donde se inicializan ambos objetos
        factory=new MediaPlayerFactory();
        mediaPlayer=factory.mediaPlayers().newEmbeddedMediaPlayer();

        // Lienzo para mostrar el video
        Canvas canvas = new Canvas();
        mediaPlayer.videoSurface().set(factory.videoSurfaces().newVideoSurface(canvas));


        setLayout(new BorderLayout());
        add(canvas);


    }

    /// Metodos para reproducir y detener el video
    public void inicio(){

    }
    public void pausa(){

    }


}
