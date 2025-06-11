package task2;

import java.util.Scanner;

public class AIChatbot {

	public static void main(String[] args) {
		
	
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Hello! I'm a simple chatbot. How can I help you today?");
		        System.out.println("Type 'bye' or 'exit' to end our conversation.");

		        while (true) {
		            System.out.print("You: ");
		            String userInput = scanner.nextLine().toLowerCase(); // Read user input and convert to lowercase

		            if (userInput.contains("bye") || userInput.contains("exit")) {
		                System.out.println("Chatbot: Goodbye! Have a great day!");
		                break; // Exit the loop
		            } else if (userInput.contains("hello") || userInput.contains("hi")) {
		                System.out.println("Chatbot: Hi there! How are you doing?");
		            } else if (userInput.contains("how are you")) {
		                System.out.println("Chatbot: I'm just a program, so I don't have feelings, but I'm ready to assist you!");
		            } else if (userInput.contains("name")) {
		                System.out.println("Chatbot: I don't have a name. You can call me Chatbot.");
		            } else if (userInput.contains("weather")) {
		                System.out.println("Chatbot: I can't check the current weather, but you can search online for it!");
		            } else if (userInput.contains("help")) {
		                System.out.println("Chatbot: I can answer basic questions. Try asking about my name or how I am.");
		            } else if (userInput.contains("java")) {
		                System.out.println("Chatbot: Java is a popular programming language, widely used for enterprise-level applications.");
		            } else if (userInput.contains("thanks") || userInput.contains("thank you")) {
		                System.out.println("Chatbot: You're welcome! Is there anything else I can help with?");
		            }
		            else {
		                System.out.println("Chatbot: I'm sorry, I don't understand that. Can you rephrase?");
		            }
		        }
		        scanner.close();	
	}
}
