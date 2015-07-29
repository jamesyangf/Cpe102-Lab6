public class Student extends Person
{
	private double gpa;

	public Student(double gpa, String name, int leg)
	{
		super(name,leg);
		this.gpa = gpa;
	}

	public double getGPA()
	{
		return gpa;
	}

	public boolean equals(Object other)
	{
		if(!super.equals(other)) return false;
		return gpa == ((Student)other).gpa;
	}

	public String toString()
	{
		return super.toString()+" and a Student Object with a "+gpa+" GPA";
	}
}