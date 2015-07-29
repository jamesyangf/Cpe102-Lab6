public class Test
{
	public static void main(String[] args)
	{
		testContructor();
		testEquals();
		testToString();

		System.out.println("\nTests: "+ SUnit.testsRun());
		System.out.println("Failures: " + SUnit.testsFailed());

      if (SUnit.testsFailed() == 0)
         System.out.println("\nPASSED ALL TESTS!!!");

	}


	private static void testContructor()
	{
		int fails = SUnit.testsFailed();

		
		System.out.println("Testing Constructor...");

		//testing Animal
		Animal a1 = new Animal(2);
		SUnit.assertEquals(2,a1.getLeg(),.000001);
	

		//testing Person
		Person p1 = new Person("Tom",8);
		SUnit.assertEquals(8,p1.getLeg(),.000001);
		SUnit.assertEqualsObject("Tom",p1.getName());
	
		//testing Student
		Student s1 = new Student(4.0,"James",2);
		SUnit.assertEquals(2,s1.getLeg(),.000001);
		SUnit.assertEqualsObject("James",s1.getName());
		SUnit.assertEquals(4.0,s1.getGPA(),.000001);
		




		if (fails == SUnit.testsFailed())
        	 System.out.println("     PASS");



	}

	private static void testEquals()
	{
		int fails = SUnit.testsFailed();

		System.out.println("Testing equals...");

		//testing Animal
		Animal a1 = new Animal(2);
		SUnit.assertTrue(a1.equals(new Animal(2)));
		SUnit.assertFalse(a1.equals(new Animal(3)));

		//testing Person
		Person p1 = new Person("Tom",8);
		SUnit.assertTrue(p1.equals(new Person("Tom",8)));
		SUnit.assertFalse(p1.equals(new Person("James",4)));

		//testing Student
		Student s1 = new Student(4.0,"James",2);
		SUnit.assertTrue(s1.equals(new Student(4.0,"James",2)));
		SUnit.assertFalse(s1.equals(new Student(4.2, "Mike",3)));


		if (fails == SUnit.testsFailed())
        	 System.out.println("     PASS");


	}

	private static void testToString()
	{
		int fails = SUnit.testsFailed();

		System.out.println("Testing toString...");

		//testing Animal
		Animal a1 = new Animal(2);
		SUnit.assertEqualsObject("I am an Animal object with 2 legs",a1.toString());

		//testing Person
		Person p1 = new Person("Tom",8);
		SUnit.assertEqualsObject("I am an Animal object with 8 legs and a Person object whose name is Tom",p1.toString());

		//testing Student
		Student s1 = new Student(4.0,"James",2);
		SUnit.assertEqualsObject("I am an Animal object with 2 legs and a Person object whose name is James and a Student Object with a 4.0 GPA",s1.toString());




		if (fails == SUnit.testsFailed())
        	 System.out.println("     PASS");
	}

}