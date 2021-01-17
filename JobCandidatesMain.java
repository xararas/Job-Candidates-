//package com.bham.pij.assignments.candidates;

//Charalampos 2165173

import java.io.IOException;
public class JobCandidatesMain 
{

	public static void main(String[] args) throws IOException 
	{
		CleaningUp clean = new CleaningUp();

		clean.cleanUpFile();
		
		CandidatesToInterview cand = new CandidatesToInterview();
		
		cand.findCandidates();
		
		cand.candidatesWithExperience();
		
		cand.createCSVFile();
		
		cand.createReport();

	}

}
