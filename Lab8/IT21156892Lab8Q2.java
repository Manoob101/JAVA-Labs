public class IT21156892Lab8Q2 {
    public static void main(String[]args){
        int A[] = {10,20,30,40,50};
        int B[] = {34,67,12,89,12};
        int C[] = new int[5];
        System.out.println("A array contents :");
            for(int k=0;k<A.length;k++){
                System.out.print(A[k]+" ");
            } 
            System.out.println();
            System.out.println("B array contents :");
            for(int l=0;l<B.length;l++){
                System.out.print(B[l]+" ");
            } 
            System.out.println();

            for (int i=0;i<C.length;i++){
            C[i]=A[i]+B[i];    
            }
            

            System.out.println("C array contents(A+B) :");
            for (int j=0;j<C.length;j++){
                System.out.print(C[j]+" ");
            }
    }
}
