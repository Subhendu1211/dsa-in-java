import java.util.Arrays;

public class longestcommenprefix {
    public static String prefixs(String[] s){
        stringbuilder result=new stringbuilder();
        char  [] first=s[0].toCharArray();
        char []last=s[s.length-1].toCharArray();
        Arrays.sort(s);
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            else{
                result.append(first[i]);
            }
        }
        return result.toString(); 
    }  
    public static void main(String[] args) {
        String[] s={"ass","ssa","asss[]"};
        s.toString();
        prefixs(s);
    }
}
