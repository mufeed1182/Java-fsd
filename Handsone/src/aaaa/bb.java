package aaaa;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
abstract class Ab{ public int getN(){return 0;}}
class Bc extends Ab{ public int getN(){return 7;}}
class Cd extends Bc { public int getN(){return 47;}}
class bb{
	 public static void main(String args[]){
	   Date date=new Date(0);
	   SimpleDateFormat sd;
	  sd=new SimplpeDateFormat("E MMM dd yyyy");
	  System.out.print(sd.format(date));}}