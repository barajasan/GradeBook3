import java.util.Scanner;

			import javax.swing.JOptionPane;

			public class GradeBook3 {
				
				public static int RandomNumber(){
					int a = 1+(int)(Math.random()*10);
					return a;
				}

				public static void main(String[] args) {
					//Declare
					int diceNumb, remainder,d=-1;
					String oddOrEven;
					
					//Start
					JOptionPane.showMessageDialog(null, "Throw a dice!");
					
					diceNumb= RandomNumber();
					
					oddOrEven=(JOptionPane.showInputDialog
							(null, "Do you think the number rolled is odd or even?").toLowerCase());

					//a odd # will have a remainder of 1, while a even # will have a remainder of 0
					remainder = diceNumb%2; 
					
					if(oddOrEven.equals("odd")||oddOrEven.equals("even")){
						switch(oddOrEven){
						case "odd":
							d=1;break;
						case "even":
							d=0;break;
						}
						if(d==remainder)
							JOptionPane.showMessageDialog(null, "You guessed correctly!");
						else
							JOptionPane.showMessageDialog(null, "You guessed wrong. :<");
					}
					else
						JOptionPane.showMessageDialog(null, "Invalid input. Try Again.");
				}
			}
			
			
			
			
			
		
	

