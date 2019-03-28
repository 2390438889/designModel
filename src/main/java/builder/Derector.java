package builder;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class Derector {

    private FriedRiceWithEgg friedRiceWithEgg;

    public Derector(FriedRiceWithEgg friedRiceWithEgg) {
        this.friedRiceWithEgg = friedRiceWithEgg;
    }

    public void friedRiceWithEgg(){
        friedRiceWithEgg.oil();
        friedRiceWithEgg.egg();
        friedRiceWithEgg.rice();
        friedRiceWithEgg.salt();
        friedRiceWithEgg.shallot();
        System.out.println("蛋炒饭炒好了，上菜！");
    }
}
