package study.controller.bit.study.day0428;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import data.dto.ShopDto;

@Controller
public class StudyFormController {

	@GetMapping("/form1")
	public String goForm1()
	{
		return "form/testform1";
	}
	
	@GetMapping("/read1")
	public ModelAndView goRead1(
			/*@RequestParam 은 생략은 가능하나 정확히 써주는게 좋다*/
			@RequestParam String name,
			@RequestParam String ipsa,

			//			@RequestParam (required = false) String pageNum
			/*값이 안넘어오더라도 오류가 안나도록 한다*/
			
			@RequestParam (defaultValue = "10") String pageNum 
			/*값이 없을경우 기본값이 10이 됨*/
			)
	{
		ModelAndView mview = new ModelAndView();
		String result = name +" 님의 입사일은 "+ipsa+"입니다.";
		mview.addObject("pageNum", pageNum);
		mview.addObject("result",result);
		mview.setViewName("result/view1");
		return mview;
	}
	///////////////////////////////////
	@GetMapping("/form2")
	public String goForm2() 
	{
		return "form/testform2";
	}
	
	@PostMapping("/read2")
	public String goRead2(Model model,
			@RequestParam String name,
			@RequestParam String gender,
			@RequestParam ("address") String a)/*폼태그의 name과 변수명이 다른 경우*/
	{
		model.addAttribute("name", name);
		model.addAttribute("gender", gender);
		model.addAttribute("address", a);
		
		return "result/view2";
	}
	
	@GetMapping("/form3")
	public String goForm3()
	{
		return "form/testform3";
	}
	
	@PostMapping("/read3")
	public String goRead3(@ModelAttribute ShopDto dto) //dto 통째로 읽어오기
	{	//@ModelAttribute 는 model 에 shopDto 라는 이름으로 저장되어있다 
		System.out.println(dto.getSang());
		return "result/view3";
	}
}
