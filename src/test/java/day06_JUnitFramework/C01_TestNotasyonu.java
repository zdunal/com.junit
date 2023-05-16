package day06_JUnitFramework;

import org.junit.Test;

public class C01_TestNotasyonu {

    /*
    Bu class icerisinde 3 test calistiralim
    1. google ana sayfaya gidip, url'in google icerdigini test edin
    2. wisequarter anasayfaya gidip url'in wisequarter icerdigini test edin
    3. amazon ana sayfaya gidip, amazin logosunun gorundugunu test edin
     */

    /*
        JUnit'in bize sagladigi ilk ve belki de en onemli ozellik
        test method'larinin bagimsiz olarak calistirilanilmesini saglayan
        @Test notasyonudur

        JUnit ile class level'dan birden fazla test method'u calistirirsak
        hangi siralama ile calisacagini ongoremeyiz ve yonetemeyiz
     */

    @Test
    public void googleTest(){
        //     1. google ana sayfaya gidip, url'in google icerdigini test edin
        System.out.println("google test");
    }

    @Test
    public void wiseTest(){
        //     2. wisequarter anasayfaya gidip url'in wisequarter icerdigini test edin
        System.out.println("wise test");
    }

    @Test
    public void amazonTest(){
        //     3. amazon ana sayfaya gidip, amazin logosunun gorundugunu test edin
        System.out.println("amazon test");
    }



}
