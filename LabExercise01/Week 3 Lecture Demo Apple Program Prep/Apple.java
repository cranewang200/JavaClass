/*
 * Author: Stanley Pieda
 * Date: Sept 11, 2020
 * Description: Week 3 Demo, Apple with variety, price, quanitity on hand.
 */

/* 
 * Apple class for apple inventory 
 */
public class Apple {
    private String variety; // name of apple variety
    private int price; // cents
    private int quantity; // count of apples
    
    /* 
     * Default constructor, sets variety to empty string, price to 0, quantity to 0 
     */
    public Apple() {
    	this("",0,0);
    }
    
    /* 
     * Overloaded constructor, with variety, price quantity parameters
     */
    public Apple(String variety, int price, int quantity) {
    	this.variety = variety;
    	this.price = price;
    	this.quantity = quantity;
    }
    
    /* 
     * accessor for variety
     */
    public String getVariety() {
    	return variety;
    }
    
    /* 
     * mutator for variety
     */
    public void setVariety(String variety) {
    	this.variety = variety;
    }
    
    /* 
     * accessor for price
     */
    public int getPrice() {
    	return price;
    }
    
    /* 
     * mutator for price
     */
    public void setPrice(int price) {
    	this.price = price;
    }
    
    /* 
     * accessor for quantity
     */
    public int getQuantity() {
    	return quantity;
    }
    /* 
     * mutator for quantity
     */
    public void setQuantity(int quantity) {
    	this.quantity = quantity;
    }
    
    /* 
     * Calculates total in cents, based on price * quantity.
     */
    public int calculateTotal() {
    	return price * quantity; // * is used for multiplication
    }
}
