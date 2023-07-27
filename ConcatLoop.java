package open.arc.org;

import java.util.ArrayList;
import java.util.List;

public class ConcatLoop {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Amitabh");
		list.add("Sunil");
		list.add("Kundan");
		list.add("Amit");
		String concatWords = joinWordsUsingConcat(list);
		System.out.println(concatWords);
		String buildWords = joinWordsUsingBuilder(list);
		System.out.println(buildWords);
		
	}

	/*
	 * This copies all characters in each iteration thus takes more memory and time.
	 * */
	public static String joinWordsUsingConcat(List<String> words) {
		String message = "";
		for (String word : words) {
			// this statement creates a new message string containing a copy of all
			// characters in the original message string with extra characters appended to
			// it. This generates a lot of temporary strings, and does a lot of copying.
			message = message + "_" + word;
		}
		return message;
	}

	/**
	 * This is much better than concatenation as it only copies the characters only once. 
	 * */
	public static String joinWordsUsingBuilder(List<String> words) {
		StringBuilder message = new StringBuilder();
		for (String word : words) {
			message.append("_").append(word);
		}
		return message.toString();
	}
}
