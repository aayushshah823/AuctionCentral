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

	private Bidder aBidder;
	private Item anItem;
	private double lessThanMaxBids;
	private double moreThanMaxBids;
	
	@Before
	public void setUp() throws Exception {
		aBidder = new Bidder();
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


}
