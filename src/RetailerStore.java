import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class RetailerStore {
    
		public static String currentUserID = "";
	public static String currentUserType = "";
	public static Scanner scanner = new Scanner(System.in);
	public static String userAction = ""; // for activity logs

	public static void checkEssentialFiles() throws IOException {
		File productFiles = new File("ProductRecords.txt");
		if (!productFiles.exists() || productFiles.length() == 0) {
			createDefaultProducts();
		}

		File inventoryFile = new File("ProductInventory.txt");
		if (!inventoryFile.exists() || inventoryFile.length() == 0) {
			createDefaultVariations();
		}

		File accountFile = new File("AccountRecords.txt");
		if (!accountFile.exists() || accountFile.length() == 0) {
			createDefaultAccounts();
		}

		File cartFile = new File("Cart.txt");
		if (!cartFile.exists() || cartFile.length() == 0) {
			BufferedWriter createCart = new BufferedWriter(new FileWriter(cartFile));
			createCart.close();
		}

		File salesRecordsFile = new File("SalesRecords.txt");
		if (!salesRecordsFile.exists() || salesRecordsFile.length() == 0) {
			BufferedWriter createSalesRecords = new BufferedWriter(new FileWriter(salesRecordsFile));
			createSalesRecords.close();
		}

		File salesTransactionsFile = new File("SalesTransactions.txt");
		if (!salesTransactionsFile.exists() || salesTransactionsFile.length() == 0) {
			BufferedWriter createSalesTransactions = new BufferedWriter(new FileWriter(salesTransactionsFile));
			createSalesTransactions.close();
		}

		File activityLogs = new File("ActivityLogs.txt");
		if (!activityLogs.exists() || activityLogs.length() == 0) {
			BufferedWriter createActivityLogsFile = new BufferedWriter(new FileWriter(activityLogs));
			createActivityLogsFile.close();
		}

		File tempFile = new File("temp.txt");
		if (!tempFile.exists() || tempFile.length() == 0) {
			BufferedWriter createTempFile = new BufferedWriter(new FileWriter(tempFile));
			createTempFile.close();
		}

		File walletFiles = new File("SORAIA_Wallets.txt");
		if (!walletFiles.exists() || walletFiles.length() == 0) {
			createDefaultWallet();
		}
		
		File archived = new File("ArchivedAccounts.txt");
		if (!archived.exists() || archived.length() == 0) {
			BufferedWriter createArchivedAccount = new BufferedWriter(new FileWriter(archived));
			createArchivedAccount.close();
		}

		File archiveProduct = new File("ArchiveProducts.txt");
		if (!archiveProduct.exists() && archiveProduct.length() == 0){
			BufferedWriter createProductArchives = new BufferedWriter(new FileWriter(archiveProduct));
			createProductArchives.close();
		}
	}

	public static void createDefaultProducts() throws IOException {
		BufferedWriter productWriter = new BufferedWriter(new FileWriter("ProductRecords.txt"));
//      skin care products SCP
		productWriter.write("1000*SCP*Garnier Micellar Water Cleanser*399*80\n");
		productWriter.write("1001*SCP*Madagascar Centrella Light Cleansing Oil*399*60\n");
		productWriter.write("1002*SCP*Senka Perfect Whip Cleansing Foam*300*60\n");
//      body care products
		productWriter.write("2000*BCP*BODY TREATS Hand Soap*199*120\n");
		productWriter.write("2001*BCP*DEO NAT Mineral Deodorant Spray*192*60\n");
		productWriter.write("2002*BCP*Luxe Organix Whitening Serum Lotion*299*60\n");
//      makeup products
		productWriter.write("3000*MUP*MAYBELLINE Superstay Lumimatte Foundation*699*100\n");
		productWriter.write("3001*MUP*YOU Noutriwear Complete Cover Concealer*269*100\n");
		productWriter.write("3002*MUP*GRWM Glam & Go Stix Multiuse - Contour Stick*449*60\n");
//      hair care products
		productWriter.write("4000*HCP*NATURALS Hair Treatment Oil*157*80\n");
		productWriter.write("4001*HCP*TRESemmé Shampoo Keratin Smooth*204*80\n");
		productWriter.write("4002*HCP*Dove 1 Minute Conditioner*194*80\n");
//      nail care products
		productWriter.write("5000*NCP*PRETTY SECRET Nail to Toe Kit with Nipper*189*20\n");
		productWriter.write("5001*NCP*OMG Nail Care Shine File*60*20\n");
		productWriter.write("5002*NCP*Catrice Nail Growth Elixir Treatment*325*20\n");
//      TOILETRIES sanitary products
		productWriter.write("6000*TSP*KOTEX Luxe Ultrathin Overnight*150*80\n");
		productWriter.write("6001*TSP*PH Care Feminine Wash*198*100\n");
		productWriter.write("6002*TSP*Kleenex Travellers Tissue*60*40\n");
		productWriter.close();
	}

	public static void createDefaultVariations() throws IOException {
		BufferedWriter productWriter = new BufferedWriter(
				new FileWriter("ProductInventory.txt"));
//      SCP - Product 1
		productWriter.write("1000*1*For Sensitive Skin*400ml*20\n");
		productWriter.write("1000*2*Vitamin C*400ml*20\n");
		productWriter.write("1000*3*Salycylic BHA*400ml*20\n");
		productWriter.write("1000*4*Argan Oil*400ml*20\n");

//      SCP - Product 2
		productWriter.write("1001*1*For All Skin Types*200ml*20\n");
		productWriter.write("1001*2*Hydrating and Nourishing*200ml*20\n");
		productWriter.write("1001*3*Deep Cleansing*200ml*20\n");

//      SCP - Product 3
		productWriter.write("1002*1*Collagen*120g*20\n");
		productWriter.write("1002*2*Acne Care*120g*20\n");
		productWriter.write("1002*3*Hyaluronic Acid*120g*20\n");

//      BCP - Product 1
		productWriter.write("2000*1*Cranberry*750ml*20\n");
		productWriter.write("2000*2*Wild Orchid*750ml*20\n");
		productWriter.write("2000*3*Clean Cotton*750ml*20\n");
		productWriter.write("2000*4*Green Tea*750ml*20\n");
		productWriter.write("2000*5*Citrus*750ml*20\n");
		productWriter.write("2000*6*Antibacterial*750ml*20\n");

//      BCP - Product 2
		productWriter.write("2001*1*Papaya*100ml*20\n");
		productWriter.write("2001*2*Aloe*100ml*20\n");
		productWriter.write("2001*3*Natural*100ml*20\n");

//      BCP - Product 6
		productWriter.write("2002*1*Milk White Glutaboost*150g*20\n");
		productWriter.write("2002*2*Vit C + Arbutin*150g*20\n");
		productWriter.write("2002*3*Vitamin C Premium*150g*20\n");

//      MUP - Product 1
		productWriter.write("3000*1*Shade 110*70g*20\n");
		productWriter.write("3000*2*Shade 120*70g*20\n");
		productWriter.write("3000*3*Shade 228*70g*20\n");
		productWriter.write("3000*4*Shade 230*70g*20\n");
		productWriter.write("3000*5*Shade 326*70g*20\n");

//      MUP - Product 2
		productWriter.write("3001*1*FC02 Creme*80ml*20\n");
		productWriter.write("3001*2*FW06 Sand*80ml*20\n");
		productWriter.write("3001*3*LC10 Oat*80ml*20\n");
		productWriter.write("3001*4*LN12 Buff*80ml*20\n");
		productWriter.write("3001*5*MW30 Walnut*80ml*20\n");
//      MUP - Product 3
		productWriter.write("3002*1*Affogato*200g*20\n");
		productWriter.write("3002*2*Café au lait*200g*20\n");
		productWriter.write("3002*3*Con Panna*200g*20\n");

//      HCP - Product 1
		productWriter.write("4000*1*Olive Oil*100ml*20\n");
		productWriter.write("4000*2*Coconut Oil*100ml*20\n");
		productWriter.write("4000*3*Argan Oil*100ml*20\n");
		productWriter.write("4000*4*Lavender Oil*100ml*20\n");

//      HCP - Product 7
		productWriter.write("4001*1*Size 1*170ml*20\n");
		productWriter.write("4001*2*Size 2*330ml*20\n");
		productWriter.write("4001*3*Size 3*620ml*20\n");
		productWriter.write("4001*4*Size 4*900ml*20\n");

//      HCP - Product 8
		productWriter.write("4002*1*Straight and Silky*150ml*20\n");
		productWriter.write("4002*2*Ceramide Intense Repair*150ml*20\n");
		productWriter.write("4002*3*Niacinamide + Arbutin*350ml*20\n");
		productWriter.write("4002*4*Biotin Hair Fall Rescue*150ml*20\n");

//      NCP - Product 2
		productWriter.write("5000*1*Standard*1pc*20\n");

//      NCP - Product 2
		productWriter.write("5001*1*Standard*1pc*20\n");
//      NCP - Product 2
		productWriter.write("5002*1*Standard*10.5ml*20\n");

//      TSP - Product 2
		productWriter.write("6000*1*Retinol + Gluta*350ml*20\n");
		productWriter.write("6000*2*Milk + Gluta*350ml*20\n");
		productWriter.write("6000*3*Niacinamide + Arbutin*350ml*20\n");
		productWriter.write("6000*4*Tranexamic Acid*350ml*20\n");

//      TCP - PRoduct 3
		productWriter.write("6001*1*Cooling Comfort*250ml*20\n");
		productWriter.write("6001*2*Retinol + Gluta*350ml*20\n");
		productWriter.write("6001*3*Delicate White*250ml*20\n");
		productWriter.write("6001*4*Floral Clean*250ml*20\n");
		productWriter.write("6001*5*Natural Protection*250ml*20\n");

//      TCP - Product
		productWriter.write("6002*1*2Ply*40 Pulls*20\n");
		productWriter.write("6002*2*2Ply*60 Pulls*20\n");

		productWriter.close();
	}

	public static void createDefaultAccounts() throws IOException {
		BufferedWriter accountWriter = new BufferedWriter(new FileWriter("AccountRecords.txt"));
		// CUSTOMERS
		accountWriter.write(
				"C01*John Doe*N%qt{j%of{f*john.doe@example.com*123 Maple Street, Springfield*Customer*Enabled\n");
		accountWriter.write(
				"C02*Alice Smith*NfrFqnhjXrnym*alice.smith@example.com*456 Oak Avenue, Metropolis*Customer*Enabled\n");
		accountWriter.write("C03*Bob Johnson*6789*bob.j@example.com*789 Pine Road, Gotham*Customer*Enabled\n");
		// ADMINS
		accountWriter.write(
				"A01*Emily Wong*jw|\\mfyFXnlrf*emily.wong@example.com*321 Elm Boulevard, Star City*Admin*Enabled\n");
		accountWriter.write(
				"A02*Mike Santos*ywfqfqjqtYwfqfqf*mike.s@example.com*654 Birch Lane, Central City*Admin*Enabled\n");
		accountWriter.write(
				"A03*Sarah Connor*yzslyzslyzslxfmzw*sarah.c@example.com*987 Cedar Court, Neon City*Admin*Enabled\n");
		accountWriter.close();
	}

	public static void displayProductCategories() {
		System.out.println("=".repeat(120)); // Adjusted menu width
		System.out.printf("| %-116s |\n", centerText("PRODUCT VIEWER MENU", 116)); // Centered menu title
		System.out.println("=".repeat(120));
		System.out.printf("| %-116s |\n", centerText("1. Skin Care Products", 114));
		System.out.printf("| %-116s |\n", centerText("2. Body Care Products", 114));
		System.out.printf("| %-116s |\n", centerText("3. Makeup Products", 110));
		System.out.printf("| %-116s |\n", centerText("4. Hair Care Products", 114));
		System.out.printf("| %-116s |\n", centerText("5. Nail Care Products", 114));
		System.out.printf("| %-45s %-70s |\n", "", ("6. Toiletries/Sanitary products"));
		System.out.printf("| %-116s |\n", centerText("0. Back to Main Menu", 113));
		System.out.println("=".repeat(120));
		System.out.print("Select an option: ");
	}

	public static void displayEMoneyOptions() {
		System.out.println("\n========================================================================================================================");
		System.out.println("|                                                    SELECT E-MONEY OPTIONS                                            |");
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("|                                                 1. Gcash                                                             |");
		System.out.println("|                                                 2. PayMaya                                                           |");
		System.out.println("|                                                 3. GrabPay                                                           |");
		System.out.println("|                                                 0. Back to Main Menu                                                 |");		
		System.out.println("________________________________________________________________________________________________________________________");
		System.out.print("Select an option: ");
	}

	
	public static void displayPaymentOptions() {
		System.out.println("\n========================================================================================================================");
		System.out.println("|                                                    SELECT PAYMENT OPTIONS                                            |");
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("|                                                 1. Cash on Delivery                                                  |");
		System.out.println("|                                                 2. SORAIA Pay                                                        |");
		System.out.println("|                                                 3. Other E-Money provider                                            |");
		System.out.println("|                                                 0. Go Back                                                           |");
		System.out.println("________________________________________________________________________________________________________________________");
		System.out.print("Select an option: ");
	}


	public static void displayCartOptions() throws IOException {
	    System.out.println("========================================================================================================================");
	    System.out.println("|                                                   EDIT CART MENU                                                     |");
	    System.out.println("------------------------------------------------------------------------------------------------------------------------");
	    System.out.println("|                                                 1. Edit Item                                                          |");
	    System.out.println("|                                                 2. Add Item                                                           |");
	    System.out.println("|                                                 3. Remove/Cancel Item                                                 |");
	    System.out.println("|                                                 4. Proceed to Checkout                                                |");
	    System.out.println("|                                                 0. Go back                                                            |");
	    System.out.println("________________________________________________________________________________________________________________________");
	    System.out.print("Select an option: ");
	}
	
	public static void displayAddProductMenu() {
		System.out.println("\n========================================================================================================================");
		System.out.println("|                                                   ADD PRODUCT MENU                                                   |");
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("|                                                1. Add product                                                        |");
		System.out.println("|                                                2. Add variant to existing product                                    |");
		System.out.println("|                                                3. Save and Exit                                                      |");
		System.out.println("|                                                0. Back to Main Menu                                                  |");
		System.out.println("________________________________________________________________________________________________________________________");
		System.out.print("Select an option: ");
	}

	public static void displayArchiveProductMenu() {
		System.out.println("\n========================================================================================================================");
		System.out.println("|                                                 ARCHIVE PRODUCT MENU                                                   |");
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("|                                                1. Delete a product                                                   |");
		System.out.println("|                                                2. Delete a product variant                                           |");
		System.out.println("|                                                3. Save and Exit                                                      |");
		System.out.println("|                                                0. Back to Main Menu                                                  |");
		System.out.println("________________________________________________________________________________________________________________________");
		System.out.print("Select an option: ");
	}

	public static void displayEditAdminAccountMenu() {
		System.out.println("\n========================================================================================================================");
		System.out.println("|                                                   EDIT ACCOUNT MENU                                                  |");
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("|                                                1. Username                                                           |");
		System.out.println("|                                                2. Password                                                              |");
		System.out.println("|                                                3. Email                                                              |");
		System.out.println("|                                                4. Address                                                            |");
		System.out.println("|                                                5. User Type                                                          |");
		System.out.println("|                                                6. Account Status                                                     |");
		System.out.println("|                                                7. All updatable details                                              |");
		System.out.println("|                                                7. Delete Account                                                     |");
		System.out.println("|                                                9. Save changes                                                       |");
		System.out.println("|                                                0. Back to Main Menu                                                  |");
		System.out.println("________________________________________________________________________________________________________________________");
		System.out.print("Select an option: ");
	}
	
	public static void displayEditUserAccountMenu() {
		System.out.println("\n========================================================================================================================");
		System.out.println("|                                                   EDIT ACCOUNT MENU                                                  |");
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("|                                                1. Username                                                           |");
		System.out.println("|                                                2. Password                                                           |");	
		System.out.println("|                                                3. Email                                                              |");
		System.out.println("|                                                4. Address                                                            |");
		System.out.println("|                                                5. All updatable details                                              |");
		System.out.println("|                                                6. Delete Account                                                     |");
		System.out.println("|                                                7. Save changes                                                       |");
		System.out.println("|                                                0. Back to Main Menu                                                  |");
		System.out.println("________________________________________________________________________________________________________________________");
		System.out.print("Select an option: ");
	}

	public static void displayEditProductMenu() {
		System.out.println("\n========================================================================================================================");
		System.out.println("|                                                   EDIT PRODUCT MENU                                                  |");
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("|                                                1. Product name                                                       |");
		System.out.println("|                                                2. Price                                                              |");
		System.out.println("|                                                3. Number of stocks                                                   |");
		System.out.println("|                                                4. All product details                                                |");
		System.out.println("|                                                5. Edit product variants                                              |");
		System.out.println("|                                                6. Save and Exit                                                      |");
		System.out.println("|                                                0. Back to Main Menu                                                  |");
		System.out.println("________________________________________________________________________________________________________________________");
		System.out.print("Select an option: ");
	}

	public static void displayEditVariantMenu() {
		System.out.println("\n========================================================================================================================");
		System.out.println("|                                                   EDIT PRODUCT VARIANT MENU                                          |");
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("|                                                1. Variant name                                                       |");
		System.out.println("|                                                2. Size                                                               |");
		System.out.println("|                                                3. Number of stocks                                                   |");
		System.out.println("|                                                4. Edit all variant detail                                            |");
		System.out.println("|                                                5. Save edited variant                                                |");
		System.out.println("|                                                0. Back to Main Menu                                                  |");
		System.out.println("________________________________________________________________________________________________________________________");
		System.out.print("Select an option: ");
	}

	public static void displayAccountTypeMenu() {
		System.out.println("========================================================================================================================");
		System.out.println("|                                                   CHOOSE ACCOUNT TYPE                                                |");
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("|                                                1. Admin Account                                                      |");
		System.out.println("|                                                2. User Account                                                       |");
		System.out.println("|                                                0. Back to Main Menu                                                  |");
		System.out.println("________________________________________________________________________________________________________________________");
		System.out.print("Select an option: ");
	}

	public static void displayUserMenu() {
		System.out.println("\n========================================================================================================================");
		System.out.println("|                                                   USER MENU                                                          |");
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("|                                                1. Browse Products                                                    |");
		System.out.println("|                                                2. View Cart                                                          |");
		System.out.println("|                                                3. My Purchase                                                        |");
		System.out.println("|                                                4. Delete account                                                     |");
		System.out.println("|                                                5. Edit Account Details                                               |");
		System.out.println("|                                                0. Back to Main Menu                                                  |");
		System.out.println("______________________________________________________________________________________________________________________");
		System.out.print("Select an option: ");
	}
	public static void displayAdminMenu() {
		System.out.println("\n========================================================================================================================");
		System.out.println("|                                                   ADMIN MENU                                                          |");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println("|                                                1. View Reports                                                        |");
		System.out.println("|                                                2. Add Products                                                        |");
		System.out.println("|                                                3. Edit Products                                                       |");
		System.out.println("|                                                4. Archive Products                                                    |");
		System.out.println("|                                                5. Edit Account Details                                                |");
		System.out.println("|                                                0. Back to Main Menu                                                   |");
		System.out.println("_________________________________________________________________________________________________________________________");
		System.out.print("Select an option: ");
	}


	public static void displayMainMenu() {
		System.out.println("========================================================================================================================");
		System.out.println("|                                       ✿.｡.:* ☆:**:. 𝓢𝓞𝓡𝓐𝓘𝓐.:**:.☆*.:｡.✿                                              |");
		System.out.println("|                                            𝓡𝓪𝓭𝓲𝓪𝓷𝓬𝓮 𝔀𝓲𝓽𝓱𝓲𝓷 𝔂𝓸𝓾𝓻𝓼𝓮𝓵𝓯                                                     |");
		System.out.println("________________________________________________________________________________________________________________________");
		System.out.println("|                                                 1. Log In                                                            |");
		System.out.println("|                                                 2. Create Account                                                    |");
		System.out.println("|                                                 0. Exit                                                              |");
		System.out.println("========================================================================================================================");
		System.out.print("Select an option: ");
	}

	private static String centerText(String text, int width) {
		int padding = width - text.length();
		if (padding <= 0) {
			return text;
		}
		int leftPadding = padding / 2;
		int rightPadding = padding - leftPadding;
		return " ".repeat(leftPadding) + text + " ".repeat(rightPadding);
	}







	public static void logActivity(String action) throws IOException {
		// TIMESTAMP*UserID*USER_TYPE*Action
		LocalTime currentTime = LocalTime.now();
		LocalDate currentDate = LocalDate.now();
		File activityLogs = new File("ActivityLogs.txt");
		BufferedWriter activityLogsWriter = new BufferedWriter(new FileWriter(activityLogs, true));
		activityLogsWriter.write(
				String.join("*", currentDate.toString(), currentTime.toString(), currentUserID, currentUserType, action)
						+ "\n");
		activityLogsWriter.close();
	}

	public static void createDefaultWallet() throws IOException {
		BufferedWriter walletWriter = new BufferedWriter(new FileWriter("SORAIA_Wallets.txt"));
		walletWriter.write("C01*John Doe*1000.00\n");
		walletWriter.write("C02*Alice Smith*1000.00\n");
		walletWriter.write("C03*Bob Johnson*1000.00\n");
		walletWriter.close();
	}

	public static void printDecryptedPasswords() throws IOException {
		File file = new File("AccountRecords.txt");
		System.out.println("Decrypted Password");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = "";
		while ((line = reader.readLine()) != null) {
			String[] fields = line.split("\\*");
			System.out.println(decryptPassword(fields[2]));
		}
		reader.close();
	}

	public static String encryptPassword(String password) {
		String encryptedPassword = "";
		char[] chars = password.toCharArray();
		for (char character : chars) {
			character += 5;
			encryptedPassword += character;
		}
		return encryptedPassword;
	}

	public static String decryptPassword(String password) {
		String decryptedPassword = "";
		char[] chars = password.toCharArray();
		for (char character : chars) {
			character -= 5;
			decryptedPassword += character;
		}
		return decryptedPassword;
	}

	public static boolean doesUsernameExist(String userName) throws IOException {
		if (userName.equals("0"))
			return true; // early out
		BufferedReader accountReader = new BufferedReader(new FileReader("AccountRecords.txt"));
		String line = "";
		while ((line = accountReader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (fields[1].equals(userName)) {
				accountReader.close();
				return true;
			}
		}
		accountReader.close();
		return false;
	}

	public static String getUserType() {
		displayAccountTypeMenu();
		String choice = scanner.nextLine().trim();
		while (!(choice.equals("1") || choice.equals("2") || choice.equals("0"))) {
			System.out.println(choice);
			System.err.println("Invalid choice. Please try again.");
			System.out.print("Select an option: ");
			choice = scanner.nextLine().trim();
		}
		if (choice.equals("0")) { // go back
			return "";
		}
		if (choice.equals("2")) {
			return "Customer";
		}
		// handling the admin account creation
		int adminCodeAttempt = 0;
		while (adminCodeAttempt < 3) {
			System.out.print("Enter admin verification code: ");
			String code = scanner.nextLine().trim();

			if (code.equals("0")) {
				System.out.println("\nReturning to main menu...\n");
				return "";
			}

			if (code.equals("50R414")) {
				System.out.println("\nAdmin verification code accepted.\n");
				return "Admin";
			} else {
				adminCodeAttempt++;
				System.err.println("Incorrect admin code. Please try again");
			}
		}
		if (adminCodeAttempt == 3) {
			System.out.println("\nAssigning your account type to Customer.\n");
			return "Customer";
		}
		return "";
	}

	public static String generateAccountID(String userType) throws IOException {
		String prefix = userType.equalsIgnoreCase("CUSTOMER") ? "C" : "A";
		String line;
		BufferedReader reader = new BufferedReader(new FileReader("AccountRecords.txt"));
		int lastAccountID = 0;
		while ((line = reader.readLine()) != null) {
			String fields[] = line.split("\\*");
			if (fields[0].startsWith(prefix)) { // C
				int currentAccountID = Integer.parseInt(fields[0].substring(1).trim());
				if (currentAccountID > lastAccountID) {
					lastAccountID = currentAccountID;
				}
			}
		}
		reader.close();
		return String.format("%s%02d", prefix, lastAccountID + 1);
	}

	public static boolean isEmailValid(String email) {
		String checker[] = email.split("");
		int ctr = 0;
		int idx = -1;
		for (int i = 0; i < checker.length; i++) {
			if (checker[i].equalsIgnoreCase("@")) {
				ctr++;
				idx = i;
			}
		}
		String address = email.substring(idx + 1);
		if (ctr != 1 || email.substring(0, idx).contains(" "))
			return false;
		if (address.contains(" ") || !address.endsWith(".com") || address.charAt(0) == '.')
			return false;
		if (email.charAt(idx - 1) == '.')
			return false;
		return true;
	}

	

	public static boolean isAdmin() {
		return currentUserType.equalsIgnoreCase("Admin");
	}

	public static String editAdminAccountAttributes(String[] accountFields) throws IOException {
		String accountAttributes = "";
		boolean isEditing = true;
		String choice = "";
		while (isEditing) {
			displayEditAdminAccountMenu();
			choice = scanner.nextLine().trim();
			switch (choice) {
			case "0":
				System.out.println("Changes not saved. Going back ...");
				return "goBackToMenu"; // early out
			case "1":
				System.out.print("Enter new username: ");
				accountFields[1] = scanner.nextLine().trim();
				break;
			case "2":
				System.out.print("Enter new password: ");
				String newPassword = scanner.nextLine().trim();
				accountFields[2] = encryptPassword(newPassword);
				break;
			case "3":
				System.out.print("Enter new email: ");
				accountFields[3] = scanner.nextLine().trim();
				while (!isEmailValid(accountFields[3])) {
					System.out.println("Invalid email account.\n");
					System.out.print("Enter email: ");
					accountFields[3] = scanner.nextLine().trim();
				}
				break;
			case "4":
				System.out.print("Enter new address: ");
				accountFields[4] = scanner.nextLine().trim();
				break;
			case "5":
				System.out.print("Enter new user type [Admin/Customer]: ");
				accountFields[5] = scanner.nextLine().trim();
				break;
			case "6":
				System.out.print("Enter new account status [Enabled/Disabled]: ");
				accountFields[6] = scanner.nextLine().trim();
				break;
			case "7":
				System.out.print("Enter new username: ");
				accountFields[1] = scanner.nextLine().trim();
				System.out.print("Enter new password: ");
				newPassword = scanner.nextLine().trim();
				accountFields[2] = encryptPassword(newPassword);
				System.out.print("Enter new email: ");
				accountFields[3] = scanner.nextLine().trim();
				System.out.print("Enter new address: ");
				accountFields[4] = scanner.nextLine().trim();
				System.out.print("Enter new user type [Admin/Customer]: ");
				accountFields[5] = scanner.nextLine().trim();
				System.out.print("Enter new account status [Enabled/Disabled]: ");
				accountFields[6] = scanner.nextLine().trim();
				break;
			case "8":
				archiveAccount(currentUserID);
				break;
			case "9":
				System.out.println("Saving updates...");
				accountAttributes = String.join("*", accountFields);
				isEditing = false;
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}
			if (!choice.equals("0"))
				displayAccountInformation(accountFields);
		}
		return accountAttributes;
	}

	public static String editUserAccountAttributes(String[] accountFields) throws IOException {
		String accountAttributes = "";
		boolean isEditing = true;
		String choice = "";
		while (isEditing) {
			displayEditUserAccountMenu(); // CHANGE MENU
			choice = scanner.nextLine().trim();
			switch (choice) {
			case "0":
				System.out.println("Changes not saved. Going back ...");
				return "goBackToMenu"; // early out
			case "1":
				System.out.print("Enter new username: ");
				accountFields[1] = scanner.nextLine().trim();
				break;
			case "2":
				System.out.print("Enter new password: ");
				String newPassword = scanner.nextLine().trim();
				accountFields[2] = encryptPassword(newPassword);
				break;
			case "3":
				System.out.print("Enter new email: ");
				accountFields[3] = scanner.nextLine().trim();
				while (!isEmailValid(accountFields[3])) {
					System.out.println("Invalid email account.\n");
					System.out.print("Enter email: ");
					accountFields[3] = scanner.nextLine().trim();
				}
				break;
			case "4":
				System.out.print("Enter new address: ");
				accountFields[4] = scanner.nextLine().trim();
				break;
			case "5":
				System.out.print("Enter new username: ");
				accountFields[1] = scanner.nextLine().trim();
				System.out.print("Enter new password: ");
				newPassword = scanner.nextLine().trim();
				accountFields[2] = encryptPassword(newPassword);
				System.out.print("Enter new email: ");
				accountFields[3] = scanner.nextLine().trim();
				System.out.print("Enter new address: ");
				accountFields[4] = scanner.nextLine().trim();
				System.out.print("Enter new user type [Admin/Customer]: ");
				accountFields[5] = scanner.nextLine().trim();
				System.out.print("Enter new account status [Enabled/Disabled]: ");
				accountFields[6] = scanner.nextLine().trim();
				break;
			case "6":
				archiveAccount(currentUserID);
				break;
			case "7":
				System.out.println("Saving updates...");
				accountAttributes = String.join("*", accountFields);
				isEditing = false;
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}
			if (!choice.equals("0"))
				displayAccountInformation(accountFields);
		}
		return accountAttributes;
	}

	


	public static void displayAccountInformation(String[] accountFields) {
		System.out.println("=".repeat(120));
		System.out.printf("| %-116s |\n", centerText("YOUR CURRENT ACCOUNT INFORMATIONS", 116));
		System.out.println("=".repeat(120));
		System.out.printf("|%-3s| %-15s | %-15s | %-20s| %-30s | %-10s | %-8s |\n", "ID", "Name", "Password","Email", "Address", "Type", "Status");
		System.out.printf("|%-3s| %-15s | %-15s | %-20s| %-30s | %-10s | %-8s |\n", 
				accountFields[0], accountFields[1], decryptPassword(accountFields[2]), accountFields[3], accountFields[4], accountFields[5], accountFields[6]);
		System.out.println("=".repeat(120));
	}

	public static boolean verifyPassword(String inputPassword, String inputUsername, File accountRecords)
			throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(accountRecords));
		String line;
		while ((line = reader.readLine()) != null) {
			String fields[] = line.split("\\*");
			String username = fields[1].trim();
			String encryptedPassword = encryptPassword(inputPassword).trim();
			if (username.equalsIgnoreCase(inputUsername) && encryptedPassword.equals(fields[2].trim())) {
				reader.close();
				return true;
			}
		}
		reader.close();
		return false;
	}

	public static boolean isUserDisabled(String username) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("AccountRecords.txt"));
		String line;
		while ((line = reader.readLine()) != null) {
			String[] field = line.split("\\*");
			if (field[1].trim().equalsIgnoreCase(username) && field[6].trim().equalsIgnoreCase("Disabled")) {
				reader.close();
				return true;
			}
		}
		reader.close();
		return false;
	}

	// NEW METHOD TO DELETE ACCOUNTS --> STORES IT TO AN ARCHIVE FILE
	public static void archiveAccount(String currentUserID) throws IOException {
	    File accountFile = new File("AccountRecords.txt");
	    File tempAccountFile = new File("TempAccount.txt");
	    File archiveAccount = new File("ArchivedAccounts.txt");

	    System.out.print("Are you sure you want to delete this account? [1 - Yes/ 2 - No): ");
	    String confirmation = scanner.nextLine().trim().toLowerCase();

	    if (!confirmation.equals("1")) {
	        System.out.println("Account deletion canceled.");
	        return;
	    }

	    BufferedReader reader = new BufferedReader(new FileReader(accountFile));
	    BufferedWriter writer = new BufferedWriter(new FileWriter(tempAccountFile));
	    BufferedWriter archiveWriter = new BufferedWriter(new FileWriter(archiveAccount, true));

	    String line;
	    boolean found = false;

	    while ((line = reader.readLine()) != null) {
	        String[] fields = line.split("\\*");
	        if (fields[0].equals(currentUserID)) {
	            found = true;
	            fields[6] = "Archived"; 
	            archiveWriter.write(line + "\n"); 
	        } else {
	            writer.write(line + "\n"); 
	        }
	    }

	    reader.close();
	    writer.close();
	    archiveWriter.close();

	    if (!found) {
	        tempAccountFile.delete();
	        System.out.println("Your account was not found. No changes made.");
	        return;
	    }

	    if (accountFile.delete() && tempAccountFile.renameTo(accountFile)) {
	        System.out.println("Your account has been archived and deleted. Goodbye!");
	        System.exit(0);
	    } else {
	        System.out.println("Failed to archive the account. No changes made.");
	    }
	}


	
	

	public static String getProductVariantName(String productID, String productVariantID) throws IOException {
		File productInventory = new File("ProductInventory.txt");
		BufferedReader inventoryReader = new BufferedReader(new FileReader(productInventory));
		String line = "";
		while ((line = inventoryReader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (productID.equals(fields[0]) && productVariantID.equals(fields[1]))
				return fields[2];
		}
		return "NOT FOUND";
	}

	

	public static int determineCartOrPlaceOrder(String[] orderAttributes, int flag) throws IOException {
		String productID = orderAttributes[0];
		String productVariationID = orderAttributes[1];
		double productPrice = Double.parseDouble(orderAttributes[2]);
		int quantity = Integer.parseInt(orderAttributes[3]);
		Double amountToPay = Double.parseDouble(String.valueOf(quantity))
				* Double.parseDouble(String.valueOf(getProductPrice(productID)));// calculates the payment
		final int changeQuantity = 3;
		final int confirmProduct = 4;
		final int decideCartOrOrder = 5; // CHECK IF THE NAMING IS CORRECT or proceedTocheckoutOption
		String decision = "";
		boolean isRunning = true;

		while (isRunning) {
			if (flag == confirmProduct) {
				System.out.println("Current Order:\n" + getProductName(productID) + " || Variation:"
						+ getProductVariantName(productID, productVariationID) + " || Quantity:" + quantity
						+ " || amount to pay:" + amountToPay);

				System.out.println("=".repeat(120));
				System.out.printf("| %-116s |\n", centerText("ORDER OPTIONS", 116));
				System.out.println("=".repeat(120));
				System.out.printf("| %-48s %-67s |\n", "", ("[1] Confirm Order"));
				System.out.printf("| %-48s %-67s |\n", "", ("[X] Cancel Order"));
				System.out.printf("| %-48s %-67s |\n", "", ("[0] Go Back"));
				System.out.println("=".repeat(120));
				System.out.print("Input: ");
				decision = scanner.nextLine().trim();
				if (decision.equals("0")) {
					return changeQuantity; // go back to variation options
				} else if (decision.equals("1")) {
					flag = decideCartOrOrder;
				} else if (decision.equalsIgnoreCase("x")) {
					System.out.println("Cancelling Order...");
					return -1; // voids the order will not do anything. no flag can catch -1
				} else {
					System.out.println("Invalid Choice!");
				}
			}

			if (flag == decideCartOrOrder) {
//				System.out.println("what would you like to do with your order");
//				System.out.println("[0] go back [1] add to cart [2] proceed to checkout");
				System.out.println("=".repeat(120));
				System.out.printf("| %-116s |\n", centerText("ORDER OPTIONS", 116));
				System.out.println("=".repeat(120));
				System.out.printf("| %-48s %-67s |\n", "", ("[1] Add to Cart"));
				System.out.printf("| %-48s %-67s |\n", "", ("[2] Proceed to Checkout"));
				System.out.printf("| %-48s %-67s |\n", "", ("[0] Go Back"));
				System.out.println("=".repeat(120));
				System.out.print("Select choice: ");
				decision = scanner.nextLine().trim();
				switch (decision) {
				case "0":
					flag = confirmProduct; // ask if it should go back here the or the quantity
					break;
				case "1":
					if ((getOrderCartQuantity(productID, productVariationID) + quantity) > getProductStocks(
							"ProductInventory.txt", productID, productVariationID, 2)) {
						System.out.println(
								"The item you ordered is already in the cart and your order already exceeds the current stocks");
						flag = confirmProduct;
					} else {
						addToCart(productID, productVariationID, productPrice, quantity);
						return -1;
					}
					break;
				case "2":
					// if the handleEPayment returns 0 it will go back to decide cart or order again
					if (processPaymentAndCheckout(productID, productVariationID, quantity, amountToPay) == -1) {
						return -1;
					}
					break;
				default:
					System.out.println("Invalid Input");
					break;
				}
			}
		}
		return -2; // for error catching no flags even the while loop will catch -2
	}

	public static int processPaymentAndCheckout(String productID, String productVariationID, int quantity,
			Double amountToPay) throws IOException {
		if (handlePaymentOptions(amountToPay) == 1) {
			proceedTocheckout(quantity, productID, productVariationID);
			return -1;
		} else {
			return 0;
		}
	}

	public static int getProductTotalStocks(String productID) throws IOException {
		int productTotalStocks = 0;
		File inventory = new File("ProductInventory.txt");
		BufferedReader inventoryReader = new BufferedReader(new FileReader(inventory));

		String line = "";

		while ((line = inventoryReader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (fields[0].equals(productID)) {
				productTotalStocks += Integer.parseInt(fields[4]);
			}
		}
		inventoryReader.close();
		return productTotalStocks;
	}

	

	

	public static void proceedTocheckout(int quantity, String productID, String productVariationID) throws IOException{
		String userAddress = "";
		if ((userAddress = changeUserAddress()).equals("")){
			userAddress = getUserAddress();
		}
		logActivity("Purchased an Item");
		LocalTime currentTime = LocalTime.now();
		LocalDate currentDate = LocalDate.now();
		File salesTransaction = new File("SalesTransactions.txt");
		BufferedWriter salesTransactionsWriter = new BufferedWriter(new FileWriter(salesTransaction, true));
		salesTransactionsWriter.write(String.join("*",currentDate.toString(),currentTime.toString(),currentUserID,userAddress,productID,productVariationID,String.valueOf(quantity) + "\n"));
		salesTransactionsWriter.close();
		
		updateInventory(productID, productVariationID, -quantity); 
		updateProductRecordStocks(productID);
		
		File salesRecords = new File ("SalesRecords.txt");
		if (isItemStackable("SalesRecords.txt", productID, productVariationID)){	
			mergeDuplicateOrders(productID, productVariationID, quantity);
		}else{
			BufferedWriter salesRecordsWriter = new BufferedWriter(new FileWriter(salesRecords, true)) ;
			salesRecordsWriter.write(String.join("*",productID,productVariationID,String.valueOf(quantity) + "\n"));
			salesRecordsWriter.close();
		}
		System.out.println("Successfully placed your order");
	}

	public static int getOrderCartQuantity(String productID, String productVariationID) throws IOException {
		File cart = new File("Cart.txt");
		BufferedReader cartReader = new BufferedReader(new FileReader(cart));
		String line = "";
		while ((line = cartReader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (currentUserID.equals(fields[0]) && productID.equals(fields[1])
					&& productVariationID.equals(fields[2])) {
				cartReader.close();
				return Integer.parseInt(fields[4]);
			}
		}
		cartReader.close();
		return 0;
	}

	

	public static boolean isItemStackable(String filePath, String productID, String productVariationID)
			throws IOException {
		File file = new File(filePath);
		BufferedReader fileReader = new BufferedReader(new FileReader(file));
		String line = "";
		while ((line = fileReader.readLine()) != null) {
			String[] fields = line.split("\\*");
			// uses the pathfile as flags
			if (filePath.equals("SalesRecords.txt") && productID.equals(fields[0])
					&& productVariationID.equals(fields[1])) {
				fileReader.close();
				return true;
			}
			if (filePath.equals("Cart.txt") && currentUserID.equals(fields[0])
					&& productID.equals(fields[1]) && productVariationID.equals(fields[2])) {
				fileReader.close();
				return true;
			}
		}
		fileReader.close();
		return false;
	}



	public static void editCartItemQuantity() throws IOException {
		boolean isRunning = true;
		final int isDecidingDeductOrAdd = 1;
		final int isSelectingCartItem = 2;
		final int isGettingItemQuantity = 3;
		int flag = isDecidingDeductOrAdd;

		boolean addItem = true; // flag for adding or deducting
		String[] cartItemAttributes = new String[5];
		int quantity = 0;
		while (isRunning) {
			if (flag == isDecidingDeductOrAdd) {
				System.out.println("=".repeat(120));
				System.out.printf("| %-116s |\n", centerText("EDIT CART ITEM", 116));
				System.out.println("=".repeat(120));
				System.out.printf("| %-48s %-67s |\n", "", ("[1] Deduct Quantity"));
				System.out.printf("| %-48s %-67s |\n", "", ("[2] Add quantity"));
				System.out.printf("| %-48s %-67s |\n", "", ("[0] Go Back"));
				System.out.println("=".repeat(120));
				System.out.print("Select choice: ");
				String choice = scanner.nextLine();
				switch (choice) {
				case "0":
					return; // early out
				case "1":
					addItem = false; // changes flag and no break; because it 1 and 2 satisfy the choosing what the
										// system will do
				case "2": // doesnt do anything but is in here just to catch the "2" input
					flag = isSelectingCartItem;
					break;
				default:
					System.out.println("Invalid Input!");
					break;
				}
			}

			if (flag == isSelectingCartItem) {
				displayCartItems();
				System.out.println("Please enter the position of the item in your cart");
				System.out.print("Input:");
				cartItemAttributes = getCartItemAttributes(Integer.parseInt(validIntInput()));

				if (cartItemAttributes.length == 0) {
					System.out.println("Going back....");
					flag = isDecidingDeductOrAdd;
					continue;
				} else if (cartItemAttributes.length == 1) {
					System.out.println("Item Not Found! Please enter a valid item position.");
					continue;
				}

				if (getProductStocks("ProductInventory.txt", cartItemAttributes[1],
						cartItemAttributes[2], 2) == 0) { // catches if the item has no stocks
					System.out.println("Item is currently out of stock");
					System.out.println("Do you want to remove this order from cart?");
					System.out.println("[1] yes [0] go back");
					String choice = scanner.nextLine().trim();
					switch (choice) {
					case "1":
						removeCartItem(cartItemAttributes);
						return;
					case "0":
						flag = isDecidingDeductOrAdd;
						break;
					default:
						break;
					}
					continue;
				}

				if (addItem && getProductStocks("ProductInventory.txt", cartItemAttributes[1],
						cartItemAttributes[2], 2) < Integer.parseInt(cartItemAttributes[4])) { // checks if the
																								// cartQuantity is
																								// higher than the
																								// currentStocks
					System.out.println("Current cart item quantity exceeds the current stocks of the item.");
					System.out.println("You only have the deduct option.");
					flag = isDecidingDeductOrAdd;
					continue;
				}

				flag = isGettingItemQuantity;
			}

			if (flag == isGettingItemQuantity) {
				System.out.print("Quantity:");
				quantity = Integer.parseInt(validIntInput());
				if (quantity == 0) {
					System.out.println("Going back.....");
					flag = isSelectingCartItem;
					continue;
				}

				if (addItem && quantity + Integer.parseInt(cartItemAttributes[4]) > getProductStocks(
						"ProductInventory.txt", cartItemAttributes[1], cartItemAttributes[2],
						2)) {
					System.out.println("Amount Exceeds the current stocks!");
					continue;
				} else if (addItem == true) {
					updateCartProductQuantity(cartItemAttributes[1], cartItemAttributes[2], quantity);
				}

				if (!addItem && Integer.parseInt(cartItemAttributes[4]) - quantity == 0) {
					System.err.println("Deducting it will remove the item from the cart");

					System.out.println("=".repeat(120));
					System.out.printf("| %-116s |\n",
							centerText("Are you sure you want to deduct " + quantity + " from your item?", 116));
					System.out.println("=".repeat(120));
					System.out.printf("| %-48s %-67s |\n", "", ("[1] Confirm Deeduct"));
					System.out.printf("| %-48s %-67s |\n", "", ("[0] Go Back"));
					System.out.println("=".repeat(120));
					System.out.print("Select choice: ");
					String choice = "";
					while (!(choice.equals("0"))) {
						choice = scanner.nextLine().trim();
						if (choice.equals("1")) {
							removeCartItem(cartItemAttributes);
							System.out.println("Successfully removed item from cart");
							return;
						} else if (choice.equals("0")) {
							flag = isSelectingCartItem;
							break;
						} else {
							System.out.println("Invalid Input");
						}
					}

					continue;
				}
				if (!addItem && Integer.parseInt(cartItemAttributes[4]) - quantity < 0) {
					System.out.println("Amount inputed is higher than the cart quantity");
					continue;
				} else if (!addItem) {
					updateCartProductQuantity(cartItemAttributes[1], cartItemAttributes[2], -quantity);
				}
				return;

			}
		}
	}

	public static String[] getCartItemAttributes(int itemPosition) throws IOException {
		if (itemPosition == 0) {
			return new String[0]; // returns empty
		}
		File cart = new File("Cart.txt");
		BufferedReader cartReader = new BufferedReader(new FileReader(cart));
		String line = "";
		int currentPosition = 1;
		while ((line = cartReader.readLine()) != null) {
			if (line.startsWith(currentUserID) && itemPosition == currentPosition) {
				return line.split("\\*"); // returns all the attributes
			}
			currentPosition++;
		}
		return new String[1]; // not found
	}

	

	

	public static void checkOutAllCartItems() throws IOException {
		double amountToPay = 0;
		File cart = new File("Cart.txt");
		BufferedReader cartReader = new BufferedReader(new FileReader(cart));
		String line = "";
		boolean canBulkBuy = true;
		while ((line = cartReader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (!(fields[0].equals(currentUserID))) {
				continue;
			}
			amountToPay += Double.parseDouble(String.valueOf(fields[4]))
					* Double.parseDouble(String.valueOf(getProductPrice(fields[1])));// calculates the payment

			if (getProductStocks("ProductInventory.txt", fields[1], fields[2], 2) == 0) {
				System.out.println("The item "
						+ String.join(" ", getProductName(fields[1]), getProductVariantName(fields[1], fields[2]))
						+ " is out of stocks");
				canBulkBuy = false;
			} else if (Integer.parseInt(fields[4]) > getProductStocks("ProductInventory.txt",
					fields[1], fields[2], 2)) {
				System.out.println("The item "
						+ String.join(" ", getProductName(fields[1]), getProductVariantName(fields[1], fields[2]))
						+ " exceeds the current stocks");
				canBulkBuy = false;
			}
			// use a flag here that detects all the item and if they are available
		}

		if (canBulkBuy == false) {
			System.out.println("Please deduct a quantity or remove the item from the cart that is printed above.");
			return;
		}
		System.out.println("Amount to pay" + amountToPay);
		cartReader.close();
		BufferedReader secondCartReader = new BufferedReader(new FileReader(cart)); // cant use the cartReader again
																					// because it starts at the very
																					// bottom so new reader to go back
																					// on top
		if (handlePaymentOptions(amountToPay) == 1) { // for payment if not fulfiled the bulk will not be purchases
			while ((line = secondCartReader.readLine()) != null) {// automatically checks everything out
				String[] fields = line.split("\\*");
				if (fields[0].equals(currentUserID)) {
					proceedTocheckout(Integer.parseInt(fields[4]), fields[1], fields[2]);
					removeCartItem(fields);
				}
			}
			System.out.println("Successfully checked out all items.");
			viewMyPurchase();
			secondCartReader.close();
			return;
		} else {
			System.out.println("Transaction Cancelled.");
		}
		secondCartReader.close();
	}

	public static void checkOutCartItem() throws IOException {
		boolean isRunning = true;
		while (isRunning) {
			handleCheckOutOptions();
			System.out.println("Please choose item in the cart:");
			System.out.print("Input:");
			String[] cartItemAttributes = getCartItemAttributes(Integer.parseInt(validIntInput()));
			if (cartItemAttributes.length == 0) {
				System.out.println("Going back....");
				return;
			} else if (cartItemAttributes.length == 1) {
				System.out.println("Item Not Found! Please enter a valid item position.");
				continue;
			}
			double amountToPay = Double.parseDouble(cartItemAttributes[3]) * Double.parseDouble(cartItemAttributes[4]);
			if (processPaymentAndCheckout(cartItemAttributes[1], cartItemAttributes[2],
					Integer.parseInt(cartItemAttributes[4]), amountToPay) == 0) {
				System.out.println("check out canceled");
			} else {
				System.out.println("Successfully purchased the item from the cart");
				removeCartItem(cartItemAttributes);
				break;
			}
		}
	}

	
	public static void removeCartItem(String[] cartItemAttributes) throws IOException {
		File cart = new File("Cart.txt");
		File temp = new File("temp.txt");
		BufferedReader cartReader = new BufferedReader(new FileReader(cart));
		BufferedWriter tempWriter = new BufferedWriter(new FileWriter(temp));
		String line = "";
		while ((line = cartReader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (!(fields[0].equals(currentUserID) && fields[1].equals(cartItemAttributes[1])
					&& fields[2].equals(cartItemAttributes[2]))) {
				tempWriter.write(line + "\n");
			}
		}
		cartReader.close();
		tempWriter.close();

		BufferedWriter cartWriter = new BufferedWriter(new FileWriter(cart));
		BufferedReader tempReader = new BufferedReader(new FileReader(temp));

		while ((line = tempReader.readLine()) != null) {
			cartWriter.write(line + "\n");
		}
		cartWriter.close();
		tempReader.close();
		logActivity("Removed an Item To Cart");
	}

	public static String validIntInput() {
		String input = scanner.nextLine().trim();
		try {
			int ipt = Integer.parseInt(input);
			if (ipt == 0) { // go back
				return "0";
			}
			if (ipt < 0) {
				System.out.print("Enter a value higher than 0:");
				return validIntInput();
			}
		} catch (Exception numberException) {
			System.out.println("Enter a valid input");
			System.out.print("Input:");
			return validIntInput();
		}
		return input;
	}

	public static String validSizeInput() {
		String input = scanner.nextLine().trim();
		String numberPart = "", unitPart = "";
		boolean dotOccured = false;

		for (char c : input.toCharArray()) {
			if ("0123456789.".indexOf(c) != -1) {
				if (c == '.' && dotOccured)
					continue;
				if (c == '.')
					dotOccured = true;
				numberPart += c;
			} else if (Character.isLetter(c)) {
				unitPart += c;
			} else {
				System.out.print("Enter a valid size: ");
				return validSizeInput();
			}
		}

		if (numberPart.isEmpty()) {
			System.out.println("Enter a valid size: ");
			return validSizeInput();
		}

		double decimalNumbers = Double.parseDouble(numberPart);
		if (decimalNumbers <= 0) {
			System.out.print("Enter a value higher than 0: ");
			return validSizeInput();
		}

		if (decimalNumbers == (int) decimalNumbers) {
			return ((int) decimalNumbers + unitPart);
		} else {
			return decimalNumbers + unitPart;
		}
	}

	public static String generateProductID(String category) throws IOException {
		int productDelimiter = getProductDelimeter(category);
		BufferedReader reader = new BufferedReader(new FileReader("ProductRecords.txt"));
		String line;
		int lastCode = productDelimiter - 1;
		while ((line = reader.readLine()) != null) {
			String[] fields = line.split("\\*");
			String productCategory = fields[1].trim();
			int productCode = Integer.parseInt(fields[0].trim());
			if (productCategory.equalsIgnoreCase(category)) {
				if (productCode > lastCode)
					lastCode = productCode;
			}
		}
		reader.close();
		return String.valueOf(lastCode + 1);
	}

	public static int getProductDelimeter(String category) {
		int productDelimiter = 0;
		switch (category) {
		case "SCP":
			productDelimiter = 1000;
			break;
		case "BCP":
			productDelimiter = 2000;
			break;
		case "MUP":
			productDelimiter = 3000;
			break;
		case "HCP":
			productDelimiter = 4000;
			break;
		case "NCP":
			productDelimiter = 5000;
			break;
		case "TSP":
			productDelimiter = 6000;
			break;
		default:
			System.out.println("Invalid category. Please try again.");
		}
		return productDelimiter;
	}

	



	public static int getLastVariantID(String productID) throws IOException {
		File variantFile = new File("ProductInventory.txt");
		if (!variantFile.exists())
			return 0;
		BufferedReader reader = new BufferedReader(new FileReader(variantFile));
		String line;
		int maxVariantID = 0;
		while ((line = reader.readLine()) != null) {
			String[] parts = line.split("\\*");
			if (parts[0].equals(productID)) {
				try {
					int variantID = Integer.parseInt(parts[1]);
					if (variantID > maxVariantID) {
						maxVariantID = variantID;
					}
				} catch (NumberFormatException e) {
				}
			}
		}
		reader.close();
		return maxVariantID;
	}

	public static void addProducts() throws IOException {
		File file = new File("ProductRecords.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
		String category = getCategoryValue(" ");
		if (category.isEmpty()) {
			writer.close();
			return; // go back to menu
		}

		String productID = generateProductID(category);

		System.out.print("Enter product name:");
		String productName = scanner.nextLine().trim();

		System.out.print("Enter price: ");
		String productPrice = validIntInput();

		System.out.print("Enter stocks: ");
		String productStocks = validIntInput();

		writer.write(String.join("*", productID, category, productName, productPrice, productStocks) + ("\n"));
		writer.close();

		// adding the variations
		System.out.println("\nEnter the product variations below: ");
		System.out.print("How many variations does " + productName + " have? ");
		int variationProductCtr = Integer.parseInt(scanner.nextLine());

		if (variationProductCtr <= 0) {
			System.out.println("No variants to add for this product.");
			return;
		}

		File variantFile = new File("ProductInventory.txt");
		BufferedWriter varProductWriter = new BufferedWriter(new FileWriter(variantFile, true));

		int lastID = getLastVariantID(productID);
		for (int i = 1; i <= variationProductCtr; i++) {
			int currentVariantID = lastID + i;
			System.out.println("VARIANT " + currentVariantID);
			String variantID = String.valueOf(currentVariantID);

			System.out.print("Enter product variant name: ");
			String variantName = scanner.nextLine();
			System.out.print("Enter product variant size: ");
			String variantSize = validSizeInput();
			System.out.print("Enter product variant stocks: ");
			String variantStocks = validIntInput();

			varProductWriter
					.write(String.join("*", productID, variantID, variantName, variantSize, variantStocks) + "\n");
		}

		varProductWriter.close();
		System.out.println("Product variant added successfully.");
	}

	public static void addProductVariation() throws IOException {
		File productFile = new File("ProductRecords.txt");
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(productFile, true))) {
			String category = getCategoryValue(" ");
			if (category.isEmpty())
				return; // go back to menu
			String line;
			System.out.println("=".repeat(120));
			System.out.printf("| %-116s |\n", centerText("ADD PRODUCT VARIATIONS", 116));
			System.out.printf("| %-10s | %-40s | %-20s | %-10s |\n", "Product Code", "Product Name", "Price", "Stocks");

			try (BufferedReader reader = new BufferedReader(new FileReader(productFile))) {
				boolean foundCategory = false;
				while ((line = reader.readLine()) != null) {
					String fields[] = line.split("\\*");
					if (fields[1].equalsIgnoreCase(category)) {
						foundCategory = true;
						String productID = fields[0];
						String name = fields[2];
						String price = fields[3];
						String stock = fields[4];
						System.out.printf("| %-10s | %-40s | %-20s | %-10s |\n", productID, name, price, stock);
					}
				}
				System.out.println("=".repeat(120));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Enter product code to add variations: ");
			String productID = scanner.nextLine().trim();
			System.out.print("Enter amount of variations to add: ");
			int variationProductCtr;
			try {
				variationProductCtr = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid number entered. Returning to menu.");
				return;
			}
			if (variationProductCtr <= 0) {
				System.out.println("No variants to add for this product.");
				return;
			}
			File variantFile = new File("ProductInventory.txt");
			try (BufferedWriter varProductWriter = new BufferedWriter(new FileWriter(variantFile, true))) {
				int lastID = getLastVariantID(productID);
				for (int i = 1; i <= variationProductCtr; i++) {
					int currentVariantID = lastID + i;
					System.out.println("VARIANT " + currentVariantID);
					String variantID = String.valueOf(currentVariantID);

					String variantName;
					do {
						System.out.print("Enter product variant name: ");
						variantName = scanner.nextLine().trim();
						if (variantName.isEmpty()) {
							System.out.println("Variant name cannot be empty.");
						}
					} while (variantName.isEmpty());
					System.out.print("Enter product variant size: ");
					String variantSize = validSizeInput();
					System.out.print("Enter product variant stocks: ");
					String variantStocks = validIntInput();
					varProductWriter
							.write(String.join("*", productID, variantID, variantName, variantSize, variantStocks));
					varProductWriter.newLine();
				}
			}
			System.out.println("Product variant/s added successfully.");
		}
	}

	public static String editProductAttributes(String[] productDetails, String editProduct) throws IOException {
		String updatedLine = "";
		boolean isEditing = true;
		boolean savedChanges = false;

		while (isEditing) {
			displayEditProductMenu();
			String choice = scanner.nextLine().trim();
			switch (choice) {
			case "0":
				System.out.println("Changes not saved. Going back...");
				isEditing = false;
				break;
			case "1":
				System.out.print("Enter new product name: ");
				productDetails[2] = scanner.nextLine().trim();
				break;
			case "2":
				System.out.print("Enter new price: ");
				productDetails[3] = validIntInput();
				break;
			case "3":
				System.out.print("Enter new stock: ");
				productDetails[4] = validIntInput();
				break;
			case "4":
				System.out.print("Enter new product name: ");
				productDetails[2] = scanner.nextLine().trim();
				System.out.print("Enter new price: ");
				productDetails[3] = validIntInput();
				System.out.print("Enter new stock: ");
				productDetails[4] = validIntInput();
				break;
			case "5":
				handleVariantEditing(editProduct);
				break;
			case "6":
				System.out.println("Saving updates...");
				updatedLine = String.join("*", productDetails);
				savedChanges = true;
				isEditing = false;
				break;
			default:
				System.out.println("Invalid choice.");
			}
		}
		return updatedLine;
	}

	

	public static boolean isProductArchived(String productID, String productVariantID) throws IOException{
		File archiveProducts = new File("ArchiveProducts.txt");

		BufferedReader reader = new BufferedReader(new FileReader(archiveProducts));
		String line = "";
		while ((line = reader.readLine()) != null){
			String [] fields = line.split("\\*");
			if ((productID.equals(fields[0]) && productVariantID.equals(fields[1]))){
				return true;
			} else	if ( productID.equals(fields[0]) && fields.length == 5){
				return true;
			}  
		}
		return false;
	}

	public static void deleteProduct() throws IOException {
		File inputFile = new File("ProductRecords.txt");
		File tempFile = new File("TempProductRecords.txt");
		File archiveFile = new File("ArchiveProducts.txt");

		String category = getCategoryValue(" ");
		if (category.isBlank()) {
			return;
		}

		String line;
		System.out.println("=".repeat(120));
		System.out.printf("| %-10s | %-67s | %-20s | %-10s |\n", "Code", "Product Name", "Price", "Stocks");
		System.out.println("=".repeat(120));
		int productCount = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
			boolean foundCategory = false;
			while ((line = reader.readLine()) != null) {
				String fields[] = line.split("\\*");
				if (isProductArchived(fields[0], "") == true){
					continue;
				}
				if (fields[1].trim().equalsIgnoreCase(category)) {
					productCount++;
					foundCategory = true;
					String productID = fields[0];
					String name = fields[2];
					String price = fields[3];
					String stock = fields[4];
					System.out.printf("| %-10s | %-67s | %-20s | %-10s |\n", productID, name, price, stock);
				}
			}
			System.out.println("=".repeat(120));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (productCount == 0){
			System.out.println("There are no available products to archive yet.");
			return;
		}
		System.out.print("Enter product code to archive: ");
		String archiveProduct = scanner.nextLine().trim();

		if (isProductArchived(archiveProduct, "") == true){
			System.out.println("Product is already in the archives.");
			return;
		}

		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
		BufferedWriter archiveWriter = new BufferedWriter(new FileWriter(archiveFile, true));
		boolean found = false;

		// Read through the product records and archive the selected product
		while ((line = reader.readLine()) != null) {
			String[] productDetails = line.split("\\*");
			if (productDetails[0].trim().equalsIgnoreCase(archiveProduct)) {
				found = true;
				archiveWriter.write(line + "\n");
				continue;
			}
			writer.write(line + "\n");
		}
		reader.close();
		writer.close();
		archiveWriter.close();

		File variantFile = new File("ProductInventory.txt");
		File archiveVariant = new File("ArchiveInventory.txt");

		BufferedReader inventoryReader = new BufferedReader(new FileReader(variantFile));
		BufferedWriter inventoryArchiveWriter = new BufferedWriter(new FileWriter(archiveVariant, true));

		boolean foundVariants = false;
		while ((line = inventoryReader.readLine()) != null) {
			String variantDetails[] = line.split("\\*");
			if (variantDetails[0].equals(archiveProduct)) {
				foundVariants = true;
				inventoryArchiveWriter.write(line + "\n");
				continue;
			}
		}
		System.out.println("Successfully deleted the product");
		inventoryReader.close();
		inventoryArchiveWriter.close();
		logActivity("Archived a product");
		
	}

	

	public static String getUserAddress() throws IOException {
		File accountRecords = new File("AccountRecords.txt");
		BufferedReader accountReader = new BufferedReader(new FileReader(accountRecords));
		String line = "";
		while ((line = accountReader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (fields[0].equals(currentUserID)) {
				accountReader.close();
				return fields[4];
			}
		}
		accountReader.close();
		return "";
	}

	public static int getProductStocks(String filePath, String productID, String productVariationID, int flag)
			throws IOException {
		// flag 2 variations flag 1 product itself
		File inventory = new File(filePath);
		BufferedReader inventoryReader = new BufferedReader(new FileReader(inventory));
		String line = "";
		while ((line = inventoryReader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (flag == 2 && fields[0].equals(productID) && fields[1].equals(productVariationID)) {
				inventoryReader.close();
				return Integer.parseInt(fields[4]);
			}
			if (flag == 1 && fields[0].equals(productID)) {
				inventoryReader.close();
				return Integer.parseInt(fields[4]);
			}
		}
		inventoryReader.close();
		return -1; // for error catching if possible
	}

	public static String getProductPrice(String productID) throws IOException {
		File productRecords = new File("ProductRecords.txt");
		BufferedReader reader = new BufferedReader(new FileReader(productRecords));
		String line = "";
		while ((line = reader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (fields[0].equals(productID)) {
				return fields[3];
			}
		}
		return "0";
	}

	public static String getProductName(String productID) throws IOException {
		File productRecords = new File("ProductRecords.txt");
		BufferedReader reader = new BufferedReader(new FileReader(productRecords));
		String line = "";
		while ((line = reader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (fields[0].equals(productID)) {
				return fields[2];
			}
		}
		return "NOT FOUND";
	}

	public static int displayCartItems() throws IOException {
		File cartRecords = new File("Cart.txt");
		BufferedReader cartReader = new BufferedReader(new FileReader(cartRecords));
		String line;
		int count = 1;

		System.out.println("=".repeat(120));
		System.out.printf("| %-116s |\n", centerText("YOUR CART", 116));
		System.out.println("=".repeat(120));
		System.out.printf("| %-10s | %-60s | %-10s | %-10s |%-15s |\n", "Position", "Product Name", "Price", "Quantity","Amount to Pay");
		while ((line = cartReader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (isProductArchived(fields[1], "") == true){
				continue;
			} else if (isProductArchived(fields[1], fields[2]) == true){
				continue;
			}
			if (line.startsWith(currentUserID)) {
				String productName = getProductName(fields[1]);
				String productVariationName = getProductVariantName(fields[1], fields[2]);
				double productPrice = Double.parseDouble(fields[3]);
				String productQuantity = fields[4];
				double totalProductPrice = Double.parseDouble(productQuantity) * productPrice;
				System.out.printf("| %-10s | %-60s | %-10s | %-10s |%-15s |\n", count++, productName + "-" +
						productVariationName, productPrice, productQuantity + "x", totalProductPrice);
			}
		}
		if (count == 1) {
			System.out.println("THERE ARE NO ITEMS IN YOUR CART");
		}
		System.out.println("=".repeat(120));
		cartReader.close();
		return count;
	}

	public static void createWallet(String userID, String username, String defaultAmount) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("SORAIA_Wallets.txt", true));
		writer.write(String.join("*", userID, username, defaultAmount) + "\n");
		writer.close();
	}

	public static boolean userWalletExists() throws IOException {
		File walletFile = new File("SORAIA_Wallets.txt");
		if (!walletFile.exists())
			return false;
		BufferedReader reader = new BufferedReader(new FileReader(walletFile));
		String line;
		while ((line = reader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (fields[0].equals(currentUserID)) {
				reader.close();
				return true;
			}
		}
		reader.close();
		return false;
	}

	public static String generateOTP() {
		Random rand = new Random();
		return String.format("%04d", rand.nextInt(10000));
	}

	public static boolean verifyOTP(String generatedOTP) {
		System.out.print("Enter verification code: ");
		String enteredOTP = scanner.nextLine().trim();
		return enteredOTP.equals(generatedOTP);
	}

	public static boolean isAllDigits(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isDigit(input.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	

	public static double getCurrentWalletBalance() throws IOException {
		File walletFile = new File("SORAIA_Wallets.txt");
		if (!walletFile.exists())
			return 0.0;
		BufferedReader reader = new BufferedReader(new FileReader(walletFile));
		String line;
		while ((line = reader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (fields[0].equals(currentUserID)) {
				reader.close();
				return Double.parseDouble(fields[2]); // GIVES IT AS AN AMOUNT
			}
		}
		reader.close();
		return 0.0;
	}

	public static double validDoubleInput() {
		String input = scanner.nextLine().trim();
		try {
			double doubleInput = Double.parseDouble(input);
			if (doubleInput == 0) {
				return 0;
			}
			if (doubleInput < 0) {
				System.out.println("Enter a value higher than 0");

			}
			return doubleInput;
		} catch (Exception NumberFormatException) {
			System.out.println("Enter a valid amount.");
			System.out.print("Input:");
			return validDoubleInput();
		}
	}

	public static void loadWalletBalance() throws IOException {
		System.out.print("Enter amount to load your account: "); // MAYBE PWEDE TONG AUTOMATIC NA SA TOTALS
		double amount = validDoubleInput();
		updateWalletBalance(amount);
		System.out.println("Wallet Successfully Updated.");
	}

	

	
	public static void displayArchivedAccounts() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("ArchivedAccounts.txt"));
		String line;
		System.out.println("=".repeat(120));
		System.out.printf("| %-116s |\n", centerText("SORAIA ACCOUNTS", 116));
        System.out.println("=".repeat(120));
        System.out.printf("|%-6s| %-20s | %-20s| %-30s | %-10s | %-8s |\n", "ID", "Name", "Email", "Address", "Type", "Status");
        System.out.println("_".repeat(120));
		while ((line = reader.readLine()) != null) {
			String fields[] = line.split("\\*");
			String id = fields[0];
			String name = fields[1];
			String email = fields[3];
			String address = fields[4];
			String type = fields[5];
			String status = fields[6];
			System.out.printf("|%-6s| %-20s | %-20s| %-30s | %-10s | %-8s |\n", id, name, email, address, type, status);
		}
		System.out.println("=".repeat(120));
		reader.close();
	}


	public static void displayArchivedProducts() throws IOException {
	    try (BufferedReader productReader = new BufferedReader(
	            new FileReader("ArchiveInventory.txt"))) {
	        String productLine;
	        System.out.println("=".repeat(120));
            System.out.printf("| %-116s |\n", centerText("ARCHIVED PRODUCT", 116));
            System.out.println("=".repeat(120));
            System.out.printf("|%-10s| %-10s | %-67s| %-10s | %-10s |\n", "Code", "Variant", "Name", "Price", "Stocks");
            System.out.println("_".repeat(120));
	        while ((productLine = productReader.readLine()) != null) {
	            String[] fields = productLine.split("\\*");
	            String productId = fields[0];
	            String categoryCode = fields[1];
	            String name = fields[2];
	            String price = fields[3];
	            String stock = fields[4];
	            System.out.printf("|%-10s| %-10s | %-67s| %-10s | %-10s |\n", productId, categoryCode, name, price, stock);
	        }
	    } catch (Exception e) {
	        System.out.println("Error reading product data: " + e.getMessage());
	    }
	    System.out.println("=".repeat(120));
	}

	public static void displayFilteredAccounts(String filter, String filterValue) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("AccountRecords.txt"));
		String line;
		boolean found = false;
		System.out.println("=".repeat(120));
		System.out.printf("| %-116s |\n", centerText("SORAIA ACCOUNTS", 116));
        System.out.println("=".repeat(120));
        System.out.printf("|%-6s| %-20s | %-30s| %-30s | %-10s | %-8s |\n", "ID", "Name", "Email", "Address", "Type", "Status");
        System.out.println("_".repeat(120));
		
		while ((line = reader.readLine()) != null) {
			String[] fields = line.split("\\*");
			String id = fields[0];
			String name = fields[1];
			String email = fields[3];
			String address = fields[4];
			String type = fields[5];
			String status = fields[6];
			boolean matches = false;
			switch (filter.toUpperCase()) {
			case "STATUS":
				matches = status.equalsIgnoreCase(filterValue);
				break;
			case "TYPE":
				if (filterValue.equals("1")) {
					filterValue = "Admin";
				} else if (filterValue.equals("2")) {
					filterValue = "Customer";
				}
				matches = type.equalsIgnoreCase(filterValue);
				break;
			case "ALL":
				matches = true;
				break;
			}
			if (matches) {
				found = true;
				System.out.printf("|%-6s| %-20s | %-30s| %-30s | %-10s | %-8s |\n", id, name, email, address, type, status);
			}
		}
		System.out.println("=".repeat(120));
		if (!found) {
			System.out.println("No accounts found under your selected filter.");
		}
		reader.close();
	}

	

	public static void displayInventoryByFilter(String filter, String filterValue) throws IOException {
		BufferedReader productReader = new BufferedReader(new FileReader("ProductRecords.txt"));
		BufferedReader variationReader;
		String line;
		boolean found = false;
		while ((line = productReader.readLine()) != null) {
			String[] fields = line.split("\\*");
			String productId = fields[0];
			String categoryCode = fields[1];
			String name = fields[2];
			String price = fields[3];
			String stock = fields[4];
			boolean matches = false;
			switch (filter.toUpperCase()) {
			case "CATEGORY":
				matches = categoryCode.equalsIgnoreCase(filterValue);
				break;
			case "ALL":
				matches = true;
				break;
			}
			if (matches) {
				found = true;
				System.out.println("=".repeat(120));
				System.out.printf("| %-116s |\n", centerText("PRODUCT", 116));
				System.out.println("=".repeat(120));
				System.out.printf("|%-10s| %-10s | %-67s| %-10s | %-10s |\n", "Code", "Category", "Name", "Price",
						"Stocks");
				System.out.println("_".repeat(120));
				System.out.printf("|%-10s| %-10s | %-67s| %-10s | %-10s |\n", productId, categoryCode, name, price,
						stock);
				System.out.println("=".repeat(120));
				variationReader = new BufferedReader(new FileReader("ProductInventory.txt"));
				String varLine;
				System.out.printf("| %-15s | %-40s | %-25s | %-27s |\n", "Variant Number", "Description", "Size",
						"Stock");
				System.out.println("_".repeat(120));
				while ((varLine = variationReader.readLine()) != null) {
					String[] variantFields = varLine.split("\\*");
					String variantProductId = variantFields[0];
					if (variantProductId.equals(productId)) {
						String variantNum = variantFields[1];
						String description = variantFields[2];
						String size = variantFields[3];
						String varStock = variantFields[4];
						System.out.printf("| %-15s | %-40s | %-25s | %-27s |\n", variantNum, description, size,
								varStock);

					}
				}
				variationReader.close();
			}
		}
		System.out.println("=".repeat(120));
		if (!found) {
			System.out.println("No products found for the selected filter.");
		}
		productReader.close();
	}

	

	public static void generateSalesReport() throws IOException {
		BufferedReader salesReader = new BufferedReader(new FileReader("SalesRecords.txt"));
		String line;

		System.out.println("=".repeat(120));
		System.out.printf("| %-15s | %-15s | %-32s | %-22s | %-20s |\n", "Product ID", "Variant ID", "Product Name",
				"Purchased", "Stock");
		System.out.println("=".repeat(120));
		while ((line = salesReader.readLine()) != null) {
			String fields[] = line.split("\\*");
			String saleProductID = fields[0];
			String saleVariantID = fields[1];
			int quantity = Integer.parseInt(fields[2]);
			BufferedReader productReader = new BufferedReader(new FileReader("ProductInventory.txt"));
			String productLine;
			boolean found = false;

			while ((productLine = productReader.readLine()) != null) {
				String[] parts = productLine.split("\\*");
				String productID = parts[0];
				String variantID = parts[1];
				
				if (productID.equals(saleProductID) && variantID.equals(saleVariantID)) {
					String name = getProductName(saleProductID) +  getProductVariantName(saleProductID, saleVariantID);
					int stock = getProductStocks("ProductInventory.txt", productID, variantID, 2);

					System.out.printf("| %-15s | %-15s | %-32s | %-22s | %-20s |\n", productID, variantID, name,quantity, stock);
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.printf("| %-15s | %-15s | %-32s | %-22s | %-20s |\n", saleProductID, saleVariantID,
						"NOT FOUND", quantity, " ");

			}
			productReader.close();
		}
		salesReader.close();
		System.out.println("=".repeat(120));
	}

	public static void findTopSales() throws IOException {
		String[][] top5Sales = new String[5][3];
		try (BufferedReader reader = new BufferedReader(new FileReader("SalesRecords.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String fields[] = line.split("\\*");
				String productId = fields[0];
				String variantId = fields[1];
				int quantity = 0;
				BufferedReader countReader = new BufferedReader(
						new FileReader("SalesRecords.txt"));
				String countLine;
				while ((countLine = countReader.readLine()) != null) {
					String[] count = countLine.split("\\*");
					if (count[0].equals(productId) && count[1].equals(variantId))
						quantity += Integer.parseInt(count[2]);
				}
				countReader.close();
				// checks if the product is already existing in the list
				boolean exists = false;
				for (String[] sale : top5Sales) {
					if (sale[0] != null && sale[0].equals(productId) && sale[1].equals(variantId)) {
						exists = true;
						break;
					}
				}
				// means its already in the list of top 5 popular products
				if (exists)
					continue;
				// organizes the array
				for (int i = 0; i < 5; i++) {
					if (top5Sales[i][0] == null || Integer.parseInt(top5Sales[i][2]) < quantity) {
						for (int j = 4; j > i; j--) {
							top5Sales[j] = top5Sales[j - 1]; // shifts the positions
						}
						top5Sales[i] = new String[] { productId, variantId, String.valueOf(quantity) };
						break;
					}
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		writeTopSales(top5Sales);
	}

	public static void writeTopSales(String top5Sales[][]) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("TopSalesReport.txt"));
		for (String[] t : top5Sales) {
			if (t[0] == null)
				continue;
			BufferedReader prodReader = new BufferedReader(
					new FileReader("ProductInventory.txt"));
			String prodLine;
			while ((prodLine = prodReader.readLine()) != null) {
				String fields[] = prodLine.split("\\*");
				if (fields[0].equals(t[0]) && fields[1].equals(t[1])) {
					String lineOut = fields[0] + "*" + fields[1] + "*" + fields[2] + "*" + fields[3] + "*" + t[2]
							+ "\n";
					writer.write(lineOut);
				}
			}
			prodReader.close();
		}
		writer.close();
	}

	public static void displayTopSales() throws IOException {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("TopSalesReport.txt"));
			String line;
			System.out.println("=".repeat(120));
			System.out.printf("| %-10s | %-10s | %-10s | %-70s | %-4s |\n", "Ranking", "Product ID", "Variant ID",
					"Product Name", "Sales");
			System.out.println("=".repeat(120));
			int ctr = 1;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split("\\*");
				String productId = parts[0].trim();
				String categoryCode = parts[1].trim();
				String productName = parts[2].trim();
				String sales = parts[4].trim();
				String name = getProductName(productId);
				System.out.printf("| %-10s | %-10s | %-10s | %-70s | %-4s |\n", ctr, productId, categoryCode,
						name + " " + productName, sales);
				ctr++;
			}
			System.out.println("=".repeat(120));
			reader.close();
		} catch (IOException | IndexOutOfBoundsException e) {
			System.err.println("Error reading the file: " + e.getMessage());
		}
	}

	public static void viewMyPurchase() throws IOException {
		try (BufferedReader readPurchase = new BufferedReader(
				new FileReader("SalesTransactions.txt"))) {
			String line;
			boolean found = false;
			System.out.println("=".repeat(120));
			System.out.printf("| %-116s |\n", centerText("MY PURCHASE", 116));
			System.out.println("=".repeat(120));
			while ((line = readPurchase.readLine()) != null) {
				String transactionParts[] = line.split("\\*");
				if (transactionParts[2].equals(currentUserID)) {
					found = true;
					String date = transactionParts[0];
					String time = transactionParts[1].split("\\.")[0];
					String productCode = transactionParts[4];
					String variantID = transactionParts[5];
					String quantity = transactionParts[6];
					String productName = getProductName(transactionParts[4]);
					int totalPrice = Integer.parseInt(getProductPrice(transactionParts[4]))
							* Integer.parseInt(quantity);
					String variantName = getProductVariantName(productCode, variantID);
					System.out.printf("%-10s | %-10s | %-10s | %-60s | %-6s | %-8s |%n", date, time, productCode,
							productName + "-" + variantName, quantity, totalPrice);
				}
			}
			if (!found) {
				System.out.println("You have 0 purchase.");
			}

			System.out.println("=".repeat(120));

		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void displayInventoryMenu() {
		System.out.println("=".repeat(120));
		System.out.printf("| %-116s |\n", centerText("PRODUCT VIEWER MENU", 116));
		System.out.println("=".repeat(120));
		System.out.printf("| %-116s |\n", centerText("1. View All Products", 114));
		System.out.printf("| %-116s |\n", centerText("2. Skin Care", 107));
		System.out.printf("| %-116s |\n", centerText("3. Body Care", 107));
		System.out.printf("| %-116s |\n", centerText("4. Makeup", 104));
		System.out.printf("| %-116s |\n", centerText("5. Hair Care", 107));
		System.out.printf("| %-116s |\n", centerText("6. Nail Care", 107));
		System.out.printf("| %-46s %-69s |\n", "", ("7. Toiletries and Sanitary"));
		System.out.printf("| %-116s |\n", centerText("8. Archived Products", 114));
		System.out.printf("| %-116s |\n", centerText("0. Go back", 105));
		System.out.println("=".repeat(120));
		System.out.print("Select an option: ");
	}

	public static void displayViewAccountMenu() {
		System.out.println("=".repeat(120));
		System.out.printf("| %-116s |\n", centerText("ACCOUNT DETAILS", 116));
		System.out.println("=".repeat(120));
		System.out.printf("| %-116s |\n", centerText("1. View All Accounts", 114));
		System.out.printf("| %-46s %-69s |\n", "", ("2. View All Enabled Accounts"));
		System.out.printf("| %-46s %-69s |\n", "", ("3. View All Disabled Accounts"));
		System.out.printf("| %-46s %-69s |\n", "", ("4. View All Archived Accounts"));
		System.out.printf("| %-46s %-69s |\n", "", ("5. View All SORAIA Wallets"));
		System.out.printf("| %-46s %-69s |\n", "", ("6. View by Category"));
		System.out.printf("| %-116s |\n", centerText("0. Go Back", 105));
		System.out.println("=".repeat(120));
		System.out.print("Enter your choice: ");
	}

	public static void displayViewReportsMenu() {
		System.out.println("=".repeat(120));
		System.out.printf("| %-116s |\n", centerText("REPORTS MENU", 116));
		System.out.println("=".repeat(120));
		System.out.printf("| %-116s |\n", centerText("1. Sales Reports", 114));
		System.out.printf("| %-48s %-67s |\n", "", ("2. Inventory Reports"));
		System.out.printf("| %-48s %-67s |\n", "", ("3. UserActivity Reports"));
		System.out.printf("| %-116s |\n", centerText("4. View Accounts", 114));
		System.out.printf("| %-116s |\n", centerText("0. Go Back", 109));
		System.out.println("=".repeat(120));
		System.out.print("Enter your choice: ");
	}

	private static void displayAccountDetails(String id, String name, String email, String address, String type,
			String status) {
		System.out.println("=".repeat(120));
		System.out.printf("| %-116s |\n", centerText("ACCOUNT DETAILS", 116));
		System.out.println("=".repeat(120));
		System.out.printf("| %-46s %s%-65s |\n", "", "ID: ", id);
		System.out.printf("| %-46s %s%-63s |\n", "", "Name: ", name);
		System.out.printf("| %-46s %s%-62s |\n", "", "Email: ", email);
		System.out.printf("| %-46s %s%-60s |\n", "", "Address: ", address);
		System.out.printf("| %-46s %s%-55s |\n", "", "Account Type: ", type);
		System.out.printf("| %-46s %s%-61s |\n", "", "Status: ", status);
		System.out.println("=".repeat(120));
	}

	public static void displaySalesReportOptions() {
		System.out.println("=".repeat(120));
		System.out.printf("| %-116s |\n", centerText("SALES REPORT MENU", 116));
		System.out.println("=".repeat(120));
		System.out.printf("| %-116s |\n", centerText("1. Sales Records", 114));
		System.out.printf("| %-48s %-67s |\n", "", ("2. View Top 5 Popular Items"));
		System.out.printf("| %-48s %-67s |\n", "", ("0. Back to Main Menu"));
		System.out.println("=".repeat(120));
		System.out.print("Select an option: ");
	}

	
	

	public static void displaySoraiaWallets() throws IOException {
	    BufferedReader walletReader = new BufferedReader(
	            new FileReader("SORAIA_Wallets.txt"));

	    String walletLine;

	    System.out.println("=".repeat(120));
	    System.out.printf("| %-116s |\n", centerText("SORAIA WALLETS", 116));
	    System.out.println("=".repeat(120));
	    System.out.printf("| %-30s | %-50s | %-30s |\n", "Wallet ID", "Owner Name", "Balance");
	    System.out.println("-".repeat(120));

	    while ((walletLine = walletReader.readLine()) != null) {
	        String[] walletInfo = walletLine.split("\\*");
	        if (walletInfo.length < 3) continue; // skip malformed lines

	        System.out.printf("| %-30s | %-50s | %-30s |\n", walletInfo[0], walletInfo[1], walletInfo[2]);
	    }

	    System.out.println("=".repeat(120));
	    walletReader.close();
	}


	
	public static int displayProductVariations(String productID) throws IOException {
		BufferedReader productReader = new BufferedReader(new FileReader("ProductInventory.txt"));
		String line;
		int productCount = 0;
		System.out.println("=".repeat(120));
		System.out.printf("| %-15s | %-40s | %-25s | %-26s |\n", "Product Position", "Name", "Category", "Quantity");
		System.out.println("_".repeat(120));
		while ((line = productReader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (isProductArchived(fields[0], fields[1]) == true) { // for items that are deleted/archived
				continue;
			}
			if (fields[0].equals(productID)) {
				productCount++;
				System.out.printf("| %-16s | %-40s | %-25s | %-26s |\n", productCount, fields[2], fields[3],(fields[4].equals("0")) ? "Out of Stocks" : fields[4]);
			}
		}
		System.out.println("=".repeat(120));
		productReader.close();
		System.out.print("Select an option: ");
		return productCount;
	}

	private static void printCategoryHeader(String category) {
		String categoryName = "";
		String[] categoryNames = { "Skin Care Products", "Body Care Products", "Makeup Products", "Hair Care Products",
				"Nail Care Products", "Toiletries / Sanitary Products" };
		for (String categories : categoryNames) {
			if (categories.startsWith(String.valueOf(category.charAt(0)))) {
				categoryName = categories;
			}
		}
		String title = " CATEGORY: " + categoryName + " ";
		System.out.println("=".repeat(120));
		System.out.printf("| %-116s |\n", centerText(title, 116));
		System.out.println("=".repeat(120));
		System.out.printf("| %-15s | %-52s | %-20s | %-20s |\n", "Product ID", "Product Name", "Price", "Stock");
		System.out.println("=".repeat(120));
	}

	public static int displayCategoryProducts(String category) throws IOException {
		File productRecord = new File("ProductRecords.txt");
		printCategoryHeader(category);
		BufferedReader productRecordsReader = new BufferedReader(new FileReader(productRecord));
		String line = "";
		int productCount = 0;
		while ((line = productRecordsReader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (isProductArchived(fields[0], "") == true){
				continue;
			} 
			if (fields[1].equals(category)) {
				productCount++;
				System.out.printf("| %-15s | %-40s | %-25s | %-27s |\n", productCount, fields[2], fields[3],
						(fields[4].equals("0")) ? "Out of Stocks" : fields[4]);
			}

		}
		System.out.println("=".repeat(120));
		productRecordsReader.close();
		System.out.print("Select an option: ");
		return productCount;
	}
	
	public static String getUsername(String userID) throws IOException{
		File accountRecords = new File("AccountRecords.txt");
		BufferedReader accountRecordsReader = new BufferedReader(new FileReader(accountRecords));
		String line = "";
		while ((line = accountRecordsReader.readLine()) != null){
			String [] fields = line.split("\\*");
			if (fields[0].trim().equals(userID)){
				accountRecordsReader.close();
				return fields [1];
			}
		}
		accountRecordsReader.close();
		return "";
	}

	public static void viewUserActivityLogs() throws IOException{
		try (BufferedReader readActivityLogs = new BufferedReader( new FileReader("ActivityLogs.txt"))) {
			String line;
			boolean found = false;
			System.out.println("=".repeat(120));
			System.out.printf("| %-116s |\n", centerText("SORAIA ACTIVITY LOGS", 116));
			System.out.println("=".repeat(120));
			System.out.printf("|%-20s| %-20s | %-30s | %-10s| %-27s |\n", "Date", "Time", "Account username", "User type","Activity");
			System.out.println("_".repeat(120));
			while ((line = readActivityLogs.readLine()) != null) {
				String activityLog[] = line.split("\\*");
				found = true;
				String date = activityLog[0];
				String time = activityLog[1].split("\\.")[0]; // Remove decimal part
				String username = getUsername(activityLog[2]);
				String userType = activityLog[3];
				String activity = activityLog[4];
				System.out.printf("|%-20s| %-20s | %-30s | %-10s| %-27s |\n", date, time, username, userType, activity);
			}
			if (!found) {
				System.out.println("There are no saved activities yet");
			}
			System.out.println("=".repeat(120));
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static String changeUserAddress() {
		String userAddress = "";
		boolean isRunning = true;
		String choice = "";
		while (isRunning){
			System.out.println("Do you want to change your address that the item will be shipped to?");
			System.out.println("=".repeat(120));
			System.out.printf("| %-116s |\n", centerText("SHIPPING OPTIONS", 116));
			System.out.println("=".repeat(120));
			System.out.printf("| %-48s %-67s |\n", "", ("[1] Yes"));
			System.out.printf("| %-48s %-67s |\n", "", ("[0] No"));
			System.out.println("=".repeat(120));
			System.out.print("Select choice: ");
			choice = scanner.nextLine().trim();
			switch (choice) {
				case "0":
					System.out.println("Using your saved address for shipping...");
					return "";
				case "1":
					System.out.println("Please input the address you want to ship you item to.");
					System.out.print("Address:");
					return scanner.nextLine().trim();
				default:
					System.out.println("Invalid Input \n");
					break;
			}
		}
		return "";
	}

	public static void editProducts() throws IOException {
	    File originalFile = new File("ProductRecords.txt");
	    File tempFile = new File("TempProductRecords.txt");

	    String category = getCategoryValue(" ");
	    if (category == null || category.trim().isEmpty()) {
	        System.out.println("No category selected. Operation cancelled.");
	        return;
	    }
	    System.out.println("=".repeat(120));
	    System.out.printf("| %-10s | %-67s | %-20s | %-10s |\n", "Code", "Product Name", "Price", "Stocks");
	    System.out.println("=".repeat(120));

	    int productCount = 0;

	    try (BufferedReader reader = new BufferedReader(new FileReader(originalFile))) {
	        String line;
	        while ((line = reader.readLine()) != null) {
	            String[] fields = line.split("\\*");
	            if (fields.length < 5) continue;

	            if (isProductArchived(fields[0], "")) continue; 

	            if (fields[1].equalsIgnoreCase(category)) {
	                productCount++;
	                System.out.printf("| %-10s | %-67s | %-20s | %-10s |\n",fields[0], fields[2], fields[3], fields[4]);
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("Error reading products: ");
	        e.printStackTrace();
	        return;
	    }

	    System.out.println("=".repeat(120));

	    if (productCount == 0) {
	        System.out.println("There are no available products to edit in this category.");
	        return;
	    }

	    System.out.print("Enter product code to edit: ");
	    String editProd = scanner.nextLine().trim().toUpperCase();

	    boolean found = false;

	    try (
	        BufferedReader reader = new BufferedReader(new FileReader(originalFile));
	        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))
	    ) {
	        String line;
	        while ((line = reader.readLine()) != null) {
	            String[] fields = line.split("\\*");

	            if (fields.length < 5) {
	                writer.write(line + "\n"); 
	                continue;
	            }

	            if (fields[0].equalsIgnoreCase(editProd)) {
	                found = true;
	                String[] productDetails = fields.clone();
	                String updatedLine = editProductAttributes(productDetails, editProd);

	                if (!updatedLine.isEmpty()) {
	                    writer.write(updatedLine + "\n");
	                } else {
	                    writer.write(line + "\n"); 
	                }
	            } else {
	                writer.write(line + "\n");
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("Error editing product file:");
	        e.printStackTrace();
	        return;
	    }

	    if (!found) {
	        System.out.println("Product code not found. No changes made.");
	        tempFile.delete();
	        return;
	    }

	    if (originalFile.delete()) {
	        if (tempFile.renameTo(originalFile)) {
	            System.out.println("Product updated successfully.");
	            System.out.print("Do you want to edit a product variant? [1 - Yes / 0 - No]: ");
	            String choice = scanner.nextLine().trim();
	            if (choice.equals("1")) {
	                handleVariantEditing(editProd);
	            }
	        } else {
	            System.out.println("Failed to rename temporary file to original.");
	        }
	    } else {
	        System.out.println("Failed to delete original file.");
	    }
	}

	public static void addAccounts() throws IOException {
		String userType = getUserType();

		if (userType.isEmpty())
			return; // early out if the user decides to go back
		String id = generateAccountID(userType);

		String username = "";

		System.out.print("Enter User Name: ");
		if (username.equals("0"))
			return;
		while (doesUsernameExist(username = scanner.nextLine()) == true) {
			System.out.println("Username is already taken");
			System.out.print("Enter User Name: ");
		}
		System.out.print("Enter Password: ");
		String password = scanner.nextLine().trim();
		if (password.equals("0"))
			return;
		String encryptedPassword = encryptPassword(password);

		System.out.print("Enter Email: ");
		String email = scanner.nextLine().trim();
		while (!isEmailValid(email)) {
			System.out.println("Invalid email account.\n");
			System.out.print("Enter email: ");
			email = scanner.nextLine().trim();
		}

		System.out.print("Enter Address: ");
		String address = scanner.nextLine().trim();
		if (address.equals("0"))
			return;
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("AccountRecords.txt", true))) {
			writer.write(String.join("*", id, username, encryptedPassword, email, address, userType, "Enabled"));
			writer.newLine();
			if (userType.equalsIgnoreCase("Customer")) {
				String initialAmount = "0.00";
				boolean validAmount = false;
				while (!validAmount) {
					try {
						System.out.print("Enter initial SORAIA Wallet: PHP ");
						initialAmount = scanner.nextLine().trim();
						if (initialAmount.equals("0"))
							return;
						double amount = Double.parseDouble(initialAmount);
						if (amount <= 0) {
							System.out.println("Amount must be higher than 0.");
						} else {
							validAmount = true;
							initialAmount = String.format("%.2f", amount);
						}
					} catch (NumberFormatException e) {
						System.out.println("Please enter a valid number.");
					}
				}
				createWallet(id, username, initialAmount);
				writer.close();
			}
		}
		System.out.println("\nAccount created successfully!\n");
	}

	



	// UPDATING RECORDS

	
	public static void addToCart(String productID, String productVariationID, double productPrice, int quantity)
			throws IOException {
		// USER_ID*PRODUCT_ID*VARIATION_ID*QUANTITY*TRANSACTION_NUMBER
		if (isItemStackable("Cart.txt", productID, productVariationID)) {
			updateCartProductQuantity(productID, productVariationID, quantity);// edits the product quantity if theres
																				// already a duplicate order
			return;
		}
		File cart = new File("Cart.txt");
		BufferedWriter cartWriter = new BufferedWriter(new FileWriter(cart, true));
		cartWriter.write(String.join("*", currentUserID, productID, productVariationID, String.valueOf(productPrice),
				String.valueOf(quantity) + "\n"));
		cartWriter.close();
		logActivity("Added an Item To Cart");
	}

	public static void mergeDuplicateOrders(String productID, String productVariationID, int quantity)
			throws IOException {
		File salesRecords = new File("SalesRecords.txt");
		File temp = new File("Temp.txt");
		BufferedReader salesRecordReader = new BufferedReader(new FileReader(salesRecords));
		BufferedWriter tempWriter = new BufferedWriter(new FileWriter(temp));
		String[] lineToUpdate = new String[3];
		String line = "";
		while ((line = salesRecordReader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (productID.equals(fields[0]) && productVariationID.equals(fields[1])) {
				lineToUpdate = fields.clone();
				continue;
			}
			tempWriter.write(line + "\n");
		}
		tempWriter.close();
		salesRecordReader.close();

		lineToUpdate[2] = String.valueOf(Integer.parseInt(lineToUpdate[2]) + quantity);

		BufferedReader tempReader = new BufferedReader(new FileReader(temp));
		BufferedWriter salesRecordWriter = new BufferedWriter(new FileWriter(salesRecords));
		while ((line = tempReader.readLine()) != null) {
			salesRecordWriter.write(line + "\n");
		}
		salesRecordWriter.write(String.join("*", lineToUpdate) + "\n");
		tempReader.close();
		salesRecordWriter.close();
		temp.delete();
	}


	public static void updateCartProductQuantity(String productID, String productVariationID, int quantity)
			throws IOException {
		File cart = new File("Cart.txt");
		File temp = new File("Temp.txt");
		BufferedReader cartReader = new BufferedReader(new FileReader(cart));
		BufferedWriter tempWriter = new BufferedWriter(new FileWriter(temp));
		String[] lineToUpdate = new String[5];
		String line = "";
		while ((line = cartReader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (currentUserID.equals(fields[0]) && productID.equals(fields[1])
					&& productVariationID.equals(fields[2])) {
				lineToUpdate = fields.clone();
				continue;
			}
			tempWriter.write(line + "\n");
		}
		tempWriter.close();
		cartReader.close();

		lineToUpdate[4] = String.valueOf(Integer.parseInt(lineToUpdate[4]) + quantity);

		BufferedReader tempReader = new BufferedReader(new FileReader(temp));
		BufferedWriter cartWriter = new BufferedWriter(new FileWriter(cart));
		while ((line = tempReader.readLine()) != null) {
			cartWriter.write(line + "\n");
		}
		cartWriter.write(String.join("*", lineToUpdate) + "\n");
		tempReader.close();
		cartWriter.close();
	}

	public static void updateInventory(String productID, String productVariationID, int amount) throws IOException {
		File inventory = new File("ProductInventory.txt");
		File temp = new File("temp.txt");
		BufferedReader inventoryReader = new BufferedReader(new FileReader(inventory));
		BufferedWriter tempWriter = new BufferedWriter(new FileWriter(temp));

		int selectedProductPosition = 0;
		int productPosition = 0;
		String line = "";
		String[] lineToUpdate = new String[5];
		while ((line = inventoryReader.readLine()) != null) {
			String[] fields = line.split("\\*");
			productPosition++;
			if (productID.equals(fields[0]) && productVariationID.equals(fields[1])) {
				lineToUpdate = fields.clone();
				selectedProductPosition = productPosition;
			} else {
				tempWriter.write(line + "\n");
			}
		}
		lineToUpdate[4] = String.valueOf(Integer.parseInt(lineToUpdate[4]) + amount); // caters negative and positive in updating
		tempWriter.close();
		inventoryReader.close();
		productPosition = 0;
		BufferedReader tempReader = new BufferedReader(new FileReader(temp));
		BufferedWriter inventoryWriter = new BufferedWriter(new FileWriter(inventory));
		boolean isAdded = false;
		while ((line = tempReader.readLine()) != null) {
			productPosition++;
			if (productPosition == selectedProductPosition) {
				inventoryWriter.write(String.join("*", lineToUpdate) + "\n");
				isAdded = true;
			}
			inventoryWriter.write(line + "\n");
		}
		if (isAdded == false) {
			inventoryWriter.write(String.join("*", lineToUpdate) + "\n");
		}
		tempReader.close();
		inventoryWriter.close();

	}

	public static void updateProductRecordStocks(String productID) throws IOException {

		File productRecords = new File("ProductRecords.txt");
		File temp = new File("temp.txt");
		BufferedReader productRecordReader = new BufferedReader(new FileReader(productRecords));
		BufferedWriter tempWriter = new BufferedWriter(new FileWriter(temp));

		int selectedProductPosition = 0;
		int productPosition = 0;
		String line = "";
		String[] lineToUpdate = new String[5];
		while ((line = productRecordReader.readLine()) != null) {
			String[] fields = line.split("\\*");
			productPosition++;
			if (productID.equals(fields[0])) {
				lineToUpdate = fields.clone();
				selectedProductPosition = productPosition;
			} else {
				tempWriter.write(line + "\n");
			}
		}
		lineToUpdate[4] = String.valueOf(getProductTotalStocks(productID));

		tempWriter.close();
		productRecordReader.close();
		productPosition = 0;
		boolean isAdded = false;
		BufferedReader tempReader = new BufferedReader(new FileReader(temp));
		BufferedWriter productRecordWriter = new BufferedWriter(new FileWriter(productRecords));
		while ((line = tempReader.readLine()) != null) {
			productPosition++;
			if (productPosition == selectedProductPosition) {
				isAdded = true;
				productRecordWriter.write(String.join("*", lineToUpdate) + "\n");
			}
			productRecordWriter.write(line + "\n");
		}
		if (isAdded == false) {
			productRecordWriter.write(String.join("*", lineToUpdate) + "\n");
		}
		tempReader.close();
		productRecordWriter.close();
	}

	public static void updateWalletBalance(double amount) throws IOException {
		File inputFile = new File("SORAIA_Wallets.txt");
		File tempFile = new File("SORAIA_Wallets_temp.txt");
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
		String line;
		while ((line = reader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (!fields[0].equals(currentUserID)) {
				writer.write(line + "\n");
				continue;
			}
			double currentBalance = Double.parseDouble(fields[2]);
			double updatedBalance = currentBalance + amount;
			writer.write(fields[0] + "*" + fields[1] + "*" + String.format("%.2f", updatedBalance) + "\n");
		}
		reader.close();
		writer.close();
		inputFile.delete();
		tempFile.renameTo(inputFile);
	}



	// ORDERING FUNCTIONS

	public static String getProductVariationID(String productID) throws IOException {
		if (displayProductVariations(productID) == 0){
			System.out.println("There are no available variants for this product yet.");
			return "";
		}
		int productPosition = 0;
		boolean isValidInput = false;
		while (isValidInput == false) {
			String userInput = scanner.nextLine();
			try {
				productPosition = Integer.parseInt(userInput);
				if (productPosition < 0) {
					System.err.print("Enter an Integer Higher than 0: ");
				} else {
					isValidInput = true;
				}
			} catch (Exception NumberFormatException) {
				System.err.print("Input a valid Integer Input: ");
			}
		}
		if (productPosition == 0) {
			return "";
		}
		String line = "";
		int currentProductPosition = 0;
		File productRecords = new File("ProductInventory.txt");
		BufferedReader productRecordsReader = new BufferedReader(new FileReader(productRecords));
		while ((line = productRecordsReader.readLine()) != null) {
			String[] fields = line.split("\\*");
			
			if (isProductArchived(fields[0], fields[1]) == true) { // for items that are deleted/archived
				continue;
			}
			if (line.contains(productID)) {
				currentProductPosition++;
			}
			if (currentProductPosition == productPosition) {
				productRecordsReader.close();
				return fields[1];
			}
		}
		System.out.println("Product not found please enter a valid Input!");
		productRecordsReader.close();
		return getProductVariationID(productID);
	}


	public static String getCategoryValue(String choice) {
		if (choice.equals(" ")) { // for new run of the selectProduct
			displayProductCategories();
			choice = scanner.nextLine().trim();
		}
		boolean isRunning = true;
		while (isRunning) {
			switch (choice) {
			case "0":
				return "";
			case "1":
				return "SCP";
			case "2":
				return "BCP";
			case "3":
				return "MUP";
			case "4":
				return "HCP";
			case "5":
				return "NCP";
			case "6":
				return "TSP";
			default:
				System.out.println("Invalid category");
				System.out.print("Input: ");
				choice = scanner.nextLine().trim();
				break;
			}
		}
		return choice;
	}

	public static String getProductID(String category) throws IOException {
		if (displayCategoryProducts(category) == 0){
			System.out.println("The current category has no available products yet.");
			return "";
		}
		int productPosition = 0;
		boolean isValidInput = false;
		while (isValidInput == false) {
			String userInput = scanner.nextLine();
			try {
				productPosition = Integer.parseInt(userInput);
				if (productPosition < 0) {
					System.err.print("Enter an Integer Higher than 0: ");
				} else {
					isValidInput = true;
				}
			} catch (Exception NumberFormatException) {
				System.err.print("Input a valid Integer Input: ");
			}
		}
		if (productPosition == 0) {
			return ""; // early out
		}
		String line = "";
		int currentProductPosition = 0;
		File productRecords = new File("ProductRecords.txt");
		BufferedReader productRecordsReader = new BufferedReader(new FileReader(productRecords));
		while ((line = productRecordsReader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (isProductArchived(fields[0], "") == true){ // for items that are not deleted
				continue;
			} 
			// for archives catching
			if (line.contains(category)) {
				currentProductPosition++;
			}
			if (currentProductPosition == productPosition) {
				productRecordsReader.close();
				return fields[0];
			}
		}
		System.out.println("Product not found please enter a valid Input!");
		productRecordsReader.close();
		return getProductID(category);
	}

	public static String[] selectOrder(String[] orderAttributes, int flag) throws IOException {// USE THIS IN THE EDIT CATEGORY??
		if (flag == 4){
			return orderAttributes; // for exiting early with the attributes
		}
		final int changeCategory = 0;
		final int changeProduct = 1;
		final int changeVariation = 2;
		final int changeQuantity = 3;
		String category = "";
		if (!(orderAttributes[1].equals(" "))) { // since the method doesnt save the category this ensure that the header will not error
			category = getCategoryValue(orderAttributes[1]);
		}
		String productID = orderAttributes[0];
		String productVariationID = orderAttributes[1];
		double productPrice = Double.parseDouble(orderAttributes[2]);
		int quantity = Integer.parseInt(orderAttributes[3]);
		String decision = "";
		boolean isRunning = true;
		while (isRunning) {
			if (flag == changeCategory) { // GET CATEGORY
				category = getCategoryValue(" ");
				flag = changeProduct;
				if (category.isEmpty()) {
					isRunning = false;
					continue;
				}
			}

			if (flag == changeProduct) { // GET PRODUCT
				// display products
				productID = getProductID(category);
				productPrice = Double.parseDouble(getProductPrice(productID));

				if (getProductStocks("ProductRecords.txt", productID, productVariationID,
						1) != 0) {
					flag = changeVariation;
				} else {
					System.out.println("Invalid Input. Product is out of stocks.");
				}

				if (productID.equals("")) {
					flag = changeCategory;
				}

			}

			if (flag == changeVariation) { // GET VARIATIONS
				// display variations
				productVariationID = getProductVariationID(productID);

				if (getProductStocks("ProductInventory.txt", productID, productVariationID, 2) != 0) {
					flag = changeQuantity;
				} else {
					System.out.println("Invalid Input. Product is out of stocks.");
				}

				if (productVariationID.equals("")) {
					flag = changeProduct;
				}
			}

			if (flag == changeQuantity) { // GET QUANTITY
				System.out.println("How many of " + getProductName(productID) + " || Variation: " + getProductVariantName(productID, productVariationID) + " || CURRENT STOCKS: "	+ (getProductStocks("ProductInventory.txt", productID,productVariationID, 2))+ "x");
				System.out.print("Quantity: ");
				quantity = Integer.parseInt(validIntInput()); // quantity

				if (quantity == 0) { // go back
					flag = changeVariation;
				}

				else if (!(quantity <= getProductStocks("ProductInventory.txt", productID,productVariationID, 2))) { // check if higher than stocks
					System.out.println("Inputted Quantity is higher than the current stocks.");
				}

				else {
					orderAttributes[0] = productID;
					orderAttributes[1] = productVariationID;
					orderAttributes[2] = String.valueOf(productPrice);
					orderAttributes[3] = String.valueOf(quantity);
					return orderAttributes;
				}
			}
		}
		return new String[0];
		// put the check out process here (cart or proceed to check out)
	}








	// EVERY METHODS HANDLING



	public static int handleEPaymentOptions() throws IOException {
		displayEMoneyOptions();
		String eMoneyChoice = scanner.nextLine().trim();
		Boolean isRunning = true;
		while (isRunning) {
			switch (eMoneyChoice) {
			case "0":
				System.out.println("Returning to payment options...");
				return 0;
			case "1":
				if (handleEMoneyPayment("GCash") == 1)
					return 1;
				break;
			case "2":
				if (handleEMoneyPayment("PayMaya") == 1)
					return 1;
				break;
			case "3":
				if (handleEMoneyPayment("GrabPay") == 1)
					return 1;
				break;
			default:
				System.err.println("Invalid option.");
				break;
			}
		}
		return 0;
	}

	public static int handlePaymentOptions(Double amountToPay) throws IOException {
		boolean isRunning = true;
		// flag 1 == transaction is accepted flag 0 == go back
		while (isRunning) {
			displayPaymentOptions();
			String choice = scanner.nextLine().trim();
			if (choice.equals("0")) {
				System.out.println("Going back...");
				isRunning = false; // goes back and returns 0
			} else if (choice.equals("1")) {
				System.out.println("Cash On Delivery (COD) selected.");
				return 1;
			} else if (choice.equals("2")) {
				if (handleSORAIAPay(amountToPay) == 1)
					return 1;
			} else if (choice.equals("3")) {
				if (handleEPaymentOptions() == 1)
					return 1;
			} else {
				System.err.println("Invalid choice, please try again.");
			}
		}
		return 0;
	}

	public static int handleSORAIAPay(double amountToPay) throws IOException {
		if (!userWalletExists()) {
			System.out.println("No wallet found.");
			return 0;
		}
		boolean isRunning = true;
		while (getCurrentWalletBalance() < amountToPay) {
			System.out.println("Insufficient Balance. Please load more.");
			System.out.println("Your current balance ₱" + getCurrentWalletBalance() + " Amount to pay: " + amountToPay);

			System.out.println("[0] go back [1] load balance to account.");
			System.out.print("Input: ");
			String choice = scanner.nextLine().trim();
			if (choice.equals("1")) {
				loadWalletBalance();
			} else if (choice.equals("0")) {
				return 0;
			} else {
				System.out.println("Invalid Input");
			}
		}
		String choice = "";
		while (!(choice.equals("0"))) {
			System.out.println("Are you sure you want to pay with SORAIA Pay?");
			System.out.println("[0] go back [1] yes");
			System.out.print("Input: ");
			choice = scanner.nextLine().trim();
			switch (choice) {
			case "0":
				System.out.println("Going back...");
				return 0;
			case "1":
				updateWalletBalance(-amountToPay); // makes the argument negative
				System.out.printf("Payment of PHP %.2f successful with SORAIA Pay.\n", amountToPay);
				return 1; // transanction went through
			default:
				System.out.println("Invalid Input");
				break;
			}
		}
		return -1; // for error catching if it occurs
	}

	public static int handleEMoneyPayment(String providerName) throws IOException {
		String number;
		boolean isValid = false;

		while (!isValid) {
			System.out.print("Enter " + providerName + " number: ");
			number = scanner.nextLine().trim();
			if (number.length() == 11 && isAllDigits(number)) {
				isValid = true;
			} else {
				System.out.println("Invalid " + providerName + " number. Please enter exactly 11 digits.");
			}
		}

		String generatedOTP = generateOTP();
		System.out.println("One Time Code: " + generatedOTP);
		if (verifyOTP(generatedOTP)) {
			System.out.println("Mode of payment: " + providerName);
			System.out.print("Payment approved! Amount paid by " + providerName + " ");
			return 1;
		} else {
			System.out.println("Invalid OTP! Payment failed.");
			return 0;
		}
	}

	public static void handleVariantEditing(String mainProduct) throws IOException {
		File variantFile = new File("ProductInventory.txt");
		File tempVariantFile = new File("tempVariantFile.txt");

		BufferedReader reader = new BufferedReader(new FileReader(variantFile));
		String[] matchingVariants = new String[10];
		int variantCount = 0;
		String line;
		// HAHANAPIN NIYA YUNG LAHAT NG MGA VARIANT NG PRODUCT
		while ((line = reader.readLine()) != null) {
			if (line.startsWith(mainProduct + "*")) {
				matchingVariants[variantCount] = line;
				variantCount++;
			}
		}
		reader.close();

		if (variantCount == 0) {
			System.out.println("No variants found for product " + mainProduct);
			return;
		}

		System.out.println("Variants for product " + mainProduct + ":");
		for (int i = 1; i <= variantCount; i++) {
			System.out.println("[" + i + "]" + matchingVariants[i]);
		}

		System.out.print("Enter the number of product variant to edit: ");
		int selectedIndex = Integer.parseInt(scanner.nextLine().trim()) - 1;
		if (selectedIndex < 0 || selectedIndex >= variantCount) {
			System.out.println("Invalid choice.");
			return;
		}

		String selectedVariant = matchingVariants[selectedIndex];
		String[] fields = selectedVariant.split("\\*");
		boolean editing = true;
		while (editing) {
			displayEditVariantMenu();
			String choice = scanner.nextLine().trim();
			switch (choice) {
			case "0":
				System.out.println("Cancelling variant edit. No changes saved.");
				return;
			case "1":
				System.out.print("Enter new name: ");
				fields[2] = scanner.nextLine().trim();
				break;
			case "2":
				System.out.print("Enter new size: ");
				fields[3] = validSizeInput();
				break;
			case "3":
				System.out.print("Enter new stock: ");
				fields[4] = validIntInput();
				break;
			case "4":
				System.out.print("Enter new name: ");
				fields[2] = scanner.nextLine().trim();
				System.out.print("Enter new size: ");
				fields[3] = validSizeInput();
				System.out.print("Enter new stock: ");
				fields[4] = validIntInput();
				break;
			case "5":
				editing = false;
				break;
			default:
				System.out.println("Invalid option.");
			}
		}

		String originalCode = fields[0];
		String originalVariantNumber = fields[1];
		String updatedLine = String.join("*", fields);

		BufferedReader rereader = new BufferedReader(new FileReader(variantFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempVariantFile));

		while ((line = rereader.readLine()) != null) {
			String[] lineParts = line.split("\\*");
			if (lineParts[0].equals(originalCode) && lineParts[1].equals(originalVariantNumber)) {
				writer.write(updatedLine + "\n");
			} else {
				writer.write(line + "\n");
			}
		}
		rereader.close();
		writer.close();

		if (variantFile.delete() && tempVariantFile.renameTo(variantFile)) {
			System.out.println("Variant updated successfully.");
		} else {
			System.out.println("Error saving changes.");
		}
	}


	public static void handleAddProducts() throws IOException {
		boolean isEditing = true;
		boolean savedChanges = false;
		while (isEditing) {
			displayAddProductMenu();
			String choice = scanner.nextLine().trim();
			switch (choice) {
				case "0":
					System.out.println("Changes not saved. Going back...");
					isEditing = false;
					break;
				case "1":
					addProducts();
					break;
				case "2":
					addProductVariation();
					break;
				case "3":
					System.out.println("Saving updates...");
					isEditing = false;
					break;
				default:
					System.out.println("Invalid choice.");
			}
		}
	}
	
	public static void handleAddToCart() throws IOException {
		boolean isRunning = true;
		int flag = 0;
		// attributes [productID, productVariationID, productPrice, quantity]
		String[] orderAttributes = { " ", " ", "0", "0" };
		while (isRunning) {

			orderAttributes = selectOrder(orderAttributes, flag);
			if (orderAttributes.length == 0) {
				isRunning = false;
				continue;
			}
			int productStocks = getProductStocks("ProductInventory.txt", orderAttributes[0],
					orderAttributes[1], 2);

			if (Integer.parseInt(orderAttributes[3]) > productStocks) { // catches stocks error
				System.out.println("Inputted amount is higher than current stocks.");
				flag = 3;
				continue;
			} else if (Integer.parseInt(orderAttributes[3])	+ getOrderCartQuantity(orderAttributes[0], orderAttributes[1]) > productStocks) {
				System.out.println("The item is already in the cart and exceeds the current stocks");
				flag = 3;
				continue;
			}

			System.out.println("Are you sure you want to add this to your cart?");
			System.err.println("[1] yes [0] go back to cart options");
			String choice = scanner.nextLine().trim();
			switch (choice) {
			case "1":
				addToCart(orderAttributes[0], orderAttributes[1], Double.parseDouble(orderAttributes[2]),Integer.parseInt(orderAttributes[3]));
				return;
			case "0":
				flag = 3;
				System.out.println("Going back...");
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		}

	}

	public static void handleRemovingOrder() throws IOException {
		boolean isRunning = true;
		boolean isSelectingCartItem = true;
		boolean isConfirmingCancellation = false;
		String[] cartItemAttributes = new String[5];

		while (isRunning) {
			displayCartItems();
			if (isSelectingCartItem) {
				System.out.println("Please enter the position of the item in your cart");
				System.out.print("Input:");
				cartItemAttributes = getCartItemAttributes(Integer.parseInt(validIntInput()));

				if (cartItemAttributes.length == 0) {
					System.out.println("Going back....");
					return;
				} else if (cartItemAttributes.length == 1) {
					System.out.println("Item Not Found! Please enter a valid item position.");
					continue;
				}
				isSelectingCartItem = false;
				isConfirmingCancellation = true;
			}
			if (isConfirmingCancellation) {
				System.out.println(
						"Are you sure you want to cancel " + String.join(" ", getProductName(cartItemAttributes[1]),
								getProductVariantName(cartItemAttributes[1], cartItemAttributes[2]),
								cartItemAttributes[4] + "x"));
				System.out.println("[1] yes [0] go back");
				System.out.print("Input: ");
				String choice = scanner.nextLine().trim();
				switch (choice) {
				case "1":
					removeCartItem(cartItemAttributes);
					System.out.println("Successfully removed " + String.join(" ", getProductName(cartItemAttributes[1]),
							getProductVariantName(cartItemAttributes[1], cartItemAttributes[2]),
							cartItemAttributes[4] + "x") + " from the cart.");
					return;
				case "0":
					System.out.println("Going back...");
					isConfirmingCancellation = false;
					isSelectingCartItem = true;
					break;
				default:
					System.out.println("Invalid Input");
					break;
				}
			}
		}
	}


	public static void handleCheckOutOptions() throws IOException {
		System.out.println("=".repeat(120));
		System.out.printf("| %-116s |\n", centerText("ORDER OPTIONS", 116));
		System.out.println("=".repeat(120));
		System.out.printf("| %-48s %-67s |\n", "", ("[1] Check out an item"));
		System.out.printf("| %-48s %-67s |\n", "", ("[2] Check out all"));
		System.out.printf("| %-48s %-67s |\n", "", ("[0] Go Back"));
		System.out.println("=".repeat(120));
		System.out.print("Select choice: ");
		String choice = scanner.nextLine().trim();
		switch (choice) {
		case "0":
			System.err.println("Returning to cart Options...");
			return;
		case "1":
			checkOutCartItem();
			// check out an item
			break;
		case "2":
			handleCheckOutAllCartItems();
			break;
		default:
			System.out.println("Invalid input!");
			break;
		}
	}

	public static void handleCheckOutAllCartItems() throws IOException {
		boolean isRunning = true;
		while (isRunning) {
			System.out.println("Are you sure you want to check out all the item in your cart?");
			System.out.println("=".repeat(120));
			System.out.printf("| %-116s |\n", centerText("ORDER OPTIONS", 116));
			System.out.println("=".repeat(120));
			System.out.printf("| %-48s %-67s |\n", "", ("[1] Yes"));
			System.out.printf("| %-48s %-67s |\n", "", ("[0] Go Back"));
			System.out.println("=".repeat(120));
			System.out.print("Select choice: ");
			String choice = scanner.nextLine().trim();
			switch (choice) {
			case "0":
				return;
			case "1":
				checkOutAllCartItems();
				return;
			default:
				System.out.println("Invalid Input!");
				break;
			}
		}
	}

	public static void handleCartOptions() throws IOException {
		boolean isRunning = true;
		boolean canManipulateCartItem = true;
		while (isRunning) {
			if (displayCartItems() == 1) {
				canManipulateCartItem = false;
			} else {
				canManipulateCartItem = true;
			}
			displayCartOptions();
			String choice = scanner.nextLine().trim();

			if (choice.equals("0")) { // early out
				System.out.println("Returning Back to Menu...");
				return;
			}
			switch (choice) {
				case "1":
					if (canManipulateCartItem == false) {
						System.out.println("Theres is no item in the cart. Please put an item first.");
						continue;
					}
					// edit item
					editCartItemQuantity();
					break;
				case "2":
					handleAddToCart();
					// add item
					break;
				case "3":
					// remove item
					if (canManipulateCartItem == false) {
						System.out.println("Theres is no item in the cart. Please put an item first.");
						continue;
					}
					handleRemovingOrder();
					break;
				case "4":
					if (canManipulateCartItem == false) {
						System.out.println("Theres is no item in the cart. Please put an item first.");
						continue;
					}
					handleCheckOutOptions();
					// proceed to check out
					break;
				default:
					break;
			}

		}
	}

	public static void handleEditAccountDetails() throws IOException {
		String userAccountTemp = "";
		File inputFile = new File("AccountRecords.txt");
		File tempFile = new File("temp.txt");
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter tempWriter = new BufferedWriter(new FileWriter(tempFile));
		String accountDetails;
		while ((accountDetails = reader.readLine()) != null) {
			if (accountDetails.contains(currentUserID)) {
				userAccountTemp = accountDetails; // saves the account details just in case the user wants to cancel the
													// edit or turn back the edits
				continue;
			}
			tempWriter.write(accountDetails + "\n");
		}
		reader.close();
		tempWriter.close();

		BufferedReader tempReader = new BufferedReader(new FileReader(tempFile));
		BufferedWriter accountRecordsWriter = new BufferedWriter(new FileWriter("AccountRecords.txt"));
		String[] accountFields = userAccountTemp.split("\\*");
		while ((accountDetails = tempReader.readLine()) != null) {
			accountRecordsWriter.write(accountDetails + "\n"); // rewrites previous accounts not adding the selected
																// account
		}
		tempReader.close();

		displayAccountInformation(accountFields);
		if (isAdmin()) {
			accountDetails = editAdminAccountAttributes(accountFields);
		} else {
			accountDetails = editUserAccountAttributes(accountFields);
		}

		// EDITS the user details
		if (accountDetails.equals("goBackToMenu")) { // goes back to menu and rewrites the selected account
			accountRecordsWriter.write(userAccountTemp);
			accountRecordsWriter.close();
			return;
		}

		accountRecordsWriter.write(accountDetails); // writes the updated account with new attributes
		accountRecordsWriter.close();
		System.out.println("Account Updated Successfully");
	}

	
	public static void handleViewAccountsOptions() throws IOException {
		boolean isRunning = true;
		while (isRunning) {
			displayViewAccountMenu();
			String option = scanner.nextLine().trim();
			switch (option) {
			case "0":
				isRunning = false;
				break;
			case "1":
				displayFilteredAccounts("ALL", "");
				break;
			case "2":
				displayFilteredAccounts("STATUS", "Enabled");
				break;
			case "3":
				displayFilteredAccounts("STATUS", "Disabled");
				break;
			case "4":
				displayArchivedAccounts();
				break;
			case "5":
				displaySoraiaWallets(); 
				break;
			case "6":
				System.out.print("Enter account type [1] Admin or [2] Customer: ");
				String typeFilter = scanner.nextLine().trim();
				displayFilteredAccounts("TYPE", typeFilter);
				break;
			default:
				System.out.println("Invalid option. Please try again.");
			}
		}
	}


	public static void handleInventoryOptions() throws IOException {
		boolean isRunning = true;
		while (isRunning) {
			displayInventoryMenu();
			String categoryChoice = scanner.nextLine().trim();
			switch (categoryChoice) {
			case "0":
				System.out.println("Returning to main menu...");
				isRunning = false;
				break;
			case "1":
				displayInventoryByFilter("ALL", "");
				break;
			case "2":
				displayInventoryByFilter("CATEGORY", "SCP");
				break;
			case "3":
				displayInventoryByFilter("CATEGORY", "BCP");
				break;
			case "4":
				displayInventoryByFilter("CATEGORY", "MUP");
				break;
			case "5":
				displayInventoryByFilter("CATEGORY", "HCP");
				break;
			case "6":
				displayInventoryByFilter("CATEGORY", "NCP");
				break;
			case "7":
				displayInventoryByFilter("CATEGORY", "TSP");
				break;
			case "8":
				displayArchivedProducts();
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 0 and 8.");
			}
		}
	}

	public static void handleSalesReportOptions() throws IOException {
		boolean isRunning = true;
		while (isRunning) {
			displaySalesReportOptions();
			String choice = scanner.nextLine().trim();
			switch (choice) {
				case "0":
					System.out.println("Going back ...");
					isRunning = false;
					break;
				case "1":
					generateSalesReport();
					break;
				case "2":
					findTopSales();
					displayTopSales();
					break;
				default:
					System.out.println("Invalid choice.");
					break;
			}
		}
	}

	public static void handleVariantDelete() throws IOException {
		File productFile = new File("ProductRecords.txt");
		File variantFile = new File("ProductInventory.txt");
		File archiveFile = new File("ArchiveProducts.txt");

		boolean found = false;

		String category = getCategoryValue(" ");
		if (category.isBlank()) {
			return;
		}

		String line;
		System.out.println("=".repeat(120));
		System.out.printf("| %-10s | %-67s | %-20s | %-10s |\n", "Code", "Product Name", "Price", "Stocks");
		System.out.println("=".repeat(120));
		int productCount = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(productFile));
			boolean foundCategory = false;
			while ((line = reader.readLine()) != null) {
				String fields[] = line.split("\\*");
				if (isProductArchived(fields[0], "") == true){
				continue;
				}
				if (fields[1].equalsIgnoreCase(category)) {
					productCount++;
					foundCategory = true;
					String productID = fields[0];
					String name = fields[2];
					String price = fields[3];
					String stock = fields[4];
					System.out.printf("| %-10s | %-67s | %-20s | %-10s |\n", productID, name, price, stock);
				}
			}
			reader.close();
			System.out.println("=".repeat(120));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		if (productCount == 0){
			System.out.println("There are no available products to archive yet");
			return;
		}
		System.out.print("Enter the product code to remove a variant from: ");
		String mainProduct = scanner.nextLine().trim();

		String[] matchingVariants = new String[25];
		int variantCount = 0;
		
		BufferedReader inventoryReader = new BufferedReader(new FileReader(variantFile));
		
		while ((line = inventoryReader.readLine()) != null) {
			String [] fields = line.split("\\*");
			
			if (isProductArchived(mainProduct, fields[1]) == true){
				continue;
			}
			if (line.startsWith(mainProduct + "*")) {
				matchingVariants[variantCount] = line;
				variantCount++;
			}
		}

		if (variantCount == 0) {
			System.out.println("No variants found for product " + mainProduct);
			return;
		}

		System.out.println();
		System.out.println("_".repeat(120));
		System.out.println("Variants for product " + mainProduct + ":");
		System.out.println("_".repeat(120));
		System.out.printf("|%-3s |%-7s | %-67s | %-20s | %-10s |\n", "No.", "Code", "Variant Name", "Size", "Stocks");
		
		for (int i = 0; i < variantCount ; i++) {
			String variantsDetails[] = matchingVariants[i].split("\\*"); 
			String variantId = variantsDetails[1]; 
			String name = variantsDetails[2];
			String size = variantsDetails[3];
			String stocks = variantsDetails[4];
			System.out.printf("|%-3s |%-7s | %-67s | %-20s | %-10s |\n", (i+1),variantId, name, size, stocks);
		}
		System.out.println("_".repeat(120));
		System.out.print("Enter the number of product variant to archive: ");

		int selectedIndex = Integer.parseInt(validIntInput()) - 1;
		String [] matchedVariantAttributes = matchingVariants[selectedIndex].split("\\*");
		
		if (selectedIndex < 0 || selectedIndex >= variantCount) {
			System.out.println("Invalid choice.");
			return;
		}
		if (isProductArchived(mainProduct, matchedVariantAttributes[1]) == true){
			System.out.println("Invalid choice");
			return;
		}

		BufferedWriter inventoryArchiveWriter = new BufferedWriter(new FileWriter(archiveFile, true));
		inventoryArchiveWriter.write( matchingVariants[selectedIndex] + "*VARIANT\n");
		inventoryArchiveWriter.close();
		logActivity("Archived a product variant");
	}


	public static void handleViewReports() throws IOException {
		boolean isRunning = true;
		while (isRunning) {
			displayViewReportsMenu();
			String choice = scanner.nextLine().trim();
			switch (choice) {
			case "0":
				System.out.println("Going back ...");
				isRunning = false;
				break;
			case "1":
				handleSalesReportOptions();
				break;
			case "2":
				handleInventoryOptions();
				break;
			case "3":
				viewUserActivityLogs(); 
				break;
			case "4":
				handleViewAccountsOptions();
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}
		}
	}

	public static void handleDeleteProducts() throws IOException {
		boolean isRunning = true;
		while (isRunning) {
			displayArchiveProductMenu();
			String choice = scanner.nextLine();
			switch (choice) {
			case "0":
				System.out.println("Changes not saved. Going back...");
				isRunning = false;
				break;
			case "1":
				deleteProduct();
				break;
			case "2":
				handleVariantDelete();
				break;
			case "3":
				System.out.println("Changes saved. Exiting archive menu...");
				isRunning = false;
				break;
			default:
				System.out.println("Invalid choice.");
			}
		}
	}

	public static void handleAdminOptions() throws IOException {
		logActivity("Log In");
		System.out.println("\nWelcome back, " + getUsername(currentUserID)); // MAKE A METHOD THE RETURNS THE USERNAME
		boolean isRunning = true;
		while (isRunning) {
			displayAdminMenu();
			String choice = scanner.nextLine();
			switch (choice) {
			case "0":
				System.out.println("\nReturning Back to Main Menu....\n");
				logActivity("Log Out");
				isRunning = false;
				break;
			case "1":
				handleViewReports();
				break;
			case "2":
				addProducts();
				break;
			case "3":
				editProducts();
				break;
			case "4":
				handleDeleteProducts();
				break;
			case "5":
				handleEditAccountDetails();
				break;
			default:
				System.out.println("\nInvalid user option.\n");
				break;
			}
		}
	}

	public static void handleUserOptions() throws IOException {
		logActivity("Log In");
		System.out.println("\nWelcome back, " + getUsername(currentUserID));
		boolean isRunning = true;
		while (isRunning) {
			displayUserMenu();
			String choice = scanner.nextLine();
			switch (choice) {
			case "0":
				System.out.println("\nReturning Back to Main Menu....\n");
				logActivity("Log Out");
				isRunning = false;
				break;
			case "1":
				int flag = 0;
				String[] orderAttributes = { " ", " ", "0", "0" };
				while (flag != -1) {
					orderAttributes = selectOrder(orderAttributes, flag);
					if (orderAttributes.length == 0) {
						flag = -1;
						continue;
					}
					flag = determineCartOrPlaceOrder(orderAttributes, 4); 
				}
				break;
			case "2":
				handleCartOptions();
				break;
			case "3":
				viewMyPurchase();
				break;
			case "4":
				archiveAccount(currentUserID); 
				break;
			case "5":
				handleEditAccountDetails();
				break;
			default:
				System.out.println("\nInvalid user option.\n");
				break;
			}
		}
	}

	public static int logIn() throws IOException {
		File accountRecords = new File("AccountRecords.txt");
		System.out.println("0 if you want to go back");
		System.out.print("Enter username: ");
		String inputUsername = "";

		while (!doesUsernameExist(inputUsername = scanner.nextLine().trim())) {
			if (inputUsername.equals("0")) {
				return 0;
			}

			System.out.println("Username is not recognized.\n");
			System.out.println("0 if you want to go back");
			System.out.print("Enter username: ");
		}

		if (isUserDisabled(inputUsername)) {
			System.err.println("Sorry, this account is disabled. Returning to the main menu...");
			return -1;
		}

		System.out.print("Enter password: ");
		String inputPassword = "";
		int logInAttempt = 0;
		if (inputPassword.equals("0"))
			return 0;
		while (!verifyPassword(inputPassword = scanner.nextLine().trim(), inputUsername, accountRecords)
				&& logInAttempt < 3) {
			System.out.println("Incorrect Password\n");
			logInAttempt++;
			if (logInAttempt == 3) {
				System.err.println("Login attempts exceeded. The program is terminating.");
				System.exit(0);
			}
			System.out.print("Enter password: ");
		}

		BufferedReader reader = new BufferedReader(new FileReader(accountRecords));
		String line;
		while ((line = reader.readLine()) != null) {
			String[] fields = line.split("\\*");
			if (fields[1].trim().equalsIgnoreCase(inputUsername)) {
				currentUserType = fields[5].trim();
				currentUserID = fields[0];
			}
		}
		reader.close();
		if (currentUserType.trim().equalsIgnoreCase("Admin"))
			return 1;
		else if (currentUserType.trim().equalsIgnoreCase("Customer"))
			return 2;
		return -1;
	}	

	public static void main(String[] args) throws IOException {
		boolean isRunning = true;
		checkEssentialFiles();
		final int isCustomerFlag = 2;
		final int isAdminFlag = 1;
		while (isRunning) {
			displayMainMenu();
			String choice = scanner.nextLine();
			int flag = 0;
			switch (choice) {
			case "0":
				System.out.println("\nThank you for visiting the app!\n");
				isRunning = false;
				break;
			case "1":
				flag = logIn();
				if (flag == isAdminFlag) {
					handleAdminOptions();
				} else if (flag == isCustomerFlag) {
					handleUserOptions();
				} else {
					System.out.println("Login unsuccessful.");
				}
				break;
			case "2":
				addAccounts();
				break;
			default:
				System.out.println("\nInvalid user option.\n");
				break;
			}
		}
	}
}