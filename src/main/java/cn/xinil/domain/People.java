package cn.xinil.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class People {
    @Autowired(required = false)
    private Cat cat;
    @Autowired(required = false)
    private Dog dog;
    public Cat getCat() {
        return cat;
    }
    public Dog getDog() {
        return dog;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}