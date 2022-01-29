// package Practice;

// import java.util.Scanner;
// class ContactApp{

// 	public static void main(String[] args){
// 		int flag = -1;
// 		int choice,i=0;
// 		String sname;
// 		char ch;
// 		Scanner sc = new Scanner(System.in);
// 		Contacts c[] = new Contacts[5];
// 		while(true){
// 		System.out.println("1 ----> Add Contact");
// 		System.out.println("2 ----> List Contacts");
// 		System.out.println("3 ----> Search Contact By Name");
// 		System.out.println("4 ----> Search Contact By Character");
// 		System.out.println("5 ----> List All Contacts(A-Z)");
// 		System.out.println("6 ----> Exit");
// 		System.out.println("Enter the choice :");
// 		choice = sc.nextInt();
// 		switch(choice){
			
// 			case 1:  if(i==8){
// 					System.out.println("Sorry Your Contact List is Full !!!");
// 					break;	
// 					}
// 					c[i] = new Contacts();
// 					c[i].Add();
// 					i++;
				
// 				break;
// 			case 2: for(int j=0; j<i; j++){
// 					c[j].contact();
// 				}
// 				break;
// 			case 3: System.out.print("Search Contact by Name :");
// 				sname = sc.next();
// 				      for(int k=0; k<i; k++){
// 					if(c[k].byname(sname)==true){
// 						 c[k].contact();
// 						flag = 1;
// 						break;	
// 					}else{
// 						flag = 0;	 
// 					}//end of if
// 				      }//end of for
				   
// 				break;
// 			case 4: System.out.print("Search Contact by Character :");
// 				ch = sc.next().charAt(0);
//                 for (int j = 0; j < i; j++) {
//                     if()
//                 }
// 				break;
// 			case 5:
// 				break;
// 			case 6:System.exit(0);
// 				break;
// 		}//end of switch
// 			if(flag == 0)
// 			{
// 				System.out.println("Contact not found");
// 				flag = -1;
// 			}
//              }//end of while 
// 	}//end of main 
// }// end of public class
// class Contacts{
// 	String name,city;
// 	String number;
// 	void Add(){
// 		Scanner scr = new Scanner(System.in);
// 		System.out.print("Name :");
// 		name = scr.next();
// 		System.out.print("Contact number :");
// 		number = scr.next();	
// 		System.out.print("City :");
// 		city = scr.next();	
// 	}
// 	void contact(){

// 		System.out.println("Name :"+name);
// 		System.out.println("Contact number :"+number);
// 		System.out.println("City :"+city);
		 	
// 	}
// 	boolean byname(String n){ 
// 		if(n.equalsIgnoreCase(name)){
// 			return true;
			 
// 		}else{ 
// 			return false;
// 		}//end of if
// 	}
// }
