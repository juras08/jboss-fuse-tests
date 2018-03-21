package com.jboss.fuse.test.practice;

import org.jboss.fuse.qa.fafram8.resource.Fafram;

import org.junit.Rule;

public abstract class Practice {
	@Rule
	public Fafram fafram = new Fafram();
}