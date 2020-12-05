package com.jutixueyuan.api;

import com.jutixueyuan.annotation.SwaggerUIAnncation;
import com.jutixueyuan.pojo.Student;
import com.jutixueyuan.pojo.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * 此控制的所有方法都给前端提供API的方法
 */
/*@Controller
@ResponseBody*/
@RestController
@RequestMapping("/student")
@Api(description = "学生API",tags = {"这是学生api的tags1"})
public class StudentController {

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    //@RequestMapping(value = "/selectById",method = RequestMethod.GET)
    @GetMapping("selectById")
    @SwaggerUIAnncation
    @ApiOperation(value = "这是根据主键id查询学生信息",notes = "记住要传id哟")
    public Student selectById(@ApiParam(value = "根据主键id查询学生信息",required = true) Integer id) {

        return new Student(id, "小红学生", "xm123", "123213213123");

    }

    @PostMapping("/login")

    /*参数的统一配置说明*/
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username",value = "这是账号！！",required = true),
            @ApiImplicitParam(name = "password",value = "这是密码！！",required = true),
    })
    public Student login( String username,
                         String password){

        return new Student(1, "小芳", "xm123", "123213213123");

    }

    @PostMapping("/insert")
    public Student insert(Student student){
        return student;
    }

    @PostMapping("/update")
    @ApiIgnore //忽略生成API文档
    public Student update(Student student){
        return student;
    }

}
