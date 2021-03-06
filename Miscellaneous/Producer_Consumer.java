package Miscellaneous;

import java.util.*;

class Producer_Consumer {
	public static int ip = 1, in = 0, out = 3, p = 0;

	public static void main(String[] args) {
		int c;
		System.out.print("1.producer\n2.consumer\n3.exit");
		while(true) {
			System.out.print("\nchoice :");
			c = sc.nextInt();
			switch(c) {
			case 1:
				if(ip == 1 && out != 0) {
					producer();
				} else {
					System.out.println("buffer full");
				}
				break;
			case 2:
				if(ip == 1 && in != 0) {
					consumer();
				} else {
					System.out.println("buffer empty");
				}
				break;
			case 3:
				System.exit(0);
				break;
			}
		}
	}

	public static int cons(int s) {
		return --s;
	}

	public static int prod(int s) {
		return ++s;
	}

	public static void producer() {
		ip = cons(ip);
		in = prod(in);
		out = cons(out);
		p++;
		System.out.println("produces " + p);
		ip = prod(ip);
	}

	public static void consumer() {
		ip = cons(ip);
		in = cons(in);
		out = prod(out);
		System.out.println("consumes " + p);
		p--;
		ip = prod(ip);
	}

	public final static Scanner sc = new Scanner(System.in);
}
