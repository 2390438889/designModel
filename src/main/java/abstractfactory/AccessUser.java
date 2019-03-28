package abstractfactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class AccessUser implements IUser {
    List<String> datas = new ArrayList<>();
    @Override
    public void insert(String value) {
        System.out.println("向Access数据库用户表中插入了一条数据 :"+value);
        datas.add(value);
    }

    @Override
    public void delete(int id) {
        try{
            System.out.println("向Access数据库用户表中移除了一条数据 :"+datas.get(id));
            datas.remove(id);
        }catch (Exception e){
            System.out.println("查无此数据");
        }

    }

    @Override
    public void update(int id,String value) {
        try{
            System.out.println("向Access数据库中用户表更新了一条数据 :"+datas.get(id));
            datas.set(id,value);
        }catch (Exception e){
            System.out.println("查无此数据");
        }
    }

    @Override
    public String query() {
        return datas.toString();
    }
}
