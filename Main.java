/*
program that reads a list of exam scores from the file MidtermScores.
txt (which contains one score per line) and then displays a histogram of those numbers, 
divided into the ranges 0–9, 10–19, 20–29, and so forth, up to the range containing only 
the value 100. 
If, for example, MidtermScores.txt contains the data shown in the right margin, your 
program should then be able to generate a histogram that looks as much as possible like 
the following sample run:

00-09 : 
10-19 : *
20-29 : *
30-39 : **
40-49 : *
50-59 : *****
60-69 : *******
70-79 : *****************
80-89 : ******
90-99 : **********
   100 : *
*/
import java.io.*;  
public class Main 
{  
public static void main(String args[])  
{  
try  
{  
File file=new File("marks.txt");    //creates a new file instance  
FileReader fr=new FileReader(file);   //reads the file  
BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
int[] arrayOfMarks={0,0,0,0,0,0,0,0,0,0,0};
//StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
String line;  
while((line=br.readLine())!=null)  
{
    int i=Integer.parseInt(line);
    if(i <= 9 && i>=0){
        arrayOfMarks[0]++;
    }
    else if(i <= 19 && i>=10){
        arrayOfMarks[1]++;
    }
    else if(i <= 29 && i>=20){
        arrayOfMarks[2]++;
    }
    else if(i <= 39 && i>=30){
        arrayOfMarks[3]++;
    }
    else if(i <= 49 && i>=40){
        arrayOfMarks[4]++;
    }
    else if(i <= 59 && i>=50){
        arrayOfMarks[5]++;
    }
    else if(i <= 69 && i>=60){
        arrayOfMarks[6]++;
    }
    else if(i <= 79 && i>=70){
        arrayOfMarks[7]++;
    }
    else if(i <= 89 && i>=80){
        arrayOfMarks[8]++;
    }
    else if(i <= 99 && i>=90){
        arrayOfMarks[9]++;
    }
    else if(i == 100){
        arrayOfMarks[10]++;
    }
    //System.out.println(i);
}  
for(int i=0; i<11;i++){
    if(i==0)
        System.out.print("\n00-09:");
    else if(i==10)
        System.out.print("\n  100:");
    else{
        System.out.print("\n"+i+"0-"+i+"9:");
    }
    for(int j=0;j<arrayOfMarks[i];j++)
        System.out.print("*");

}

fr.close();    //closes the stream and release the resources  
  
   //returns a string that textually represents the object  
}  
catch(IOException e)  
{  
e.printStackTrace();  
}  
}  
}  
