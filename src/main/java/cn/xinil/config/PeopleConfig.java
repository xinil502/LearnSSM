package cn.xinil.config;

import cn.xinil.domain.Cat;
import cn.xinil.domain.Dog;
import cn.xinil.domain.People;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class PeopleConfig {

    @Bean
    public People people_1(){
        People people = new People();
        people.setCat(new Cat());
        people.setDog(new Dog());
        return people;
    }
}
