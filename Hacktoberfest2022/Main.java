//ROHAN GODHA
import java.util.Scanner;
public class Main 
{
public static void main(String[] args) {
String[][] student = new String[][] 
{
    {"20ECE1000", "Ram", "70", "50", "90", "ECE" },
    {"20BCS1002", "Shyam", "80", "60", "80", "CSE" },
    {"20BCS1762", "Rohan Godha", "100", "99", "100", "CSE" },
    {"20ECE1006", "Richa Dhiman", "100", "100", "100", "ECE" },
    {"20BCS1008", "Thoiba Singh", "83", "59", "100", "CSE" },
    {"20ECE1010", "Alka Jain", "100", "99", "98", "ECE" }
};
String[] deptHead = { "Decode", "DeptName", "DisciplineMarks" };
String[][] deptTable = new String[][] 
{
{ "ECE", "Electonics", "80" },
{ "CSE", "Consultant", "100" },
{ "CSE", "Clerk", "100" },
{ "ECE", "Electonics", "90" },
{ "CSE", "Manager", "60" },
{ "ECE", "Electonics", "100" }
};
System.out.println("Student Data: \n");
for (int i = 0; i < 7; i++) 
{
int Physics = Integer.parseInt(student[i][2]);
int Chem = Integer.parseInt(student[i][3]);
int Math = Integer.parseInt(student[i][4]);
int Disp = Integer.parseInt(deptTable[i][6]);
int AvgMarks = (Physics + Chem + Math - Disp)/4;
System.out.println(Physics+" ");
System.out.print(Chem + " ");
System.out.print(Math + " ");
System.out.print(Disp + " ");
System.out.print(AvgMarks + " ");
}
}
}
