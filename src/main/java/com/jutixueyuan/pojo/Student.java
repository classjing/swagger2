package com.jutixueyuan.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "这是学生对象")
public class Student {

    private Integer id;
    @ApiModelProperty(name = "userrname1",value = "用户名",example = "admin,zhangsan,lisi",required = true)
    private String username;
    private String password;
    private String phone;
}
