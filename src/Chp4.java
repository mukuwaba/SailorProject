public class Chp4 {
   public static void main(String[] args) {
      //4.22

      //loop to print values

      int count = 1;
      int print = 1;
      int count2 = 1;

      while (count <= 5) {


          System.out.printf(" %d ", print);
          print = print * 10;
          count2 = count2 + 1;

          if (count2 == 5) {

              System.out.printf("\n");
              count = count + 1;
              print = count;
              count2 = 1;

          } //if end

      } //while end

   } //main end

} //class end
