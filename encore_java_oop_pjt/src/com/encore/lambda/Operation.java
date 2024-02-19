package com.encore.lambda;

import java.util.function.DoubleBinaryOperator;

public enum Operation {
/*
	PLUS("+"){
		public double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS("-"){
		public double apply(double x, double y) {
			return x - y;
		}
	}; // 상수 먼저 정의*/
	
	PLUS("+", (double x, double y) -> x + y),
	MINUS("-", (double x, double y) -> x - y),
	DIVIDE("/", (double x, double y) -> x / y);
	
	public final String symbol;
	public final DoubleBinaryOperator op;
	
	Operation(String symbol, DoubleBinaryOperator op) {
		this.symbol = symbol;
		this.op = op;
	}
	
	public String toString() {
		return symbol;
	}
	
	public double apply(double x, double y) {
		return op.applyAsDouble(x, y);
	};
}
