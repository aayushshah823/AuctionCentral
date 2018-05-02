import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Benjamin Yuen, Raisa Meneses, Aayush R Shah, 
 * 		   Allen Whitemarsh, Jake Lin Yang
 * @version 5/1/2018
 */
public class NonProfit {
	private String myOrg;
	private String myName;
	private List<Auction> myAuctions;
	private Date myLastAuctionDate;
	private int myCurrentAuction;
	
	public NonProfit(String theOrg, String theName) {
		myOrg = theOrg;
		myName = theName;
		myAuctions = new ArrayList<Auction>();
		myLastAuctionDate = null;
		myCurrentAuction = -1;
	}
	
	public boolean submitAuctionRequest() {
		if (myLastAuctionDate == null || myLastAuctionDate.getYear() - (new Date().getYear()) >= 1) {
			myLastAuctionDate = new Date();
			myCurrentAuction++;
			return true;
		}
		return false;
	}
	
	public void addItem(Item theItem) {
		if (myCurrentAuction < 0) {
			throw new NullPointerException();
		}
		myAuctions.get(myCurrentAuction).addItem(theItem);
	}
	
	//only works for current auction
	public List<Item> getItemsInAuction() {
		if (myCurrentAuction < 0) {
			throw new NullPointerException();
		}
		return myAuctions.get(myCurrentAuction).getItems();
	}
	
	public String getOrg() {
		return myOrg;
	}
	
	public String getName() {
		return myName;
	}
	
	public Date getLastAuctionDate() {
		return myLastAuctionDate;
	}
	
	public List<Auction> getAuctions() {
		return myAuctions;
	}
}
