class Str2
{
	public static void main(String[] args) {
		String p1 = "Earth is ";
		int ea = 3;
		String p2 = " billion years old";
		String s = p1 + ea + p2;

		System.out.println(s);
		
		// There is a semantic error in this section.
		// The error comes from the difference between string and integer addition.
		// In the first line of these two, line 14, we are performing string
		// concatenation. For the second of the two, line 15, because the integer
		// addition is in brackets, it does not perform string concatenation.
		System.out.println("Sun is " + ea + 2 + " billion years old");
		System.out.println("Sun is " + (ea + 2) + " billion years old");

		// 1 > 2  // This is an error. It is a compilation Error.
		// It is a compilation error for two reasons. For one, it is a meaningless
		// statement in java. Also, there is no semicolon ';' at the end of
		// the statement.

		// Escape sequences
		
		System.out.println("1. I said \"Hello\" to you.");
		System.out.println("2. I said \nHello to you.");
		System.out.println("3. I said \tHello to you.");
		System.out.println("4. I said \b\bHello to you.");
		System.out.println("5. I said \fHello to you.");
		System.out.println("6. I said \\ Hello to you.");
	}
}
