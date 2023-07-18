package com.digit.javaTraining.Project1;

import java.util.Scanner;

abstract class categories {

	String catagories1[] = { "Grocery", " Electronics ", "Home", "Fashion", "Toys & Baby" };

	abstract void category();

}

class subcategories extends categories {

	String subCatagories[][] = {

			// Grocery

			{ "Dry Fruits & Nuts", "Fruits & Vegetables", "Body & Skin care", "Laundry & Dishwash" },

			// Electronics

			{ "Mobiles", "Laptops", "Headphone", "Cameras" },

			// Home

			{ "Kitchen Essentials", "Home Decor", "Home Furnishing", "Gardening & Tools" },

			// Fashion

			{ "Men's wear", "Women's wear", "Watches", "Shoes" },

			// Toys & baby

			{ "Baby care essentials", "Baby care combos", "Stationery ", "Toys & Games" } };

	@Override

	void category() {

		for (int i = 0; i < 5; i++) {

			System.out.println((i + 1) + "." + catagories1[i]);

			//

		}

	}

}

class products extends subcategories {

	String Product1[][] = {

			// Dry Fruits & Nuts

			{ "Almonds", "Cashew", "Dates & Raisins", "Apricots & Berries", "Makhana & Figs" },

			// Fruits & Vegetables

			{ "Mango", "Tomato", "Coconut", "Apple", "Sweet Corn" },

			// Body & Skin care

			{ "Soaps & Body Wash", "Face wash", "Perfumes", "Creams & Lotions", "Shaving needs" },

			// Laundry & Dishwash

			{ "Surf excel", "Vanish", "Vim", "Lizol", "Comfort" },

			// Mobiles

			{ "Apple", "Samsung", "OnePlus", "Vivo", "Oppo" },

			// Laptops

			{ "MacBook", "HP", "Dell", "Asus", "Acer" },

			// Headphone

			{ "bOAt", "Nothing", "Sony", "JBL", "Noise" },

			// Cameras

			{ "Canon", "Sony", "Nikon", "GoPro", "Dji" },

			// Kitchen Essentials

			{ "Gas Stoves", "Cooker", "Dinner Set", "Microwave", "chimney" },

			// Home Decor

			{ "Decorative Mirror", "Candels", "Photo Frame", "Wallpaper", "paintings" },

			// Home Furnishing

			{ "Pillow", "Blankets", "Bedsheets", "Door Mates", "Curtains" },

			// Gardening & Tools

			{ "Plant stand", "Bosch Tools", "Hammer", "Flower Cutter", "Water Pipe" },

			// Men's wear

			{ "Pants", "Shorts", "T-shirts", "Shirts", "Comfort wear" },

			// Women's

			{ "Kurtas", "Sarees", "Tops", "SportsWear", "Night wear" },

			// Watches

			{ "Disel", "Titan", "Rolex", "Rado", "Michael Kors" },

			// Shoes

			{ "Nike", "Adidas", "Puma", "RedTape", "Asics" },

			// Baby care essentials

			{ "Mama Earth", "Johnson's", "Himalaya", "Dove", "Chicco" },

			// Baby care combos

			{ "Himalayan Gentle Baby soap", "Dove Moisturizer", "Mama earth shampoo", "Chicco face cream",

					"Johnsons's Powder" },

			// Stationery

			{ "Pens", "Eraser", "Notebooks", "Colors", "Geometry" },

			// Toys & Games

			{ "Racing car", "Mini Drone", "Cycle", "PlayStation", "Xbox" }

	};

}

class description extends products {

