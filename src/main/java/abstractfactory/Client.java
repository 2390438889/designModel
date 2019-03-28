package abstractfactory;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class Client {
    public static void main(String[] args) {
        IFactory dataFactory = DataFacotry.createDataFactory();
        IUser user = dataFactory.createUser();
        IDepartment department = dataFactory.createDepartment();
        user.insert("value1");
        user.insert("value2");
        user.insert("value3");
        user.insert("value4");
        user.delete(1);
        user.update(2, "value5");
        System.out.println(user.query());

    }
}
