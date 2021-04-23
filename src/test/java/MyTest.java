import com.lixinzhuang.pojo.Book;
import com.lixinzhuang.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("bookServiceImpl");
        for(Book book : bookServiceImpl.queryAllBook()) {
            System.out.println(book);
        }

    }
}
