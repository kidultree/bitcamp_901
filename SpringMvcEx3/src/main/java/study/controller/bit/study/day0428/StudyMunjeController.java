package study.controller.bit.study.day0428;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import data.dto.PersonDto;

@Controller
public class StudyMunjeController {

	@GetMapping("/form/munje")
	public String goForm5()
	{
		return "form/testform5";
	}
	
	@PostMapping("/form/result")
	public ModelAndView result(@ModelAttribute PersonDto dto)
	{	
		ModelAndView mview = new ModelAndView();
		//????, ???? ????
		int tot = dto.getJava()+dto.getSpring();
		double avg = tot/2.0;
		mview.addObject("tot", tot);
		mview.addObject("avg", avg);
		
		mview.setViewName("result/view5");
		return mview;
	}
}

