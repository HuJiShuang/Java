package definecom;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 新闻条目的实体类,通过实现Comparable接口，重写CompareTo方法
 */
public class NewsItem implements Comparable<NewsItem>{
    private String title;//标题
    private int hits;//点击量
    private Date pubTime;//发行时间

    @Override
    public int compareTo(NewsItem o) {
        int result = 0;
        //时间的比较已经由Date类型封装好了
        result = -this.pubTime.compareTo(o.pubTime);//加上一个负号以后变成降序
        if(result == 0){
            result = this.hits - o.hits;//点击量升序
            if(result == 0){
                result = -this.title.compareTo(o.title);//标题排序
            }
        }
        return  result;
    }
    /**
     * 先按照时间降序+点击量升序+标题降序
     * @param o
     * @return
     */
    public NewsItem() {
    }

    public NewsItem(String title, int hits, Date pubTime) {
        this.title = title;
        this.hits = hits;
        this.pubTime = pubTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public Date getPubTime() {
        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("标题为:"+this.title);
       sb.append("\n");
       sb.append("时间为:"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(this.pubTime));
       sb.append("点击量为:"+this.hits);
       return sb.toString();
    }
}
