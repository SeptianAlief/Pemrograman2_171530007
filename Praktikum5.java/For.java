public class For {
    public static void main(String[] args) {
        int count = 1;
        For (int i=0; i<9; i++) {
            For (int j=0; j<i+1; j++) {
                System.out.print(count);
            }
            count++; System.out.println();
        }
    }
}