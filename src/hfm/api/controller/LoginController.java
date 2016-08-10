package hfm.api.controller;

import java.io.PrintWriter;

import javax.annotation.Resource;

import hfm.api.service.*;

import org.apache.catalina.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Scope("session")
@Controller
@RequestMapping("/login")
public class LoginController {
	@Resource(name = "loginServiceImpl")
	private LoginService loginService;
	
	public LoginController(){
		System.out.println("LoginController initiated.");
	}
	
	@RequestMapping("/show_login_page")
	public String login() {
		return "login";
	}
	
	@ResponseBody
	@RequestMapping("/validate_user")
	public boolean validate_user(User user) {
		System.out.println(user.getUsername());
		boolean result = this.loginService.validateUser();
		return result;
	}
	
	@RequestMapping("/memberlist")
	public String memberlist() {
		return "memberlist/memberlist";
	}
	
	@RequestMapping("/loadData")
	public String loadData(String userName, String pwd, String cluster, String app, String file_name) {
		//LoadData ld = new LoadData();
		//ld.load2HFM(userName, pwd, cluster, app, file_name);
		return "memberlist/hello";
	}

	// pass the parameters to front-end using ajax
	@RequestMapping("/getPerson")
	public void getPerson(String name, PrintWriter pw) {
		pw.write("hello," + name);
	}

}
