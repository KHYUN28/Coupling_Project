package com.kkh.collector;

import com.kkh.export.ExportMetadata;
import com.kkh.fetch.FetchMetadata;

public interface MetadataCollector {
	public void setMetadataCollector(FetchMetadata fetchMetadata, ExportMetadata exportMetadata);
	public void collectMetadata();
	public void print();
}
