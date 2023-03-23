package Task1;

import java.util.Scanner;

public class D_Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		A_Student s=new A_Student();
		B_College c=new B_College();
		C_University u=new C_University();
		
		System.out.println("  Enter Student Information ");
		System.out.println(" ----------------------------------------");
		System.out.print("  Student Name       =  ");
		s.setName(sc.next());
		System.out.print("  Student Contact    =  ");
		s.setMobno(sc.nextLong());
		

		System.out.print("  College ID         =  ");
		c.setClid(sc.nextInt());
		System.out.print("  College name       =  ");
		c.setClname(sc.next());
		System.out.print("  College Address    =  ");
		c.setCladdr(sc.next());
		c.setStu(s);
		
		System.out.print("  University ID      =  ");
		u.setUid(sc.nextInt());
		System.out.print("  University name    =  ");
		u.setUname(sc.next());
		System.out.print("  University Contact =  ");
		u.setMobno(sc.nextLong());
		u.setClg(c);
		System.out.println("  \nEnter Student Information ");
		System.out.println(" ----------------------------------------");
		System.out.println("Student Name       = "+u.getClg().getStu().getName());
		System.out.println("Student Contact    = "+u.getClg().getStu().getMobno());
		System.out.println("College ID         ="+u.getClg().getClid());
		System.out.println("College name       = "+u.getClg().getClname());
		System.out.println("College Address    = "+u.getClg().getCladdr());
		System.out.println("University ID      = "+u.getUid());
		System.out.println("University name    = "+u.getUname());
		System.out.println("University Contact = "+u.getMobno());
		
	}

}
