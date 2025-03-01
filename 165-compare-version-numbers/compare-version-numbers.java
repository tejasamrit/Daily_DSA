class Solution {
    public int compareVersion(String version1, String version2) {
        String arr1[]=version1.split("\\.");
        String arr2[]=version2.split("\\.");
        int p1=0,p2=0;
        int n1=arr1.length;
        int n2=arr2.length;
        while(p1<n1 || p2<n2){
            int num1=(p1<n1)?Integer.parseInt(arr1[p1]):0;
            int num2=(p2<n2)?Integer.parseInt(arr2[p2]):0;
            if(num1!=num2){
                return (num1>num2)?1:-1;
            }
            p1++;
            p2++;
        }
        return 0;
    }
}