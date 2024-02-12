public class ReverseWords {
    public static void main(String[] args) {
        String s = "geeks for geeks baby java";
        String strArr[] = s.split(" ");
        int i=0;
        int j=strArr.length-1;
        while(i<j){
            String temp = strArr[i];
            strArr[i] = strArr[j];
            strArr[j] = temp;
            i++;
            j--;
        }
        for(String words:strArr){
            System.out.print(words+" ");
        }
    }
}
