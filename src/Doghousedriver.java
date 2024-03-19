public class Doghousedriver {
    public static void main(String[] args) {
       Doghouseblueprint dogObjRef = new Doghouseblueprint();

        dogObjRef.setNameOfDog("Holly");
        dogObjRef.setColorOfDoghouse("Red");
        System.out.println("Color of Doghouse is..." + dogObjRef.getColorOfDoghouse());
        System.out.println("Name of Dog..." + dogObjRef.getNameOfDog());

    }

}
