package cp6;

import java.util.Arrays;

public class EmployeeSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] staff = new Employee[3];

		staff[0] = new Employee("Harry Hacker", 35000);
		staff[1] = new Employee("Carl Craker", 75000);
		staff[2] = new Employee("Tony Tester", 38000);

		Arrays.sort(staff);

		for (Employee e : staff)
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());

	}

}
