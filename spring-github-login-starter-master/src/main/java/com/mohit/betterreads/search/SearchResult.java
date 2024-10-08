package com.mohit.betterreads.search;

import java.util.List;

public class SearchResult {
    private int numFound;
    private List<SearchResultBook> docs;

    
    public int getNumFound() {
        return numFound;
    }
    public void setNumFound(int numFound) {
        this.numFound = numFound;
    }
    public List<SearchResultBook> getDocs() {
        return docs;
    }
    public void setDocs(List<SearchResultBook> docs) {
        this.docs = docs;
    }
    @Override
    public String toString() {
        return "SearchResult [numFound=" + numFound + ", docs=" + docs + "]";
    }
    
    
}
