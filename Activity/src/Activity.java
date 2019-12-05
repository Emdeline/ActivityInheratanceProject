
public abstract class Activity
	{
		protected String name;
		protected String type;
		
		public abstract void playGame();
		public abstract void winOrLose();
		public void start()
			{
				System.out.println("The compition " + name + ", which is a " + type + ", is a ready to start. Lets Go!!");
			}
		
	}
//////////////