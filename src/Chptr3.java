

public class Chptr3 {

    private String name; //instance var

    //3.13 3 instance variables
    String firstName;
    String lastName;
    double monthSal;


    //set and get method


    public void setFirstName (String name){
        this.firstName = name; //stores the name
    }
    public String getFirstName () {
        return firstName; //return value of name to caller
    }


    public void setLastName (String name){
        this.lastName = name; //stores the name
    }
    public String getLastName () {
        return lastName; //return value of name to caller
    }


    public void setMonthSal(double monthSal) {
        this.monthSal = monthSal;
    }

    public double getMonthSal() {
        return monthSal;
    }



} //class end