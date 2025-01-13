package org.saketh.practice;

public class MethodOverLoadingCalculator {
	int sum(int a, int b)
	{
		return a+b;
	}
	float sum(float a, float b)
	{
		return a+b;
	}
	int sum(int a, int b, int c)
	{
		return a+b+c;
	}
}
