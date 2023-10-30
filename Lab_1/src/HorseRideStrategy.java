package org.example;

public class HorseRideStrategy implements MoveStrategy {
    @Override
    public String doMove(int x1, int y1, int x2, int y2) {
        return "The hero rode a horse from point (" + x1 + "," + y1 + ") to point (" + x2 + "," + y2 + ").";
    }
}
