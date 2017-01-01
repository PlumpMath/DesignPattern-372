package chap05.StrategyPattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 영수증 출력하기
 * 
 * 테스트할 때 실제 영수증 기기(HD)에 연결해야하는 번거로움 해결하도록..
 * --> Fake프린터 클래스 만들어서 테스트할때는 해당 객체 주입하여 테스트
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
