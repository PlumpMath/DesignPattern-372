package chap05.StrategyPattern;

/**
 * Strategy Pattern (�������� 6��, p.187)
 *
 * @author assu
 * @date 2017. 1. 1.
 */
public class P187_6_Client {
	public static void main(String[] args) {
		P187_6_Item item1 = new P187_6_Item("��Ǫ", 2000);
		P187_6_Item item2 = new P187_6_Item("����", 3000);
		P187_6_Sale sale = new P187_6_Sale();
		String expected = "��Ǫ2000����3000";
		
		sale.add(item1);
		sale.add(item2);
		
		P187_6_FakePrinter printer = new P187_6_FakePrinter();
		sale.setReceiptPrinter(printer);
		sale.printerReceipt();
	
		if (expected.equals(printer.getReceiptContents())) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}
}
