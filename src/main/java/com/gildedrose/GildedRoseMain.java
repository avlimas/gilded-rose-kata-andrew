package com.gildedrose;

public class GildedRoseMain {

	public static void main(String[] args) {
        if (args.length > 0) {
			if(args[0].equals("--help")) {
				System.out.println("Hello fellow travelers, to simulate the day in Gilded rose, please add '-days=' as parameter. Thank you!");
			}
			else if(args[0].contains("-days")) {
				try {
					String daysToSimulate = args[0].replace("-days=", "");
					int days = Integer.parseInt(daysToSimulate);
					if (days <= 0)
						System.out.println("Zero day is invalid. Please add more than 0");
					else
						runTheApplication(days);
				} catch (Exception e) {
					System.out.println("Invalid parameter for 'days' (Use only integers) ");
				}
			}
		}
        else {
			System.out.println("Please use --help to see how the application works");
        }
    }
	
	private static Item[] initiateDemoData() {
        System.out.println("Now initiating demo data...");
		return new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 9),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new Item("Conjured Mana Cake", 3, 6) };
	}
	
	private static void runTheApplication(int days) {
		Item[] items = initiateDemoData();
		GildedRose app = new GildedRose(items);

        for (int i = 0; i < days; i++) {
            System.out.println("-------- Day " + (i+1) + " --------");
            System.out.println("Name, 	Sell Until Date, Quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
	}
}
