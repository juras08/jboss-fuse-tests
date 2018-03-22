package com.jboss.fuse.test.practice;

import org.jboss.fuse.qa.fafram8.resource.Fafram;

import org.junit.ClassRule;
import org.junit.Rule;

public abstract class Practice {
	@ClassRule
	public static Fafram fafram = new Fafram();
}