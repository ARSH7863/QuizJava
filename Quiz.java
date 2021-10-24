import java.io.*;

import java.util.*;

class Login

{

    Scanner sc = new Scanner(System.in);

    InputStreamReader isr = new InputStreamReader(System.in);

    BufferedReader br = new BufferedReader(isr);

    char ch;

    int i, c, d, sr = 0, tr = 0;

    int marks = 0;

    int pmarks[] = new int[100];

    int chemmarks[] = new int[100];

    int gkmarks[] = new int[100];

    int iqmarks[] = new int[100];

    int rollno[] = new int[100];

    int prollno[] = new int[100];

    int chemrollno[] = new int[100];

    int gkrollno[] = new int[100];

    int iqrollno[] = new int[100];

    int n, p = 0, chem = 0, g = 0, q = 0, flag = 0, temp;

    String[] phyquestion = new String[100];

    String[] chemistryquestion = new String[100];

    String[] gkquestion = new String[100];

    String[] iqquestion = new String[100];

    String[] phyuser = new String[100];

    String[] chemistryuser = new String[100];

    String[] gkuser = new String[100];

    String[] iquser = new String[100];

    String[] phypass = new String[100];

    String[] chemistrypass = new String[100];

    String[] gkpass = new String[100];

    String[] iqpass = new String[100];

    String[] phyopt1 = new String[100];

    String[] chemistryopt1 = new String[100];

    String[] gkopt1 = new String[100];

    String[] iqopt1 = new String[100];

    String[] phyopt2 = new String[100];

    String[] chemistryopt2 = new String[100];

    String[] gkopt2 = new String[100];

    String[] iqopt2 = new String[100];

    String[] phyopt3 = new String[100];

    String[] chemistryopt3 = new String[100];

    String[] gkopt3 = new String[100];

    String[] iqopt3 = new String[100];

    String[] phyopt4 = new String[100];

    String[] chemistryopt4 = new String[100];

    String[] gkopt4 = new String[100];

    String[] iqopt4 = new String[100];

    int phyans[] = new int[100];

    int chemistryans[] = new int[100];

    int gkans[] = new int[100];

    int iqans[] = new int[100];

    String[] studuser = new String[100];

    String[] studpass = new String[100];

    String[] teachuser = new String[100];

    String[] teachpass = new String[100];

    String username = new String();

    String password = new String();

    int pcount = 0, chemcount = 0, gkcount = 0, iqcount = 0;

    void login() throws IOException

    {

        do

        {

            System.out.println("\nLOGIN PAGE\n");

            System.out.println("Select 1 for Student Login\n");

            System.out.println("Select 2 for Student Sign Up\n");

            System.out.println("Select 3 for Teacher Login\n");

            System.out.println("Select 4 for Teacher Sign Up\n");

            System.out.println("Select 5 to Exit\n");

            System.out.println("Enter your choice : ");

            c = sc.nextInt();

            switch (c)

            {

            case 1:

                studentlogin();

                break;

            case 2:

                studentsignup();

                break;

            case 3:

                teacherlogin();

                break;

            case 4:

                teachersignup();

                break;

            default:

                break;

            }

        } while (c != 5);

    }

    void studentlogin() throws IOException

    {

        if (sr != 0)

        {

            System.out.println("\nSTUDENT LOGIN\n");

            System.out.println("Enter Username : ");

            username = br.readLine();

            System.out.println("Enter password : ");

            password = br.readLine();

            for (i = 0; i < sr; i++)

            {

                if (studuser[i].equals(username))

                {

                    if (studpass[i].equals(password))

                    {

                        System.out.println("\nLOGIN SUCCESSFUL\n");

                        temp = i;

                        sselectsubject();

                        flag++;

                        break;

                    }

                }

            }

            if (flag == 0)

            {

                System.out.println("\nINCORRECT USERNAME OR PASSWORD. PLEASE REENTER\n");

                studentlogin();

            }

        }

        else

        {

            System.out.println("\nALERT: NO ACCOUNT CREATED YET. PLEASE SIGN UP!!\n");

            studentsignup();

        }

    }

    void teacherlogin() throws IOException

    {

        int flag = 0;

        if (tr != 0)

        {

            System.out.println("\nTEACHER LOGIN\n");

            System.out.println("Enter Username : ");

            username = br.readLine();

            System.out.println("Enter password : ");

            password = br.readLine();

            for (i = 0; i < tr; i++)

            {

                if (teachuser[i].equals(username))

                {

                    if (teachpass[i].equals(password))

                    {

                        System.out.println("\nLOGIN SUCCESSFUL\n");

                        tselectsubject();

                        flag++;

                        break;

                    }

                }

            }

            if (flag == 0)

            {

                System.out.println("\nINCORRECT USERNAME OR PASSWORD. PLEASE REENTER\n");

                teacherlogin();

            }

        }

        else

        {

            System.out.println("\nALERT : NO ACCOUNT CREATED YET. PLEASE SIGN IN!!\n");

            teachersignup();

        }

    }

