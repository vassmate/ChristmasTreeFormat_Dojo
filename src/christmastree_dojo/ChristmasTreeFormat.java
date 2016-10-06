package christmastree_dojo;

public class ChristmasTreeFormat {

	public StringBuilder formatter(String input) {
		StringBuilder result = new StringBuilder();
		String currentChar = "";
		int charRowCount = 3;
		int spaceCount = input.length() - 1;

		if (input == null || input.equals("")) {
			return result;
		}

		for (int i = 0; i < input.length(); i++) {
			currentChar = String.valueOf(input.charAt(i));
			if (i == 0) {
				result.append(makeSpaces(spaceCount));
				spaceCount--;
				result.append(currentChar);
			} else {
				result.append("\n");
				result.append(makeSpaces(spaceCount));
				spaceCount--;
				for (int j = 0; j < charRowCount; j++) {
					result.append(currentChar);
				}
				charRowCount += 2;
			}
		}
		return result;
	}

	private String makeSpaces(int spaceCnt) {
		String spaces = "";
		for (int p = 0; p < spaceCnt; p++) {
			spaces += " ";
		}
		return spaces;
	}

	public static void main(String[] args) {
		System.out.println(new ChristmasTreeFormat().formatter("hello").toString());
	}
}
