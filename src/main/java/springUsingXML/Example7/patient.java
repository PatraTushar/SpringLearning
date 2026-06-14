package springUsingXML.Example7;

public class patient {

    private int patientID;
    private String patientName;
    private long mobileNumber;


    public patient() {

        System.out.println(" This is Default Constructor");
    }

    public patient(int patientID, String patientName, long mobileNumber) {

        System.out.println(" The constructor has 3 parameters ");
        this.patientID = patientID;
        this.patientName = patientName;
        this.mobileNumber = mobileNumber;
    }

    public patient(int patientID, String patientName) {

        System.out.println(" The constructor has 2 parameters ");
        this.patientID = patientID;
        this.patientName = patientName;

    }


    public String toString() {

        return "{" + patientID + "," + patientName + "," + mobileNumber + "}";
    }


}
