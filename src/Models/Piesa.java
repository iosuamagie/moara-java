package Models;

import Enums.CuloarePiesa;
import Enums.PozitieStrat;
import Enums.Strat;
import Utility.Pozitie;

public class Piesa {
    public Pozitie Pozitie;
    public CuloarePiesa Culoare;

    public Piesa(Pozitie pozitie, CuloarePiesa culoare ) {
        Pozitie = pozitie;
        Culoare = culoare;
    }

    public Piesa(Strat strat, PozitieStrat pozitieStrat, CuloarePiesa culoare ) {
        Pozitie = new Pozitie(strat, pozitieStrat);
        Culoare = culoare;
    }
}
