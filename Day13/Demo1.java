package com.revature.Day13;

public class Demo1 {
    public static void main(String[] args) {
        // without lambda expression
        Output output = new Output();
        output.draw();

        DrawSomething d2 = new DrawSomething() {
            @Override
            public void draw() {
                System.out.println("drawing...");
            }
        };
        d2.draw();
        // with lambda expression
        DrawSomething d3 = () -> System.out.println("lambda is drawing");
        d3.draw();

    }
}

class Output implements DrawSomething {

    @Override
    public void draw() {
        System.out.println("drawing...");
    }
}

@FunctionalInterface
interface DrawSomething {
    void draw();
}
