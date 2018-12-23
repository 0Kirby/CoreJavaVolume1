package cp6;

import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeClone implements Cloneable {
	private String name;
	private double salary;
	private Date HireDay;

	public EmployeeClone(String name, double salary) {
		this.name = name;
		this.salary = salary;
		HireDay = new Date();
	}

	public EmployeeClone clone() throws CloneNotSupportedException {
		EmployeeClone cloned = (EmployeeClone) super.clone();
		cloned.HireDay = (Date) HireDay.clone();
		return cloned;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public void setHireDay(int year, int month, int day) {
		Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
		HireDay.setTime(newHireDay.getTime());

	}

	public String toString() {
		return "[name=" + name + ",salary=" + salary + ",hireDay=" + HireDay + "]";

	}

}
