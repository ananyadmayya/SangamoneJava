package com.sangamone.java;

public class StringExample {
    public static void main(String[] args) {
        // StringBuffer is synchronized and thread-safe
        StringBuffer stringBuffer = new StringBuffer();

        // Appending strings to StringBuffer
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World!");

        // Converting StringBuffer to String
        String result = stringBuffer.toString();
        System.out.println(result); // Output: Hello World!
        
        
     // StringBuilder is not synchronized and faster but not thread-safe
        StringBuilder stringBuilder = new StringBuilder();

        // Appending strings to StringBuilder
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("World!");

        // Converting StringBuilder to String
        String result2 = stringBuilder.toString();
        System.out.println(result2); // Output: Hello World!

    }
    
    
}

