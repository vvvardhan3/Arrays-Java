package InterviewPrepQuestions;

// import java.util.Arrays;

public class firstNonrepeating {
    public static void main(String[] args) {
        
        int[] a = {1,2,1,3,4,5,9,8,3,2,1};

        // Arrays.sort(a);

        // System.out.println(Arrays.toString(a));
        
        for(int i=0; i<a.length-1; i++){
            if (a[i]!=a[i+1]) {
                System.out.print(a[i]);
                
            }
        }
    }
    
}
