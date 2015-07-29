public class Person extends Animal
{
	private String name;

	public Person(String name, int leg)
	{
		super(leg);
		this.name = name;
	}

	public String getName()
	{
		return name;
	} 


	public boolean equals(Object other)
	{
		if(!super.equals(other)) return false;
		return name.equals(((Person)other).name);
	}
	public String toString()
	{
		return super.toString()+" and a Person object whose name is "+name;
	}
}