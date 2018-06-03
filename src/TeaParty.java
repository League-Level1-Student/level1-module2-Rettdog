import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TeaParty {
	public static void main(String[] args) {
		TeaParty party = new TeaParty();
		TeaPartyTest sd = party.new TeaPartyTest();
		sd.test();
	}

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String sir = "";
		if (isKnighted) {
			sir = " Sir ";
		} else if (isWoman) {
			sir = " Ms. ";
		} else {
			sir = " Mr. ";
		}
		return "Hello" + sir + name;
	}

	public class TeaPartyTest {
		/**
		 * Jane Austen is a woman, so say “Hello Ms. Austen”. George Orwell is a man, so
		 * say “Hello Mr. Orwell”. Isaac Newton was knighted, so say "Hello Sir Isaac
		 * Newton".
		 **/

		@Test
		public void test() {
			TeaParty teaParty = new TeaParty();
			String greeting = teaParty.welcome(null, false, false);
			assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
			assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
			assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
		}
	}
}
