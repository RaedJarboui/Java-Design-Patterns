package com.dependency.inversion;

import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	// Writes message to a file, false implementation
	public void writeMessage(Message msg, String fileName) throws IOException {
		/*
		 * Formatter formatter = new JSONFormatter();// creates formatter, first
		 * dependency
		 * 
		 * try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) { //
		 * creates print writer + second dependency
		 * writer.println(formatter.format(msg)); // formats and writes message
		 * writer.flush(); }
		 */

		// ***MessagePrinter is very dependant of Formatter and PrintWriter dependencies
		// : tight coupling
		// ** we should minimize the coupling using abstraction, if not there will be a
		// big problems regarding the change of the current code : more bugs
		// ** we dont need to create instances of Formatter and PrintWriter, we need
		// only to pass it as params or using the intefaces where all implemetations are
		// created for formatter and printwriter

	}

	// true implementations using dependency inversion
	public void writeMessageUsingDI(Message msg, Formatter formatter, PrintWriter writer) throws IOException {
		// try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
		writer.println(formatter.format(msg));
		writer.flush();
	}

}
