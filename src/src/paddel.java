public class paddel {
    private int x;
    private int y;
    private int width = 10;

    public paddel(int x, int y) {
        this.x = y;
        this.y = y;
    }
public void moveUp(int x, int y){
        y += y;

    }
public void modveDown(){
            y -= y;
}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }
}
