package abstractfactory;


/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class MySQLFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new MySQLUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new MySQLDepartment();
    }
}
