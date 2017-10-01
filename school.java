
import java.util.Scanner;
import static java.lang.System.out;

class student {

    Scanner sc = new Scanner(System.in);
    String name;
    int rolls;
    String sub1, sub2;
    int i = 0;
    int ID;

    int[] att = new int[7];
    String[] att1 = new String[7];
    String[] ass1 = new String[7];
    int[] marks1 = new int[7];
    int[] marks2 = new int[7];
    int[] test1 = new int[7];
    int[] test2 = new int[7];
    int[] ass = new int[7];

    int get_stu() {
        out.println("------------------------------------------------------------------------------------------------------------------------");
        out.print("Enter Name : ");
        name = sc.next();
        out.println("");
        out.print("Enter ID : ");
        ID = sc.nextInt();
        out.println("");
        out.print("Enter Roll Number : ");
        rolls = sc.nextInt();
        out.println("");
        out.print("Enter 1 Subject : ");
        sub1 = sc.next();
        out.println("");
        out.print("Enter 2 Subject : ");
        sub2 = sc.next();
        out.println("------------------------------------------------------------------------------------------------------------------------");
        out.println("");

        return 0;
    }

    int update() {
        out.println("------------------------------------------------------------------------------------------------------------------------");
        out.print("Enter Name : ");
        name = sc.next();
        out.println("");
        out.print("Enter ID : ");
        ID = sc.nextInt();
        out.println("");
        out.print("Enter Roll Number : ");
        rolls = sc.nextInt();
        out.println("");
        out.print("Enter 1 Subject : ");
        sub1 = sc.next();
        out.println("");
        out.print("Enter 2 Subject : ");
        sub2 = sc.next();
        out.println("------------------------------------------------------------------------------------------------------------------------");
        out.println("");

        return 0;
    }

    String sub_1() {
        return sub1;
    }

    String sub_2() {
        return sub2;
    }

    //  String name(){return name;}
    //  int roll(){return rolls;}
    int get_attend() {
        out.println("------------------------------------------------------------------------------------------------------------------------");
        out.println("Press 1. Present");
        out.println("Press 2. Absent");
        out.println("");
        for (i = 0; i < 7; i++) {
            out.print("Enter the Attendence of Day " + (i + 1) + " :  ");
            att[i] = sc.nextInt();
            out.println("");
        }
        out.println("------------------------------------------------------------------------------------------------------------------------");
        return 0;
    }
    //    int []atten(){return att;}

    /*      int test_details()
          {
            out.println("Press 1.If you took test ");
            out.println("Press 2.If you didnt ");
                out.println("");
            for(i=0;i<7;i++)
            {
              out.println("Test 1 Details "+(i+1)+" Day");
              test1[i]=sc.nextInt();
                  out.println("");
              out.println("Test 2 Details "+(i+1)+" Day");
              test2[i]=sc.nextInt();
                out.println("");

            }

          return 0;

          }
     */
    //  int []test_1(){return test1;}
    //  int []test_2(){return test2;}
    int get_marks() {
        out.println("");
        out.println("------------------------------------------------------------------------------------------------------------------------");
        for (i = 0; i < 7; i++) {
            out.println("Enter the Marks of Test " + (i + 1) + " of Subject " + sub_1());
            marks1[i] = sc.nextInt();
            out.println("");
            out.println("Enter the Marks of Test " + (i + 1) + " of Subject " + sub_2());
            marks2[i] = sc.nextInt();
            out.println("");
        }
        out.println("------------------------------------------------------------------------------------------------------------------------");
        return 0;
    }
    //  int[] mar1(){return marks1;}
    //    int[] mar2(){return marks2;}

    int get_assign() {
        out.println("------------------------------------------------------------------------------------------------------------------------");
        out.println("Press 1. To Submit");
        out.println("Press 2. If you have not completed it.");
        out.println("");
        for (i = 0; i < 7; i++) {
            out.println("Submit Assignment of DAY " + (i + 1));
            ass[i] = sc.nextInt();
            if (ass[i] == 1) {
                out.println("Assignment Submitted.");
            } else {
                out.println("Assignment not submitted");
            }
            out.println("");

        }
        out.println("------------------------------------------------------------------------------------------------------------------------");
        return 0;
    }
    //  int[] assignm(){return ass;}

    int show_stu() {
        out.println("------------------------------------------------------------------------------------------------------------------------");

        out.println("Name :          " + name);
        out.println("ID :            " + ID);
        out.println("Roll Number :   " + rolls);
        out.println("Subject 1:      " + sub1);
        out.println("Subject 2:      " + sub2);
        out.println("------------------------------------------------------------------------------------------------------------------------");
        out.println("");

        return 0;
    }

