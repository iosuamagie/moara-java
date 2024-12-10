package Utility;

import Enums.PozitieStrat;
import Enums.Strat;

public class Pozitie {
    public Strat Strat;
    public PozitieStrat PozitieStrat;

    public Pozitie(Strat strat, PozitieStrat pozitieStrat) {
        Strat = strat;
        PozitieStrat = pozitieStrat;
    }

    public Pozitie(PozitieMatrice pozitieMatrice) {
        // EXTERIOR
        if (pozitieMatrice.equals(new PozitieMatrice(0, 0))) {
            this.Strat = Enums.Strat.exterior;
            this.PozitieStrat = Enums.PozitieStrat.susStanga;
        } else if (pozitieMatrice.equals(new PozitieMatrice(3, 0))) {
            this.Strat = Enums.Strat.exterior;
            this.PozitieStrat = Enums.PozitieStrat.susMijloc;
        } else if (pozitieMatrice.equals(new PozitieMatrice(6, 0))) {
            this.Strat = Enums.Strat.exterior;
            this.PozitieStrat = Enums.PozitieStrat.susDreapta;
        } else if (pozitieMatrice.equals(new PozitieMatrice(0, 3))) {
            this.Strat = Enums.Strat.exterior;
            this.PozitieStrat = Enums.PozitieStrat.mijlocStanga;
        } else if (pozitieMatrice.equals(new PozitieMatrice(6, 3))) {
            this.Strat = Enums.Strat.exterior;
            this.PozitieStrat = Enums.PozitieStrat.mijlocDreapta;
        } else if (pozitieMatrice.equals(new PozitieMatrice(0, 6))) {
            this.Strat = Enums.Strat.exterior;
            this.PozitieStrat = Enums.PozitieStrat.josStanga;
        } else if (pozitieMatrice.equals(new PozitieMatrice(3, 6))) {
            this.Strat = Enums.Strat.exterior;
            this.PozitieStrat = Enums.PozitieStrat.josMijloc;
        } else if (pozitieMatrice.equals(new PozitieMatrice(6, 6))) {
            this.Strat = Enums.Strat.exterior;
            this.PozitieStrat = Enums.PozitieStrat.josDreapta;
        }

        // MIJLOC
        else if (pozitieMatrice.equals(new PozitieMatrice(1, 1))) {
            this.Strat = Enums.Strat.mijloc;
            this.PozitieStrat = Enums.PozitieStrat.susStanga;
        } else if (pozitieMatrice.equals(new PozitieMatrice(3, 1))) {
            this.Strat = Enums.Strat.mijloc;
            this.PozitieStrat = Enums.PozitieStrat.susMijloc;
        } else if (pozitieMatrice.equals(new PozitieMatrice(5, 1))) {
            this.Strat = Enums.Strat.mijloc;
            this.PozitieStrat = Enums.PozitieStrat.susDreapta;
        } else if (pozitieMatrice.equals(new PozitieMatrice(1, 3))) {
            this.Strat = Enums.Strat.mijloc;
            this.PozitieStrat = Enums.PozitieStrat.mijlocStanga;
        } else if (pozitieMatrice.equals(new PozitieMatrice(5, 3))) {
            this.Strat = Enums.Strat.mijloc;
            this.PozitieStrat = Enums.PozitieStrat.mijlocDreapta;
        } else if (pozitieMatrice.equals(new PozitieMatrice(1, 5))) {
            this.Strat = Enums.Strat.mijloc;
            this.PozitieStrat = Enums.PozitieStrat.josStanga;
        } else if (pozitieMatrice.equals(new PozitieMatrice(3, 5))) {
            this.Strat = Enums.Strat.mijloc;
            this.PozitieStrat = Enums.PozitieStrat.josMijloc;
        } else if (pozitieMatrice.equals(new PozitieMatrice(5, 5))) {
            this.Strat = Enums.Strat.mijloc;
            this.PozitieStrat = Enums.PozitieStrat.josDreapta;
        }

        // INTERIOR
        else if (pozitieMatrice.equals(new PozitieMatrice(2, 2))) {
            this.Strat = Enums.Strat.interior;
            this.PozitieStrat = Enums.PozitieStrat.susStanga;
        } else if (pozitieMatrice.equals(new PozitieMatrice(3, 2))) {
            this.Strat = Enums.Strat.interior;
            this.PozitieStrat = Enums.PozitieStrat.susMijloc;
        } else if (pozitieMatrice.equals(new PozitieMatrice(4, 2))) {
            this.Strat = Enums.Strat.interior;
            this.PozitieStrat = Enums.PozitieStrat.susDreapta;
        } else if (pozitieMatrice.equals(new PozitieMatrice(2, 3))) {
            this.Strat = Enums.Strat.interior;
            this.PozitieStrat = Enums.PozitieStrat.mijlocStanga;
        } else if (pozitieMatrice.equals(new PozitieMatrice(4, 3))) {
            this.Strat = Enums.Strat.interior;
            this.PozitieStrat = Enums.PozitieStrat.mijlocDreapta;
        } else if (pozitieMatrice.equals(new PozitieMatrice(2, 4))) {
            this.Strat = Enums.Strat.interior;
            this.PozitieStrat = Enums.PozitieStrat.josStanga;
        } else if (pozitieMatrice.equals(new PozitieMatrice(3, 4))) {
            this.Strat = Enums.Strat.interior;
            this.PozitieStrat = Enums.PozitieStrat.josMijloc;
        } else if (pozitieMatrice.equals(new PozitieMatrice(4, 4))) {
            this.Strat = Enums.Strat.interior;
            this.PozitieStrat = Enums.PozitieStrat.josDreapta;
        }

        else {
            this.Strat = Enums.Strat.exterior;
            this.PozitieStrat = Enums.PozitieStrat.susStanga;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pozitie poz) {
            return poz.Strat.equals(this.Strat) && poz.PozitieStrat.equals(this.PozitieStrat);
        }
        return false;
    }

