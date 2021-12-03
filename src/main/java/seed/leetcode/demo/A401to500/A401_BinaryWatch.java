package seed.leetcode.demo.A401to500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A401_BinaryWatch {

	private Map<Integer, List<String>> lightTimeMap = new HashMap<Integer, List<String>>();

	public A401_BinaryWatch() {
		for (int i = 0; i <= 10; i++)
			lightTimeMap.put(i, new ArrayList<String>());

		constructLightTimeMap();
	}

	private void constructLightTimeMap() {
		for (int hour = 0; hour < 12; hour++) {
			for (int minute = 0; minute < 60; minute++) {
				getLights(hour, minute);
			}
		}
	}

	private void getLights(int hour, int minute) {
		lightTimeMap.get(getLights(hour) + getLights(minute)).add(hour + ":" + String.format("%02d", minute));
	}

	private int getLights(int num) {
		if (num == 1)
			return 1;
		if (num == 0)
			return 0;

		return num % 2 + getLights(num / 2);
	}

	public List<String> readBinaryWatch(int turnedOn) {
		return lightTimeMap.get(turnedOn);
	}
}
