package vista.login;

import com.formdev.flatlaf.FlatClientProperties;
import net.miginfocom.swing.MigLayout;
import vista.forms.Menu;
import vista.managerForms.FormsManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Login extends JPanel {
    public Login(){
        init();
    }
    private void init(){
        setLayout(new MigLayout("fill, insets 20","[center]","[center]"));
        txtUsername= new JTextField();
        txtPassword= new JPasswordField();
        chRememberMe= new JCheckBox("Recordarme");
        JButton cmdLogin = new JButton("Login");
        JPanel panel = new JPanel(new MigLayout("wrap, fillx,insets 35 40 30 45,","fill, 400:300"));
        panel.putClientProperty(FlatClientProperties.STYLE,"" +
                "arc:20;" +
                "[Light]background:darken(@background,3%);" +
                "[dark]background:lighten(@background, 3%)");


        /// Hacer invisible la contraseña ///
        txtPassword.putClientProperty(FlatClientProperties.STYLE,""+
                "showRevealButton:true");

        /// Texto en placeholder
        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT,"Ingresa tu usuario aqui ;b");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT,"Ingresa tu contraseña aqui :D");


        JLabel lbTitle=new JLabel("Bienvenido a Smart Suggest!");
        JLabel descripcion = new JLabel("Porfavor ingresa con tu cuenta");

        /// Fuente del primer titulo
        lbTitle.putClientProperty(FlatClientProperties.STYLE,""+
                "font:bold +13");
        descripcion.putClientProperty(FlatClientProperties.STYLE,""+
                "[Light]foreground:lighten(@foreground,30%);"+
                "[dark]foreground:darken(@foreground,30%)");

        //////////////////
        panel.add(lbTitle);
        panel.add(descripcion);
        panel.add(new JLabel("Username"), "gapy 8");
        panel.add(txtUsername);
        panel.add(new JLabel("Password"),"gapy 8");
        panel.add(txtPassword);
        panel.add(chRememberMe, "grow 0");
        panel.add(cmdLogin,"gapy 10");

        add(panel);

    }
    private void JButton CmdLogin(){
        MainMenu frameMenu = new MainMenu();
        frameMenu.setVisible(true);

    }

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JCheckBox chRememberMe;
    private JButton cmdLogin;


}
