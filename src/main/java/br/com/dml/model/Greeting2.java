package br.com.dml.model;

public record Greeting2() {

    private static long id;
    private static String content;

    public Greeting2 {
    }

    public long getId() {
        return id;
    }
    public String getContent() {
        return content;
    }


}
