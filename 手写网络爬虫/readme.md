��д��������;
1.URL url = new URL(strUrl);//��ȡ�������е������Ϣ
//�˴�ָ�������ʽʹ��GBK����ȡҳ������
2.BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), Charset.forName(charset)));
3.��ȡ�ı������ӵı��ʽregex = "href=\"([\\w.:/\\s]+?)\""