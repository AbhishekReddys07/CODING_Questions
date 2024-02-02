public class AlgPatreen {
	public static void main(String[] args) {

		for (int i = 1; i <= 15; i++) {
			for (int j = 1; j <= 15; j++) {
//
//				if (i ==1  && j==3) {
//					System.out.print("*"+ " ");
//				} 
//				else if(i==2 && j==2 || i==2 && j==4){
//					System.out.print("*");
//				}
//				else if(i==3 && j==2 || i==3 && j==4||i==3&& j==3)
//					System.out.print("*");
//				else{
//					System.out.print(" ");
//				}
				if(i==j||i==1||i==15||j==1||j==15||i+j==15+1 )
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
