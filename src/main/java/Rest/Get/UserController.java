package Rest.Get;

import Rest.Model.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController 
{
	
	 @RequestMapping("/")
	 public String index() 
	 {
	      return "AddUser";
	   }
	
	 
	 @RequestMapping("/login")
	   public String login() 
	 {
	      return "Login";
	   }
	 
	 
        @GetMapping("/getUserDetails")
	   public ResponseEntity<ArrayList> GetUserDetails(@RequestParam("username")String name,@RequestParam("password")String psw)
	   {
        	User u=new User();
        	u.setFirstname("abc");
        	u.setLastname("def");
        	u.setAge(20);
        	
        	
        	User u1=new User();
        	u1.setFirstname("abc");
        	u1.setLastname("def");
        	u1.setAge(20);
        	
        	ArrayList alist=new ArrayList();
        	
        	alist.add(u);
        	alist.add(u1);
        	
        	return ResponseEntity.ok(alist);
        	
		   //System.out.println("Return UserDetails from here");
	   }
        @PostMapping("/AddUser")
        
        public void AddUsers()
        {
        	System.out.println("Add User Details");
        }
	
}
