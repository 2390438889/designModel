package prototype;

import strategy.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc
 */
public class Prototype implements Cloneable{

    private String name;

    private List<String> likes;

    private Experise experise;

    public Prototype(String name, List<String> likes, Experise experise) {
        this.name = name;
        this.likes = likes;
        this.experise = experise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLikes() {
        return likes;
    }

    public void setLikes(List<String> likes) {
        this.likes = likes;
    }

    public Experise getExperise() {
        return experise;
    }

    public void setExperise(Experise experise) {
        this.experise = experise;
    }

    @Override
    protected Object clone(){
        Prototype prototype = null;
        try {
            prototype = (Prototype)super.clone();
            prototype.likes = new ArrayList<String>(likes);
            prototype.experise = (Experise) experise.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", likes=" + likes +
                ", experise=" + experise +
                '}';
    }
}
