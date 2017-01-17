package pl.cljava.rze.pl.cljava.rze.obj;

/**
 * Created by pakz on 2017-01-17.
 */
public abstract class Vehicle {

    private String engineName;
    private Long engineCM;

    public abstract String getEngine();

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public Long getEngineCM() {
        return engineCM;
    }

    public void setEngineCM(Long engineCM) {
        this.engineCM = engineCM;
    }
}
