package fanshe.basic.simpleClass;

import lombok.Data;

import java.util.Date;

/**
 * @Author 海东
 * @Date: 2021/9/2 11:38 下午
 * @Description:
 */
@Data
public class Emp {
    private String ename;
    private String job;
    private double salary;
    private long empno;
    private Date hiredate;

}
