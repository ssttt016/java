package com.kbstar.app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class App2 {

	public static void main(String[] args) {

		DAO<Integer, ItemDTO> itemDao = new ItemDAO();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Input command [q,i,d,u,s,sa]");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("종료");
				break;
			} else if (cmd.equals("i")) {
				System.out.println("상품번호를 입력하세요");
				int itemNo = Integer.parseInt(sc.next());
				System.out.println("상품이름을 입력하세요");
				String itemName = sc.next();
				System.out.println("상품 수량을 입력하세요");
				int itemQt = Integer.parseInt(sc.next());
				ItemDTO item = new ItemDTO(itemNo, itemName, itemQt);
				try {
					itemDao.insert(item);
				} catch (Exception e) {
					System.out.println("이미 존재하는 상품번호입니다");
				}
			} else if (cmd.equals("u")) {
				System.out.println("상품번호를 입력하세요");
				int itemNo = Integer.parseInt(sc.next());
				System.out.println("상품이름을 입력하세요");
				String itemName = sc.next();
				System.out.println("상품 수량을 입력하세요");
				int itemQt = Integer.parseInt(sc.next());
				ItemDTO item = new ItemDTO(itemNo, itemName, itemQt);
				try {
					itemDao.update(item);
				} catch (Exception e) {
					System.out.println("존재하지않는 상품번호입니다");
				}
			}  else if (cmd.equals("d")) {
				System.out.println("삭제할 상품번호를 입력하세요");
				int itemNo = Integer.parseInt(sc.next());
				try {
					itemDao.delete(itemNo);
				} catch (Exception e) {
					System.out.println("존재하지않는 상품번호입니다");
				}
			} else if (cmd.equals("s")) {
				System.out.println("조회할 상품번호를 입력하세요");
				int itemNo = Integer.parseInt(sc.next());
				try {
					itemDao.select(itemNo);
				} catch (Exception e) {
					System.out.println("존재하지않는 상품번호입니다");
				}
			} else if (cmd.equals("sa")) {
				List<ItemDTO> list = null;
				try {
					list = itemDao.select();
					for (ItemDTO i : list) {
						System.out.println(i);
					}
				} catch (Exception e) {
					System.out.println("");
				}
			}
		}
	}

}
