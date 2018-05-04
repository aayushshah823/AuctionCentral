import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Benjamin Yuen, Raisa Meneses, Aayush R Shah, 
 * 		   Allen Whitemarsh, Jake Lin Yang
 * @version 5/1/2018
 */
public class BidderTest {

	private static final double BID_LESS_THAN_MIN_AMOUNT = 300;
	private static final double BID_MORE_THAN_MIN_AMOUNT = Math.random() * 500 + 501;
	private static final double BID_EQUAL_TO_MIN_AMOUNT = 500;
	
	private Bidder aBidder;
	private Item anItem;
	private double lessThanMaxBids;
	private double moreThanMaxBids;
	private Bidder bidderWithFewBidsOnItems;
	private Bidder bidderWithTooManyBidsOnItems;
	private static double validBid = 50.00;

	
	@Before
	public void setUp() throws Exception {
		
		bid = new Bidder();
		
		aBidder = new Bidder();
		bidderWithFewBidsOnItems = new Bidder();
		bidderWithTooManyBidsOnItems = new Bidder();
		anItem = new Item();
		lessThanMaxBids = 3;
		moreThanMaxBids = 5;
	}
	
	@Test
	public void getBidsPerItem_lessThanMaxBids_true() {
		assertTrue(lessThanMaxBids < Bidder.MAX_BIDS_PER_ITEM);
	}
	
	@Test
	public void getBidsPerItem_moreThanMaxBids_false() {
		assertFalse(moreThanMaxBids < Bidder.MAX_BIDS_PER_ITEM);
	}

	@Test
	public void makeBid_OneLessThanMaxNumberOfItems_true() {
		assertTrue(bidderWithRoomToMakeBids(validBid, anItem));
	}
	
	@Test
	public void makeBid_BidderAtMaxNumberOfItem_false() {
		assertFalse(bidderWithTooManyBidsOnItems.makeBid(validBid, anItem));
	}
	
	/**
	 * Tests the bid amount less than minimum required.
	 */
	@Test
	public void isBidAmount_LessThanMinimum_False() {
		bid.setMyBid(BID_LESS_THAN_MIN_AMOUNT);
		assertFalse(bid.isBidAmount(BID_LESS_THAN_MIN_AMOUNT));
	}

	/**
	 * Tests the bid amount more than minimum required.
	 */
	@Test
	public void isBidAmount_MoreThanMinBidAmount_True() {
		bid.setMyBid(BID_MORE_THAN_MIN_AMOUNT);
		assertTrue(bid.isBidAmount(BID_MORE_THAN_MIN_AMOUNT));
	}

	/**
	 * Tests the bid amount equal t0 minimum required.
	 */
	@Test
	public void isBidAmount_EqualToMinBidAmount_True() {
		bid.setMyBid(BID_EQUAL_TO_MIN_AMOUNT);
		assertTrue(bid.isBidAmount(BID_EQUAL_TO_MIN_AMOUNT));
	}
}
