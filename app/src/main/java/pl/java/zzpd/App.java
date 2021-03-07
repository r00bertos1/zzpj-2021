package pl.java.zzpd;

import pl.java.zzpj.Car;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Car model
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car();
        car.setModel(getProperty("carModel"));
        System.out.println(car.carInfo());
    }

    public static String getProperty(String propertyName) {
        Properties prop = new Properties();
        String filePath = "config.properties";
        try (InputStream resourceAsStream = App.class.getClassLoader().getResourceAsStream(filePath)) {
            prop.load(resourceAsStream);
        } catch (IOException e) {
            System.err.println("Unable to load properties file : " + filePath);
        }
        return prop.getProperty(propertyName);
    }
}
