
import java.util.Scanner;

public class CryptoQuiz {
	
	private static int 
		NUM_BITS1, 
		NUM_BITS2, 
		NUM_BITS3, 
		NUM_BITS4;
	
	private static String 
		CRYPT1,
		CRYPT2,
		CRYPT3, 
		CRYPT4;

	private static String 
		promptInitialChoice, 
		promptSelectBITs, 
		promptWhichSystemPart1,
		promptWhichSystemPart2, 
		promptSelectSystem, 
		promptHowManyBITsPart1,
		promptHowManyBITsPart2,
		feedbackInvalidChoice, 
		feedbackCorrect,
		feedbackIncorrect;
	

	//CODE ABOVE HERE IS GIVEN TO YOU - DO NOT ALTER IT

	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		


		
		//Initialize the quiz Q&A values, storing the values in the
		//  variables that were defined for you earlier in the code above.
		
		NUM_BITS1 = 64;
		NUM_BITS2 = 128; 
		NUM_BITS3 = 168; 
		NUM_BITS4 = 768;
		
		CRYPT1 = "Blowfish";
		CRYPT2 = "Rijndael";
		CRYPT3 = "TripleDES";
		CRYPT4 = "RSA";
		
		promptInitialChoice = "1) English   2) Espanol: ";
		feedbackInvalidChoice = "Invalid Choice";
		
		
		
		
//Ask what language they would like to use.
		
