package com.revature.Day4;

public class Demo10 {
    public static void main(String[] args) {
        Output4 obj = new Output4();
        obj.draw();
        //obj.print();
    }
}
interface Drawable3 {
    void draw();
    // Can't be use outside of class
    private void print(){
        System.out.println();
    }
}

class Output4 implements Drawable3{

    @Override
    public void draw() {

    }
}
