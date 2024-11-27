package com.human.notice.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

public interface controller {

    public ModelAndView listCodeGroup(HttpServletRequest request, HttpServletResponse response) throws Exception;

    public ModelAndView detailCodeGroup(HttpServletRequest request, HttpServletResponse response) throws Exception;

    public ModelAndView codeGroupPage(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
