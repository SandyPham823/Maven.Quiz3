package rocks.zipcode.io.quiz3.collections;

import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    List<Lab> labs;

    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
        this.labs = new ArrayList<>();
    }

    public Lab getLab(String labName) {
        for (Lab l : labs)
            if (labName.equals(l.getName()))

                return l;
            return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab lab = getLab(labName);
        try {
            lab.setStatus(labStatus);
        }
        catch (Exception e){
            throw new UnsupportedOperationException(e);
        }
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        Lab lab = getLab(labName);
        return lab.getStatus();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = labs.size() - 1; i >= 0; i--){
            sb.append(labs.get(i).getName() + " > " + labs.get(i).getStatus() + "\n");
        }
        String result = sb.toString();
        return result.trim();
    }
}
