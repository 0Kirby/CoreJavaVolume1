package cp9;

import java.util.*;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Employee> staff = new HashMap<>();
		staff.put("144-25-5464", new Employee("Amy Lee"));
		staff.put("567-24-2546", new Employee("Harry Hacker"));
		staff.put("157-62-7935", new Employee("Gray Cooper"));
		staff.put("456-62-5527", new Employee("Francesca Crus"));

		System.out.println(staff);

		staff.remove("567-24-2546");

		staff.put("456-62-5527", new Employee("Francesca Miller"));

		System.out.println(staff.get("157-62-7935"));

		staff.forEach((k, v) -> System.out.println("key=" + k + ",value=" + v));

		
		
		Set<String> keys = staff.keySet();
		for (String key : keys)
			System.out.print(key + ',');
		System.out.println();
		Collection<Employee> values = staff.values();
		for (Employee staffs : values)
			System.out.println(staffs.toString());
		
		
		Map<String,Employee> cache = new LinkedHashMap<>(128,0.75F,true) {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			protected boolean removeEldestEntry(Entry<String, Employee> eldest) {
				// TODO Auto-generated method stub
				return size()>100;
			}
			
		};
			System.out.println(cache);
	}

}
