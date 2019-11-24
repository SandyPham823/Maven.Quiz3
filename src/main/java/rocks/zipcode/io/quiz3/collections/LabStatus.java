package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 * Ensure there are enumerations for, `COMPLETED`, `INCOMPLETE`, `PENDING`
 */
public enum LabStatus {
    COMPLETED("COMPLETED"), INCOMPLETE("INCOMPLETE"), PENDING("PENDING");
    String labStatus;

    LabStatus(String labStatus){
        this.labStatus = labStatus;
    }


}
