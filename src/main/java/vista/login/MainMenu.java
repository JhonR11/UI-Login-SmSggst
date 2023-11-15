package vista.login;

import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import vista.main.Aplicacion;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {
    public MainMenu(){


    }
    private void init(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new Dimension(1300,750));
        setLocationRelativeTo(null);


    }

    private static void main(String[] args){
        //// Instalar las fuentes
        FlatRobotoFont.install();
        FlatMacDarkLaf.setup();
        //// UI manager para poner la fuente papu
        UIManager.put("deafaultFont",new Font(FlatRobotoFont.FAMILY,Font.PLAIN,13));
        EventQueue.invokeLater(()-> new Aplicacion().setVisible(true));
    }

}
