package com.mashibing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {

    /**
     * @PathVariable
     * 在路径中要使用{变量名称}
     * 在方法参数中可以添加@PathVarable做识别，如果路径中的名称跟参数的名称不一致的时候，可以添加路径中的变量，推荐添加
     *
     * @param name
     * @param id
     * @return
     */
    @RequestMapping("/testPathVariable/{id}/{name}")
    public String testPathVariable(@PathVariable("id") Integer id, @PathVariable String name){
//        request.getParamter("name")
        System.out.println(name);
        System.out.println(id);
        return "hello";
    }
}
