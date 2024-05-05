package com.nagarro.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Info {
    private String seed;
    private int results;
    private int page;
    private String version;
	public String getSeed() {
		return seed;
	}
	public int getResults() {
		return results;
	}
	public int getPage() {
		return page;
	}
	public String getVersion() {
		return version;
	}
	public void setSeed(String seed) {
		this.seed = seed;
	}
	public void setResults(int results) {
		this.results = results;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public void setVersion(String version) {
		this.version = version;
	}
    
    
}