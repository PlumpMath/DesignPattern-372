package chap05.StrategyPattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ������ ����ϱ�
 * 
 * �׽�Ʈ�� �� ���� ������ ���(HD)�� �����ؾ��ϴ� ���ŷο� �ذ��ϵ���..
 * --> Fake������ Ŭ���� ���� �׽�Ʈ�Ҷ��� �ش� ��ü �����Ͽ� �׽�Ʈ
 *
 * @author assu
 * @date 2017. 1. 1.
 */
public class P187_6_Sale {
	private ArrayList<P187_6_Item> items = new ArrayList<P187_6_Item>();
	private P187_6_ReceiptPrinter printer;
	
	public void printerReceipt() {
		Iterator<P187_6_Item> itr = items.iterator();
		StringBuffer buf = new StringBuffer();
		
		while (itr.hasNext()) {
			P187_6_Item item = itr.next();
			buf.append(item.getName());
			buf.append(item.getPrice());
		}
		printer.print(buf.toString());
	}
	
	public void add(P187_6_Item item) {
		items.add(item);
	}
	
	public void setReceiptPrinter(P187_6_ReceiptPrinter printer) {
		this.printer = printer;
	}
}
