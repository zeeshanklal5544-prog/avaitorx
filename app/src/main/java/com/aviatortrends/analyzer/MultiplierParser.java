package com.aviatortrends.analyzer;
import java.util.*; import java.util.regex.*;
public final class MultiplierParser { private static final Pattern P=Pattern.compile("(?i)(?<![\\d.])([1-9]\\d{0,4}(?:[.,]\\d{1,2})?)\\s*[x×](?![\\w])"); public static List<Double> parse(String text){List<Double> out=new ArrayList<>();if(text==null)return out;Matcher m=P.matcher(text);while(m.find())try{double v=Double.parseDouble(m.group(1).replace(',','.'));if(v>=1&&v<=100000)out.add(v);}catch(Exception ignored){}return out;} }
