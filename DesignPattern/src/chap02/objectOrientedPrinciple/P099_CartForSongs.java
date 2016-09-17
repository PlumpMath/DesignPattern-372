package chap02.objectOrientedPrinciple;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * �Ϲ�ȭ���踦 ���� ĸ��ȭ(��������), �������� �������ε� (��������4 p.99)
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P099_CartForSongs {
	ArrayList<P099_Songs> cart = new ArrayList<P099_Songs>();
	
	public double calculateTotalPrice() {
		double total = 0.0;
		Iterator<P099_Songs> itor = cart.iterator();
		
		while(itor.hasNext()) {
			P099_Songs song = itor.next();
			total += song.getPrice();
		}
		
		return total;
	}
	
	public void add(P099_Songs song) {
		cart.add(song);
	}
}
