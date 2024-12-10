package Panels;
import Enums.CuloarePiesa;
import Enums.PozitieStrat;
import Enums.Strat;
import Models.Piesa;
import Rendering.PiesaRenderer;
import Rendering.TablaRenderer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PanouTabla extends JPanel {
    public Graphics2D G2D;

    public PanouTabla(){}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        G2D = (Graphics2D) g;
        TablaRenderer tablaRenderer=new TablaRenderer();
        tablaRenderer.renderTabla();

        List<Piesa> piese=new ArrayList<>();
        piese.add(new Piesa(Strat.mijloc, PozitieStrat.josStanga, CuloarePiesa.neagra));
        PiesaRenderer piesaRenderer=new PiesaRenderer();
        for (Piesa p : piese) {
            piesaRenderer.renderPiesa(p);
        }
    }
}
