package quiz;

public class B06_ForQuiz1 {
	/*
		1. 1000부터 2000사이의 8의 배수를 모두 출력하시오
		2. 100부터 300까지의 총합을 구하시오
		3. 1000부터 2000까지의 10의 배수를 10의 배수를 한 줄에 5개씩 출력하시오
	*/

	public static void main(String[] args) {
		System.out.println("1. 1000~2000 -> 8의 배수");
		System.out.print("  => ");
		// A between B : A와 B를 모두 포함
		// 1,000부터 2,000까지 반복하면서
		for (int i = 1000; i <= 2000; i++) {
			// 8의 배수만 출력
			if (i % 8 == 0) {
				System.out.printf("%d, ", i);
			}
		}
		System.out.println();
		
		System.out.println("2. 100~300 -> 합");
		int sum = 0;
		for (int i = 100; i <= 300; i++) {
			sum += i;
		}
		System.out.printf("  => %d \n", sum);
		
		System.out.println("3. 1000~2000: 10의 배수 한 줄에 5개씩");
		for (int i = 1000, j = 0; i <= 2000; i++) {
			if (i % 10 == 0) {
				System.out.printf("%d, ", i);
				if (++j % 5 == 0) {
					System.out.println();
				}
			}
		} 
	}
}


/*
1. 1000~2000: 8의 배수
  => 1000, 1008, 1016, 1024, 1032, 1040, 1048, 1056, 1064, 1072,
     1080, 1088, 1096, 1104, 1112, 1120, 1128, 1136, 1144, 1152,
     1160, 1168, 1176, 1184, 1192, 1200, 1208, 1216, 1224, 1232,
     1240, 1248, 1256, 1264, 1272, 1280, 1288, 1296, 1304, 1312,
     1320, 1328, 1336, 1344, 1352, 1360, 1368, 1376, 1384, 1392,
     1400, 1408, 1416, 1424, 1432, 1440, 1448, 1456, 1464, 1472,
     1480, 1488, 1496, 1504, 1512, 1520, 1528, 1536, 1544, 1552,
     1560, 1568, 1576, 1584, 1592, 1600, 1608, 1616, 1624, 1632,
     1640, 1648, 1656, 1664, 1672, 1680, 1688, 1696, 1704, 1712,
     1720, 1728, 1736, 1744, 1752, 1760, 1768, 1776, 1784, 1792,
     1800, 1808, 1816, 1824, 1832, 1840, 1848, 1856, 1864, 1872,
     1880, 1888, 1896, 1904, 1912, 1920, 1928, 1936, 1944, 1952,
     1960, 1968, 1976, 1984, 1992, 2000, 
2. 100~300 -> 합
  => 40200 
3. 1000~2000: 10의 배수 한 줄에 5개씩
1000, 1010, 1020, 1030, 1040, 
1050, 1060, 1070, 1080, 1090, 
1100, 1110, 1120, 1130, 1140, 
1150, 1160, 1170, 1180, 1190, 
1200, 1210, 1220, 1230, 1240, 
1250, 1260, 1270, 1280, 1290, 
1300, 1310, 1320, 1330, 1340, 
1350, 1360, 1370, 1380, 1390, 
1400, 1410, 1420, 1430, 1440, 
1450, 1460, 1470, 1480, 1490, 
1500, 1510, 1520, 1530, 1540, 
1550, 1560, 1570, 1580, 1590, 
1600, 1610, 1620, 1630, 1640, 
1650, 1660, 1670, 1680, 1690, 
1700, 1710, 1720, 1730, 1740, 
1750, 1760, 1770, 1780, 1790, 
1800, 1810, 1820, 1830, 1840, 
1850, 1860, 1870, 1880, 1890, 
1900, 1910, 1920, 1930, 1940, 
1950, 1960, 1970, 1980, 1990, 
2000, 
*/