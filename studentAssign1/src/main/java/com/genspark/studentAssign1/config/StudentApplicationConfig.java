package com.genspark.studentAssign1.config;

import com.genspark.studentAssign1.entity.Address;
import com.genspark.studentAssign1.entity.Phone;
import com.genspark.studentAssign1.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentApplicationConfig {

    @Bean(name="address")
    public Address getAddress() {
        Address address = new Address();
        address.setCity("Suwanee");
        address.setState("Georgia");
        address.setZipcode("30024");
        address.setCountry("USA");
        return address;
    }

    @Bean(name="phone")
    public List<Phone> getPhone() {
        Phone ph1 = new Phone();
        ph1.setMob("111-222-3333");

        Phone ph2 = new Phone();
        ph2.setMob("444-555-6666");

        List<Phone> mobs = new ArrayList<Phone>();
        mobs.add(ph1);
        mobs.add(ph2);

        return mobs;
    }

    @Bean(name="student")
    public Student getStudent() {
        Student stu = new Student();
        stu.setId(1);
        stu.setAdd(getAddress());
        stu.setPh(getPhone());
        stu.setName("Veena");
        return stu;
    }
}
