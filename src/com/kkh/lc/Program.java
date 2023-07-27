package com.kkh.lc;

import com.kkh.collector.CSVMetadataCollector;
import com.kkh.collector.MetadataCollector;
import com.kkh.collector.PDFMetadataCollector;
import com.kkh.export.CSVExport;
import com.kkh.export.ExportMetadata;
import com.kkh.export.PDFExport;
import com.kkh.fetch.FetchMetadata;
import com.kkh.fetch.JSONFetch;
import com.kkh.fetch.XMLFetch;

public class Program {

   //주석을 넣어보겠습니다.
   public static void setMetadataCollector(MetadataCollector mdcollector,
         FetchMetadata fetchMetadata, 
         ExportMetadata exportMetadata) {
      mdcollector.setMetadataCollector(fetchMetadata, exportMetadata);
   }
   
   public static void collectMetadata(MetadataCollector mdcollector) {
      mdcollector.collectMetadata();
   }

   public static void print(MetadataCollector mdcollector) {
      mdcollector.print();
   }

   public static void main(String[] args) {
      FetchMetadata fetchMetadata1 = JSONFetch.getInstance();
      ExportMetadata exportMetadata1 = PDFExport.getInstance();
      
      MetadataCollector mdcollector1 = new PDFMetadataCollector();
      setMetadataCollector(mdcollector1, fetchMetadata1, exportMetadata1);
      collectMetadata(mdcollector1);
      print(mdcollector1);
      
      FetchMetadata fetchMetadata2 = XMLFetch.getInstance();
      ExportMetadata exportMetadata2 = CSVExport.getInstance();
      
      MetadataCollector mdcollector2 = new CSVMetadataCollector();

      setMetadataCollector(mdcollector2, fetchMetadata2, exportMetadata2);
      collectMetadata(mdcollector2);
      print(mdcollector2);
   }
}
