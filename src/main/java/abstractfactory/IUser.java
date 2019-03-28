package abstractfactory;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public interface IUser {

    void insert(String value);

    void delete(int id);

    void update(int id,String value);

    String query();
}
