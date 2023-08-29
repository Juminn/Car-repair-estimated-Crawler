package com.carweb.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Test {
    public static void test() throws IOException {

        String crawlingURL = "https://www.mobis-as.com/simple_search_partLoad.do?pageIndex=1&hkgb=H&vtyp=P&catSeq=890139&srchType=normal&inText=%EC%97%94%EC%A7%84";

        Document doc = Jsoup.connect(crawlingURL).get();

        Elements equiptTable = doc.getElementsByClass("table-d p-tc m-tl");
        Elements equipts = equiptTable.get(0).getElementsByTag("li");
        System.out.println(equipts.get(0));
        for(Element equipt: equipts) {
            Elements equiptInfo = equipt.getElementsByClass("t-td");
            String equiptName = equiptInfo.get(1).text();
            String equiptPrice = equiptInfo.get(3).text();

            System.out.println("이름: " + equiptName + " 가격: " + equiptPrice);
        }


    }
}
