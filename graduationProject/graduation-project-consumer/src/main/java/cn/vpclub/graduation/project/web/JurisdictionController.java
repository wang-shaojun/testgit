package cn.vpclub.graduation.project.web;

/*
* 描述：权限角色
* 作者：王少军
* 日期：2018年03月15日
* */

import cn.vpclub.graduation.project.entity.Jurisdiction;
import cn.vpclub.graduation.project.service.JurisdictionService;
import cn.vpclub.moses.core.model.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/graduation/jurisdiction")
public class JurisdictionController {
    @Autowired
    private JurisdictionService service;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public BaseResponse add(@RequestBody Jurisdiction vo)
    {
        return service.add(vo);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public BaseResponse delete(@RequestBody Jurisdiction vo)
    {
        return service.delete(vo);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public BaseResponse update(@RequestBody Jurisdiction vo)
    {
        return service.update(vo);
    }

    @RequestMapping(value = "/query",method = RequestMethod.POST)
    public BaseResponse query(@RequestBody Jurisdiction vo)
    {
        return service.query(vo);
    }

    @RequestMapping(value = "/selectAll",method = RequestMethod.POST)
    public BaseResponse selectAll(@RequestBody Jurisdiction vo)
    {
        return service.selectAll(vo);
    }
}
