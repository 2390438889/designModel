package strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc
 */
public class CashContext {

    private static Map<String,CashSuper> cash;

    static {
        cash = new HashMap<String, CashSuper>();
        cash.put("打八折", new CashRebate(8));
        cash.put("满300减100", new CashReturn(300, 100));
        cash.put("正常价格", new CashNormal());
    }

    public static double getRealMoney(String type,double mongey){
        return cash.get(type).acceptCash(mongey);
    }
}