    void studentsignup() throws IOException

    {

        String cpassword = new String();

        System.out.println("\nSTUDENT SIGNUP\n");

        System.out.println("Enter Username : ");

        studuser[sr] = br.readLine();

        System.out.println("Enter Roll no : ");

        rollno[sr] = sc.nextInt();

        System.out.println("Enter Password : ");

        studpass[sr] = br.readLine();

        System.out.println("Confirm Password : ");

        cpassword = br.readLine();

        if (studpass[sr].equals(cpassword))

        {

            if (sr == 0)

            {

                System.out.println("\nACCOUNT SUCCESSFULLY CREATED\n");

                sr++;

                studentlogin();

            }

            else

            {

                for (i = 0; i < sr - 1; i++)

                {

                    if (studuser[i].equals(studuser[sr]))

                    {

                        if (studpass[i].equals(studpass[sr]))

                        {

                            System.out.println("\nACCOUNT ALREADY EXISTS. PLEASE LOGIN\n");

                            login();

                        }

                    }

                }

                System.out.println("\nACCOUNT SUCCESSFULLY CREATED\n");

                sr++;

                studentlogin();

            }

        }

        else

        {

            System.out.println("\nPASSWORD AND CONFIRM PASSWORD DIDN'T MATCH\n");

            studentsignup();

        }

    }

    void teachersignup() throws IOException

    {

        String cpassword = new String();

        System.out.println("\nTEACHER SIGNUP\n");

        System.out.println("Enter Username : ");

        teachuser[tr] = br.readLine();

        System.out.println("Enter Password : ");

        teachpass[tr] = br.readLine();

        System.out.println("Confirm Password : ");

        cpassword = br.readLine();

        if (teachpass[tr].equals(cpassword))

        {

            if (tr == 0)

            {

                System.out.println("\nACCOUNT SUCCESSFULLY CREATED\n");

                tr++;

                teacherlogin();

            }

            else

            {

                for (i = 0; i < tr - 1; i++)

                {

                    if (teachuser[i].equals(teachuser[tr]))

                    {

                        if (teachpass[i].equals(teachpass[tr]))

                        {

                            System.out.println("\nACCOUNT ALREADY EXISTS. PLEASE LOGIN\n");

                            login();

                        }

                    }

                }

                System.out.println("\nACCOUNT SUCCESSFULLY CREATED\n");

                tr++;

                teacherlogin();

            }

        }

        else

        {

            System.out.println("\nPASSWORD AND CONFIRM PASSWORD DIDN'T MATCH\n");

            teachersignup();

        }

    }

    void sselectsubject() throws IOException

    {

        System.out.println("\nChose a subject from following:\n");

        System.out.println("1. Physics\n2.Chemistry\n3.General Knowledge\n4.IQ\n");

        System.out.println("Enter your choice\n");

        c = sc.nextInt();

        switch (c)

        {

        case 1:

            prollno[pcount] = rollno[temp];

            sphysics();

            break;

        case 2:

            chemrollno[chemcount] = rollno[temp];

            schemistry();

            break;

        case 3:

            gkrollno[gkcount] = rollno[temp];

            sgk();

            break;

        case 4:

            iqrollno[iqcount] = rollno[temp];

            siq();

            break;

        default:

            System.out.println("\nInvalid choice\n");

            sselectsubject();

            break;

        }

    }

    void tselectsubject() throws IOException

    {

        do

        {

            System.out.println("\nChose a subject from following:\n");

            System.out.println("1.Physics\n2.Chemistry\n3.General Knowledge\n4.IQ\n");

            System.out.println("Enter your choice : ");

            c = sc.nextInt();

            switch (c)

            {

            case 1:

                tphysics();

                break;

            case 2:

                tchemistry();

                break;

            case 3:

                tgk();

                break;

            case 4:

                tiq();

                break;

            default:

                System.out.println("\nInvalid choice\n");

                tselectsubject();

                break;

            }

            System.out.println("\nPress 1 to select other subject\n");

            c = sc.nextInt();

        } while (c == 1);

        login();

    }

    void tphysics() throws IOException

    {

        System.out.println(
                "\nPress 1 to add questions\nPress 2 to view marks\nPress 3 to return to previous menu\nPress 4 to return to login page\n");

        System.out.println("Enter your choice : ");

        c = sc.nextInt();

        switch (c)

        {

        case 1:

            System.out.println("Enter no. of question : ");

            n = sc.nextInt();

            for (i = p; i < n; i++)

            {

                System.out.println("\nEnter question no " + (i + 1));

                phyquestion[p] = br.readLine();

                System.out.println("Enter options\n");

                System.out.println("1.");

                phyopt1[p] = br.readLine();

                System.out.println("2.");

                phyopt2[p] = br.readLine();

                System.out.println("3.");

                phyopt3[p] = br.readLine();

                System.out.println("4.");

                phyopt4[p] = br.readLine();

                System.out.println("Enter answer : ");

                phyans[p] = sc.nextInt();

                p++;

            }

            tphysics();

            break;

        case 2:

            pdisplay();

            break;

        case 3:

            return;

        case 4:

            login();

        }

    }

