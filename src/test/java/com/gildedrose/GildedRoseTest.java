package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

	@Test
    void qualityOfItemShouldNeverBeNegative() {
    	// Given
    	int days = 7;
    	int expectedQuality = 0;
    	Item[] items = new Item[] {new Item("Elixir of the Mongoose", 5, 5)};
    	
    	//When
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < days; i++) {
            app.updateQuality();
		}
        
        //Then
        assertEquals(expectedQuality, app.items[0].quality);
    }
	
	@Test
    void qualityOfItemShouldNeverBeThanFifty() {
    	// Given
    	int days = 10;
    	int expectedQuality = 50;
    	Item[] items = new Item[] {new Item("Aged Brie", 5, 48)};
    	
    	//When
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < days; i++) {
            app.updateQuality();
		}
        
        //Then
        assertEquals(expectedQuality, app.items[0].quality);
    }
	
	@Test
    void bothValuesAreDegradedEachDay() {
    	// Given
    	int days = 7;
    	int expectedQuality = 13;
    	int expectedSellIn = 3;
    	Item[] items = new Item[] {new Item("Elixir of the Mongoose", 10, 20)};
    	
    	//When
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < days; i++) {
            app.updateQuality();
		}
        
        //Then
        assertEquals(expectedQuality, app.items[0].quality);
        assertEquals(expectedSellIn, app.items[0].sellIn);
    }
	
	@Test
    void normalItemsAreDegradedTwice() {
    	// Given
    	int days = 4;
    	int expectedQuality = 14;
    	Item[] items = new Item[] {new Item("Elixir of the Mongoose", 1, 20)};
    	
    	//When
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < days; i++) {
            app.updateQuality();
		}
        
        //Then
        assertEquals(expectedQuality, app.items[0].quality);
    }
	
	@Test
    void conjuredItemsAreDegradedTwice() {
    	// Given
    	int days = 4;
    	int expectedQuality = 12;
    	Item[] items = new Item[] {new Item("Conjured Mana Cake", 10, 20)};
    	
    	//When
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < days; i++) {
            app.updateQuality();
		}
        
        //Then
        assertEquals(expectedQuality, app.items[0].quality);
    }
	
    @Test
    void brieShouldIncreaseItsQualityAsItGetsOld() {
    	// Given
    	int days = 10;
    	int expectedQuality = 20;
    	Item[] items = new Item[] {new Item("Aged Brie", 5, 10)};
    	
    	//When
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < days; i++) {
            app.updateQuality();
		}
        
        //Then
        assertEquals(expectedQuality, app.items[0].quality);
    }
    
    @Test
    void sulfurasShouldNeverDegradeQuality() {
    	// Given
    	int days = 100;
    	int expectedQuality = 80;
    	Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", 5, 80)};
    	
    	//When
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < days; i++) {
            app.updateQuality();
		}
        
        //Then
        assertEquals(expectedQuality, app.items[0].quality);
    }
    
    @Test
    void backstageDropsToZeroAfterConcert() {
    	// Given
    	int days = 7;
    	int expectedQuality = 0;
    	Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 5, 50)};
    	
    	//When
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < days; i++) {
            app.updateQuality();
		}
        
        //Then
        assertEquals(expectedQuality, app.items[0].quality);
    }
    
    @Test
    void backstageIncreasesTwoTimesInLessThanTenDays() {
    	// Given
    	int days = 3;
    	int expectedQuality = 16;
    	Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10)};
    	
    	//When
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < days; i++) {
            app.updateQuality();
		}
        
        //Then
        assertEquals(expectedQuality, app.items[0].quality);
    }
    
    @Test
    void backstageIncreasesThreeTimesInLessThanFiveDays() {
    	// Given
    	int days = 3;
    	int expectedQuality = 19;
    	Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10)};
    	
    	//When
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < days; i++) {
            app.updateQuality();
		}
        
        //Then
        assertEquals(expectedQuality, app.items[0].quality);
    }
}
