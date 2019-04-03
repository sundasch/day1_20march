package day4_25march_111099_fs;

import java.util.Scanner;

public class Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private String name;
	private String country;
	private Skill skill = new Skill();
	Scanner newscan = new Scanner(System.in);
	name = newscan.next();
	country = newscan.next();
	skill = newscan.next();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	private static String playerDetails(name,country,skill){
		
	}
	
}

}
