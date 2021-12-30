package seed.leetcode.demo.A0401to0500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A401_BinaryWatch {

	private Map<Integer, Integer> LEDNums = new HashMap<Integer, Integer>();

	public List<String> readBinaryWatch(int turnedOn) {

		constructLEDNums();

		List<String> result = new ArrayList<String>();

		for (int hour = 0; hour < 12; hour++) {
			for (int minute = 0; minute < 60; minute++) {
				if (getLEDs(hour, minute) == turnedOn)
					result.add(hour + ":" + String.format("%02d", minute));
			}
		}

		return result;
	}

	private void constructLEDNums() {
		for (int i = 0; i < 60; i++)
			LEDNums.put(i, getLEDs(i));
	}

	private int getLEDs(int hour, int minute) {
		return LEDNums.get(hour) + LEDNums.get(minute);
	}

	private int getLEDs(int num) {
		if (num == 1)
			return 1;
		if (num == 0)
			return 0;

		if (LEDNums.containsKey(num))
			return LEDNums.get(num);
		else
			return num % 2 + getLEDs(num / 2);
	}

}
