package test;

import com.bjpowernode.pojo.User;
import com.bjpowernode.service.UserService;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author deuses
 * @creat 2022-09-01 21:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext_mapper.xml","classpath:applicationContext_service.xml"})
public class MyTest {

    @Autowired
    UserService userService;

    @Test
    public void testSelectUserPage(){
        List<User> list = userService.selectUserPage(null,"男",1,5);
        list.forEach(System.out::println);
    }

    @Test
    public void testGetRowCount(){
        int num = userService.getRowCount("三",null);
        System.out.println(num);
    }

    @Test
    public void testDeleteUserById(){
        int num = userService.deleteUserById("1");
        System.out.println(num);
    }

    @Test
    public void testCreateUser(){
        int num = userService.createUser(new User("2","2","3","4","5",6,"7"));
        System.out.println(num);
    }

    @Test
    public void testUpdateUserById(){
        int num = userService.updateUserById(new User("1","1","1","1","1",1,"1"));
    }

    @Test
    public void testDeleteUserByIdList(){
    }

    @Test
    public void testId(){
        String id = String.valueOf(System.currentTimeMillis());
        int num = (int)(Math.random()*9000 + 1000);
        System.out.println(num);
        for (int i = 0; i < 100000 ; i++) {
            int result = (int)(Math.random()*9000 + 1000);
            if (result < 1000 || result > 9999){
                System.out.println("=======================");
            }
        }
        id += num;
        System.out.println(id);
        Date date = new Date();
        long l = 1596816208736L;
        date.setTime(l);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sf.format(date));
    }
}
