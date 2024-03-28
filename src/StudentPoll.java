public class StudentPoll {
    public static void main(String[] args) {

        int[] responses = {1,2,5,4,3,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
        int[] frequency = new int[6];

        frequency[0] = 987;

        for( int answer = 0; answer < responses.length; answer++) {
            try {
                ++frequency[responses[answer]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.println("    reponses[%d] = %d%n%n", answer, responses[answer]);
            }
        }



    }
}
