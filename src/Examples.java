



public class Examples {

	public static void main(String[] args) {
		//Create object of superclass
		Person p = new Person("Amy", "4/28");
		//System.out.println(p);
		
		//Create object of subclass
		Student s = new Student("Amy", "4/28", 3.9, "Band, Computer Science");
		System.out.println(s);
	}

}
