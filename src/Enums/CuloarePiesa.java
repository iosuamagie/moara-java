package Enums;

import Constants.Globals;

import java.awt.*;

public enum CuloarePiesa {
    neagra,alba;

    public Color getColor() {
        return this.equals(neagra) ? Globals.CULOARE_PIESA_NEAGRA : Globals.CULOARE_PIESA_ALBA;
    }
}
