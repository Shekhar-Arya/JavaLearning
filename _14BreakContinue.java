public class _14BreakContinue {
    public static void main(String[] args) {
        
        // Break is used to come out of the loop;
        // Eg. as below;
        for (int i = 0; i < 5; i++) {
            if (i==3) {
                break;
            }
            System.out.println(i);
        }

        // Continue is used to skip the current iteration and start next iteration;
        for (int i = 0; i < 5; i++) {
            if (i==2) {
                continue;
            }
            System.out.println(i);
        }
    }
}
