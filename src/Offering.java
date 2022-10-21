import java.util.ArrayList;
import java.util.List;

/**
 * SER-515
 * Offering  class for Iterator pattern
 */
public class Offering {

    public Offering(String offeringName) {
        this.offeringName = offeringName;
    }

    public String getOfferingName() {
        return offeringName;
    }

    public void setOfferingName(String offeringName) {
        this.offeringName = offeringName;
    }

    String offeringName;
}
