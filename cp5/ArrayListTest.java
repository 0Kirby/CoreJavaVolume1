package cp5;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> staff = new ArrayList<>();

		staff.ensureCapacity(100);
		staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
		staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
		staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));
		System.out.println(staff.size());

		for (Employee e : staff)
			e.raiseSalary(5);

		for (Employee e : staff)
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireday="
					+ e.getHireDay());
		System.out.printf("%c",2,4);
	}

}
