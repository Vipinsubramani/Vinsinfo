package vinsinfo;

public class StringReverse {
	public static void main(String[] args) {

				String a = "vipin";

				String rev = "";

				for(int i=0;i<a.length();i++)

					rev = a.charAt(i) + rev;

				if(a.equals(rev)) {

					System.out.println(true);

				}

				else {

					System.out.println(false);

					}

			}



		}


