import java.util.Scanner;

public class menu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        studentList dssv = new studentList();
        int luaChon = 0;
        do {
            System.out.println("MENU ---------- ");
            System.out.println(
              "1.   ADD.\n"
            + "2.   Edit with ID\n"
            + "3.   Delete member with ID.\n"
            + "4.   SHOW.\n"
            + "5.   Clear list.\n"
            + "6.   Number menber in list.\n"
            + "7.   Find with ID.\n"
            + "8.   Sort high to low scores.\n"
            + "9.   Check NULL.\n"
            + "10.  Write file.\n"
            + "0.   Exit");
            luaChon = sc.nextInt();
            sc.nextLine();
            
            // add element
            if(luaChon == 1)
            {
                System.out.print("\nID: "); String ID= sc.nextLine();
                System.out.print("\nNAME: "); String NAME= sc.nextLine();
                System.out.print("\nAGE: "); int AGE = sc.nextInt();
                System.out.print("\nSCORE: "); float SCORE = sc.nextFloat();
                student sv = new student(ID, NAME, AGE, SCORE);
                dssv.addElement(sv);
                
            }

            // Edit element with ID
            else if(luaChon == 2)
            {
                System.out.print("ID: "); String ID= sc.nextLine();
                System.out.println("Info: ");
                dssv.editStudnet(ID);
            }

            else if(luaChon == 3) 
            {
                // Delete element with ID
                System.out.println("ID: "); 
                String ID = sc.nextLine();
                dssv.deleteElement(ID);
            }

            // show list
            else if(luaChon == 4) 
            {
                dssv.printList();   
            }

            // Clear list
            else if(luaChon == 5) 
            {
                dssv.clearList();
            }

            // Number member of list
            else if(luaChon == 6) 
            {
                System.out.println("NUMBER: "+ dssv.numberElement());
            }

            // Find element with ID
            else if(luaChon == 7) 
            {
                System.out.print("ID: "); String ID= sc.nextLine();
                System.out.println("Info: ");
                dssv.findStudnet(ID);
            }

            // Sort list
            else if(luaChon == 8) 
            {
                dssv.sortList();
                dssv.printList();
            }

            // Check NULL
            else if(luaChon == 9) 
            {
                System.out.println("Check empty list: "+ dssv.checkNULL());
            }

            // write file
            else if(luaChon == 10) 
            {
                dssv.writeFile();
            }

        }while(luaChon!=0);
    }
}




