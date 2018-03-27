package cn.vpclub.graduation.project.web;

/*
* 描述：课程
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Curriculum;
import cn.vpclub.graduation.project.service.CurriculumService;
import cn.vpclub.moses.core.model.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/graduation/curriculum")
public class CurriculumController {
    @Autowired
    private CurriculumService service;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public BaseResponse add(@RequestBody Curriculum vo)
    {
        return service.add(vo);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public BaseResponse delete(@RequestBody Curriculum vo)
    {
        return service.delete(vo);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public BaseResponse update(@RequestBody Curriculum vo)
    {
        return service.update(vo);
    }

    @RequestMapping(value = "/query",method = RequestMethod.POST)
    public BaseResponse query(@RequestBody Curriculum vo)
    {
        return service.query(vo);
    }

    @RequestMapping(value = "/selectAll",method = RequestMethod.POST)
    public BaseResponse selectAll(@RequestBody Curriculum vo)
    {
        return service.selectAll(vo);
    }
}
