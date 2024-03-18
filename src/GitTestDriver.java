public class GitTestDriver {
    public static void main(String[] args) {
        GitTest account1 = new GitTest("Benjamin", 99.9);
        GitTest account2 = new GitTest("Mukuwa", 99.9);

        System.out.printf("%s's letter grade is: %s%n", account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n", account2.getName(), account2.getLetterGrade());

    } //end main
} //end driver
