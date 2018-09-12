import java.util.ArrayList;

public class subSequenceOfString 
{
	static ArrayList<String> list = new ArrayList<>();

	static void printSubSeq(String input, String output)
	{
		if(input.length() ==0)
		{
			if(output != "")
			{
				list.add(output);
			}
			return;
		}

		printSubSeq(input.substring(1), output);
		printSubSeq(input.substring(1), output+ input.charAt(0));
	}

	static void subSeq(String input)
	{
		printSubSeq(input, "");
	}

	public static void main(String[] args) {
		subSeq("abcd");
		System.out.println(list);
	}	
}