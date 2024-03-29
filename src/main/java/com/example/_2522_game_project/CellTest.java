package com.example._2522_game_project;

import org.junit.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.*;

/**
 * The Cell JUnit test suite.
 *
 * @author EunjeongHur
 * @version 230408
 */
public class CellTest {
    Cell cell = new Cell(5, 7, "white");
    Cell limeCell = new Cell(5, 8, "white");

    @Test
    public void open() {
        cell.open();
        StateType expectedStateType = StateType.OPENED;
        StateType actualStateType = cell.getState();
        assertEquals(expectedStateType, actualStateType);
    }

    @Test
    public void isLime() {
        limeCell.setLime(true);
        assertFalse(cell.isLime());
        assertTrue(limeCell.isLime());
    }

    @Test
    public void setLime() {
        limeCell.setLime(false);
        assertFalse(limeCell.isLime());

        limeCell.setLime(true);
        assertTrue(limeCell.isLime());
    }

    @Test
    public void getState() {
        cell.setState(StateType.FLAGGED);
        assertEquals(StateType.FLAGGED, cell.getState());
    }

    @Test
    public void setState() {
        cell.setState(StateType.UNOPENED);
        assertEquals(StateType.UNOPENED, cell.getState());
    }

    @Test
    public void setNeighbourLimes() {
        cell.setNeighbourLimes(3);
        assertEquals(3, cell.getNeighbourLimes());
    }

    @Test
    public void getNeighbourLimes() {
        cell.setNeighbourLimes(1);
        assertEquals(1, cell.getNeighbourLimes());
    }

    @Test
    public void getRow() {
        assertEquals(7, cell.getRow());
        assertEquals(8, limeCell.getRow());
    }

    @Test
    public void getColumn() {
        assertEquals(5, cell.getColumn());
        assertEquals(5, limeCell.getColumn());
    }
}