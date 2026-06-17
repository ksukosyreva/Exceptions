import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {

    @Test
    public void shouldRemoveIfProductIdExist() {
        ShopRepository repository = new ShopRepository();
        Product product1 = new Product(3, "Книга", 400);
        Product product2 = new Product(55, "Тетрадь", 150);
        Product product3 = new Product(41, "Ручка", 65);

        repository.add(product1);
        repository.add(product2);
        repository.add(product3);
        repository.remove(41);

        Product[] expected = {product1, product2};
        Product[] actual = repository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldThrowsExceptionIfProductIdDoesNotExist() {
        ShopRepository repository = new ShopRepository();
        Product product1 = new Product(5, "Фотоальбом", 750);
        Product product2 = new Product(65, "Рамка", 220);
        Product product3 = new Product(71, "Стикер", 40);

        repository.add(product1);
        repository.add(product2);
        repository.add(product3);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repository.remove(40);
        });
    }
}
