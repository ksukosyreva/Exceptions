import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void shouldSetPrice() {
        Product product = new Product(27, "Хлеб", 50);
        product.setPrice(60);

        int expected = 60;
        int actual = product.getPrice();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTitle() {
        Product product = new Product(45, "Дыня", 300);
        product.setTitle("Дыня Колхозница");

        String expected = "Дыня Колхозница";
        String actual = product.getTitle();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPrice() {
        Product product = new Product(57, "Тетрадь", 100);

        int expected = 100;
        int actual = product.getPrice();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetTitle() {
        Product product = new Product(22, "Тетрадь1", 130);

        String expected = "Тетрадь1";
        String actual = product.getTitle();

        Assertions.assertEquals(expected, actual);
    }
}