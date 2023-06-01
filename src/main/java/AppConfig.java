import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name="helloworld")
    @Scope ("singleton")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean(name = "cat")
    @Scope ("prototype") // request Ограничивает одно определение компонента жизненным циклом одного HTTP-запроса.
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setMessage("Мяууу");
        return cat;
    }
}