手写网络爬虫;
1.URL url = new URL(strUrl);//获取超链接中的相关信息
//此处指定解码格式使用GBK，获取页面内容
2.BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), Charset.forName(charset)));
3.获取文本中链接的表达式regex = "href=\"([\\w.:/\\s]+?)\""