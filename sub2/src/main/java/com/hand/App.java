package com.hand;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> alpha = Arrays.asList("a", "b", "c", "d");
        System.out.println(alpha);
       List<String> cllectStrs =  alpha.stream().map(item->item.toUpperCase())
               .collect(Collectors.toList());
        System.out.println(cllectStrs);
//        String str1 = new
    }
}
