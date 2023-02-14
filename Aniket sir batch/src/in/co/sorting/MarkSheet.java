package in.co.sorting;

public class MarkSheet implements Comparable<MarkSheet> {

	private String rollno;
	String firstname;
	String lastname;
	int marks;

	public String getRollno() {
		return rollno;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public int getMarks() {
		return marks;
	}

	public MarkSheet(String rollno, String firstname, String lastname, int marks) {
		super();
		this.rollno = rollno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.marks = marks;
	}

	@Override
	public int compareTo(MarkSheet o) {

		return rollno.compareTo(o.rollno);

	}

	@Override
	public String toString() {

		return rollno + " ," + firstname + " , " + lastname + " , " + marks;
	}

}
