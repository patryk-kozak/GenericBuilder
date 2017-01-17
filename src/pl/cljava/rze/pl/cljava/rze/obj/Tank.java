package pl.cljava.rze.pl.cljava.rze.obj;

/**
 * Created by pakz on 2017-01-17.
 */
public class Tank extends Vehicle {

    private boolean isArmed;
    private boolean isLegal;

    @Override
    public String getEngine() {
        return String.format("This tank has {0} engine and it is {1} wide", this.getEngineName(), this.getEngineCM());
    }

    public boolean isArmed() {
        return isArmed;
    }

    public void setArmed(boolean armed) {
        isArmed = armed;
    }

    public boolean isLegal() {
        return isLegal;
    }

    public void setLegal(boolean legal) {
        isLegal = legal;
    }
}
