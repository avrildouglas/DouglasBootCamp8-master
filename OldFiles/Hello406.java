import java.util.Scanner;
02
 
03
public class Assignment2
04
{
05
    public static void main(String[] args)
06
        {
07
        //Create scanner object to obtain input from user
08
        Scanner input = new Scanner (System.in);
09
         
10
        int MonthNum; //To hold the month from user input
11
        int Year; //To hold the year
12
        int numDays;
13
        String Month;
14
         
15
        System.out.print("Please enter the Month #");
16
        MonthNum = input.nextInt();
17
        System.out.print("Please enter the Year");
18
        Year = input.nextInt();
19
         
20
        if (MonthNum == 2)
21
            {
22
             if ( (Year % 4 == 0) && (Year % 400 == 0)
23
                     && !(Year % 100 == 0) )
24
                    numDays = 29;
25
                else
26
                    numDays = 28;
27
            }
28
        else if (MonthNum == 1 || MonthNum == 3 || MonthNum == 5 || MonthNum == 7 || MonthNum == 8 
29
                    || MonthNum == 10 || MonthNum == 12)
30
            numDays = 31;
31
        else
32
            numDays = 30;
33
         
34
        if (MonthNum == 1)
35
            Month = "January";
36
        else if (MonthNum == 2)
37
            Month = "Feburary";
38
        else if (MonthNum == 3)
39
            Month = "March";
40
        else if (MonthNum == 4)
41
            Month = "April";
42
        else if (MonthNum == 5)
43
            Month = "May";
44
        else if (MonthNum == 6)
45
            Month = "June";
46
        else if (MonthNum == 7)
47
            Month = "July";
48
        else if (MonthNum == 8)
49
            Month = "August";
50
        else if (MonthNum == 9)
51
            Month = "September";
52
        else if (MonthNum == 10)
53
            Month = "October";
54
        else if (MonthNum == 11)
55
            Month = "November";
56
        else if (MonthNum == 12)
57
            Month = "December";
58
     
59
         
60
        System.out.println(Month + " " + Year " has " + numDays "." );
61
        System.out.println(Month);
62
        System.out.println(numDays);
63
    }
64
}
