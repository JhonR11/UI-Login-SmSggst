package vista.managerForms;

import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import vista.main.Aplicacion;

import javax.swing.*;
import java.awt.*;

public class FormsManager {

    private Aplicacion aplicacion;
    private static FormsManager instance;
    public static FormsManager getInstance(){

        if(instance==null){
            instance=new FormsManager();
        }
        return instance;
    }
    private FormsManager(){

    }

    public void initAplicacion(Aplicacion aplicacion){
        this.aplicacion=aplicacion;
    }
    public void showForm(JComponent form){
        EventQueue.invokeLater(()->{
            FlatAnimatedLafChange.showSnapshot();
            aplicacion.setContentPane(form);
            aplicacion.revalidate();
            aplicacion.repaint();
            FlatAnimatedLafChange.hideSnapshotWithAnimation();
        });
    }


}
