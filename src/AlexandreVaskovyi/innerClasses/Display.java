package AlexandreVaskovyi.innerClasses;

public class Display {
    private static final int DISPLAY_HEIGHT = 1920;
    private static final int DISPLAY_WIDTH = 1280;
    private int x = 0;

    public Display(){
        Pixel pixel = new Pixel(10,10, Color.BLUE);
    }

    private class Pixel {
        private int x;
        private int y;
        private Color color;

        private Pixel(int x, int y, Color color) {

            if (0<=x&&x<=DISPLAY_HEIGHT && 0<=y&&y<=DISPLAY_WIDTH ) {
                this.x = x;
                this.y = y;
                this.color = color;
                System.out.println("Creating "+ color+" pixel at ("+ x +"," + y + ")" );
            } else {
                throw new IllegalArgumentException("Cordinates x and y shold be between 0-"+ DISPLAY_HEIGHT + " and 0-"+ DISPLAY_WIDTH);
            }
        }
    }


}
