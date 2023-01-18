public class Scanner {
    public static void main(String[] args){
        //import無しで書いた例
        String input; //読み込んだユーザ入力を格納するStringオブジェクトを用意。
        java.util.Scanner in = new java.util.Scanner(System.in); // 標準入力から読み込むスキャナを用意

        while(true){
        System.out.println("何かごようですか？"); // 入力を促す文を出力しているだけ。
            input = in.nextLine(); // inputにユーザ入力を保存する。
        if (input.equals("クーラー")){
            System.out.println("クーラーをオンにしました。");
        }
        if (input.equals("bye.")){
            System.out.println("ご利用いただきありがとうございました");
            break;
    
        }else{
            System.out.println(input + "とは何ですか？");
        }
        }
        in.close(); // スキャナを閉じる。
    }
}
