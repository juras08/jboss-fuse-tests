package com.jboss.fuse.test.practice.command;

import static org.junit.Assert.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.jboss.fuse.test.practice.Practice;

public class ExFaframTest extends Practice {
	@Test
	public void exCmdTest() {
		assertEquals("1", fafram.executeCommand("echo 1"));
		assertThat(fafram.executeCommand("echo 1")).isEqualTo("1");
	}
}