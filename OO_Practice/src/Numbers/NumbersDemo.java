package Numbers;

public class NumbersDemo {
	public static void main(String[] args)
	{
		Number[] nums = new Number[2];
		nums[0] = new Fraction(2, 3, true);
		nums[1] = new Fraction(3, 4, true);
		nums[0].addition(nums[1]);
		nums[0].display();
	}
}
