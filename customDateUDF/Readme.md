###Custom UDF for converting Date Formats.
This UDF was used to convert Dates from one specific format to another in a Hive column of type string.

Converts date from "MM/dd/yyyy" to "MMMM" 
For Example: 
```
02/27/2014 -> February
```

This uses the Standard Java Date Formatter. 
[Documentation Can Be Found Here](http://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html)

###Usage
```
add jar hdfs://<path-to-compiled-jar>;
create temporary function dateChange as 'com.mandusmomberg.hiveUDF.customDate';
select dateChange(COLUMN_NAME) from TABLE_NAME;
```


