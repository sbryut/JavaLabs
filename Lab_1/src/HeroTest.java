package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void testSetMove() {
        Hero hero = new Hero();

        MoveStrategy flyStrategy = new FlyStrategy();
        hero.setMove(flyStrategy);
        assertEquals(flyStrategy, hero.getMove());

        MoveStrategy horseRideStrategy = new HorseRideStrategy();
        hero.setMove(horseRideStrategy);
        assertEquals(horseRideStrategy, hero.getMove());

        MoveStrategy goByCarStrategy = new GoByCarStrategy();
        hero.setMove(goByCarStrategy);
        assertEquals(goByCarStrategy, hero.getMove());

        MoveStrategy walkStrategy = new WalkStrategy();
        hero.setMove(walkStrategy);
        assertEquals(walkStrategy, hero.getMove());
    }

    @Test
    public void doMove() {
        Hero hero = new Hero();

        MoveStrategy flyStrategy = new FlyStrategy();
        hero.setMove(flyStrategy);
        assertEquals("The hero flew from point (0,0) to point (5,10).", hero.doMove(0,0,5,10));

        MoveStrategy goByCarStrategy = new GoByCarStrategy();
        hero.setMove(goByCarStrategy);
        assertEquals("The hero drove by car from point (5,10) to point (31,8).", hero.doMove(5,10,31,8));

        MoveStrategy walkStrategy = new WalkStrategy();
        hero.setMove(walkStrategy);
        assertEquals("The hero walked from point (5,10) to point (31,8).", hero.doMove(5,10,31,8));

        MoveStrategy horseRideStrategy = new HorseRideStrategy();
        hero.setMove(horseRideStrategy);
        assertEquals("The hero rode a horse from point (5,10) to point (31,8).", hero.doMove(5,10,31,8));
    }
}