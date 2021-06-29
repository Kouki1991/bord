package jp.co.sss.bord.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.bord.entity.BuBord;
import jp.co.sss.bord.form.BordForm;
import jp.co.sss.bord.repository.BubordRepository;

@Controller
public class IndexController {
	
	@RequestMapping(path="/main")
	public String main() {
		return "main.html";
	}
	
	@Autowired
	BubordRepository repository;
	
	@RequestMapping(path = "/showAll", method=RequestMethod.GET)
	public String showBord(BordForm form, Model model) {
		model.addAttribute("bords", repository.findAll());
		return "main.html";
	}
	
	@RequestMapping(path="/Registration", method=RequestMethod.POST)
	public String RegBord(BordForm form) {
		BuBord bord = new BuBord();
		Date date = new Date();
		SimpleDateFormat d1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String sdate = d1.format(date);
		bord.setName(form.getName());
		bord.setMail(form.getMail());
		bord.setTitle(form.getTitle());
		bord.setWritedate(sdate);
		bord.setContents(form.getContents());
		
		repository.save(bord);
		
		return "redirect:/showAll";
	}

}