		System.out.print(promptInitialChoice);
		int langChoice = scan.nextInt();
		
		
//Start English version of test
		if (langChoice == 1)
		{
			promptSelectBITs = "Enter 1 to guess a crypto system, 2 to guess how many BITs:";
			promptWhichSystemPart1 = "Select a crypto system:";
			promptSelectSystem = "2 to guess how many BITs:";
			promptHowManyBITsPart1 = "Select number of BITs:";
			feedbackInvalidChoice = "Invalid choice.";
			feedbackCorrect = "Correct!";
			feedbackIncorrect = "Incorrect!";	
			
			System.out.print(promptSelectBITs);
			int choice1 = scan.nextInt();
			
//Start choice 1 of English Version	
			if(choice1 == 1)
			{
				System.out.print(promptHowManyBITsPart1);
				int n = scan.nextInt();
				scan.nextLine();
				if((n == 64) || (n == 128) || (n == 168) || (n == 768))
					{
						System.out.print("Which crypto system uses " + n + " BITs?");
						String guessCRYPT = scan.nextLine();
						
						
						if(n == NUM_BITS1 && guessCRYPT.equalsIgnoreCase(CRYPT1))
							{
							System.out.print(feedbackCorrect);
							} else if (n == NUM_BITS2 && guessCRYPT.equalsIgnoreCase(CRYPT2))
								{
								System.out.print(feedbackCorrect);
								} else if (n == NUM_BITS3 && guessCRYPT.equalsIgnoreCase(CRYPT3))
									{
									System.out.print(feedbackCorrect);
									} else if (n == NUM_BITS4 && guessCRYPT.equalsIgnoreCase(CRYPT4))
										{
										System.out.print(feedbackCorrect);
										} else
											{
											System.out.print(feedbackIncorrect);
											}
					}else
						{
						System.out.print(feedbackInvalidChoice);
						}
				
				
//Start choice 2 of English version
			}else if (choice1 == 2)
				{
				System.out.print(promptWhichSystemPart1);
				scan.nextLine();
				String CRYPT = scan.nextLine();
				
				if(CRYPT.equalsIgnoreCase(CRYPT1) || CRYPT.equalsIgnoreCase(CRYPT2) || CRYPT.equalsIgnoreCase(CRYPT3) || CRYPT.equalsIgnoreCase(CRYPT4))
					{
					System.out.print("How many BITs are used in a " + CRYPT + " system");
					int guessBIT = scan.nextInt();
					
					if((CRYPT.equalsIgnoreCase(CRYPT1) && guessBIT == NUM_BITS1) || (CRYPT.equalsIgnoreCase(CRYPT2) && guessBIT == NUM_BITS2)	|| (CRYPT.equalsIgnoreCase(CRYPT3) && guessBIT == NUM_BITS3) || (CRYPT.equalsIgnoreCase(CRYPT4) && guessBIT == NUM_BITS4))
						{
						System.out.print(feedbackCorrect);
						} else
							{
							System.out.print(feedbackIncorrect);
							}
					
					}else
						{
						System.out.print(feedbackInvalidChoice);
						}
				}
			
//Start Spanish version of test		
			
		} else if(langChoice == 2)
			{
			promptSelectBITs = "Presione el numero 1 para adivinar un sistema de codificacion criptografica, 2 para adivinar la cantidad de BITS:";
			promptWhichSystemPart1 = "Seleccione un sistema de codificacion criptografica:";
			promptSelectSystem = " 2 para adivinar la cantidad de BITS:";
			promptHowManyBITsPart1 = "Seleccione el numero de BITs:";
			feedbackInvalidChoice = "Opcion invalida.";
			feedbackCorrect = "Correcto!";
			feedbackIncorrect = "Incorrecto!";
			
			
			
			
			System.out.print(promptSelectBITs);
			int choice1 = scan.nextInt();
			
//Start choice 1 of Spanish version			
			if(choice1 == 1)
			{
				System.out.print(promptHowManyBITsPart1);
				int n = scan.nextInt();
				scan.nextLine();
				
				if(n == 64 || n == 128 || n == 168 || n == 768)
					{
						System.out.print("Que sistema de codificacion criptografica utiliza " + n + " BITs? ");
						String guessCRYPT = scan.nextLine();					
					if(n == NUM_BITS1 && guessCRYPT.equalsIgnoreCase(CRYPT1))
						{
						System.out.print(feedbackCorrect);
						} else if (n == NUM_BITS2 && guessCRYPT.equalsIgnoreCase(CRYPT2))
							{
							System.out.print(feedbackCorrect);
							} else if (n == NUM_BITS3 && guessCRYPT.equalsIgnoreCase(CRYPT3))
								{
								System.out.print(feedbackCorrect);
								} else if (n == NUM_BITS4 && guessCRYPT.equalsIgnoreCase(CRYPT4))
									{
									System.out.print(feedbackCorrect);
									} else
										{
										System.out.print(feedbackIncorrect);
										}
					}else
						{
						System.out.print(feedbackInvalidChoice);
						}
				
//Start choice 2 of Spanish version				
			}else if (choice1 == 2)
				{
				System.out.print(promptWhichSystemPart1);
				scan.nextLine();
				String CRYPT = scan.nextLine();
				
				if(CRYPT.equalsIgnoreCase(CRYPT1) || CRYPT.equalsIgnoreCase(CRYPT2) || CRYPT.equalsIgnoreCase(CRYPT3) || CRYPT.equalsIgnoreCase(CRYPT4))
					{
					System.out.print("Cuantos BITs son utilizados en un sistema " + CRYPT + "?");
					int guessBIT = scan.nextInt();
					
					if((CRYPT.equalsIgnoreCase(CRYPT1) && (guessBIT == NUM_BITS1)) || (CRYPT.equalsIgnoreCase(CRYPT2) && (guessBIT == NUM_BITS2))	|| (CRYPT.equalsIgnoreCase(CRYPT3) && (guessBIT == NUM_BITS3)) || (CRYPT.equalsIgnoreCase(CRYPT4) && (guessBIT == NUM_BITS4)))
						{
						System.out.print(feedbackCorrect);
						} else
							{
							System.out.print(feedbackIncorrect);
							}
					
					}else
						{
						System.out.print(feedbackInvalidChoice);
						}
				
				}
			}
	
		
		
		scan.close();
	}
}
