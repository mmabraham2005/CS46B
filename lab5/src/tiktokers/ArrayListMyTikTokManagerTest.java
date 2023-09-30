package tiktokers;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayListMyTikTokManagerTest {
	
	private MyTikTokManager dir;
	private MyTikTokManager topTen;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() 
	{
	   dir = new ArrayListMyTikTokManager();
	   topTen = new ArrayListMyTikTokManager();
	   topTen.load("src/Top10TikTokers.txt");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void topTenContainsBurak() 
	{
	   assertNotNull(topTen.get("@cznburak", "Followers"));
	}

	
	@Test 
	 public void basicRemove() 
	 {
		setUp();
	    dir.put("@rumpledeater", "Followers", "100");
	    dir.remove("@rumpledeater", "Followers");
	    assertNull(dir.get("@rumpledeater", "Followers"));
	 }
	@Test (expected = NoSuchElementException.class)
	 public void removeNonExistentEntryEmptyManager() {
		
			setUp();
			dir.remove("@rumpledeater", "Followers");
			}
	@Test 
	 public void removeNonExistentEntryNonEmptyManager() {
		assertThrows(NoSuchElementException.class, () -> {
			setUp();
			dir.put("@johncena", "Followers", "100000");
		    dir.remove("@rumpledeater", "Followers");
		 });
		
	}
}

