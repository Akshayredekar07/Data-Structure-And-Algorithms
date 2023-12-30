package First;

public class T24__BreakContinueExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                // Skip even numbers
                continue;
            }
            
//            if (i % 5 == 0) {
//                break;
//            }
            
            System.out.println(i);
        }

        int i = 0;
        do{
            System.out.println(i);
            System.out.println("Java is great!");
            if(i==2){
                System.out.println("Ending the loop!");
                break;
            }
            i++;
        }while (i<5);
            System.out.println("Loops end here");


        for(int j = 0; j <=4; j++){
            if (j==2){
                System.out.println("Ending the loop here!");
                continue;
            }
            System.out.println(j);
            System.out.println("Java is great!");
        }
    }
}
