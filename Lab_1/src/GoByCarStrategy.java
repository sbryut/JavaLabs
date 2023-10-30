package org.example;

public class GoByCarStrategy implements MoveStrategy {
    @Override
    public String doMove(int x1, int y1, int x2, int y2) {
        return "The hero drove by car from point (" + x1 + "," + y1 + ") to point (" + x2 + "," + y2 + ").";
    }
}
