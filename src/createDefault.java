import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class createDefault {
    
	public  void createDefaultProducts() throws IOException{
		BufferedWriter productWriter = new BufferedWriter(new FileWriter("ProductRecords.txt"));
//		skin care products SCP 
		productWriter.write("1000*SCP*Garnier Micellar Water Cleanser*399*200\n");
		productWriter.write("1001*SCP*Madagascar Centrella Light Cleansing Oil*399*200\n");
		productWriter.write("1002*SCP*Senka Perfect Whip Cleansing Foam*300*200\n");
//		body care products 
		productWriter.write("2000*BCP*BODY TREATS Hand Soap*199*200\n");
		productWriter.write("2001*BCP*DEO NAT Mineral Deodorant Spray*192*200\n");
		productWriter.write("2002*BCP*Luxe Organix Whitening Serum Lotion*299*200\n");
//		makeup products 
		productWriter.write("3000*MUP*MAYBELLINE Superstay Lumimatte Foundation*699*200\n");
		productWriter.write("3001*MUP*YOU Noutriwear Complete Cover Concealer*269*200\n");
		productWriter.write("3002*MUP*GRWM Glam & Go Stix Multiuse - Contour Stick*449*200\n");	
//		hair care products 
		productWriter.write("4000*HCP*NATURALS Hair Treatment Oil*157*200\n");
		productWriter.write("4001*HCP*TRESemmé Shampoo Keratin Smooth*204*200\n");
		productWriter.write("4002*HCP*Dove 1 Minute Conditioner*194*200\n");		
//		nail care products 
		productWriter.write("5000*NCP*PRETTY SECRET Nail to Toe Kit with Nipper*189*200\n");
		productWriter.write("5001*NCP*OMG Nail Care Shine File*60*200\n");
		productWriter.write("5002*NCP*Catrice Nail Growth Elixir Treatment*325*200\n");
//		TOILETRIES sanitary products 
		productWriter.write("6000*TSP*KOTEX Luxe Ultrathin Overnight*150*200\n");
		productWriter.write("6001*TSP*PH Care Feminine Wash*198*200\n");
		productWriter.write("6002*TSP*Kleenex Travellers Tissue*60*200\n");
		productWriter.close(); 
	}
	
	public  void createDefaultVariations() throws IOException{
		BufferedWriter productWriter = new BufferedWriter(new FileWriter("ProductInventory.txt")); 
//		SCP - Product 1 
		productWriter.write("1000*1*For Sensitive Skin*400ml*200\n");
		productWriter.write("1000*2*Vitamin C*400ml*200\n");
		productWriter.write("1000*3*Salycylic BHA*400ml*200\n");
		productWriter.write("1000*4*Argan Oil*400ml*200\n"); 
		
//		SCP - Product 2
		productWriter.write("1001*1*For All Skin Types*200ml*200\n"); 
		productWriter.write("1001*2*Hydrating and Nourishing*200ml*200\n"); 
		productWriter.write("1001*3*Deep Cleansing*200ml*200\n"); 
		
//		SCP - Product 3 
		productWriter.write("1002*1*Collagen*120g*200\n");
		productWriter.write("1002*2*Acne Care*120g*200\n");
		productWriter.write("1002*3*Hyaluronic Acid*120g*200\n");
		
//		BCP - Product 1
		productWriter.write("2000*1*Cranberry*750ml*200\n");
		productWriter.write("2000*2*Wild Orchid*750ml*200\n");
		productWriter.write("2000*3*Clean Cotton*750ml*200\n");
		productWriter.write("2000*4*Green Tea*750ml*200\n");
		productWriter.write("2000*5*Citrus*750ml*200\n");
		productWriter.write("2000*6*Antibacterial*750ml*200\n");
		
//		BCP - Product 2
		productWriter.write("2001*1*Papaya*100ml*200\n");
		productWriter.write("2001*2*Aloe*100ml*200\n");
		productWriter.write("2001*3*Natural*100ml*200\n");
		
//		BCP - Product 6
		productWriter.write("2002*1*Milk White Glutaboost*150g*200\n");
		productWriter.write("2002*2*Vit C + Arbutin*150g*200\n");
		productWriter.write("2002*3*Vitamin C Premium*150g*200\n");
		
//		MUP - Product 1
		productWriter.write("3000*1*Shade 110*70g*200\n"); 
		productWriter.write("3000*2*Shade 120*70g*200\n"); 
		productWriter.write("3000*3*Shade 228*70g*200\n"); 
		productWriter.write("3000*4*Shade 230*70g*200\n"); 
		productWriter.write("3000*5*Shade 326*70g*200\n"); 
		
//		MUP - Product 2
		productWriter.write("3001*1*FC02 Creme*80ml*200\n");
		productWriter.write("3001*2*FW06 Sand*80ml*200\n");
		productWriter.write("3001*3*LC10 Oat*80ml*200\n");
		productWriter.write("3001*4*LN12 Buff*80ml*200\n");
		productWriter.write("3001*5*MW30 Walnut*80ml*200\n");
// 		MUP - Product 3
		productWriter.write("3002*1*Affogato*200g*200\n");
		productWriter.write("3002*2*Café au lait*200g*200\n");
		productWriter.write("3002*3*Con Panna*200g*200\n");

//		HCP - Product 1
		productWriter.write("4000*1*Olive Oil*100ml*200\n");
		productWriter.write("4000*2*Coconut Oil*100ml*200\n");
		productWriter.write("4000*3*Argan Oil*100ml*200\n");
		productWriter.write("4000*4*Lavender Oil*100ml*200\n");
		
//		HCP - Product 7
		productWriter.write("4001*1*170ml*170ml*200\n");
		productWriter.write("4001*2*330ml*330ml*200\n");
		productWriter.write("4001*3*620ml*620ml*200\n");
		productWriter.write("4001*4*900ml*900ml*200\n");
		
//		HCP - Product 8
		productWriter.write("4002*1*Straight and Silky*150ml*200\n");
		productWriter.write("4002*2*Ceramide Intense Repair*150ml*200\n");
		productWriter.write("4002*3*Niacinamide + Arbutin*350ml*200\n");
		productWriter.write("4002*4*Biotin Hair Fall Rescue*150ml*200\n");
		
//		NCP - Product 2
		productWriter.write("5000*1*Standard*1pc*200\n");

//		NCP - Product 2
		productWriter.write("5001*1*Standard*1pc*200\n");
//		NCP - Product 2
		productWriter.write("5002*1*Standard*10.5ml*200\n");
		
//		TSP - Product 2 
		productWriter.write("6000*1*Retinol + Gluta*350ml*200\n");
		productWriter.write("6000*2*Milk + Gluta*350ml*200\n");
		productWriter.write("6000*3*Niacinamide + Arbutin*350ml*200\n");
		productWriter.write("6000*4*Tranexamic Acid*350ml*200\n");
		
//		TCP - PRoduct 3
		productWriter.write("6001*1*Cooling Comfort*250ml*200\n");
		productWriter.write("6001*2*Retinol + Gluta*350ml*200\n");
		productWriter.write("6001*3*Delicate White*250ml*200\n");
		productWriter.write("6001*4*Floral Clean*250ml*200\n");
		productWriter.write("6001*5*Natural Protection*250ml*200\n");
	
// 		TCP - Product 
		productWriter.write("6002*1*2Ply*40 Pulls*200\n");
		productWriter.write("6002*2*2Ply*60 Pulls*200\n");
		
		productWriter.close();
	}
}
