package oving1.Location;

public class Location {
    private int xpos;
    private int ypos;

    // Constructor:
    public Location(int startX, int startY) {
        this.xpos = startX;
        this.ypos = startY;
    };

    public void up(int moveY) {
        this.ypos += moveY;
    };

    public void down(int moveY) {
        this.ypos -= moveY;
    };
    
    public void left(int moveX) {
        this.xpos -= moveX;
    };

    public void right(int moveX) {
        this.xpos += moveX;
    };

    // Get pos methods:
    public int getX() {
        return xpos;
    };
    
    public int getY() {
        return ypos;
    };

    // toString method;
    public String toString(){
        return String.format("The point is currently located at (%o,%o)", this.xpos, this.ypos);
        // docs: https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html 
    };

    // main method:
    public static void main(String[] args) {
        Location point = new Location(14, 10);
        System.out.println(point.toString());
        point.up(2);
        System.out.println(point.toString());
    }
}

