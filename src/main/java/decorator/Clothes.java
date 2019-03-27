package decorator;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc
 */
public class Clothes implements Decorate {

    private String name;

    private Decorate decorate;

    public Clothes(String name, Decorate decorate) {
        this.name = name;
        this.decorate = decorate;
    }

    public Clothes(String name) {
        this.name = name;
    }

    public String show() {

        if (null == decorate){
            return name;
        }
        return decorate.show()+","+name;
    }
}
