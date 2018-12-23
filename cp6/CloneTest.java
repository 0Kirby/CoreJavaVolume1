package cp6;

public class CloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeClone original = new EmployeeClone("John Q. Public", 50000);
		original.setHireDay(2000, 1, 1);
		try {
			EmployeeClone copy = original.clone();
			copy.raiseSalary(10);
			copy.setHireDay(2002, 12, 31);
			System.out.println("orignal=" + original);
			System.out.println("copy=" + copy);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
