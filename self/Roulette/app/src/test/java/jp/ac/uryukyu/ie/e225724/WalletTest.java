package jp.ac.uryukyu.ie.e225724;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WalletTest {
	Wallet wallet;

	@BeforeEach
	void initialize() {
		wallet = new Wallet(10000);
	}

	@Test
	void testInitialize() {
		assertEquals(10000, wallet.getCache());
	}

	@Test
	void testPayCache() {
		wallet.payCache(100);
		assertEquals(9900, wallet.getCache());
	}

	@Test
	void testIsInsolvency() {
		assertFalse(wallet.isInsolvency());
		wallet.payCache(10001);
		assertTrue(wallet.isInsolvency());
	}
}