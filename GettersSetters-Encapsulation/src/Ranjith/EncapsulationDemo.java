package Ranjith;

class Student{
	private int rollNo;
	private String name;
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.setName("Ranjith");
		obj.setRollNo(28);
		System.out.println("Name : " + obj.getName());
		System.out.println("RollNo : " + obj.getRollNo());
	}

}
