package com.main.Springboot.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.main.Springboot.Dao.MemberRepository;
//import com.main.Springboot.Model.MemberAccountJPA;
import com.main.Springboot.Model.MemberModel;
import com.main.Springboot.Model.ResponseCheckPwModel;
import com.main.Springboot.Service.MemberService;

@RestController
@RequestMapping("/memberApi/v1")
public class MemberApiController {
	
	@Autowired
	MemberService memberService;
	
//	@Autowired
//	MemberRepository memberRepository;
	
	@RequestMapping("")
	public String introdApi() {
		String introduction = "This is an simple introduction of member API version 1."
							+ "\n/memberApi/v1/memberInfo?account={account}&password={password}: it will return member information."
							+ "\n/memberApi/v1/checkPassword/{password}: it will check the password rules, for example:"
							+ "\n	⦁Must consist of a mixture of lowercase letters and numerical digits only, with at least one\n" + 
							"of each."
							+ "\n	⦁Must be between 5 and 12 characters in length."
							+ "\n	⦁Must not contain any sequence of characters immediately followed by the same sequence.";
		
		return introduction;
	}
	
	@GetMapping("/memberInfo")
	public MemberModel getMemberInfo(@RequestParam Map<String,String> requestParams) throws Exception {
		MemberModel member = new MemberModel();
		member.setAccount(requestParams.get("account"));
		member.setPassword(requestParams.get("password"));
		return member;
	}
	
	@RequestMapping(value = "/checkPassword/{password}", produces = {"application/json"})
	public ResponseCheckPwModel checkPwRules(@PathVariable String password) throws Exception  {
		return memberService.checkPassword(password);
	}
	
	@PostMapping("/newMember")
	public void newMember() {
		
	}
	
	@GetMapping("/login")
	public String login() { //@ModelAttribute MemberAccountJPA memberAccountJPA
		return "login";
	}
	
	@PostMapping("/doLogin")
	public String doLogin() {//@ModelAttribute MemberAccountJPA memberAccountJPA
//		System.out.println(memberRepository.findMemberAccount(memberAccountJPA.getEmail(), memberAccountJPA.getPassword()));
		return "welcome";
	}
	
//	@GetMapping
//	public List<MemberModel> getAllMembers(){
//		List<MemberModel> memberList = new ArrayList<MemberModel>();
//		return memberList;
//	}
}
