package christmastree_dojo;

public class ChristmasTreeFormat {

	public StringBuilder formatter(String input) {
		StringBuilder result = new StringBuilder();
		if (input == null || input.equals("")) {
			return result;
		}
		int spaceCount = input.length() - 1;
		int rowCharCount = input.length();

		for (int i = 0; i < input.length(); i++) {
			for (int c = 0; c < rowCharCount; c++) {
				if (c < spaceCount) {
					result.append(" ");
				} else {
					result.append(String.valueOf(input.charAt(i)));
				}
			}
			rowCharCount++;
			spaceCount--;
			result.append("\n");
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(new ChristmasTreeFormat().formatter("bye").toString());
	}
}
