package strategy;

import java.util.Arrays;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc
 */
public class Client {

    public static void main(String[] args) {
        String[] titles = new String[]{
                "商品名称","单价","数量","活动"
        };
        Product[] products = new Product[]{
                new Product("白菜",20,20,"打八折"),
                new Product("变形金刚玩具",100,3,"满300减100"),
                new Product("作业本",300,1,"正常价格")
        };

        System.out.println(String.join("\t",titles));
        for (Product product : products) {
            System.out.println(product+"\t 实际价格"+CashContext.getRealMoney(product.getCash(),product.getMoney()*product.getCount()));
        }
    }
}
