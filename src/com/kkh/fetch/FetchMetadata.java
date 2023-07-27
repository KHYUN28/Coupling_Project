package com.kkh.fetch;

import java.util.List;

public interface FetchMetadata {	
	String getFetchType();
	List<Object> fetchMetadata();
}