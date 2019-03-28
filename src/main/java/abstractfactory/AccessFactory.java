package abstractfactory;


/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class AccessFactory implements IFactory {


    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
