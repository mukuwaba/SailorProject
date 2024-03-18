public class GitTest {

    private String name;
    private double average;

    //Constructor
    public GitTest(String name, double average){

        this.name = name;

        if( average > 0.0 ){
            if( average <= 100.00 ){
                this.average = average;
            }
        }
    }//setAverage

    public double getAverage() {
        return average;
    }


    public String getLetterGrade() {
        String letterGrade = "";

        if(average >= 90.00) {
            letterGrade = "A";
        }
        else if( average >= 80.00 ) {
            letterGrade = "B";
        }
        else if( average >= 70.00 ) {
            letterGrade = "C";
        }
        else if( average >= 60.00 ) {
            letterGrade = "D";
        }
        else if( average >= 50.00 ) {
            letterGrade = "F";
        }


        return letterGrade;
    }

    public String getName() {
        return name;
    }
} //class
