package cn.vpclub.graduation.project.web;

/*
* 描述：团队
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Team;
import cn.vpclub.graduation.project.service.TeamService;
import cn.vpclub.moses.core.model.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/graduation/team")
public class TeamController {
    @Autowired
    private TeamService service;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public BaseResponse add(@RequestBody Team vo)
    {
        return service.add(vo);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public BaseResponse delete(@RequestBody Team vo)
    {
        return service.delete(vo);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public BaseResponse update(@RequestBody Team vo)
    {
        return service.update(vo);
    }

    @RequestMapping(value = "/query",method = RequestMethod.POST)
    public BaseResponse query(@RequestBody Team vo)
    {
        return service.query(vo);
    }

    @RequestMapping(value = "/selectAll",method = RequestMethod.POST)
    public BaseResponse selectAll(@RequestBody Team vo)
    {
        return service.selectAll(vo);
    }
}
