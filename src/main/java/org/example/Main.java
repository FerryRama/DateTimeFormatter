package org.example;

import org.json.JSONObject;

import javax.swing.text.Document;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {


        Instant instant1 = Instant.now(); // get The current time in instant object
        Timestamp t = java.sql.Timestamp.from(instant1); // Convert instant to Timestamp
        Instant anotherInstant = t.toInstant();
        System.out.println("Instant Before : " + anotherInstant);
        System.out.println("Timestamp: " + t);
        Instant i = Instant.from(t.toInstant());
        System.out.println("Instant : " +i);
        System.out.println("Sql : 20-01-2023 14.20.02,197553000");
        System.out.println("=======================================");
        System.out.println("");


        String startDateString = "20-01-2023 14.20.02,197553000";
        SimpleDateFormat sdf =  new SimpleDateFormat("dd-MM-yyyy HH.mm.ss");
        SimpleDateFormat sdf2 =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Timestamp time2 = java.sql.Timestamp.valueOf(sdf2.format(sdf.parse(startDateString)));
        System.out.println("SimpleDateFormat Convert To TimeStamp Format : " +time2);
        Instant is = Instant.from(time2.toInstant());
        System.out.println("Convert Format To Timestamp : "+is);
        System.out.println("Instant Format Date Time    : "+Instant.now());
        Long jumlah = Duration.between(is, Instant.now()).toDays();
        System.out.println(jumlah +" Hari");
        if(jumlah < 0){
            System.out.println("Tidak Bisa Transaksi");
        }else if(jumlah <= 14){
            System.out.println(jumlah +" Hari | " +" Bisa Transaksi");
        }else {
            System.out.println("Tidak Bisa Transaksi");
        }

    }

}