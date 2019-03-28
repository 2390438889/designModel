package memento;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public interface CareTaker<T> {

    void save(Memento<T> memento);

    Memento<T> recover();
}
