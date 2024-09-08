package org.saketh.practice;

public class StringCompressionTest {
	public static void main(String[] args)
	{
		String str = "aaaabbbccd";
		StringBuilder sb = new StringBuilder(str);
		StringCompression.string_compression(sb);
	}
}
