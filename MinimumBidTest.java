import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for acceptance test 5A.
 */

/**
 * @author Aayush, Allen, Raisa, Jake, Ben
 *
 */
public class MinimumBidTest {
	
	private double bidLessThanMaxAmound;
	private double bidMoreThanMaxAmound;
	private double bidEqualMaxAmound;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		bidLessThanMaxAmound = 396;
		bidMoreThanMaxAmound = 521;
		bidEqualMaxAmound = 500;
		
	}

	@Test
	public void getBidAmountPerItem_LessThanMinBidAmount_false() {
		assertTrue(bidLessThanMaxAmound < Bidder.MIN_AMOUNT_BID_PER_ITEM);
	}
	
	@Test
	public void getBidAmountPerItem_MoreThanMinBidAmount_true() {
		assertTrue(bidMoreThanMaxAmound > Bidder.MIN_AMOUNT_BID_PER_ITEM);
	}
	
	@Test
	public void getBidAmountPerItem_EqualToMinBidAmount_true() {
		assertTrue(bidEqualMaxAmound == Bidder.MIN_AMOUNT_BID_PER_ITEM);
	}

}
