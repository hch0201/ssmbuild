import com.zzuli.dao.BookMapper;
import com.zzuli.pojo.Book;
import com.zzuli.pojo.BookExample;
import com.zzuli.service.BookService;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author hch
 * @date 2022/3/31 - 12:17
 */

public class MyTest {
    @Test
    public void test() throws IOException {

        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();


        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //通过代理模式创建UserMapper接口的代理实现类对象
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，
        // 通过调用的方法名匹配 映射文件中的SQL标签，并执行标签中的SQL语句
        BookExample example = new BookExample();
        BookExample.Criteria criteria = example.createCriteria();
        criteria.andBNameEqualTo("Java");
        List<Book> books = mapper.selectByExample(example);
        //sqlSession.commit();
        System.out.println("结果："+books);
    }
}
