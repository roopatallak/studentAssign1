package com.genspark.studentAssign1;

import com.genspark.studentAssign1.entity.Address;
import com.genspark.studentAssign1.entity.Student;
import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.web.XmlBeamHttpMessageConverter;

public class StudentBeanMethod {
    public static void main(String[] args) {
        Resource res = new ClassPathResource("applicationContext.xml");
        XmlBeanFactory bf = new XmlBeanFactory(res);

        //Address a = (Address) bf.getBean("st_address");
        //System.out.println(a.getCity());

        Student st = (Student) bf.getBean("student");
        System.out.println(st.getAdd().getCity());

        Student st2 = (Student) bf.getBean("st2");
        System.out.println("Student 2" + st2.getName() + " : " + st2.getAdd().getCity() + st2.getPh());
    }
}
