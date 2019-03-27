package decorator;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc
 */
public class Person {

    private String name;

    private Decorate decorate;

    public Person(String name, Decorate decorate) {
        this.name = name;
        this.decorate = decorate;
    }

    @Override
    public String toString() {
        return name+"穿上了："+decorate.show();
    }
}
