package Windows;

import Constants.Globals;
import Panels.PanouTablaSingleton;

import javax.swing.*;
import java.awt.*;

public class FereastraJoc {
    public static JFrame Fereastra;

    public FereastraJoc() {
        Fereastra = new JFrame("Moara");
    }

    public void renderFereastra(){
        JPanel panouJoc;
        panouJoc = PanouTablaSingleton.getInstance();

        Fereastra.setContentPane(panouJoc);
        panouJoc.setPreferredSize(new Dimension(Globals.MARIME_FEREASTRA, Globals.MARIME_FEREASTRA));
        Fereastra.pack();
        Fereastra.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Fereastra.setVisible(true);
    }
}

