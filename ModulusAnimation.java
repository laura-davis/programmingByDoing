public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		for ( int i=0; i<80; i++ )
		{
			if ( i%18 == 0 )
				System.out.print("..................\r");
			if ( i%18 == 1 )
				System.out.print(".................H\r");
			if ( i%18 == 2 )
				System.out.print("................He\r");
			if ( i%18 == 3 )
				System.out.print("...............Hel\r");
			if ( i%18 == 4 )
				System.out.print("..............Hell\r");
			if ( i%18 == 5 )
				System.out.print(".............Hello\r");
			if ( i%18 == 6 )
				System.out.print("............Hello.\r");
			if ( i%18 == 7 )
				System.out.print("...........Hello.T\r");
			if ( i%18 == 8 )
				System.out.print("..........Hello.Th\r");
			if ( i%18 == 9 )
				System.out.print(".........Hello.The\r");
			if ( i%18 == 10 )
				System.out.print("........Hello.Ther\r");
			if ( i%18 == 11 )
				System.out.print(".......Hello.There\r");
			if ( i%18 == 12 )
				System.out.print("......Hello.There.\r");
			if ( i%18 == 13 )
				System.out.print(".....Hello.There..\r");
			if ( i%18 == 14 )
				System.out.print("....Hello.There...\r");
			if ( i%18 == 15 )
				System.out.print("...Hello.There....\r");
			if ( i%18 == 16 )
				System.out.print("..Hello.There.....\r");
			if ( i%18 == 17 )
				System.out.print(".Hello.There......\r");
			Thread.sleep(100);
		}
		
	}
}