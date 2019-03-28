package memento;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class Client {

    public static void main(String[] args) {

        GameRole gameRole = new GameRole();

        GameRoleCareTaker gameRoleCareTaker = new GameRoleCareTaker();

        //初始状态
        System.out.println(gameRole);

        //存档
        gameRoleCareTaker.save(gameRole.saveMemento());

        //查看状态
        System.out.println(gameRole);

        //打boss
        gameRole.boss();

        //查看状态
        System.out.println(gameRole);

        //回档
        gameRole.recoverMemento(gameRoleCareTaker.recover());

        //查看状态
        System.out.println(gameRole);
    }
}
