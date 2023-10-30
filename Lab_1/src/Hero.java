package org.example;

public class Hero {
    private MoveStrategy move;

    public void setMove(MoveStrategy move) {
        if (move == null) {
            System.out.println("Nullptr exception.");
        } else {
            this.move = move;
        }
    }

    public MoveStrategy getMove() {
        return move;
    }

    public String doMove(int x1, int y1, int x2, int y2) {
        return move.doMove(x1, y1, x2, y2);
    }
}
