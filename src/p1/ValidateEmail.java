package p1;

public class ValidateEmail {

	public static void main(String[] args) {
		String email = "ishan.dua@gmail.com";
		String[] arr = email.split("@");
		if(arr.length != 2) {
			System.out.println("Not Valid!");
			return;
		}
		char[] ch = arr[0].toCharArray();
		for(char c : ch) {
			if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9') || c=='.' || c=='_') {
				
			}else {
				System.out.println("Not Valid!");
				return;
			}
		}
		String[] arr2 = arr[1].split(".");
		for(String str : arr2) {
			
			char[] ch2 = str.toCharArray();
			for(char c : ch2) {
				if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
					
				}else {
					System.out.println("Not Valid!");
					return;
				}
			}
		}
		System.out.println("valid email: "+ email);
	}

}
