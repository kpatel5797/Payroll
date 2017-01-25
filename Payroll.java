

//
import java.io.*; 
public class Payroll
{
     int count=5;
    String name[]=new String[10];
    String add[]=new String[10];
    int code[]=new int[10];
    String pan[]=new String[10];
    int age[]=new int[10];
    double bsal[]=new double[10];
    double DA[]=new double[10];
    double HRA[]=new double[10];
    double LTA[]=new double[10];
    double PF[]=new double[10];
    double ITax[]=new double[10];
    double GSal[]=new double[10];
    double NetSal[]=new double[10];
    
    Existing obj=new Existing(); 
    New objt=new New(); 
    
    InputStreamReader read=new InputStreamReader(System.in); 
    BufferedReader buf=new BufferedReader(read);
    Payroll()throws IOException
     {
        name[0]="John";
        add[0]="A-21, Palace Towers, Mumbai";
        code[0]=123;
        pan[0]="12abcd1234";
        age[0]=45;
        bsal[0]=15000.00;
        
        name[1]="James";
        add[1]="605, Oscar Towers, Mumbai";
        code[1]=456;
        pan[1]="23efgh2345";
        age[1]=31;
        bsal[1]=6700.00;
        
        name[2]="Alex";
        add[2]="5, B7, Garden Society,  Mumbai";
        code[2]=789;
        pan[2]="34ijkl3456";
        age[2]=53;
        bsal[2]=12500.00;
        
        name[3]="Frank";
        add[3]="12, Coral Towers, Mumbai";
        code[3]=1011;
        pan[3]="45mnop4567";
        age[3]=35;
        bsal[3]=5900.00;
        
        name[4]="Connor";
        add[4]="D, 706, Imperial Heights, Mumbai";
        code[4]=1213;
        pan[4]="56qrst5678";
        age[4]=39;
        bsal[4]=8900.00;
        

        for(int i=0; i<count; i++)
        {
          DA[i]=0.75*bsal[i];
          HRA[i]=0.25*bsal[i];
          LTA[i]=0.15*bsal[i];
          PF[i]=0.12*bsal[i];
          GSal[i]=bsal[i]+DA[i]+HRA[i]+LTA[i];
          ITax[i]=0.10*GSal[i];
          NetSal[i]=GSal[i]-(PF[i]+ITax[i]);
        }
    }
   
    public void main()throws IOException
    {       
        System.out.println("       =============================================================");
        System.out.println("       *************************************************************");    
        System.out.println("       .....                       WELCOME                     .....");  
        System.out.println("       ........                      TO                     ........");
        System.out.println("       ....<<<____        KRA WARFARE TECHNOLOGIES       ____>>>....");
        System.out.println("               -  The beginning of the future War Machines -        ");
        System.out.println("       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("       =============================================================");
        System.out.println();
        System.out.println("                         ;;;;;;;;;;;;;;'';; ");
        System.out.println("                         @@@@@@@@@@@@@@@@@|  ----------=)))");
        System.out.println("                         //// #       `````` ");
        System.out.println("                        //// ");
        System.out.println();
        System.out.println();
        abc:
        do
        {
            System.out.println("Shoot 'a' if you are an Existing employee...");
            System.out.println("Shoot 'b' if you are a New employee...");
            System.out.println("Shoot 'c' if you want to Exit the System...");
            char ch=buf.readLine().charAt(0);
            
           
                if(ch=='a')
                {
                   System.out.println("LOADING");
       for(int i=0; i<=37; i++)
       {
           for(int j=0; j<=999999999; j++)
           {
            }
               System.out.print(".");
       }
        System.out.println();
        System.out.println("Existing Employee--->");
        System.out.println();
           int empCode=0;
           do
             {
                try

                {
                     System.out.print("Enter the Employee Code: ");
                     empCode=Integer.parseInt(buf.readLine());
                }
                catch(NumberFormatException obj)
                {
                     System.out.println("Please enter digits only...");
                     continue;
                }
                 
                if(empCode<=0)
                {
                    System.out.println("Please enter a valid code...");
                    continue;
                }
                break;
            }while(true);

           System.out.print("Enter the Employee PAN Number: ");
           String PAN=buf.readLine();

           int i=0;
           boolean flag=false;
           for(i=0; i<count; i++)
           {
               if(empCode==code[i] && PAN.equals(pan[i]))
               {
                  flag=true;
                  break;
               }
           }
          
          if(flag==true)
          {
            employeeLoop: 
            do

            {
                System.out.println();
                System.out.println("Shoot 1 for Monthly Salary Slip...");
                System.out.println("Shoot 2 for Service Record...");
                System.out.println("Shoot 3 for Bonus...");
                char c=buf.readLine().charAt(0);
                switch(c)
                {

                    case '1':
                    obj.SalarySlip(i);
                    break;
                    
                    case '2':
                    obj.ServiceRecord(i);
                    break;          
                    
                    case '3':
                    obj.Bonus(i);
                    break;
                    
                    default :
                    System.out.println("Invalid choice...");
                    System.out.println("Please enter 1,2 or 3 only...");
                    
                 }
                do
                  {
                    System.out.println();
                    System.out.println ("Do you wish to continue with the same employee... enter y/n (Y/N)?");
                    char ch2=buf.readLine().charAt(0);
                      
                    if(ch2=='n'||ch2=='N')
                    {
                        System.out.println("Going back to main menu...");
                        System.out.println();
                        break employeeLoop ;
                    }
                          
                    else if (ch2=='y'||ch2=='Y')
                        continue employeeLoop;
                    else 
                        System.out.println ("Please enter a y/n (Y/N) only...");
                }while(true);
            }while(true);
        }
          else 
          {
            System.out.println("You have entered wrong Employee Code and PAN Number...");
            System.out.println("You are restricted to access the Payroll system...");
            System.out.println("Please enter correct Employee Code and PAN Number...");
            System.out.println();
                }
              }//end of ExistingEmployee()
                
               else if(ch=='b')
               {
                objt.NewEmployee();
                System.out.println();
               
               }
               else if(ch=='c')
               {
                System.out.println();
                System.out.println("    ----THANK YOU FOR VISITING US!----   ");
                System.out.println("GOOD WISHES FROM KRA WARFARE TECHNOLOGIES");
                System.out.println("       >>>---     BYE!!!    ---<<<       ");
                System.out.println("           ____________________          ");
                System.exit(0);
               }
               else
                System.out.println("Please enter a,b or c only...");

            
            do
            {
                System.out.println("Enter 'y' to go back to main menu...");
                System.out.println("Enter 'n' to exit the System..."); 
                char ch1=buf.readLine().charAt(0);
               if(ch1=='n'||ch1=='N')
               {
                System.out.println();
                System.out.println("    ----THANK YOU FOR VISITING US!----   ");
                System.out.println("GOOD WISHES FROM KRA WARFARE TECHNOLOGIES");
                System.out.println("       >>>---     BYE!!!    ---<<<       ");
                System.out.println("           ____________________          ");
                System.exit(0);
               } 
               else if(ch1=='y'||ch1=='Y')
                continue abc;
               else
                System.out.println("Please enter y/n (Y/N) only...");
            }while(true);
     }while(true);
   }//end of main()
}
