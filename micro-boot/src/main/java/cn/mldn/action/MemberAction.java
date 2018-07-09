package cn.mldn.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberAction {
	@RequestMapping("/loginPage")
	public String get() {
		return "member_login" ;
	}
	@RequestMapping("/pages/back/welcome")
	public String welcome() {
		return "back/welcome" ;
	}
}
