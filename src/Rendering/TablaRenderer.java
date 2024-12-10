package Rendering;

import Constants.Globals;
import Panels.PanouTablaSingleton;

import java.awt.*;

public class TablaRenderer {
    public TablaRenderer(){}

    public void renderTabla(){
        Graphics2D g2d= PanouTablaSingleton.getInstance().G2D;
        int initialOffset=50;
        int offset=0;
        int offsetGap=(Globals.MARIME_FEREASTRA-100)/6;
        g2d.setColor(Globals.CULOARE_BACKGROUND_TABLA);
        g2d.fillRect(offset,offset,Globals.MARIME_FEREASTRA,Globals.MARIME_FEREASTRA);

        // Chenarul Exterior
        offset=initialOffset;
        g2d.setColor(Globals.CULOARE_MARGINE_TABLA);
        g2d.fillRect(offset,offset,Globals.MARIME_FEREASTRA-offset*2,Globals.MARIME_FEREASTRA-offset*2);
        offset=offset+5;
        g2d.setColor(Globals.CULOARE_TABLA);
        g2d.fillRect(offset,offset,Globals.MARIME_FEREASTRA-offset*2,Globals.MARIME_FEREASTRA-offset*2);

        // Chenarul Mijlociu
        offset=offset+offsetGap;
        g2d.setColor(Globals.CULOARE_MARGINE_TABLA);
        g2d.fillRect(offset,offset,Globals.MARIME_FEREASTRA-offset*2,Globals.MARIME_FEREASTRA-offset*2);
        offset=offset+5;
        g2d.setColor(Globals.CULOARE_TABLA);
        g2d.fillRect(offset,offset,Globals.MARIME_FEREASTRA-offset*2,Globals.MARIME_FEREASTRA-offset*2);

        // Chenarul Interior
        offset=offset+offsetGap;
        g2d.setColor(Globals.CULOARE_MARGINE_TABLA);
        g2d.fillRect(offset,offset,Globals.MARIME_FEREASTRA-offset*2,Globals.MARIME_FEREASTRA-offset*2);
        offset=offset+5;
        g2d.setColor(Globals.CULOARE_TABLA);
        g2d.fillRect(offset,offset,Globals.MARIME_FEREASTRA-offset*2,Globals.MARIME_FEREASTRA-offset*2);

        int lineLength=offset-initialOffset;
        g2d.setColor(Globals.CULOARE_MARGINE_TABLA);
        g2d.fillRect(initialOffset,Globals.MARIME_FEREASTRA/2-3,lineLength,5);
        g2d.setColor(Globals.CULOARE_MARGINE_TABLA);
        g2d.fillRect(Globals.MARIME_FEREASTRA/2-3,initialOffset,5,lineLength);
        g2d.setColor(Globals.CULOARE_MARGINE_TABLA);
        g2d.fillRect(Globals.MARIME_FEREASTRA/2-3,Globals.MARIME_FEREASTRA/2+(Globals.MARIME_FEREASTRA-offset*2)/2,5,lineLength);
        g2d.setColor(Globals.CULOARE_MARGINE_TABLA);
        g2d.fillRect(Globals.MARIME_FEREASTRA/2+(Globals.MARIME_FEREASTRA-offset*2)/2,Globals.MARIME_FEREASTRA/2-3,lineLength,5);

    }
}
