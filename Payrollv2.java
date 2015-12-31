//
import java.io.*;
public class Payrollv2
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
    
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader buf=new BufferedReader(read);
    

    //Default constructor
     Payrollv2()throws IOException
     {
        name[0]="Ramesh";
        add[0]="A-21, Palace Towers, Mumbai";
        code[0]=123;
        pan[0]="12abcd1234";
        age[0]=45;
        bsal[0]=15000.00;
        
        name[1]="Suresh";
        add[1]="605, Oscar Towers, Mumbai";
        code[1]=456;
        pan[1]="23efgh2345";
        age[1]=31;
        bsal[1]=6700.00;
        
        name[2]="Alok";
        add[2]="5, B7, Garden Society,  Mumbai";
        code[2]=789;
        pan[2]="34ijkl3456";
        age[2]=53;
        bsal[2]=12500.00;
        
        name[3]="Kashyap";
        add[3]="12, Coral Towers, Mumbai";
        code[3]=1011;
        pan[3]="45mnop4567";
        age[3]=35;
        bsal[3]=5900.00;
        
        name[4]="Tapan";
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

       main();
   }//end of default constructor
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
            
            switch(ch)
            {
                case 'a':
                ExistingEmployee();
                System.out.println();
                break;
                
                case 'b':
                NewEmployee();
                System.out.println();
                break;
                
                case 'c':
                System.out.println();
                System.out.println("    ----THANK YOU FOR VISITING US!----   ");
                System.out.println("GOOD WISHES FROM KRA WARFARE TECHNOLOGIES");
                System.out.println("       >>>---     BYE!!!    ---<<<       ");
                System.out.println("           ____________________          ");
                System.exit(0);
                
                default:
                System.out.println("Please enter a,b or c only...");

            }
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
   public void ExistingEmployee()throws IOException
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
                char ch=buf.readLine().charAt(0);
                switch(ch)
                {

                    case '1':
                    SalarySlip(i);
                    break;
                    
                    case '2':
                    ServiceRecord(i);
                    break;          
                    
                    case '3':
                    Bonus(i);
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
   
    public void SalarySlip(int n)throws IOException
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
        System.out.println("         -----Salary Slip-----");
        System.out.println();
        System.out.println("Employee's name      : "+name[n]);
        System.out.println("Address              : "+add[n]);
        System.out.println("Employee Code        : "+code[n]);
        System.out.println("PAN Number           : "+pan[n]);
        System.out.println("Age                  : "+age[n]);
        System.out.println("Monthly Basic Salary : "+bsal[n]);
        System.out.println("DA                   : "+DA[n]);
        System.out.println("HRA                  : "+HRA[n]);
        System.out.println("LTA                  : "+LTA[n]);
        System.out.println("PF                   : "+PF[n]);
        System.out.println("Income-Tax           : "+ITax[n]);
        System.out.println("Gross Salary         : "+GSal[n]);
        System.out.println("Net Salary           : "+NetSal[n]);

    }//end of SalarySlip(int i)
          
    public void ServiceRecord(int n)throws IOException
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
        System.out.println("         -----Service Records-----");
        System.out.println();
        System.out.println("Employee's Name      : "+name[n]);
        System.out.println("Address              : "+add[n]);
        System.out.println("Employee Code        : "+code[n]);
        System.out.println("PAN Number           : "+pan[n]);
        System.out.println("Age                  : "+age[n]);
        System.out.println("Monthly Basic Salary : "+bsal[n]);
        int cleaves=12;

        int leaves=0;
        do
         {
                try

                {
                     System.out.print("Enter the number of leaves taken earlier:");

                     leaves=Integer.parseInt(buf.readLine());
                }
                catch(NumberFormatException obj)
                {
                     System.out.println("Please enter digits only.....");
                     continue;
                }
                 
                if(leaves<=0 || leaves>12)
                {
                    System.out.println("Please enter leave between 1 and 12.....");continue;
                }
                break;
         }while(true);

                    
        int leavesLeft= 12-leaves;
        System.out.println("The number of leaves eligible (days) : "+cleaves);
        System.out.println("The number of leaves left (days)     : "+leavesLeft);
        int yearsLeft= 58-age[n];
        System.out.println("Number of years left for retirement  : "+yearsLeft);
    }
    
    public void Bonus(int n)throws IOException
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
        System.out.println("              -----Bonus-----");
        System.out.println();
        System.out.println("Employee's Name      : "+name[n]);
        System.out.println("Address              : "+add[n]);
        System.out.println("Employee Code        : "+code[n]);
        System.out.println("PAN Number           : "+pan[n]);
        System.out.println("Age                  : "+age[n]);
        System.out.println("Monthly Basic Salary : "+bsal[n]);
            

             double month=0;
            do
            {
                try
                {
                     System.out.println ("Enter the number of months you have been working: ");
                     month =Double.parseDouble (buf.readLine());
                }
                catch(NumberFormatException obj)
                {
                     System.out.println("Please enter digits only...");
                     continue;
                }
                 
                if(month<0 )
                {
                    System.out.println("Working period can not be less than Zero...");
                    continue;
                }
                break;
            }while(true);
            
              
           if (month <12)
            {
               System.out.println ("You can recieve your bonus only after working for an year...");
            }
              else 
              {
                    int ps=0;
                 do
                 {
                    try

                    {
                         System.out.print("Enter your performance scale: ");
                         ps=Integer.parseInt(buf.readLine());
                    }
                    catch(NumberFormatException obj)
                    {
                         System.out.println("Please enter digits only...");
                         continue;
                    }
                    if(ps<=0 || ps>5 )
                    {
                        System.out.println("Please enter a value between 1 and 5 only...");continue;
                    }
                    break;
                }while(true);  
               
               double bonus= 0.33*GSal[n];
               double PLI=0.0;
               if(ps==1)
                PLI=0;
                else if(ps==2)
                PLI=bsal[n]*0.05;
                else if(ps==3)
                 PLI=bsal[n]*0.1;
                 else if(ps==4)
                  PLI=bsal[n]*0.15;
                  else if(ps==5)
                   PLI=bsal[n]*0.2;

               System.out.println("Your Bonus ........................."+(bonus+PLI));
           }  
    }
    
    public void NewEmployee()throws IOException
    {
        int i=0;
        System.out.println("LOADING");
        for(i=0; i<=37; i++)
        {
           for(int j=0; j<=999999999; j++)
           {
            }
               System.out.print(".");
        }
        System.out.println();
        System.out.println("New Employee--->");
        System.out.println();
         do
         {
            try
            {
                 System.out.print ("Enter your new Employee Code: ");
                 code[count]=Integer.parseInt(buf.readLine());
            }
            catch(NumberFormatException obj)
            {
                 System.out.println("Please enter digits only...");
                 continue;
            }
            break;
         }while(true);    
              
         int flag=1;
         for (i =0;i<count;i++)
          {  
             if (code[count]==code[i])
             {
                System.out.println ("You are already an existing employee...Sorry "); 
                flag=0;
                break;
             }
         }
          if(flag==0)
          {
              return;
          }
         else
         {         
             System.out.print("Enter your Name: ");
             name[count]=buf.readLine();
              do
             {
                try
                {
                       System.out.print("Enter your age: ");
                       age[count]=Integer.parseInt(buf.readLine());
                }
                catch(NumberFormatException obj)
                {
                         System.out.println("Please enter digits only...");
                         continue;
                    }
                if(age[count]<21 || age[count]>58)
                {
                    System.out.println("Sorry... enter a valid age");
                    continue;
                }
                break;
             }while(true);    
        
            System.out.print("Enter your address: ");
            add[count]=buf.readLine();
            do
            {
                try
                {
                     System.out.print("Enter your monthly Basic salary: ");
                     bsal[count]=Double.parseDouble(buf.readLine());
                }
                catch(NumberFormatException obj)
                {
                     System.out.println("Please enter digits only...");
                     continue;
                }
                 
                break;
            }while(true);    
            
            System.out.print("Enter your PAN Number: ");
            pan[count]=buf.readLine();
            int panflag=1;
            for (i =0;i<count;i++)
             {  
              if (pan[count].equals(pan[i]))
                {
                   System.out.println ("You are already an existing employee...Sorry "); 
                   panflag=0;
                   break;
                 }
            }
            if(panflag==0)
            {
              return;
            }
            DA[i]=0.75*bsal[i];
            HRA[i]=0.25*bsal[i];
            LTA[i]=0.15*bsal[i];
            PF[i]=0.12*bsal[i];
            ITax[i]=0.10*GSal[i];
            GSal[i]=bsal[i]+DA[i]+HRA[i]+LTA[i];
            NetSal[i]=GSal[i]-(PF[i]+ITax[i]);

            count++;
            System.out.println();
            System.out.println (" You are now registered ");
         }
        count++;
    }//end of newEmployee
 }