package com.hsh.team;

public interface TeamDAO {

	public void insert(String[] ga, String[] na, String[] da) throws Exception;
	
	public TeamDTO createTeam(String ch) throws Exception;
	
}
