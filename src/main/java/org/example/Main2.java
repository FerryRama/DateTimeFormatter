package org.example;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Main2 {
    public static void main(String args[]) {
        // Membuat tanggal yang akan diperiksa
        Instant dateToCheck = Instant.parse("2023-02-11T14:20:02.197553000Z");

        // Membuat tanggal sekarang
        Instant now = Instant.now();
        Long jumlah = Duration.between(dateToCheck, now).toDays();
        //System.out.println("Jumlah Hari : "+jumlah);
        // Menghitung selisih tanggal sekarang dan tanggal yang akan diperiksa
        long difference = ChronoUnit.DAYS.between(now, dateToCheck);

        // Mengecek apakah tanggal yang akan diperiksa termasuk dalam 14 hari ke belakang
        if (difference <= 0 && difference >= -14) {
            System.out.println("Bisa Transaki | Total Hari : "+jumlah);
        } else {
            System.out.println("Tidak Bisa Transaksi | Lewat Hari : "+jumlah);
        }
    }
}
