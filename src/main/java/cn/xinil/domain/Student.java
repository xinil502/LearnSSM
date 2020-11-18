package cn.xinil.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int sssid;
    private String name;

    //外键
//    private Teacher teacher;
    private int tid;
}
