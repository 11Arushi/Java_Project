package Inheritance;

public class HirarchialInheritanceDemo {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Person p;
		p = new Person("Renu", "Pune");
		if (p instanceof Person)
			System.out.println("Person Details "+p);
		
		p = new Employee("Niky", "Bangalore", 111, 56000, "Software Developer");
		
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new Student1("Panki", "Pune", "FE", 88);
		if (p instanceof Student1)
			System.out.println("Student Details "+p);
	}

}
