package jp.ac.uryukyu.ie.e225724;

public class Check0dd{
    public static void main(String[] args) {
        int[] data = {1, 2, 3};
        /*
        int i;
        for(i=0; i<data.length; i++){
            if( data　[i] % 2 == 0 ){
                System.out.println(data[i]);
            }else{
                System.out.println("奇数");
            }
}
*/
for(int i : data){
    if ( i % 2 == 0){
        System.out.println(i);
    }else{
        System.out.println("奇数");
            }    
        }
    }
}
