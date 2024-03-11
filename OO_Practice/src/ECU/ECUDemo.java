package ECU;

public class ECUDemo {

	public static void main(String[] args) {
		Student s1 = new Student("name", "A001", "CS");
		s1.displayInfo("Hello");
		
		Student[] stu = new Student[3];
		Employee[] emplyee = new Employee[3];
		
		for(int i = 0; i < 3; i++)
		{
			stu[i] = new Student("Stu" + (i+1), "A00" + (i + 1), "CS");
			emplyee[i] = new Employee("Employee"+ (i + 1), "E00" + (i + 1), "CS", 500 + i * 5500);
		}
		
		//Person[] committee = new Person[4];
		
		Person[] committee = new Person[4];
		
		committee[0] = new Student();
		committee[1] = new Employee();
		
		for(int i = 0; i < 4; i++)
		{
			committee[i].displayInfo();
		}
		
		committee[0] = stu[(int)(Math.random() * 3)];
		
		//Person committee1 = new Student();
		//Person committee2 = new Employee();
		
		committee1.getMajor();
		
		committee1.displayInfo();
		committee2.displayInfo();

	}

}
