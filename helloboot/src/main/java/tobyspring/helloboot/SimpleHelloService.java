package tobyspring.helloboot;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class SimpleHelloService implements HelloService {
    @Override
    public String sayHello(String name){
        return "Hello " + name;
    }
}
