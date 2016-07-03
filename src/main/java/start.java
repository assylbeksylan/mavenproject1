
import java.io.Reader;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class start {

    public static void main(String args[]) {
        try {
            Reader reader = org.apache.ibatis.io.Resources.getResourceAsReader("newSpringXMLConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sqlSessionFactory.openSession();
            mybatis master = (mybatis) session.selectOne("masterMapper.selectMaster", 1);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
