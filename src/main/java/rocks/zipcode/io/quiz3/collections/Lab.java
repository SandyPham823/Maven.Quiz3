package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    LabStatus labStatus;
    String labName;


    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labName = labName;
        this.labStatus = LabStatus.INCOMPLETE;
    }

    public String getName() {
        return this.labName;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus = labStatus;
    }

    public LabStatus getStatus() {
        return labStatus;
    }
}
