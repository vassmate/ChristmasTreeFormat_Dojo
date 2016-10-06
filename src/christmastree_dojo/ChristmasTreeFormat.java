package christmastree_dojo;

public class ChristmasTreeFormat {

	public StringBuilder formatter(String input) {
		StringBuilder result = new StringBuilder();
		if (input == null || input.equals("")) {
			return result;
		}

		String currentChar = "";
		int charRowCount = 3;
		int spaceCount = input.length() - 1;

		for (int i = 0; i < input.length(); i++) {
			currentChar = String.valueOf(input.charAt(i));
			if (i == 0) {
				result.append(makeRow(spaceCount, 1, currentChar));
				spaceCount--;
			} else {
				result.append("\n" + makeRow(spaceCount, charRowCount, currentChar));
				spaceCount--;
				charRowCount += 2;
			}
		}
		return result;
	}

	private String makeRow(int spaceCnt, int charRowCnt, String charToAppend) {
		String row = "";
		for (int p = 0; p < spaceCnt; p++) {
			row += " ";
		}
		for (int j = 0; j < charRowCnt; j++) {
			row += charToAppend;
		}
		return row;
	}

	public static void main(String[] args) {
		System.out.println(new ChristmasTreeFormat().formatter("hello").toString());
	}
}