    int name_id() {
        out.println("------------------------------------------------------------------------------------------------------------------------");

        out.println("Name :   " + name + ", ID :   " + ID);

        out.println("------------------------------------------------------------------------------------------------------------------------");
        return 0;
    }

    int show_attend() {
        out.println("------------------------------------------------------------------------------------------------------------------------");

        for (i = 0; i < 7; i++) {
            out.print("Attendence of Day " + (i + 1) + " : ");
            if (att[i] == 1) {
                out.println("Present.");
            } else {
                out.println("Absent.");
            }
        }
        out.println("------------------------------------------------------------------------------------------------------------------------");

        return 0;
    }

    int show_marks() {
        out.println("------------------------------------------------------------------------------------------------------------------------");
        out.println("");
        for (i = 0; i < 7; i++) {
            out.println("Marks of Test " + (i + 1) + " of Subject " + sub_1());
            out.println(marks1[i]);
            out.println("");
            out.println("Marks of Test " + (i + 1) + " of Subject " + sub_2());
            out.println(marks2[i]);
            out.println("");

        }
        out.println("------------------------------------------------------------------------------------------------------------------------");

        return 0;
    }

    int show_report() {
        for (i = 0; i < 7; i++) {
            if (ass[i] == 1) {
                ass1[i] = "YES";
            } else {
                ass1[i] = "NO";
            }
        }
        for (i = 0; i < 7; i++) {
            if (att[i] == 1) {
                att1[i] = "Present";
            } else {
                att1[i] = "Absent";
            }
        }

        out.println("----------------------------------------------------------------REPORT CARD----------------------------------------------------------------");
        out.println("Name       : " + name + "                                      ID : " + ID + "                                             Roll No. : " + rolls + "          ");
        out.println("Subject 1  : " + sub1 + "                            Subject 2:  " + sub2 + "                                                                        ");
        out.println("Days       :\tDay1\tDay2\tDay3\tDay4\tDay5\tDay6\tDay7");
        out.println("Attendence :\t" + att1[0] + "\t" + att1[1] + "\t" + att1[2] + "\t" + att1[3] + "\t" + att1[4] + "\t" + att1[5] + "\t" + att1[6]);
        out.println("Assignment :\t" + ass1[0] + "\t" + ass1[1] + "\t" + ass1[2] + "\t" + ass1[3] + "\t" + ass1[4] + "\t" + ass1[5] + "\t" + ass1[6]);
        out.println("Marks of " + sub1 + "     :  " + marks1[0] + "\t" + marks1[1] + "\t" + marks1[2] + "\t" + marks1[3] + "\t" + marks1[4] + "\t" + marks1[5] + "\t" + marks1[6] + " : Total ::\t" + (marks1[0] + marks1[1] + marks1[2] + marks1[3] + marks1[4] + marks1[5] + marks1[6]));
        out.println("Marks of " + sub2 + "   : " + marks2[0] + "\t" + marks2[1] + "\t" + marks2[2] + "\t" + marks2[3] + "\t" + marks2[4] + "\t" + marks2[5] + "\t" + marks2[6] + " : Total ::\t" + (marks2[0] + marks2[1] + marks2[2] + marks2[3] + marks2[4] + marks2[5] + marks2[6]));
        out.println("--------------------------------------------------------------------------------------------------------------------------------------------");

        return 0;
    }

}

public class school {

