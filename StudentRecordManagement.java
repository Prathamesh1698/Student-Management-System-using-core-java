import java.util.LinkedList;
import java.util.Scanner;

public class StudentRecordManagement {

    LinkedList<Record> list = new LinkedList<>();

    public StudentRecordManagement() {
        // list ;
    }

    public void add(Record record) {

        list.add(record);

    }

    public void delete(int id) {
        Record recordDel = null;
        for (Record ll : list) {

            if (ll.getIdNumber() == id) {
                recordDel = ll;
            }
        }

        if (recordDel == null) {
            System.out.println("Invalid record Id");
        } else {

            list.remove(recordDel);
            System.out.println("Successfully removed record from the list");
        }
    }

    public boolean find(int id) {

        for (Record l : list) {
            if (l.getIdNumber() == id) {

                System.out.println(l);
                return true;
            }
        }
        return false;
    }

    public Record findRecord(int id) {

        for (Record l : list) {

            if (l.getIdNumber() == id) {
                return l;
            }
        }

        return null;
    }

    public void update(int id) {

        if (find(id)) {

            Scanner input = new Scanner(System.in);

            Record rec = findRecord(id);

            System.out.print("What is the new Student id Number ? ");
            int idNumber = input.nextInt();

            System.out.print("What is the new Student contact Number ");
            Long contactNumber = input.nextLong();
            input.nextLine();

            System.out.print("What is the new Student Name ? ");
            String name = input.nextLine();

            rec.setIdNumber(idNumber);
            rec.setName(name);
            rec.setContactNumber(contactNumber);
            System.out.println("Record Updated Successfully");
        } else {
            System.out.println("Record Not Found in the Student list");
        }
    }

    public void display() {

        if (list.isEmpty()) {
            System.out.println("The list has no records\n");
        }

        for (Record record : list) {
            System.out.println(record.toString());
        }
    }
}
