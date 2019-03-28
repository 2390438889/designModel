package abstractfactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class AccessDepartment implements IDepartment {
    List<String> datas = new ArrayList<>();

    @Override
    public void add(String department) {
        System.out.println("向Access数据库部门表中插入了一条数据 :"+department);
        datas.add(department);

    }

    @Override
    public void remove(int id) {
        System.out.println("向Access数据库部门表中移除了一条数据 :"+id);
        datas.remove(id);
    }

    @Override
    public void update(int id,String department) {
        System.out.println("向Access数据库部门表中更新了一条数据 :"+id);
        datas.set(id,department);
    }

    @Override
    public List<String> query() {
        return datas;
    }
}
