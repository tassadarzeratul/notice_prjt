package com.human.notice.controller;

import com.human.notice.service.NoticeService;
import com.human.notice.vo.NoticeVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller("codeGroupController")
public class CodeGroupControllerImpl implements NoticeController {

    @Autowired
    private NoticeService codeGroupService;

    @Autowired
    private NoticeService codeGroupVO;

    @Override
    /* 코드의 명확성을 위해 RequestMapping 대신 GetMapping 사용 */
    /*@RequestMapping(value = "/code/listCodeGroup.do", method = RequestMethod.GET)
    public ModelAndView listCodeGroup(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List codeGroupList = codeGroupService.listCodeGroup();
        ModelAndView mav = new ModelAndView("/code/listCodeGroup");

        mav.addObject("codeGroupList", codeGroupList);
        return mav;
    }*/
    @GetMapping("/code/listCodeGroup.do")
    public ModelAndView listCodeGroup(HttpServletRequest request, HttpServletResponse response) throws Exception {

        List codeGroupList = codeGroupService.listCodeGroup();
        ModelAndView mav = new ModelAndView("/code/listCodeGroup");
        mav.addObject("codeGroupList", codeGroupList);
        return mav;
    }

    @Override
    @GetMapping("/code/detailCodeGroup.do")
    public ModelAndView detailCodeGroup(HttpServletRequest request, HttpServletResponse response) throws Exception {

        List codeGroupList = codeGroupService.detailCodeGroup();
        ModelAndView mav = new ModelAndView("/code/detailCodeGroup");
        mav.addObject("codeGroupList", codeGroupList);
        return mav;
    }

    @Override
    @GetMapping("/code/codeGroup.do")
    public ModelAndView codeGroupPage(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView("/code/codeGroup");
        return mav;
    }

}