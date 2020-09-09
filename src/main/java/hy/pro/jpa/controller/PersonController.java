package hy.pro.jpa.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import hy.pro.jpa.model.Person;
import hy.pro.jpa.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Controller
@Slf4j
public class PersonController {
	private final PersonService ser;
	
	@GetMapping("")
	public String homePage(Model model) {
		model.addAttribute("person", new Person());
		return "makePerson";
	}
	
	@GetMapping("/person")
	public String getPagePerson(Model model) {
		model.addAttribute("persons", ser.getAllPerson());
		return "result";
	}
	
	@PostMapping("/person")
	public String addPagePerson(@ModelAttribute Person person, Model model) {
		ser.createPerson(person);
		model.addAttribute("persons", ser.getAllPerson());
		return "redirect:/person";
	}
	
	@GetMapping("/person/delete/{id}")
	public String deletePagePerson(@PathVariable Long id) {
		ser.deletePerson(id);
		return "redirect:/person"; // 9
	}
	// 사용자 정보를 가지고 와서 화면에 뿌리기
	@GetMapping("/person/update/{id}")
	public String updatePagePerson(@PathVariable Long id, Model model) {
		model.addAttribute("person", ser.getPerson(id));
		return "updatePerson"; 
	}
	@PostMapping("/person/updatePerson")
	public String updatePerson(@ModelAttribute Person person, Model model) {
		ser.updatePerson(person);
		return "redirect:/person";
	}
}
