package day1_20march_111099_fs;

public class ALetterToYourself {
	public static void main(String[] args) {
		ALetterToYourself obj = new ALetterToYourself();
		obj.printHeadLine();
		obj.printHashLine();
		obj.printBlankLine();
		obj.printMyAddress();
		obj.printBlankLine();
		obj.printTailLine();

	}

	private void printHeadLine() {
		System.out.println("+---------------------------------------------------------+");
	}

	private void printHashLine() {
		System.out.println("|                                                    #### |");
		System.out.println("|                                                    #### |");
		System.out.println("|                                                    #### |");
	}

	private void printBlankLine() {
		System.out.println("|                                                         |");
	}

	private void printMyAddress() {
		System.out.println("|                              Sundas Chaudhry            |");
		System.out.println("|                              771 Lake Street            |");
		System.out.println("|                          Glendale Heights, IL 60148     |");
	}

	private void printTailLine() {
		System.out.println("+---------------------------------------------------------+");
	}

}
