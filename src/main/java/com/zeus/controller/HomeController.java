package com.zeus.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.java.Log;

@Log
@Controller // -> Component : 객체를 만들어달라는 뜻, 하지만 기능을 알려주기 위해
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	// 이미 객체가 만들어져있어서 클래스 로딩 및 오버라이딩 하고 할 필요 없음
	// 화면으로 돌려주느 값 -> 아래 함수의 String 값
	public String home(Locale locale, Model model) {
		log.info("환영합니다 여기는 " + locale + " 입니다");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formatterDate = dateFormat.format(date);

		// request와 같다
		model.addAttribute("serverTime", formatterDate);
		return "home"; // /WEB-INF/views/가 앞에 붙음
	}
}
