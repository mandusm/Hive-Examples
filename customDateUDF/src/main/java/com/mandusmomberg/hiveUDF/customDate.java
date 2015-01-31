package com.mandusmomberg.hiveUDF;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;        


@Description(
		name = "customDate",
		value = "_FUNC_(str) - Converts a date to new format",
		extended = "Example:\n" +
		"  > SELECT customDate(MM/dd/yyy) FROM authors "
)
public class customDate extends UDF {
	  
	public String evaluate(String dt2) throws ParseException{
	SimpleDateFormat incommingDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat convertedDateFormat = new SimpleDateFormat("MMMM");
        Date dt = incommingDateFormat.parse(dt2);
        return convertedDateFormat.format(dt);
	}

}


