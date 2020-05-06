package com.bridgelabz.codinclub.main;
import java.util.*;

import com.bridgelabz.codinclub.service.AddressBook;
import com.bridgelabz.codinclub.util.Util;

public class main {

		public static void main(String []args){
			Scanner s = new Scanner(System.in);
			String opt;
			int option = 0;
			System.out.println("OPTIONS:");
			do {
				System.out.println("1.INSERT  2.OPEN  3.UPDATE  4.DELETE  5.SORT  6.QUIT");
				opt = s.next();
				boolean checkResult = Util.checkInt(opt);
				if (checkResult){
					option = Integer.parseInt(opt);
					switch(option){
						case 1:
								Util.getPerson();
								break;
						case 2:
								AddressBook a = new AddressBook();
								a.readData();
								break;
						case 3:
								System.out.println("enter id:");
								String id = s.next();
								s.nextLine();
								AddressBook abc = new AddressBook();
								abc.edit(id);
								break;
						case 4:
								System.out.println("1:Delete All 2:Delete One");
								int op = s.nextInt();
								if (op == 1){
									AddressBook aa = new AddressBook();
									try{
										aa.delete();
									}catch(Exception e){
										e.printStackTrace();
									}
								} else {
									System.out.println("Enter id:");
									String delete = s.next();
									AddressBook aaa = new AddressBook();
									try{
										aaa.deleteOne(delete);
									}catch(Exception e){
										e.printStackTrace();
									}
								}
								break;
						case 5:System.out.println("1.sortBy firstName 2.sortBy lastName 3.sortBy zip");
								int sortBy=s.nextInt();
								AddressBook ab = new AddressBook();
								if(sortBy == 1){
									ab.sortBy("firstName");
								}else if (sortBy == 2){
									ab.sortBy("lastName");
								}
								else if(sortBy == 3){
									ab.sortBy("zip");
								}else{
									 System.out.println("Enter a valid option:");
								}
								break;
						case 6: System.exit(0);break;
						default : System.out.println("Enter a valid option:");
					}
				}else{
					System.out.println("Enter a valid number:");
				}
			}while(option != 6);
		}
	}
