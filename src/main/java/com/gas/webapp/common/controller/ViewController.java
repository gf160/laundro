package com.gas.webapp.common.controller;

import com.gas.common.AppGlobal;
import com.gas.common.CommonController;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 * 공통 페이지 처리
 */
@Controller
public class ViewController extends CommonController {
	/**====================================
	 * 	공통
	 ====================================*/
	private static final Logger logger = Logger.getLogger(ViewController.class);	

	//spring-servlet.xml에 설정된 값으로 인해
	//  /WEB-INF/view/main.jsp를 열어줌
	@RequestMapping(value="main.do")
	public void main(Model model) {
		setBaseInfo(model);
	}

	//spring-servlet.xml에 설정된 값으로 인해
	//  /WEB-INF/view/main/sample.jsp를 열어줌
	@RequestMapping(value="/main/sample.do")
	public void sample(Model model) {
		setBaseInfo(model);
	}

	@RequestMapping(value="/main/dropOff.do")
	public void dropOff(Model model) {
	    setBaseInfo(model);
	}

	/**
	 * @Method manager
	 * @Date 2022. 11. 5.
	 * @Writter GTP
	 * @Return void
	 * @Discript 메뉴추가 등 관리자 페이지
	 */
	@RequestMapping(value = "/admin/manager.do")
	public void manager(Model model) {
		setBaseInfo(model);
	}

    @RequestMapping(value="/main/takeOut.do")
    public void takeOut(Model model) {
        setBaseInfo(model);
    }
}
