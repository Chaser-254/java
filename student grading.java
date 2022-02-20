// Write a program that grades marks for a student
Class student {
    Public static void main (String [] args)
    {
 
        Int marks [] = {25, 65, 46, 98, 78, 65};
 
        Int max_marks = marks. Length * 100;
 
        Int total = 0;
 
        Char grade = 'F';
 
        For (int i = 0; i < marks. Length; i++) {
            Total += marks[i];
        }
 
        Double percentage
            = ((double) (total) / max_marks) * 100;
 
      if (percentage >= 90) {
            Grade = 'A';
        }
        else {
            if (percentage >= 80 && percentage <= 89)
 {
                Grade = 'B';
            }
           else {
                if (percentage >= 60 && percentage <= 79) {
                    Grade = 'C';
                }
                else {
                    if (percentage >= 33 && percentage <= 59) {
                        Grade = 'D';
                    }
                    else {
                        Grade = 'F';
                    }
                }
            }
        }
 
        System.out.println (grade);
    }
}
