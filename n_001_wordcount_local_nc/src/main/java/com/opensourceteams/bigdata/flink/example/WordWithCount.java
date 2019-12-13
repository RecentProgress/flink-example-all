package com.opensourceteams.bigdata.flink.example;

public class WordWithCount {

    private String word;
    private long count;


    public WordWithCount() {
    }

    public WordWithCount(String word, long count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return word + ":" + count +" ";
    }
}
