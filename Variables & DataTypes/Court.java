class Court{
  static int caseId = 10023;
  static int judgeId = 501;
  static int courtroomNumber = 7;
  static int hearingDuration = 90;
  static int plaintiffAge = 45;
  static int defendantAge = 38;
  static int numberOfHearings = 3;
  static int totalCasesToday = 22;
  static int pendingCases = 120;
  static int courtStaff = 35;
  static String courtName = "Supreme Court of India";
  static String judgeName = "Justice A.K. Sharma";
  static String caseStatus = "Under Trial";
  static String caseType = "Civil";
  static String plaintiffName = "Rohit Mehra";
  static String defendantName = "Anil Khanna";
  static String verdict = "Guilty";
  static String nextHearingDate = "2025-07-15";
  static String caseTitle = "Mehra vs Khanna";
  static String courtClerk = "Mrs. Priya Kapoor";
   
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
   
   }
}