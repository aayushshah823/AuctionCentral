import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Benjamin Yuen, Raisa Meneses, Aayush R Shah, 
 * 		   Allen Whitemarsh, Jake Lin Yang
 * @version 5/1/2018
 */
public class Bidder {
	
	public static final int MIN_BIDS_PER_ITEM = 0;
	public static final int MAX_BIDS_PER_ITEM = 4;
	
	public static final int MIN_AMOUNT_BID_PER_ITEM = 500;

	//Private fields
	private ArrayList<Auction> myBids;
	private int myTotalBids;
	private Map<Auction, Item> myAuctions;	
	private static int myBid;
	
	public Bidder() {
		myBids = new ArrayList<Auction>();
		myTotalBids = 0;
		myAuctions = new HashMap<Auction, Item>();
		myBid = 0;
	}
	
//	Bid(double): void
//	getAuctionsWithBid(): List<Auction>
//	getMyItemsWithBidsSingleAuction(Auction): List
//	getMyItemsWithBidsAllAuctions(): List
//	getMyBids(): void
//	getMyItems(): void
//	getAllAuctions(): List
	
	public void makeBid(double bid, Item theItem) {
		
	}
	
	public ArrayList<Auction> getAuctionsWithBid(){
		return null;
	}
	
	public ArrayList<Auction> getMyItemsWithBidsSingleAuction(Auction theAuction){
		return null;
	}
	
	public ArrayList<Auction> getMyItemsWithBidsAllAuctions(){
		return null;
	}
	
	public void getMyBids() {
		
	}	
	
	public void getMyItems() {
		
	}
	
	public int getBidsPerItem(Item theItem) {
		return 0;
	}
	
	public ArrayList<Auction> getAllAuctions() {
		return null;
	}
	
	public static int getBidAmountPerItem(Item theItem) {
		return myBid;
	}

}
