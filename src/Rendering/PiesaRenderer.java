
package Rendering;

import Constants.Globals;
import Models.Piesa;
import Panels.PanouTablaSingleton;
import Utility.Pozitie;
import Utility.PozitieMatrice;

import java.awt.*;

public class PiesaRenderer {
    private final int INITIAL_OFFSET = 50;
    private final int BORDER_WIDTH = 5;
    private final int PIECE_DIAMETER = 50;
    private final int GRID_STEP = (Globals.MARIME_FEREASTRA - 100) / 6;

    public void renderPiesa(Piesa piesa) {
        Graphics2D g2d = PanouTablaSingleton.getInstance().G2D;

        PozitieMatrice pos = piesa.Pozitie.getMatrixPos();
        int pixelX = calculatePixelPosition(pos.X);
        int pixelY = calculatePixelPosition(pos.Y);

        g2d.setColor(piesa.Culoare.getColor());
        Object originalAntialiasing = g2d.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(pixelX - PIECE_DIAMETER/2,
                pixelY - PIECE_DIAMETER/2,
                PIECE_DIAMETER,
                PIECE_DIAMETER);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, originalAntialiasing);
    }

    private int calculatePixelPosition(int matrixPos) {
        switch(matrixPos) {
            case 0:
                return INITIAL_OFFSET + BORDER_WIDTH;
            case 1:
                return INITIAL_OFFSET + BORDER_WIDTH + GRID_STEP;
            case 2:
                return INITIAL_OFFSET + 2 * BORDER_WIDTH + 2 * GRID_STEP;
            case 3:
                return Globals.MARIME_FEREASTRA / 2;
            case 4:
                return Globals.MARIME_FEREASTRA - (INITIAL_OFFSET + 2 * BORDER_WIDTH + 2 * GRID_STEP);
            case 5:
                return Globals.MARIME_FEREASTRA - (INITIAL_OFFSET + BORDER_WIDTH + GRID_STEP);
            case 6:
                return Globals.MARIME_FEREASTRA - (INITIAL_OFFSET + BORDER_WIDTH);
            default:
                return 0;
        }
    }
}