package memento;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class GameRoleCareTaker implements CareTaker<GameRole> {

    private Memento<GameRole> memento;
    @Override
    public void save(Memento<GameRole> memento) {
        this.memento = memento;
    }

    @Override
    public Memento<GameRole> recover() {
        return this.memento;
    }
}
