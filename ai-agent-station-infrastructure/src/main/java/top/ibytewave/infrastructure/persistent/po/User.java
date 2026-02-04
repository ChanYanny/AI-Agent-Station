package top.ibytewave.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Long id;
    private String name;
    private Integer age;
    private Date createTime;
    private Date updateTime;

}
