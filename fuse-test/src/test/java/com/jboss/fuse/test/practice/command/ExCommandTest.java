package com.jboss.fuse.test.practice.command;

import static org.junit.Assert.assertEquals;

import static org.assertj.core.api.Assertions.assertThat;

import org.jboss.fuse.qa.fafram8.resource.Fafram;

import org.junit.Rule;
import org.junit.Test;

public class ExCommandTest {
	@Rule
	public Fafram fafram = new Fafram();

	@Test
	public void exCmdTest() {
		assertEquals("1", fafram.executeCommand("echo 1"));
		assertThat(fafram.executeCommand("echo 1")).isEqualTo("1");
	}
}