	String descriptions1[][] = {

			// Almonds

			{ "Rs.850/kg", "Rs.799/kg", "Rs.343/kg", "Rs.766/kg", "Rs.899/kg" },

			// Fruits & Vegetables

			{ "Rs.99/kg", "Rs.340/kg", "Rs.60/pcs", "Rs.100/kg" },

			// Body & Skin care

			{ "upto.60% Off", "upto70% Off", "1699 only", "Starts with 199 only", "upto 40% off" },

			// Laundry & Dishwash

			{ "Rs.300/kg", "Rs.235\n 800ml", "Rs.99", "Rs.876\n1000ml", "Rs.188\n 375ml" },

			// "Apple","Samsung","OnePlus","Vivo","Oppo"

			{ "Iphone 14Pro\n Rs.1,30,000", "Flip-4\n RS.90,000", "1+ 11Pro\n  69,999", "X90-Pro\n 85,999",

					"Reno-8pro\n 35,999" },

			// "MacBook","HP","Dell","Asus","Acer"

			{ "MacBook Pro M2-(8GB/512 GB SSD/Mac OS \n Rs.1,37,990)",

					"HP Pavilion Intel Core i5 12th Gen-(16GB/512 SSD /Window)\n Rs.66,990",

					"DELL Core i5 12th Gen-(8GB/1TB HDD 256GB/SSD)\n Rs.54,990",

					"ASUS VivoBook 15core i5 12th GEN-(8GB/512GB SSD/Window)\n RS.59,990",

					"ACER Nitro 5 Gaming Core i7 12th GEN -(16GB/1TB SSD )\n Rs.1,09,990" },

			// "bOAt","Nothing","Sony","JBL","Noise"

			{ "bOAt Airdrop 131 Pro\n Rs.1399", "Nothing Ear2\n Rs.9,990", "SONY WH-1000XM4 \n Rs.12,990",

					"JBL TUNE 230NC TWS\n Rs.5,899", "Noise Buds Trance \n Rs.1,129" },

			// "Canon","Sony","Nikon","GoPro","Dji"

			{ "Cannon EOS M50 Mark\n Rs.59,990", "Nikon Z 50 Mirrorless \n Rs.92,590 ",

					"GoPro Hero 9 Sports\n Rs.39,990", "dji ASR01 Camera \n Rs.34,990" },

			// "Gas Stoves","Cooker","Dinner Set","Microwave","chimney"

			{ "Prestige 3 burner \n Rs.7,999", "Pigeon By Stovekraft \n Rs.3,399", "Milton Ernesto Inner \n Rs.999",

					"IFB 23L MICROWAVE \n Rs.5,990", "Hindware Clarissa BLK 60 \n RS.5,990" },

			// "Decorative Mirror","Candels","Photo Frame","Wallpaper","paintings"

			{ "Flipkart Perfect homes \n Rs.760 ", "Fragnance candels \n Rs.890", "3*4 Photo Frame \nRs.670",

					"Shri Krishna Style Wallpaper \n Rs.234", "Postal Painting of Mona Lisa \n Rs.567" },

			// "Pillow","Blankets","Bedsheets","Door Mates","Curtains"

			{ "Sleepwell Pillow \n Rs.569", "Signature single bed blanket \n Rs.1,990",

					"Signature Double Bedsheet With pillow cover \n Rs.1,790", "4 X 12 Doormate \n Rs.1,890",

					"single side curatins \nRs.3,560" },

			// "Plant stand","Bosch Tools","Hammer","Flower Cutter","Water Pipe"

			{ "3 X 5inch plant stand with 6 bucket \n Rs.990", "Bosch 10 Tools with all equipment \n Rs.2,990",

					"Hammer Drills DH10-78 \n Rs.6,137 ", "Jeel Enterprise flower control \n Rs.579",

					"Water pipe 2mtr \n Rs.990" },

			// "Pants","Shorts","T-shirts","Shirts","Comfort wear"

			{ "Levis Pants \n Rs.1,990  ", "UCB shorts \n Rs.780", "USPA \n Rs.990", "Allen Solly \n Rs.789",

					"Addidas \n Rs.1,990" },

			// "Kurtas","Sarees","Tops","SportsWear","Night wear"

			{ "Cickankari kurta's \n Rs.990 ", "Linnen Saree with best quality \n Rs.1,990", "Roadster Tops \n Rs.990",

					"Nike SportsWear \n Rs.2,990", "USA COMFY \n Rs.349" },

			// "Disel","Titan","Rolex","Rado","Michael Kors"

			{ "Disel Round Analog Watch \n Rs.5,789", "Edge Squircle Annalog watch \n Rs.3,990",

					" Rolex Yellow Gold Green Dial Analog Watch  \n Rs.56,890",

					"Rado Captain Cook High-Tech Ceramic Driver \n Rs.3,47,000",

					"Michael kors Digital watch \n Rs.67,990" },

			// Nike","Adidas","Puma","RedTape","Asics

			{ "Nike AIR JORDAN Green Mocha \n Rs.35,990", "Adidas EQ23 Run Running Shoes \n Rs.9,990",

					"Puma Flat heel Sports Runner \n Rs.3,990", "Redtape Runnning Shoes \n Rs.1,990",

					"Asics comfy shoes \n Rs.3,990" },

			// "Mama Earth","Johnson's","Himalaya","Dove","Chicco"

			{ "Mama Earth Baby Shampoo 350ml \n Rs.375", "Johnson's Baby Powder \n Rs.450",

					"Himalaya Baby wipes \n Rs.143", "Dove Baby saop 4pack \n Rs.129",

					"chicco Baby face cream 50gm \n Rs.179" },

			// "Himalayan Gentle Baby soap","Dove Moisturizer","Mama earth shampoo","Chicco

			// face cream","Johnsons's Powder

			{ "Himalayan Gentle Baby combo \n Rs.459", "Dove Moisturizer combos \n Rs.349",

					"Mama earth shampoo combo \n Rs.679", "Chicco face cream combo \n Rs.569",

					"Johnsons's Powder combo \n Rs.990" },

			// "Pens","Eraser","Notebooks","Colors","Geometry"

			{ "Pilot V5 3pens \n Rs.158", "Apsara Eraser pack \n Rs.59 ", "ClassMate NoteBook 360pages \n Rs.120",

					"Oil Postal Color Pack of 6 \n Rs.89", "ClassMate Geometry \n Rs.190" },

			// "Racing car","Mini Drone","Cycle","PlayStation","Xbox"

			{ "Racing 4x4 car \n Rs.990", "Mini Drone BY DJI \n RS.13,300", "Cycle For 6years old \n Rs.9,990",

					" Sony PlayStation 5 \n Rs.50,000", "Microsoft XBOX 360 \n Rs.30,000" }, };

}

