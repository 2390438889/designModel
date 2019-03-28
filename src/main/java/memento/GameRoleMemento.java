package memento;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class GameRoleMemento implements Memento<GameRole> {

    private double via;

    private double attc;

    private double den;


    @Override
    public void save(GameRole gameRole) {
        via = gameRole.getVitality();
        attc = gameRole.getAttack();
        den = gameRole.getDefense();
    }

    @Override
    public void recover(GameRole gameRole) {
        gameRole.setAttack(attc);
        gameRole.setDefense(den);
        gameRole.setVitality(via);
    }
}
