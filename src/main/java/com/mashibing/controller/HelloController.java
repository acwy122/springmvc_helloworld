package com.mashibing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * springmvc处理过程
 *     1、浏览器发送请求http://localhost:8080/hello
 *     2、首先交给tomcat容器
 *     3、在web.xml文件中配置了DispatcherServlet的类，所以此时会由当前的DispatcherServlet来接收请求
 *     4、接收到请求之后找到对应的controller，去controller中寻找@RequestMapping注解标识的方法
 *     5、找到匹配的方法之后，执行方法的逻辑
 *     6、处理完成之后需要返回一个前端页面的名称
 *     7、由视图处理器来根据名称映射到对应的jsp页面的路径
 *     8、DispatcherServlet拿到对应的路径地址之后返回给浏览器
 *
 */
@Controller
@RequestMapping("hello")
public class HelloController {


    /**
     * @RequestMapping  用来匹配当前方法要处理的请求，其中/可以写也可以不写，推荐写上
     * 可以添加在类上，也可以添加在方法上
     * 当添加在类上的时候表示给所有的当前类的方法添加一个访问路径
     * 方法：http://localhost:8080/hello
     * 类：http://localhost:8080/hello/hello
     * 当添加在类上的时候表示给所有的当前类的方法前添加一个访问路径
     * 什么时候需要在类上添加此注解？
     * 当包含多个Controller，通过在不同的controller中包含同名的请求的时候，需要添加
     *
     * @param map
     * @return
     */
    @RequestMapping("/hello")
    public String hello(Map<String,String> map){
        System.out.println(this.getClass().getName());
        map.put("hello","hello,springmvc");
        return "hello";
    }
}
