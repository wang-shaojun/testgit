package cn.vpclub.graduation.project.web;

/*
* 描述：公告消息
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Notice;
import cn.vpclub.graduation.project.service.NoticeService;
import cn.vpclub.moses.core.model.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/graduation/notice")
public class NoticeController {
    @Autowired
    private NoticeService service;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public BaseResponse add(@RequestBody Notice vo)
    {
        return service.add(vo);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public BaseResponse delete(@RequestBody Notice vo)
    {
        return service.delete(vo);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public BaseResponse update(@RequestBody Notice vo)
    {
        return service.update(vo);
    }

    @RequestMapping(value = "/query",method = RequestMethod.POST)
    public BaseResponse query(@RequestBody Notice vo)
    {
        return service.query(vo);
    }

    @RequestMapping(value = "/selectAll",method = RequestMethod.POST)
    public BaseResponse selectAll(@RequestBody Notice vo)
    {
        return service.selectAll(vo);
    }
}
