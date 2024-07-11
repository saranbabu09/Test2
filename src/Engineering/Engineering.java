package Engineering;

public class Engineering extends University {
	public void eng() {
		System.out.println("Engineering");

		String u = "Uthaya and shalini are made for each other.They both are Couples";

		String[] words = u.toUpperCase().split(" ");
		String word = "UTHAYA";

		int occurence = 0;
		for (int i = 0; i < words.length; i++) {

			if (words[i].equals(word)) {

				occurence++;
			}

		}

		System.out.println(occurence);

	}

}
