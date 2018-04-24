package edu.dickerson.dillon;

import net.sf.json.JSONObject;

public class MapLogic {

	static public String mapToLetterGrade(double grade) {
		String letterGrade = "E";
		if (grade < 0.0) letterGrade = "I";
		if (grade >= 60.0) letterGrade = "D";
		if (grade >= 70.0) letterGrade = "C";
		if (grade >= 77.0) letterGrade = "C+";
		if (grade >= 80.0) letterGrade = "B-";
		if (grade >= 83.0) letterGrade = "B";
		if (grade >= 88.0) letterGrade = "B+";
		if (grade >= 90.0) letterGrade = "A-";
		if (grade >= 93.0) letterGrade = "A";
		if (grade >= 98.0) letterGrade = "A+";
		JSONObject jsonObj = new JSONObject().element("lettergrade", letterGrade);
		return jsonObj.toString();
	}
	
	static public String error(Exception e) {
		JSONObject jsonObj = new JSONObject().element("error", e.toString());
		return jsonObj.toString();
	}
}
