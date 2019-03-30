
public class MultPersFreq{
	void multPersFreq(long min, long max) {
		DetermineMultPers dmp = new DetermineMultPers();
		long[] freqArray = new long[13];
		Long l = min;
		while (l <= max) {
			long result = dmp.determineMultPers(l);
			for (int i = 0; i < 13; i++) {
				if (result == (i)) {
					freqArray[i]++;
					break;
				}
			}
			l++;
		}
		System.out.println("MultPers \t 0 \t 1 \t 2 \t 3 \t 4 \t 5 \t 6 \t 7 \t 8 \t 9 \t 10 \t 11 \t 12");
		System.out.print("Freq \t ");
		for (int i = 0; i < 13; i++) {
			System.out.print(freqArray[i] + "\t ");
		}
	}
}
