package entity;

import java.time.LocalDate;

public class program {
	public static void main(String[] args) {
		Department DepartmentA = new Department();
		DepartmentA.Departmentid = 1;
		DepartmentA.DepartmentName = "giam doc";
		System.out.println("DepartmentA = " + DepartmentA);
		
		Department DepartmentB = new Department();
		DepartmentB.Departmentid = 2;
		DepartmentB.DepartmentName = "Sale";
		System.out.println("DepartmentB = " + DepartmentB);
		
		Department DepartmentC = new Department();
		DepartmentC.Departmentid = 3;
		DepartmentC.DepartmentName = "Nhan su";
		System.out.println("DepartmentC = " + DepartmentC);
		
		Position Position1 = new Position();
		Position1.PositionID = 1;
		Position1.PositionName = positionName.DEV;
		System.out.println("Position1 = " + Position1);
		
		Position Position2 = new Position();
		Position2.PositionID = 2;
		Position2.PositionName = positionName.PM;
		System.out.println("Position2 = " + Position2);
		
		Position Position3 = new Position();
		Position3.PositionID = 3;
		Position3.PositionName = positionName.SCRUM_MASTER;
		System.out.println("Position3 = " + Position3);
		
		Account Account1 = new Account();
		Account1.accountID = 1;
		Account1.email = "haidang29productions@gmail.com";
		Account1.userName = "dangblack";
		Account1.fullName = "Nguyen Hai Dang";
		Account1.Department = DepartmentA;
		Account1.Position = Position1;
		Account1.createDate = LocalDate.now();
		System.out.println("Account1 = " + Account1);
		
		Account Account2 = new Account();
		Account2.accountID = 2;
		Account2.email = "account1@gmail.com";
		Account2.userName = "quanganh";
		Account2.fullName = "Tong Quang Anh";
		Account2.Department = DepartmentB;
		Account2.Position = Position2;
		Account2.createDate = LocalDate.now();
		System.out.println("Account2 = " + Account2);
		
		Account Account3 = new Account();
		Account3.accountID = 3;
		Account3.email = "account2@gmail.com";
		Account3.userName = "vanchien";
		Account3.fullName = "Nguyen Van Chien";
		Account3.Department = DepartmentC;
		Account3.Position = Position3;
		Account3.createDate = LocalDate.now();
		System.out.println("Account3 = " + Account3);
		
		Group Group1 = new Group();
		Group1.groupID = 1;
		Group1.groupName = "group1";
		Group1.creatorID = Account1;
		Group1.createDate = LocalDate.now();
		System.out.println("Group1 = " + Group1);
		
		Group Group2 = new Group();
		Group2.groupID = 2;
		Group2.groupName = "group2";
		Group2.creatorID = Account2;
		Group2.createDate = LocalDate.now();
		System.out.println("Group2 = " + Group2);
		
		Group Group3 = new Group();
		Group3.groupID = 3;
		Group3.groupName = "group3";
		Group3.creatorID = Account3;
		Group3.createDate = LocalDate.now();
		System.out.println("Group3 = " + Group3);
		
		GroupAccount GroupAccount1 = new GroupAccount();
		GroupAccount1.GroupID = Group1;
		GroupAccount1.AccountID = Account1;
		System.out.println("GroupAccount1 = " + GroupAccount1);
		
		GroupAccount GroupAccount2 = new GroupAccount();
		GroupAccount2.GroupID = Group2;
		GroupAccount2.AccountID = Account2;
		System.out.println("GroupAccount2 = " + GroupAccount2);
		
		typeQuestion typeQuestion1 = new typeQuestion ();
		typeQuestion1.typeID = 1;
		typeQuestion1.typeName = TypeName.Essay;
		System.out.println("typeQuestion1 = " + typeQuestion1);

		typeQuestion typeQuestion2 = new typeQuestion ();
		typeQuestion2.typeID = 2;
		typeQuestion2.typeName = TypeName.Multiple_Choice;
		System.out.println("typeQuestion2 = " + typeQuestion2);
		
		typeQuestion typeQuestion3 = new typeQuestion ();
		typeQuestion3.typeID = 3;
		typeQuestion3.typeName = TypeName.Multiple_Choice;
		System.out.println("typeQuestion3 = " + typeQuestion3);
		
		categoryQuestion categoryQuestion1 = new categoryQuestion();
		categoryQuestion1.categoryID = 1;
		categoryQuestion1.categoryName = "Java";
		System.out.println("categoryQuestion1 = " + categoryQuestion1);
		
		categoryQuestion categoryQuestion2 = new categoryQuestion();
		categoryQuestion2.categoryID = 2;
		categoryQuestion2.categoryName = "SQL";
		System.out.println("categoryQuestion2 = " + categoryQuestion2);
		
		categoryQuestion categoryQuestion3 = new categoryQuestion();
		categoryQuestion3.categoryID = 3;
		categoryQuestion3.categoryName = "NET";
		System.out.println("categoryQuestion3 = " + categoryQuestion3);
		
		Question Question1 = new Question();
		Question1.questionID = 1;
		Question1.Content = "Câu hỏi về Java";
		Question1.categoryID = categoryQuestion1;
		Question1.typeID = typeQuestion1;
		Question1.creatorID = Account1;
		Question1.createDate = LocalDate.now();
		System.out.println("Question1 = " + Question1);
		
		Question Question2 = new Question();
		Question2.questionID = 2;
		Question2.Content = "Câu Hỏi về PHP";
		Question2.categoryID = categoryQuestion2;
		Question2.typeID = typeQuestion2;
		Question2.creatorID = Account2;
		Question2.createDate = LocalDate.now();
		System.out.println("Question2 = " + Question2);
		
		Question Question3 = new Question();
		Question3.questionID = 3;
		Question3.Content = "Hỏi về C#";
		Question3.categoryID = categoryQuestion2;
		Question3.typeID = typeQuestion3;
		Question3.creatorID = Account3;
		Question3.createDate = LocalDate.now();
		System.out.println("Question3 = " + Question3);
		
		answer answer1 = new answer();
		answer1.answerID = 1;
		answer1.content = "Trả lời 01";
		answer1.questionID = Question1;
		answer1.isCorrect = isCorrect.T;
		System.out.println("answer1 = " + answer1);
		
		answer answer2 = new answer();
		answer2.answerID = 2;
		answer2.content = "Trả lời 01";
		answer2.questionID = Question2;
		answer2.isCorrect = isCorrect.T;
		System.out.println("answer2 = " + answer2);
		
		answer answer3 = new answer();
		answer3.answerID = 3;
		answer3.content = "Trả lời 01";
		answer3.questionID = Question3;
		answer3.isCorrect = isCorrect.F;
		System.out.println("answer3 = " + answer3);
		
		exam exam1 = new exam();
		exam1.examID = 1;
		exam1.code = "VTIQ001";
		exam1.title = "Đề thi C#";
		exam1.categoryID = categoryQuestion1;
		exam1.duration = 60;
		exam1.Creator = Account1;
		exam1.createDate = LocalDate.now();
		System.out.println("exam1 = " + exam1);
		
		exam exam2 = new exam();
		exam2.examID = 2;
		exam2.code = "VTIQ003";
		exam2.title = "Đề thi 2#";
		exam2.categoryID = categoryQuestion2;
		exam2.duration = 90;
		exam2.Creator = Account2;
		exam2.createDate = LocalDate.now();
		System.out.println("exam2 = " + exam2);
		
		exam exam3 = new exam();
		exam3.examID = 2;
		exam3.code = "VTIQ002";
		exam3.title = "Đề thi 3#";
		exam3.categoryID = categoryQuestion3;
		exam3.duration = 120;
		exam3.Creator = Account3;
		exam3.createDate = LocalDate.now();
		System.out.println("exam3 = " + exam3);
		
		examQuestion examQuestion1 = new examQuestion();
		examQuestion1.exam = exam1;
		examQuestion1.question = Question1;
		System.out.println("examQuestion1 = " + examQuestion1);
		
		examQuestion examQuestion2 = new examQuestion();
		examQuestion2.exam = exam2;
		examQuestion2.question = Question2;
		System.out.println("examQuestion2 = " + examQuestion2);
		
		examQuestion examQuestion3 = new examQuestion();
		examQuestion3.exam = exam3;
		examQuestion3.question = Question3;
		System.out.println("examQuestion3 = " + examQuestion3);
		
	}
}
	
		
	
