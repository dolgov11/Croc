package Lesson_3;

public class Chess {
    public int x;
    public int y;

    public Chess(int x, int y) throws IllegalArgumentException{
        if (x<0 || x>8)
            throw new IllegalArgumentException("Coords should be between 0 and 7");
        this.x = x;
        if (y<0 || y>8)
            throw new IllegalArgumentException("Coords should be between 0 and 7");
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public String toString(){
        char[] letters = {'a','b','c','d','e','f','g'};
        return String.format("%c%d",letters[this.x],this.y+1);
    }
}
