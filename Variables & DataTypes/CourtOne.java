class CourtOne{
  static int caseId ;
  static int judgeId ;
  static int courtroomNumber ;
  static int hearingDuration ;
  static int plaintiffAge ;
  static int defendantAge ;
  static int numberOfHearings ;
  static int totalCasesToday ;
  static int pendingCases ;
  static int courtStaff ;
  static String courtName ;
  static String judgeName ;
  static String caseStatus; 
  static String caseType ;
  static String plaintiffName ;
  static String defendantName ;
  static String verdict ;
  static String nextHearingDate ;
  static String caseTitle ;
  static String courtClerk;
   
   public static void main(String Police[]){
   
   System.out.println("Unique ID assigned to a court case "+caseId);
   System.out.println("Unique ID of a presiding judge "+judgeId);
   System.out.println("Courtroom assigned for a session "+courtroomNumber);
   System.out.println("Duration of a court hearing in minutes "+hearingDuration);
   System.out.println("Age of the person filing the case "+plaintiffAge);
   System.out.println("Age of the defendant "+defendantAge);
   System.out.println("Number of hearings for the case "+numberOfHearings);
   System.out.println("Total number of cases scheduled for the day "+totalCasesToday);
   System.out.println("Total unresolved or pending cases "+pendingCases);
   System.out.println(" Number of administrative and support staff "+courtStaff);
   System.out.println("Name of the court "+courtName);
   System.out.println(" Name of the judge "+judgeName);
   System.out.println("Status of the legal case "+caseStatus);
   System.out.println("Case type (Civil, Criminal, Family, etc.) "+caseType);
   System.out.println("Name of the person who filed the case "+plaintiffName);
   System.out.println(" Name of the person being accused "+defendantName);
   System.out.println("Outcome of the case (Guilty, Not Guilty, Settled)"+verdict);
   System.out.println("Date of the next court hearing "+nextHearingDate);
   System.out.println(" Title/label of the case "+caseTitle);
   System.out.println("Name of the administrative court clerk "+courtClerk);
   
   
   
    caseId = 10023;
    judgeId = 501;
    courtroomNumber = 7;
    hearingDuration = 90;
    plaintiffAge = 45;
    defendantAge = 38;
    numberOfHearings = 3;
    totalCasesToday = 22;
    pendingCases = 120;
    courtStaff = 35;
    courtName = "Supreme Court of India";
    judgeName = "Justice A.K. Sharma";
    caseStatus = "Under Trial";
    caseType = "Civil";
    plaintiffName = "Rohit Mehra";
    defendantName = "Anil Khanna";
    verdict = "Guilty";
    nextHearingDate = "2025-07-15";
    caseTitle = "Mehra vs Khanna";
    courtClerk = "Mrs. Priya Kapoor";
	
	
	System.out.println("Unique ID assigned to a court case "+caseId);
   System.out.println("Unique ID of a presiding judge "+judgeId);
   System.out.println("Courtroom assigned for a session "+courtroomNumber);
   System.out.println("Duration of a court hearing in minutes "+hearingDuration);
   System.out.println("Age of the person filing the case "+plaintiffAge);
   System.out.println("Age of the defendant "+defendantAge);
   System.out.println("Number of hearings for the case "+numberOfHearings);
   System.out.println("Total number of cases scheduled for the day "+totalCasesToday);
   System.out.println("Total unresolved or pending cases "+pendingCases);
   System.out.println(" Number of administrative and support staff "+courtStaff);
   System.out.println("Name of the court "+courtName);
   System.out.println(" Name of the judge "+judgeName);
   System.out.println("Status of the legal case "+caseStatus);
   System.out.println("Case type (Civil, Criminal, Family, etc.) "+caseType);
   System.out.println("Name of the person who filed the case "+plaintiffName);
   System.out.println(" Name of the person being accused "+defendantName);
   System.out.println("Outcome of the case (Guilty, Not Guilty, Settled)"+verdict);
   System.out.println("Date of the next court hearing "+nextHearingDate);
   System.out.println(" Title/label of the case "+caseTitle);
   System.out.println("Name of the administrative court clerk "+courtClerk);
   
   }
}