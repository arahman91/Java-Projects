package Math;

public class ShowConversion {
	public static void main(String[] args) {
		System.out.println(BaseConvert.BinaryConvert(22));
		System.out.println(BaseConvert.OctalConvert(22));
		System.out.println(BaseConvert.BinaryToDecimal(1111));
		System.out.println(BaseConvert.OctalToDecimal(777));
		System.out.println(BaseConvert.BinaryFractionConvert( 85.32, 4));
		System.out.println(BaseConvert.OctalFractionConvert(7.8435342542, 0));
	}
}
