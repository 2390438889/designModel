package abstractfactory;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();
}
