package com.hua.test.flake;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import com.hua.sequence.Sequence;

public class RepeatedTest {

	/**
	 * 重复性测试
	 */
	@Test
	public void testRepeated() {
		Set<Long> set = new HashSet<Long>();
		int maxTimes = 10000 * 10;
		Sequence sequence = new Sequence(0);
		for (int i = 0; i < maxTimes; i++) {
			set.add(sequence.nextId());
		}
		Assert.assertEquals(maxTimes, set.size());
	}

}
