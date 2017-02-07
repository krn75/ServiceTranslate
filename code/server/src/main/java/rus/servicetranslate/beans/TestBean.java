package rus.servicetranslate.beans;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Ruslan on 07/02/17.
 */
@Component
public class TestBean {

    @Autowired
    private SessionFactory sessionFactory;

    public void test(){
        System.out.println("sf"+sessionFactory);
    }
}
