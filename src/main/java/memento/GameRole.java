package memento;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class GameRole implements Originator<GameRole>{
    /**
     * 攻击力
     */
    private double attack;

    /**
     * 防御力
     */
    private double defense;

    /**
     * 体力
     */
    private double vitality;

    public GameRole() {
        attack = 50;

        defense = 40;

        vitality = 100;
    }

    public void boss(){
        vitality = 0;
        defense = 20;
        attack = 30;
    }


    @Override
    public Memento<GameRole> saveMemento() {

        Memento<GameRole> memento = new GameRoleMemento();
        memento.save(this);
        return memento;
    }

    @Override
    public void recoverMemento(Memento<GameRole> memento) {
        memento.recover(this);
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getVitality() {
        return vitality;
    }

    public void setVitality(double vitality) {
        this.vitality = vitality;
    }

    @Override
    public String toString() {
        return "GameRole{" +
                "attack=" + attack +
                ", defense=" + defense +
                ", vitality=" + vitality +
                '}';
    }
}
