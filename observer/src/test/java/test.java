import com.google.CurrentConditionsDisplay;
import com.google.MaxConditionDisplay;
import com.google.WeatherData;
import org.junit.Test;

public class test {
    @Test
    public void test1() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        MaxConditionDisplay maxConditionDisplay = new MaxConditionDisplay();
        weatherData.addObserver(currentConditionsDisplay);
        weatherData.addObserver(maxConditionDisplay);
        weatherData.setData(20, 30, 40);
        weatherData.setData(60, 20, 55);
    }
}
