import com.helloWorld.DummyService;
import com.helloWorld.DummyServiceImpl;

public class HelloWorld {

    public static void main(String[] args){
        DummyService dummyService = new DummyServiceImpl();
        System.out.println(" com.HelloWorld.DummyService returned: " + dummyService.test());
    }
}
