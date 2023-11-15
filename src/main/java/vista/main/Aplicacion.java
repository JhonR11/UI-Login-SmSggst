/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.main;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import vista.login.Login;
import vista.managerForms.FormsManager;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Jhon Roca
 */
public class Aplicacion extends JFrame{
    
    public Aplicacion(){
        init();
    }
    private void init(){
        //// Titulo superior y dimensiones ///
        setTitle("Smart Suggest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(1300,750));
        setLocationRelativeTo(null);
        setContentPane(new Login());
        FormsManager.getInstance().initAplicacion(this);
    }
    
    public static void main(String[] args){
        /// Dependecia FlatLaf para poner modo nigga//
        FlatRobotoFont.install();

        /// Llama a los recursos de FlatLaf
        FlatLaf.registerCustomDefaultsSource("SmartSuggest.temas");

        // Fuente, tamaño
        UIManager.put("defaultFornt",new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));

        // Define el color del tema (cambiar el "dark" por el "light" si lo quieren en modo claro
        FlatMacDarkLaf.setup();


        EventQueue.invokeLater(()-> new Aplicacion().setVisible(true));
    }

}
