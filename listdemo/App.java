package listdemo;
import java.util.ArrayList;
import java.util.Scanner;
public class App{
		public static void main(String[] args)throws InterruptedException{
			ArrayList<Student>list =new ArrayList<Student>();
			int choice=0;
			while(choice!=5){
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter your choice:");
				System.out.println("1: For Inserting students");
				System.out.println("2: For Updating students");
				System.out.println("3: For Deleting students");
				System.out.println("4: For Displaying All Records of Students");
				System.out.println("5: For Exit Student Menu");
				choice =sc.nextInt();
					switch (choice){
						case 1:
						Student s = new Student();
						s.scan();
						list.add(s);
						System.out.println("Student record successfully Inserted");
						break;
						
						case 2:
						System.out.println("Enter no which you want to Update Student record");
						int no=sc.nextInt();
						boolean flag = false;
						Student searchStudent =null;
						int i =0;
						for (; i<list.size();i++){
							searchStudent=list.get(i);
							if(searchStudent.getNo()==no){
								flag=true;
								break;
							}
						}
						if(flag){
							searchStudent.update();
							list.set(i, searchStudent);
							System.out.println("Student record successfully Updated");
						}
						else{
							System.out.println("No not found in students record");
						}
						break;
						
						case 3:
						break;
						
						case 4:
						System.out.println("Rno\tName\tStd");
						
						for(int j=0;j<list.size();j++){
							Student dis=list.get(j);
							System.out.println(dis.getNo()+"\t"+dis.getName()+"\t"+dis.getStd());
							
						}
						break;
						
						case 5:
							System.out.println("System wil exit:");
							Thread.sleep(1000);
							break;
						default:
							System.out.println("Invalid choice,\n\tPlease enter between 1 to 5");
							break;
					}
					sc.close();
				}
		}
}