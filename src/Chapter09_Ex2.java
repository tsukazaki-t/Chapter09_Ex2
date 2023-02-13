
public class Chapter09_Ex2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int a = 976;
        int b = 427;
        System.out.println(a + " と " + b + " の最大公約数は、" + gcd(a, b) + "です。");
    }

    // ユークリッドの互除法で最大公約数を計算するメソッド
    static int gcd(int a, int b) {
    	//a÷bのあまりを変数cとする。
        int c = a % b;
        
        if(c != 0) {
        	//あまりが0以外の場合、再計算する（割る数をあまりで割る）
        	return gcd(b,  c);
        }
        	//上記以外の場合、最大公約数（割られる数の最終形を返す）
        else{
        	return a;
        }
        
    }

	

}
