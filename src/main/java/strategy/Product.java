package strategy;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc
 */
public class Product {

    private String name;

    private double money;

    private int count;

    private String cash;

    public Product(String name, double money, int count, String cash) {
        this.name = name;
        this.money = money;
        this.count = count;
        this.cash = cash;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t%s\t%s",name,money,count,cash);
    }
}
