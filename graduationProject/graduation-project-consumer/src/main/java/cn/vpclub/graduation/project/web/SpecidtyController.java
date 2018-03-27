package cn.vpclub.graduation.project.web;

/*
* 描述：专业
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Specidty;
import cn.vpclub.graduation.project.service.SpecidtyService;
import cn.vpclub.moses.core.model.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/graduation/specidty")
public class SpecidtyController {
    @Autowired
    private SpecidtyService service;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public BaseResponse add(@RequestBody Specidty vo)
    {
        return service.add(vo);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public BaseResponse delete(@RequestBody Specidty vo)
    {
        return service.delete(vo);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public BaseResponse update(@RequestBody Specidty vo)
    {
        return service.update(vo);
    }

    @RequestMapping(value = "/query",method = RequestMethod.POST)
    public BaseResponse query(@RequestBody Specidty vo)
    {
        return service.query(vo);
    }

    @RequestMapping(value = "/selectAll",method = RequestMethod.POST)
    public BaseResponse selectAll(@RequestBody Specidty vo)
    {
        return service.selectAll(vo);
    }
}
