
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import java.io.PrintWriter;

public class studentList  {

    // Biến có kiểu dữ liệu arraylist có tên "list"
    // khai báo với class SinhVien
    private ArrayList<student> list = new ArrayList<student>(); ;
        

        public studentList() {
        }
        
        public void addElement(student st)
        {
            this.list.add(st);
        }
        
        public void editStudnet(String ID) {
            Scanner sc = new Scanner(System.in);
            boolean check = false;
            for (student sinhVien : list) {
                if(ID.compareTo(sinhVien.getID()) == 0) {
                    System.out.print("\nName: ");
                    String nameEdit = sc.nextLine();
                    sinhVien.setFullName(nameEdit);

                    System.out.print("\nID  : ");
                    String idEdit = sc.nextLine();
                    sinhVien.setID(idEdit);

                    System.out.print("\nAGE : ");
                    int AgeEdit = sc.nextInt();
                    sinhVien.setAge(AgeEdit);

                    System.out.print("\nGPA : ");
                    Float GPAEdit = sc.nextFloat();
                    sinhVien.setGpa(GPAEdit);
                    check = true;
                }   
            }

            if(check == false)
                System.out.println("Not found edit");
        }

        public void deleteElement(String ID) {
            boolean check = false;
            for (int i=0; i < list.size(); i++) {
                if(ID.compareTo(list.get(i).getID()) == 0) {
                    list.remove(list.get(i));
                    System.out.println("\nDeleted student");
                    check = true;
                }   
            }

            if(check == false)
                System.out.println("Not found delete");
        }

        // public boolean deleteElement(student sv) {
        //     return this.list.remove(sv);
        // }

        public void printList() {
            for (student sinhVien : list) {
                System.out.println(sinhVien.toString());
            }
        }
        
        public boolean checkNULL() {
            return this.list.isEmpty();
        }
        
        public int numberElement() {
            return this.list.size();
        }
        
        public void clearList() {
            this.list.removeAll(list);
        }
        
        
        public void findStudnet(String ID) {
            boolean check = false;
            for (student sinhVien : list) {
                if(ID.compareTo(sinhVien.getID()) == 0) {
                    System.out.println(sinhVien);
                    check = true;
                }   
            }

            if(check == false)
                System.out.println("Not found");
        }
        
        public void sortList() {
            Collections.sort(this.list, new Comparator<student>() {
                @Override
                public int compare(student sv1, student sv2) {
                    if(sv1.getGpa()<sv2.getGpa()) {
                        return 1;
                    }else if(sv1.getGpa()>sv2.getGpa()) {
                        return -1;
                    }else {
                        return 0;
                    }
                }   
            });

        }
        public void writeFile() 
        {
            try {
                PrintWriter pw = new PrintWriter("outFile.txt", "UTF-8");
                
                for(int i = 0; i < list.size(); i++)
                {
                    pw.println(list.get(i).toString());
                }
                pw.flush();
                pw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
}