    public PozitieMatrice getMatrixPos() {
        // EXTERIOR
        if(this.equals(new Pozitie(Enums.Strat.exterior, Enums.PozitieStrat.susStanga))) {
            return new PozitieMatrice(0, 0);
        }
        if(this.equals(new Pozitie(Enums.Strat.exterior, Enums.PozitieStrat.susMijloc))) {
            return new PozitieMatrice(3, 0);
        }
        if(this.equals(new Pozitie(Enums.Strat.exterior, Enums.PozitieStrat.susDreapta))) {
            return new PozitieMatrice(6, 0);
        }
        if(this.equals(new Pozitie(Enums.Strat.exterior, Enums.PozitieStrat.mijlocStanga))) {
            return new PozitieMatrice(0, 3);
        }
        if(this.equals(new Pozitie(Enums.Strat.exterior, Enums.PozitieStrat.mijlocDreapta))) {
            return new PozitieMatrice(6, 3);
        }
        if(this.equals(new Pozitie(Enums.Strat.exterior, Enums.PozitieStrat.josStanga))) {
            return new PozitieMatrice(0, 6);
        }
        if(this.equals(new Pozitie(Enums.Strat.exterior, Enums.PozitieStrat.josMijloc))) {
            return new PozitieMatrice(3, 6);
        }
        if(this.equals(new Pozitie(Enums.Strat.exterior, Enums.PozitieStrat.josDreapta))) {
            return new PozitieMatrice(6, 6);
        }

        // MIJLOC
        if(this.equals(new Pozitie(Enums.Strat.mijloc, Enums.PozitieStrat.susStanga))) {
            return new PozitieMatrice(1, 1);
        }
        if(this.equals(new Pozitie(Enums.Strat.mijloc, Enums.PozitieStrat.susMijloc))) {
            return new PozitieMatrice(3, 1);
        }
        if(this.equals(new Pozitie(Enums.Strat.mijloc, Enums.PozitieStrat.susDreapta))) {
            return new PozitieMatrice(5, 1);
        }
        if(this.equals(new Pozitie(Enums.Strat.mijloc, Enums.PozitieStrat.mijlocStanga))) {
            return new PozitieMatrice(1, 3);
        }
        if(this.equals(new Pozitie(Enums.Strat.mijloc, Enums.PozitieStrat.mijlocDreapta))) {
            return new PozitieMatrice(5, 3);
        }
        if(this.equals(new Pozitie(Enums.Strat.mijloc, Enums.PozitieStrat.josStanga))) {
            return new PozitieMatrice(1, 5);
        }
        if(this.equals(new Pozitie(Enums.Strat.mijloc, Enums.PozitieStrat.josMijloc))) {
            return new PozitieMatrice(3, 5);
        }
        if(this.equals(new Pozitie(Enums.Strat.mijloc, Enums.PozitieStrat.josDreapta))) {
            return new PozitieMatrice(5, 5);
        }

        // INTERIOR
        if(this.equals(new Pozitie(Enums.Strat.interior, Enums.PozitieStrat.susStanga))) {
            return new PozitieMatrice(2, 2);
        }
        if(this.equals(new Pozitie(Enums.Strat.interior, Enums.PozitieStrat.susMijloc))) {
            return new PozitieMatrice(3, 2);
        }
        if(this.equals(new Pozitie(Enums.Strat.interior, Enums.PozitieStrat.susDreapta))) {
            return new PozitieMatrice(4, 2);
        }
        if(this.equals(new Pozitie(Enums.Strat.interior, Enums.PozitieStrat.mijlocStanga))) {
            return new PozitieMatrice(2, 3);
        }
        if(this.equals(new Pozitie(Enums.Strat.interior, Enums.PozitieStrat.mijlocDreapta))) {
            return new PozitieMatrice(4, 3);
        }
        if(this.equals(new Pozitie(Enums.Strat.interior, Enums.PozitieStrat.josStanga))) {
            return new PozitieMatrice(2, 4);
        }
        if(this.equals(new Pozitie(Enums.Strat.interior, Enums.PozitieStrat.josMijloc))) {
            return new PozitieMatrice(3, 4);
        }
        if(this.equals(new Pozitie(Enums.Strat.interior, Enums.PozitieStrat.josDreapta))) {
            return new PozitieMatrice(4, 4);
        }
        return new PozitieMatrice(0, 0);
    }
}
