public class DrawFigures {
    public static void main(String[] args) {
        drawDiamond();
        drawX();
        drawRocket();
    }

    private static void drawUpTriangle() {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }

    private static void drawRocket() {
        drawUpTriangle();
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
        System.out.println("|United|");
        System.out.println("|States|");
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
        drawUpTriangle();
        System.out.println();
    }

    private static void drawX() {
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
        drawUpTriangle();
        System.out.println();
    }

    private static void drawDiamond() {
        drawUpTriangle();
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
        System.out.println();
    }
}