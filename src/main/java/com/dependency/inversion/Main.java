package com.dependency.inversion;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		/*
		 * Message msg = new Message("This is a message again"); MessagePrinter printer
		 * = new MessagePrinter(); printer.writeMessage(msg, "test_msg.txt");
		 */

		// using DI :

		Message msg = new Message("This is a message again");
		MessagePrinter printer = new MessagePrinter();
		printer.writeMessageUsingDI(msg, new JSONFormatter(), new PrintWriter(new FileWriter("test_msg.txt")));
	}

}
