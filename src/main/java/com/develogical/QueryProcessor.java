package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("hi")) {
            return "bye";
        }
        return "";
    }
}