    public static void main(String[] args) {
        int op, op1, i, op2;
        int id1, flag = 0;
        int pos = 0, num, j;
        int e, id2;
        int id3, id4, id5;
        int id6;
        int count = 0;
        int temp;

        Scanner sc = new Scanner(System.in);

        student[] stud = new student[2];
        for (i = 0; i < 2; i++) {
            stud[i] = new student();
        }

        do {
            out.println("---------------------------------------------------School Database 1.0--------------------------------------------------");
            out.println("1.Student Data");
            out.println("2.Attendence");
            out.println("3.Marks");
            out.println("4.Assignment");
            out.println("5.Report Card");
            out.println("Choose an Option");
            op = sc.nextInt();
            out.println("------------------------------------------------------------------------------------------------------------------------");
            out.println("");
            if (op > 5) {
                out.println("\nwrong input\n");
                out.println("\nPress 1. To Try Again\n");
                e = sc.nextInt();
                out.println("------------------------------------------------------------------------------------------------------------------------");

            } else {
                switch (op) {
                    case 1:
                        out.println("------------------------------------------------------------------------------------------------------------------------");
                        out.println("Press 1.To Enter New Data");
                        out.println("Press 2.Update the existing Data");
                        out.println("Press 3.Show the Data");
                        out.println("");
                        op1 = sc.nextInt();
                        if (op1 > 3) {
                            out.println("Enter a valid choice.");

                        } else {

                            out.println("");
                            switch (op1) {
                                case 1:
                                    out.println("------------------------------------------------------------------------------------------------------------------------");
                                    out.print("Enter the Student Ad. Number : ");
                                    num = sc.nextInt();
                                    out.println("");
                                    for (i = 0; i < 2; i++) {
                                        if (stud[i].ID == num) {
                                            out.println("------------------------------------------------------------------------------------------------------------------------");
                                            out.println("Record with the same student number exist, Enter new Ad.Number .");
                                            out.println("");
                                            for (j = 0; stud[j].ID != num; j++) {
                                                num = sc.nextInt();

                                            }
                                            flag = 1;
                                            break;
                                        } else {

                                            flag = 1;
                                            break;
                                        }

                                    }
                                    if (flag == 1) {
                                        out.println("");
                                        stud[count].get_stu();

                                        out.println("");
                                        out.println("------------------------------------------------------------------------------------------------------------------------");
                                        out.println("Press 1. To see the data you have entered ");
                                        out.println("Press 2. To go to Main Menu ");

                                        op2 = sc.nextInt();
                                        if (op > 2) {
                                            out.println("Enter a valid choice.");
                                        } else {
                                            if (op2 > 2) {
                                                out.println("Enter a valid choice.");
                                            } else {
                                                if (op2 == 2) {
                                                    count++;
                                                }
                                                out.println("");
                                                if (op2 == 1) {

                                                    stud[count].show_stu();
                                                    count++;

                                                }

                                                break;
                                            }
                                        }
                                    }
                                    out.println("------------------------------------------------------------------------------------------------------------------------");
                                    break;

                                case 2:
                                    out.println("------------------------------------------------------------------------------------------------------------------------");
                                    out.println("Press 1. If you have the Student ID.");
                                    out.println("Press 2. If you dont have the Student ID, then go to the Main Menu and select option Show Name & ID");
                                    out.println("");

                                    op2 = sc.nextInt();
                                    out.println("");

                                    switch (op2) {
                                        case 1:
                                            out.println("------------------------------------------------------------------------------------------------------------------------");
                                            out.println("Enter the student ID");
                                            id1 = sc.nextInt();
                                            out.println("");
                                            for (i = 0; i < 2; i++) {
                                                if (stud[i].ID == id1) {
                                                    flag = 1;
                                                    pos = i;
                                                } else {
                                                    flag = 0;

                                                }

                                            }
                                            if (flag == 0) {

                                                out.println("ID not present, Enter the data first. ");
                                            }
                                            if (flag == 1) {
                                                out.println("------------------------------------------------------------------------------------------------------------------------");
                                                out.println("Enter the new Data.");
                                                out.println("");
                                                stud[pos].update();

                                            }
                                            break;

                                        case 2:
                                            out.println("------------------------------------------------------------------------------------------------------------------------");
                                            break;

                                    }
                                    out.println("------------------------------------------------------------------------------------------------------------------------");

                                    break;

                                case 3:
                                    out.println("------------------------------------------------------------------------------------------------------------------------");
                                    out.println("Press 1. To show Name & ID");
                                    out.println("Press 2. To show all Data");

                                    op2 = sc.nextInt();
                                    out.println("");

                                    out.println("");

                                    switch (op2) {
                                        case 1:
                                            out.println("------------------------------------------------------------------------------------------------------------------------");

                                            for (i = 0; i < 2; i++) {
                                                if (stud[i].ID == 0) {
                                                    out.println();
                                                    break;
                                                }

                                                stud[i].name_id();

                                            }
                                            if (flag == 1) {
                                                out.println("Enter the data First");
                                            }
                                            break;
                                        case 2:
                                            out.println("------------------------------------------------------------------------------------------------------------------------");
                                            out.println("All Students Records.");
                                            for (i = 0; i < 2; i++) {
                                                if (stud[i].ID == 0) {
                                                    out.println();
                                                    break;
                                                }

                                                stud[i].show_stu();

                                            }
                                            if (flag == 1) {
                                                out.println("Enter the data First");
                                            }
                                            break;

                                    }

                            }
                        }

                        break;

                    case 2:
                        out.println("------------------------------------------------------------------------------------------------------------------------");
                        out.println("Press 1.To Enter the Attendence");
                        out.println("Press 2.Show Attendence of whole class ");

                        op1 = sc.nextInt();
                        out.println("");

                        switch (op1) {
                            case 1:
                                out.println("------------------------------------------------------------------------------------------------------------------------");
                                out.println("Enter Student ID");
                                id2 = sc.nextInt();
                                for (i = 0; i < 2; i++) {
                                    if (stud[i].ID == id2) {
                                        temp = i;
                                        out.println("Enter the Attendence of : " + stud[i].name);
                                        stud[i].get_attend();
                                        out.println("");

                                        out.println("Press 1. To see the data you have entered ");
                                        out.println("Press 2. To go to Main Menu ");
                                        out.println("");

                                        op2 = sc.nextInt();
                                        out.println("");

                                        out.println("");
                                        if (op2 == 1) {

                                            out.println("Attendence of   " + stud[i].name);
                                            stud[i].show_attend();
                                            out.println("");

                                        }
                                        break;

                                    } else {
                                        out.println("ID not found");
                                        break;

                                    }

                                }
                                out.println("------------------------------------------------------------------------------------------------------------------------");
                                break;

                            case 2:
                                out.println("------------------------------------------------------------------------------------------------------------------------");
                                for (i = 0; i < 2; i++) {
                                    if (stud[i].ID == 0) {
                                        out.println("Enter the data first.");
                                        break;
                                    } else {
                                        out.println("Attendence of " + stud[i].name + " , ID : " + stud[i].ID);
                                        stud[i].show_attend();
                                        out.println("");
                                    }
                                }

                        }
                        out.println("------------------------------------------------------------------------------------------------------------------------");
                        break;

                    case 3:
                        out.println("------------------------------------------------------------------------------------------------------------------------");
                        out.println("Press 1. To enter the Marks ");
                        out.println("Press 2. To Show the Marks");
                        op1 = sc.nextInt();
                        switch (op1) {
                            case 1:
                                out.println("------------------------------------------------------------------------------------------------------------------------");
                                out.println("Enter Student ID");
                                id3 = sc.nextInt();
                                for (i = 0; i < 2; i++) {
                                    if (stud[i].ID == id3) {
                                        out.println("Enter the Marks of : " + stud[i].name);
                                        stud[i].get_marks();
                                        out.println("");
                                        break;
                                    } else {
                                        out.println("ID not found");
                                    }
                                    break;
                                }
                                break;
                            case 2:
                                out.println("------------------------------------------------------------------------------------------------------------------------");
                                out.println("Press 1. To show Marks");
                                out.println("Press 2. To show Marks of all students ");
                                op2 = sc.nextInt();

                                switch (op2) {
                                    case 1:
                                        out.println("------------------------------------------------------------------------------------------------------------------------");
                                        out.println("Enter Student ID");
                                        id4 = sc.nextInt();
                                        for (i = 0; i < 2; i++) {
                                            if (stud[i].ID == 0) {
                                                out.println("Enter the data first.");
                                                break;
                                            } else {
                                                if (stud[i].ID == id4) {
                                                    out.println(" Marks of : " + stud[i].name);
                                                    stud[i].show_marks();

                                                    out.println("");
                                                    break;
                                                } else {
                                                    out.println("ID not found");
                                                }
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        out.println("------------------------------------------------------------------------------------------------------------------------");
                                        for (i = 0; i < 2; i++) {
                                            if (stud[i].ID == 0) {
                                                out.println("Enter the data first.");
                                                break;
                                            } else {
                                                out.println(" Marks of : " + stud[i].name);
                                                out.println("");
                                                stud[i].show_marks();
                                            }
                                        }
                                        break;
                                }
                                break;

                        }
                        out.println("------------------------------------------------------------------------------------------------------------------------");
                        break;
                    case 4:
                        out.println("------------------------------------------------------------------------------------------------------------------------");
                        out.println("Press 1.To Submit Assignment ");
                        op1 = sc.nextInt();
                        out.println("");

                        switch (op1) {
                            case 1:
                                out.println("------------------------------------------------------------------------------------------------------------------------");
                                out.println("Enter Student ID");
                                id5 = sc.nextInt();
                                for (i = 0; i < 2; i++) {
                                    if (stud[i].ID == id5) {
                                        out.println("Assignment submission of : " + stud[i].name);
                                        stud[i].get_assign();
                                        out.println("");
                                        break;
                                    } else {
                                        out.println("ID not found");
                                        break;
                                    }

                                }

                        }
                        out.println("------------------------------------------------------------------------------------------------------------------------");
                        break;

                    case 5:
                        out.println("------------------------------------------------------------------------------------------------------------------------");
                        out.println("");

                        out.println("Enter Student ID");
                        id6 = sc.nextInt();
                        for (i = 0; i < 2; i++) {
                            if (stud[i].ID == 0) {
                                out.println("Enter the data first.");
                                break;
                            } else {
                                if (stud[i].ID == id6) {

                                    stud[i].show_report();
                                    out.println("");
                                    break;
                                } else {
                                    out.println("ID not found");
                                    break;
                                }

                            }
                        }

                        out.println("------------------------------------------------------------------------------------------------------------------------");

                        break;
                }
            }
        } while (true);
    }
}
