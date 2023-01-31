import com.google.Waiter;
import com.google.cook.impl.GuangdongCook;
import com.google.cook.impl.HubeiCook;
import com.google.cuisine.impl.GuangdongCuisine;
import com.google.cuisine.impl.HubeiCuisine;
import org.junit.Test;

import java.lang.reflect.WildcardType;

public class MyTest {
    @Test
    public void test() {
        GuangdongCuisine guangdongCuisine = new GuangdongCuisine(new GuangdongCook());
        HubeiCuisine hubeiCuisine = new HubeiCuisine(new HubeiCook());

        Waiter waiter = new Waiter();
        waiter.order(guangdongCuisine);
        waiter.order(hubeiCuisine);
        waiter.placeOrder();
    }
}