    void tchemistry() throws IOException

    {

        System.out.println(
                "\nPress 1 to add questions\nPress 2 to view marks\nPress 3 to return to previous menu\nPress 4 to return to login page\n");

        System.out.println("Enter your choice : ");

        c = sc.nextInt();

        switch (c)

        {

        case 1:

            System.out.println("\nEnter no. of question : ");

            n = sc.nextInt();

            for (i = chem; i < n; i++)

            {

                System.out.println("Enter question no " + (i + 1));

                chemistryquestion[chem] = br.readLine();

                System.out.println("Enter options\n");

                System.out.println("1.");

                chemistryopt1[chem] = br.readLine();

                System.out.println("2.");

                chemistryopt2[chem] = br.readLine();

                System.out.println("3.");

                chemistryopt3[chem] = br.readLine();

                System.out.println("4.");

                chemistryopt4[chem] = br.readLine();

                System.out.println("Enter answer : ");

                chemistryans[chem] = sc.nextInt();

                chem++;

            }

            tchemistry();

            break;

        case 2:

            chemdisplay();

            break;

        case 3:

            return;

        case 4:

            login();

        }

    }

    void tgk() throws IOException

    {

        System.out.println("\nPress 1 to add questions\nPress 2 to view marks\nPress 3 to return to previous menu\n");

        System.out.println("Enter your choice : ");

        c = sc.nextInt();

        switch (c)

        {

        case 1:

            System.out.println("\nEnter no. of question : ");

            n = sc.nextInt();

            for (i = g; i < n; i++)

            {

                System.out.println("Enter question no " + (i + 1));

                gkquestion[g] = br.readLine();

                System.out.println("Enter options\n");

                System.out.println("1.");

                gkopt1[g] = br.readLine();

                System.out.println("2.");

                gkopt2[g] = br.readLine();

                System.out.println("3.");

                gkopt3[g] = br.readLine();

                System.out.println("4.");

                gkopt4[g] = br.readLine();

                System.out.println("Enter answer : ");

                gkans[g] = sc.nextInt();

                g++;

            }

            tgk();

            break;

        case 2:

            gkdisplay();

            break;

        case 3:

            return;

        }

    }

    void tiq() throws IOException

    {

        System.out.println("\nPress 1 to add questions\nPress 2 to view marks\nPress 3 to return to previous menu\n");

        System.out.println("Enter your choice : ");

        c = sc.nextInt();

        switch (c)

        {

        case 1:

            System.out.println("\nEnter no. of question : ");

            n = sc.nextInt();

            for (i = q; i < n; i++)

            {

                System.out.println("Enter question no " + (i + 1));

                iqquestion[q] = br.readLine();

                System.out.println("Enter options\n");

                System.out.println("1.");

                iqopt1[q] = br.readLine();

                System.out.println("2.");

                iqopt2[q] = br.readLine();

                System.out.println("3.");

                iqopt3[q] = br.readLine();

                System.out.println("4.");

                iqopt4[q] = br.readLine();

                System.out.println("Enter answer : ");

                iqans[q] = sc.nextInt();

                q++;

            }

            tiq();

            break;

        case 2:

            iqdisplay();

            break;

        case 3:

            return;

        }

    }

    void sphysics() throws IOException

    {

        int a;

        marks = 0;

        System.out.println("\nLets start the quiz\n");

        for (i = 0; i < n; i++)

        {

            System.out.println("\n Q." + (i + 1) + " " + phyquestion[i]);

            System.out.println("\n 1. " + phyopt1[i]);

            System.out.println("\n 2. " + phyopt2[i]);

            System.out.println("\n 3. " + phyopt3[i]);

            System.out.println("\n 4. " + phyopt4[i]);

            System.out.println("\n Enter your answer : ");

            a = sc.nextInt();

            if (a == phyans[i])

            {

                marks = marks + 4;

            }

            else

            {

                marks = marks - 1;

            }

        }

        pmarks[pcount] = marks;

        System.out.println("Your total marks is " + marks);

        pcount++;

        System.out.println(
                "\n1. If you want to give it a another try press 1\n2. To select other subject press 2\n3. To return to login page press 3\n");

        d = sc.nextInt();

        switch (d)

        {

        case 1:

            pcount--;

            sphysics();

            break;

        case 2:

            sselectsubject();

            break;

        case 3:

            login();

            break;

        }

    }

