import java.util.Scanner;
public class ScoreBord
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
				
		int scoreBord [][];
		
		int over = 1;
		int ball = 6;
		int run=0;
		int wicket=0;
		scoreBord = new int[over][ball];
		
		for(int i=0; i<over; i++)
		{
			for(int j=0; j<ball; j++)
			{
				System.out.println("Enter Run in over "+(i+1)+" in ball "+(j+1)+" : ");
				scoreBord[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<over; i++)
		{
			for(int j=0; j<ball; j++)
			{
				while(scoreBord[i][j] == -1 || scoreBord[i][j] == -2 || scoreBord[i][j] == -3)
				{
					if(scoreBord[i][j] == -1)
					{
						System.out.println("Enter run in wide: ");
						scoreBord[i][j] = sc.nextInt();
						run++;
					}
					else if(scoreBord[i][j] == -2)
					{
						System.out.println("Enter run in no ball: ");
						scoreBord[i][j] = sc.nextInt();
						
						if(scoreBord[i][j] == -2)
						{
							System.out.println("Enter run in no ball: ");
							scoreBord[i][j] = sc.nextInt();
						}
						run++;
					}
					else if(scoreBord[i][j] == -3)
					{
						scoreBord[i][j] = 0;
						wicket++;
					}
					
				}
				run = run + scoreBord[i][j];
			}
		}
		System.out.println("Total Run: "+run+"\nWicket: "+wicket);
	}
}