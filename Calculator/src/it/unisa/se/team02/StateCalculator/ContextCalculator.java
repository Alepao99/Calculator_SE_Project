package it.unisa.se.team02.StateCalculator;

/**
 *
 * @author Team02
 */
public class ContextCalculator {

    private State state;

    public ContextCalculator() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
