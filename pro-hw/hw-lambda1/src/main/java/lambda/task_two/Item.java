package lambda.task_two;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

/**
 * Создайте `класс Item` с полями названия товара и стоимости
 * товара.
 */

@Setter
@Getter
@ToString
public class Item implements Comparable{
    private String article;
    private int price;

    /**
     * Please, enter price in cents. Ex: 23.45 $ = 2345.
     * @param article String, name of item.
     * @param price int.
     */
    public Item(String article, int price) {
        this.article = article;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (Double.compare(price, item.price) != 0) return false;
        return Objects.equals(article, item.article);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = article != null ? article.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(Object o) {
        return this.hashCode() - o.hashCode();
    }
}
