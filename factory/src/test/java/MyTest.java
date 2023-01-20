import com.google.factoryMethod.CatStore;
import com.google.factoryMethod.DogStore;
import com.google.factoryMethod.Pet;
import com.google.factoryMethod.Store;
import org.junit.Test;

public class MyTest {
    @Test
    public void test() {
        Store dogStore = new DogStore();
        Pet sushi = dogStore.createPet("sushi");
        dogStore.orderPet(sushi);

        Store catStore = new CatStore();
        Pet yuumi = catStore.createPet("yuumi");
        catStore.orderPet(yuumi);
    }
}
