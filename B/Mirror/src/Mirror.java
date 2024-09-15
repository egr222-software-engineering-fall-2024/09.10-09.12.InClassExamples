public class Mirror {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        border();
        topHalf();
        bottomHalf();
        border();
    }

    public static void border() {
        System.out.print("#");
        for (int i = 1; i <= 16; i++) {
            System.out.print("=");
        }
        System.out.println("#");
    }

    public static void topHalf() {
        System.out.println("topHalf");
    }

    public static void bottomHalf() { System.out.println("bottomHalf"); }
}