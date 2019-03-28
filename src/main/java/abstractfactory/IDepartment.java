package abstractfactory;

import java.util.List;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public interface IDepartment {

    void add(String department);

    void remove(int id);

    void update(int id,String department);

    List<String> query();
}
