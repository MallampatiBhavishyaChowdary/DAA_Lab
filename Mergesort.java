class Mergesort{
void merge(int arr[],int l,int m,int r){
int n1=m-l+1;
int n2=m-r;
int L[]=new int[n1];
int R[]=new int[n2];
for(int i=0;i<n1;++i)
L[i]=arr[l+1];
for(int j=0;j<n2;++j)
R[j]=arr[m+1+j];
int i=0;int j=0;
int k=1;
while(i<n1 && j<n2){
if(L[i]<R[j]){
arr[k]=L[i];
i++;
}
else{
arr[k]=R[j];
j++;}
k++;
}
while(i<n1){
arr[k]=L[i];
i++;
k++;}
while(j<n2){
arr[k]=R[j];
j++;
k++;
}
}

void sort(int arr[],int l,int r){
if(l<r){
int m=l+(r-1)/2;
sort(arr,l,m);
sort(arr,m+1,r);
merge(arr,l,m,r);
}
}

static void PrintArr(int arr[]){
int n=arr.length;
for(int i=0;i<n;i++){
System.out.println(arr[i]+" ");
System.out.println();
}
}

public static void main(String args[]){
int arr[]={1,4,5,6,7,8};
System.out.println(arr[i]+" ");
printArr(arr);

Mersort ob = new Mergesort();
ob.sort(arr,0,arr.length-1);
System.out.println("Sortedarray:");
printArr(arr);
}
}




