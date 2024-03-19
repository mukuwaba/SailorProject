 public class Doghouseblueprint {
    //Instant variable
    //Theses are the attributes of our doghouse
    private String colorOfDoghouse;
    private int widthInFeet;
    private int heightInFeet;
    private int depthInFeet;
    private String nameOfDog;

    public void setNameOfDog( String nameOfDog ) {
        this.nameOfDog = nameOfDog;

    }

    public void setColorOfDoghouse(String colorOfDoghouse) {
        if( colorOfDoghouse.equals("Red") ) {
            System.out.println("You cannot choose RED");
        } else {
            this.colorOfDoghouse = colorOfDoghouse;
        }

    }

    public String getColorOfDoghouse() { return colorOfDoghouse; }



    public String getNameOfDog() { return nameOfDog; }
}