    void schemistry() throws IOException

    {

        int a;

        marks = 0;

        System.out.println("\nLets start the quiz\n");

        for (i = 0; i < n; i++)

        {

            System.out.println("\n Q." + (i + 1) + " " + chemistryquestion[i]);

            System.out.println("\n 1. " + chemistryopt1[i]);

            System.out.println("\n 2. " + chemistryopt2[i]);

            System.out.println("\n 3. " + chemistryopt3[i]);

            System.out.println("\n 4. " + chemistryopt4[i]);

            System.out.println("\n Enter your answer : ");

            a = sc.nextInt();

            if (a == chemistryans[i])

            {

                marks = marks + 4;

            }

            else

            {

                marks = marks - 1;

            }

        }

        chemmarks[chemcount] = marks;

        System.out.println("Your total marks is " + marks);

        chemcount++;

        System.out.println(
                "\n1. If you want to give it a another try press 1\n2. To select other subject press 2\n3. To return to login page press 3\n");

        d = sc.nextInt();

        switch (d)

        {

        case 1:

            chemcount--;

            schemistry();

            break;

        case 2:

            sselectsubject();

            break;

        case 3:

            login();

            break;

        }

    }

    void sgk() throws IOException

    {

        int a;

        System.out.println("\nLets start the quiz\n");

        marks = 0;

        for (i = 0; i < n; i++)

        {

            System.out.println("\n Q." + (i + 1) + " " + gkquestion[i]);

            System.out.println("\n 1. " + gkopt1[i]);

            System.out.println("\n 2. " + gkopt2[i]);

            System.out.println("\n 3. " + gkopt3[i]);

            System.out.println("\n 4. " + gkopt4[i]);

            System.out.println("\n Enter your answer : ");

            a = sc.nextInt();

            if (a == gkans[i])

            {

                marks = marks + 4;

            }

            else

            {

                marks = marks - 1;

            }

        }

        gkmarks[gkcount] = marks;

        System.out.println("Your total marks is " + marks);

        gkcount++;

        System.out.println(
                "\n1. If you want to give it a another try press 1\n2. To select other subject press 2\n3. To return to login page press 3\n");

        d = sc.nextInt();

        switch (d)

        {

        case 1:

            gkcount--;

            sgk();

            break;

        case 2:

            sselectsubject();

            break;

        case 3:

            login();

            break;

        }

    }

    void siq() throws IOException

    {

        int a;

        marks = 0;

        System.out.println("\nLets start the quiz\n");

        for (i = 0; i < n; i++)

        {

            System.out.println("\n Q." + (i + 1) + " " + iqquestion[i]);

            System.out.println("\n 1. " + iqopt1[i]);

            System.out.println("\n 2. " + iqopt2[i]);

            System.out.println("\n 3. " + iqopt3[i]);

            System.out.println("\n 4. " + iqopt4[i]);

            System.out.println("\n Enter your answer : ");

            a = sc.nextInt();

            if (a == iqans[i])

            {

                marks = marks + 4;

            }

            else

            {

                marks = marks - 1;

            }

        }

        iqmarks[iqcount] = marks;

        System.out.println("Your total marks is " + marks);

        iqcount++;

        System.out.println(
                "\n1. If you want to give it a another try press 1\n2. To select other subject press 2\n3. To return to login page press 3\n");

        d = sc.nextInt();

        switch (d)

        {

        case 1:

            iqcount--;

            siq();

            break;

        case 2:

            sselectsubject();

            break;

        case 3:

            login();

            break;

        }

    }

    void pdisplay()

    {

        if (pcount != 0)

        {

            System.out.println("Roll no\tMarks\n");

            for (i = 0; i < pcount; i++)

            {

                System.out.println(prollno[i] + "\t" + pmarks[i]);

            }

        }

        return;

    }

    void chemdisplay()

    {

        if (chemcount != 0)

        {

            System.out.println("Roll no\tMarks\n");

            for (i = 0; i < chemcount; i++)

            {

                System.out.println(chemrollno[i] + "\t" + chemmarks[i]);

            }

        }

        return;

    }

    void gkdisplay()

    {

        if (gkcount != 0)

        {

            System.out.println("Roll no\tMarks\n");

            for (i = 0; i < gkcount; i++)

            {

                System.out.println(gkrollno[i] + "\t" + gkmarks[i]);

            }

        }

        return;

    }

    void iqdisplay()

    {

        if (iqcount != 0)

        {

            System.out.println("Roll no\tMarks\n");

            for (i = 0; i < iqcount; i++)

            {

                System.out.println(iqrollno[i] + "\t" + iqmarks[i]);

            }

        }

        return;

    }

}

class Quiz

{
    public static void main(String[] args) throws IOException {
        Login l = new Login();
        l.login();
    }
}
