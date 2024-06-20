package com.telusko.QuizApp;

import java.util.Scanner;

public class QuestionService {

	//Assuming 5 questions
	Question[] questions = new Question[5];
	
	public QuestionService()
	{
		questions[0] = new Question(1,"Most used Lang","Python","java","ruby","C","python");
		questions[1] = new Question(2,"Types of constructors","1","2","3","4","2");
		questions[2] = new Question(3,"Types of polymorphism","1","2","3","4","2");
		questions[3] = new Question(4,"String immutable","true","false","Dk","Na","true");
		questions[4] = new Question(5,"13 reason why hero","clay","tony","alex","zach","clay");

	}
	
	public void displayQuestions()
	{
		int userScore = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Starting the quiz");
		for(int i=0;i<5;i++)
		{
			System.out.println("Question - "+questions[i].getQuestion());
			System.out.println("Option 1: "+questions[i].getOpt1()+" \toption2: "+questions[i].getOpt2());
			System.out.println("Option 3: "+questions[i].getOpt3()+" \toption4: "+questions[i].getOpt4());
			System.out.println("Enter answer in words: ");
			String userAns = sc.next();
			userScore = (userAns.equalsIgnoreCase(questions[i].getAnswer()))?(userScore+1):userScore;
			
		}
		System.out.println("You Answered : "+userScore+"/"+"5 correctly.");
		System.out.println("Quiz Ended! ");
		System.out.println("try Again Y/N: ");
		String retry = sc.next();
		if(retry.equalsIgnoreCase("y"))
			displayQuestions();
		else
			System.out.println("Thanks for Playing!");
		sc.close();
	}
	
}
