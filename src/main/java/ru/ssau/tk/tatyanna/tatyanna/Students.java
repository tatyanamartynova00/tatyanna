package ru.ssau.tk.tatyanna.tatyanna;

public class Students {
    private String firstName;
    private String lastName;
    private String middleName;
    private int count;
    private int numberOfScores;
    private int scores[] = new int[numberOfScores];

    private Students() {

    }

    private Students(String firstName, String lastName, String middleName, int number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.count = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getNumber() {
        return count;
    }

    public int getNumberOfScores() {
        return numberOfScores;
    }

    public int[] getScores() {
        return scores;
    }

    public int getScores(int index) {
        return scores[index];
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
        ;
    }

    public void setNumber(int number) {
        this.count = number;
    }

    public void setNumberOfScores(int numberOfScores) {
        this.numberOfScores = numberOfScores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public void setScores(int index, int score) {
        scores[index] = score;
    }


    public static void main(String[] args) {
        int arrayOfScoresOfFirst[] = new int[]{4, 4, 4};
        Students first = new Students("Olezha", "Pupkin", "Nikolaevich", 7862455);
        System.out.println("information about the first student is:    " + first.getFirstName() + "  " + first.getLastName() + "    " + first.getMiddleName() + "    " + first.getNumber());
        first.setNumberOfScores(5);
        System.out.println("Number Of Scores is   " + first.getNumberOfScores());
        first.setScores(arrayOfScoresOfFirst);
        for (int i = 0; i < arrayOfScoresOfFirst.length; i++) {
            System.out.println(first.scores[i]);
        }
        first.setScores(1, 5);
        for (int i = 0; i < arrayOfScoresOfFirst.length; i++) {
            System.out.println("updated scores is   " + first.scores[i]);
        }

        System.out.println(" Score for 4 exam is   " + first.getScores(2));

        Students second = new Students();
        second.setFirstName("Katya");
        System.out.println("information about the second student is:    " + second.getFirstName() );

    }
}
