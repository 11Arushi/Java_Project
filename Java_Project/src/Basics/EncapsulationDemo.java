package Basics;
	
	public class EncapsulationDemo {

		public static void main(String[] args) {
			Student obj=new Student(1,"Arushi",21);	
			System.out.println(obj);
			
	       Student s1=new Student();
	       s1.setSerialNum(2);
	       s1.setName("Anya");
	       s1.setAge(21);
	       System.out.println(s1);
		}

}
