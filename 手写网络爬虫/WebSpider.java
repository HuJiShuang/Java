package javatest;

import sun.nio.cs.ext.GBK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebSpider {

    private static String getUrlConten(String strUrl,String charset) throws IOException{
        StringBuilder sb = new StringBuilder();
        URL url = new URL(strUrl);
        //此处指定解码格式使用GBK
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), Charset.forName(charset)));
        String string = "";
        try {
            while((string = br.readLine()) != null)
                sb.append(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    private  static List<String> getHref(String content, String regex){
        List<String> list = new ArrayList<>();
        //取到超链接整个的内容
        //Pattern pattern = Pattern.compile("<a[\\s\\S]+?</a>");
        //只获取超链接
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find())
            list.add(matcher.group(1));
        return list;
    }
    public static void main(String[] args) throws IOException {
        String content = getUrlConten("https://www.163.com/", "GBK");
        List<String> list = getHref(content, "href=\"([\\w.:/\\s]+?)\"");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
