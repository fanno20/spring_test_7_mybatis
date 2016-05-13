package com.hsh.p7;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsh.team.TeamDTO;
import com.hsh.team.TeamService;

@Controller
@RequestMapping("/team/*")
public class TeamController {

	@Inject
	private TeamService teamService;
	
	@RequestMapping("/testF")
	public void goTestF(){
		/*FileReader fr = new FileReader("");
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while((str=br.readLine())!= null){
			StringTokenizer st = new StringTokenizer(str, "");
			while(st.hasMoreTokens()){
				st.nextToken();
			}
		}
		int[] ga;
		for(int i=0;i<6;i++){
			
		}
		return "";*/
	}
	
	@RequestMapping("/test")
	public void goTest(@RequestParam("ga") String[] ga,@RequestParam("na") String[] na,@RequestParam("da") String[] da,Model model){
		teamService.insert(ga, na, da);
		model.addAttribute("chga", ga.length);
		model.addAttribute("chna", na.length);
		model.addAttribute("chda", da.length);
	}
	
	@RequestMapping("/createTeam")
	@ResponseBody
	public TeamDTO createTeam(@RequestParam String ch){
		System.out.println("test");
		TeamDTO teamDTO = teamService.createTeam(ch);
		return teamDTO;
	}
	
}
