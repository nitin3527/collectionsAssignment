public class Q2 {
    public int findUnique(String str){
        String temp = "";
        for (int i = 0; i < str.length(); i++){
            char current = str.charAt(i);
            if (temp.indexOf(current) < 0){
                temp = temp + current;
            } else {
                temp = temp.replace(String.valueOf(current), "");
            }
        }
       return temp.length();
    }
    public static void main(String[] args) {
        String str = "Nitin";
        Q2 q = new Q2();
        System.out.println(q.findUnique(str));
    }
}