class purchase {

	Scanner sc = new Scanner(System.in);

	void confirm() {

		System.out.println("Enter OK To Confirm your Purchase:");

		String buy = sc.next();

		if (buy.equals("ok")) {

			System.out.println("Your purchase is succesfull");

			System.out.println("If you want to go to menu then enter  \" main \"  .If you want to exit then enter 0");

		} else {

			System.out.println("Your Purchase is unsuccesfull \n Try Again");

			System.out.println("If you want to exit then enter 0");

			if (buy.equals(0)) {
				System.out.println("Exiting....");

				System.out.println("....Thanks for coming to ekart....");
				System.out.println("....Have a nice day....");

			}
			// confirm();

		}

	}

}

class shop {

	void shopping() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Select one of the following");

		description d1 = new description();

		purchase p1 = new purchase();

		d1.category();

		System.out.println("Select category:");

		int catagories1 = sc.nextInt();

		while (catagories1 < 1 || catagories1 > 5) {

			System.out.println("please select options from 1 to 5.If you want to exit then enter 0");

			catagories1 = sc.nextInt();

			if (catagories1 == 0) {

				System.out.println("\"....Thanks for coming to ekart....\" ");
				System.out.println("....Have a nice day....");

			}

		}

		for (int i = 1; i <= 4; i++) {

			System.out.println(i + "." + d1.subCatagories[catagories1 - 1][i - 1]);

		}

		System.out.println("Select category:");

		int subCatagories = sc.nextInt();

		while (subCatagories < 1 || subCatagories > 4) {

			System.out.println("Select options from 1 to 5 only .If you want to exist type 0");

			subCatagories = sc.nextInt();

			if (subCatagories == 0) {

				System.out.println("Exiting....");

				System.out.println("....Thanks For comming....");

			}

		}

		for (int j = 1; j <= 5; j++) {

			System.out.println(j + "." + d1.Product1[4 * (catagories1 - 1) + (subCatagories - 1)][j - 1]);

		}

		System.out.println("Select Product : ");

		int Product2 = sc.nextInt();

		while (Product2 < 1 || Product2 > 5) {

			System.out.println("Please select options from 1 to 5 only. If you want to exit then enter 0");

			Product2 = sc.nextInt();

			if (Product2 == 0) {

				System.out.println("Exiting....");

				System.out.println("\"....Thanks for coming to ekart....\"");

			}
			System.exit(0);

		}

		System.out.println("Description : ");

		System.out.println(d1.descriptions1[4 * (catagories1 - 1) + (subCatagories - 1)][Product2 - 1]);

		p1.confirm();

	}

}

public class eKart {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		shop s = new shop();

		System.out.println("Welcome to E-kart Shopping");

		s.shopping();

		String str = sc.next();

		while (str.equals("main")) {

			s.shopping();

			str = sc.next();

		}

		if (str != "main") {

			System.out.println("Exiting......");

			System.out.println("\"....Thanks for coming to ekart....\"");
			System.out.println("\"....Have a nice day....\"");

		}

	}

}