package memento;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public interface Originator<T> {

    Memento<T> saveMemento();

    void recoverMemento(Memento<T> memento);

}
