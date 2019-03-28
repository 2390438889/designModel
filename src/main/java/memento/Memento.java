package memento;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public interface Memento<T> {

    void save(T t);

    void recover(T t);
}
