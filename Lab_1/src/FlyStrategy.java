package org.example;

public class FlyStrategy implements MoveStrategy {
    @Override
    public String doMove(int x1, int y1, int x2, int y2) {
        return "The hero flew from point (" + x1 + "," + y1 + ") to point (" + x2 + "," + y2 + ").";
    }
}
