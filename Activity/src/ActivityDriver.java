
public class ActivityDriver
	{

		public static void main(String[] args)
			{
				Activity [] Sport = new Activity[8];
					Sport[0] = new CrossCountry();
					Sport[1] = new Track();
					Sport[2] = new RacketBall();
					Sport[3] = new Swimming();
					Sport[4] = new Hockey();
					Sport[5] = new Lacross();
					Sport[6] = new Soccer();
					Sport[7] = new BasketBall();
					
				for(Activity s : Sport)
					{
						s.playGame();
						s.winOrLose();
						s.start();
						
						System.out.println();
					}

				
			}

	}
