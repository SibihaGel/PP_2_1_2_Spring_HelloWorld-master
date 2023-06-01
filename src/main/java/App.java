import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld tree =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld leaf =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat one =
                (Cat) applicationContext.getBean("cat");
        Cat two =
                (Cat) applicationContext.getBean("cat");

        System.out.println("Пара HelloWorld - " + (tree == leaf));
        System.out.println("Пара Сat- " + (one == two));
    }
}