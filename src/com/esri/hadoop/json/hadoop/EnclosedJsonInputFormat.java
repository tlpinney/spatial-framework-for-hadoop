package com.esri.hadoop.json.hadoop;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.*;

/**
 * 
 * FileInputFormat for reading features from a feature exported as JSON in Esri standard format.
 */
public class EnclosedJsonInputFormat extends FileInputFormat<LongWritable, Text> {

	@Override
	public org.apache.hadoop.mapred.RecordReader<LongWritable, Text> getRecordReader(
			org.apache.hadoop.mapred.InputSplit arg0, JobConf arg1,
			Reporter arg2) throws IOException {
		return new EnclosedJsonRecordReader(arg0, arg1);
	}
}
