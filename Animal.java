public class Animal
{
	private int legs;

	public Animal(int leg)
	{
		this.legs = leg;
	}

	public int getLeg()
	{
		return legs;
	}

	public boolean equals(Object other)
	{
		if(other == null)
		{
			return false;
		}
		if(this.getClass() != other.getClass())
		{
			return false;
		}

		return legs == ((Animal)other).legs;
	}

	public String toString()
	{
		return "I am an Animal object with "+legs+" legs";
	}
}