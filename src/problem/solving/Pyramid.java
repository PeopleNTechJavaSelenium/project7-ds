package problem.solving;

public class Pyramid {
    public static void main(String[] args) {
        int level = 100;
        for(int j=0; j<level; j++){
            for(int i=0; i<level-j; i++){
                System.out.print(" ");
            }
            for(int k=0; k<=j; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
