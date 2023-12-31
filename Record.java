public class Record {

    private String name;
    private int idNumber;
    private long contactNumber;

    public Record() {
    }

    public Record(String name, int idNumber, Long contactNumber) {

        this.name = name;
        this.idNumber = idNumber;
        this.contactNumber = contactNumber;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Long contactNumber) {

        this.contactNumber = contactNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return " ID = " + idNumber + " , Name = " + name + " , Mobile No = " + contactNumber;
    }
}
