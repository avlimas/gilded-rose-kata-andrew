package com.gildedrose;

class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		final String legendaryItem 		= "Sulfuras, Hand of Ragnaros";
		final String agedBrie 			= "Aged Brie";
		final String backstagePasses 	= "Backstage passes to a TAFKAL80ETC concert";
		final String conjuredItem 		= "Conjured Mana Cake";
		
		for (int i = 0; i < items.length; i++) {
			if (!items[i].name.equals(legendaryItem)) {
				if (items[i].sellIn < 0) {
					if (items[i].name.equals(agedBrie)) {
						if (items[i].quality < 50)
							items[i].quality += 1;
					} else if (items[i].name.equals(backstagePasses)) 
						items[i].quality = 0;
					else {
						if (items[i].quality > 1)
							items[i].quality -= 2;
						else
							items[i].quality = 0;
					}
				} else {
					if (items[i].name.equals(agedBrie)) {
						if (items[i].quality < 50)
							items[i].quality += 1;
					} else if (items[i].name.equals(backstagePasses)) {
						if (items[i].quality < 50) {
							if (items[i].sellIn <= 10 && items[i].sellIn > 5) 
								items[i].quality += 2;
							if (items[i].sellIn <= 5) 
								items[i].quality += 3;
							if (items[i].sellIn > 10)
								items[i].quality += 1;
						}
						if(items[i].quality > 50)
							items[i].quality = 50;
					} 
					else {
						if (items[i].quality > 1) {
							if (items[i].name.equals(conjuredItem))
								items[i].quality -= 2;
							else
								items[i].quality -= 1;
						}
						else
							items[i].quality = 0;
					}
				}
			}
			items[i].sellIn -= 1;
		}
	}
}