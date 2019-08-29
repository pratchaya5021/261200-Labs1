public class Spacecraft {
    int x;
    int y;
    int width;
    int height;

    public Spacecraft() {
        this.width = 1;
        this.height = 1;
    }

    public Spacecraft(int size){
        this.width = size;
        this.height = size;
    }

    public Spacecraft(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area(){
        return this.width*this.height;
    }
    public int perimeter(){
        return 2 * (this.width + this.height);
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setSize(int newwidth,int newheight){
        this.width = newwidth;
        this.height = newheight;
    }
    public void setSize(int newsize){
        this.width = newsize;
        this.height = newsize;
    }
}