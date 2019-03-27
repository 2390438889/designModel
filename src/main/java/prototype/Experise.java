package prototype;

import simplefactory.Operation;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc
 */
public class Experise implements Cloneable{

    private String time;

    private String thing;

    public Experise(String time, String thing) {
        this.time = time;
        this.thing = thing;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    @Override
    public String toString() {
        return "Experise{" +
                "time='" + time + '\'' +
                ", thing='" + thing + '\'' +
                '}';
    }

    @Override
    protected Object clone(){
        Object exception = null;
        try {
            exception = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return exception;
    }
}
