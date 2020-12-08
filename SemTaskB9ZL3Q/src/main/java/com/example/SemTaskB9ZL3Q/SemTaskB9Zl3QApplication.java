package com.example.SemTaskB9ZL3Q;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SemTaskB9Zl3QApplication {

	public static void main(String[] args) {
		SpringApplication.run(SemTaskB9Zl3QApplication.class, args);

	System.out.println("Press 'Enter' to terminate");
    new Scanner(System.in).nextLine();
    System.out.println("Exiting");
    System.exit(1);
	}
}
