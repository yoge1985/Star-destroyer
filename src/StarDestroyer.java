import Armament.Armament;
import Hull.Hull;
import MajorComponents.Propulsion.Propulsion;

public abstract class StarDestroyer implements Maneuvers, ShipCombat, ShipMovement{

    protected String shpNumber;
    protected String shpType = "star destroyer";
    protected String shpName;
    protected String shpClass;
    protected int shpCrew;
    protected double shpCost;
    protected Hull shpMainHull;
    protected Propulsion shpPropulsion;
    protected Armament shpArmament;
    protected Location shpLocation;

    public void displayShipInfo(){

    }

}
