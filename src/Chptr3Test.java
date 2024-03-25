public class Chptr3Test {
    public static void main(String[] args) {


        Chptr3 employee1ObjRef = new Chptr3();
        employee1ObjRef.setFirstName("Sailor");
        employee1ObjRef.setLastName("Rooley");
        employee1ObjRef.setMonthSal(100000);
        double yearlySal1 = employee1ObjRef.getMonthSal() * 12;

        System.out.printf("User name is: %s %s\n Monthly SALARY: %s \n Yearly SALARY: %s\n",
                employee1ObjRef.getFirstName(), employee1ObjRef.getLastName(), employee1ObjRef.getMonthSal(), yearlySal1 );
        System.out.printf(" new SALARY (after 10%% raise): %s \n", yearlySal1 * 1.1 );


        Chptr3 employee2ObjRef = new Chptr3();
        employee2ObjRef.setFirstName("Tony");
        employee2ObjRef.setLastName("Stark");
        employee2ObjRef.setMonthSal(15000);

        double yearlySal2 = employee2ObjRef.getMonthSal() * 12;

        System.out.printf("User name is: %s %s\n Monthly SALARY: %s \n Yearly SALARY: %s\n",
                employee2ObjRef.getFirstName(), employee2ObjRef.getLastName(), employee2ObjRef.getMonthSal(), yearlySal2 );
        System.out.printf(" new SALARY (after 10%% raise): %s \n", yearlySal2 * 1.1 );



    } //main end
    
} //class end
