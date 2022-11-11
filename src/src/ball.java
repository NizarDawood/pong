public class ball {
    //--------------------------------------------------------------------------
    private int x;
    private int y;
    private int vx;
    private int vy;

    public ball(int x, int y, int vx, int vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }

    public void move(){
        x += vx;
        y -= vy;

    }
    public void bounce(p){
        vy = -vy;
    }

    public void bounce(){
        vx = -vx;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }





    }


}
