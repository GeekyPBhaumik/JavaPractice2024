public class CustomizedDynamicArray {
    public static void main(String[] args) {
        DynamicArray arrayList = new DynamicArray();
        for(int i=0;i<=40;i++){
            arrayList.add(i);
        }
        arrayList.remove(2);
    }
}
class DynamicArray{
    private int size;
    private int capacity;
    private int arr[];

    DynamicArray(){
        arr = new int[10];
        size=0;
        capacity=10;
    }
    public void add(int e){
        if(size<capacity){
            arr[size]=e;
            size++;
        }else if(size==capacity){
            int newArr[]=new int[2*capacity];
            this.arr=newArr;
            for(int i=0;i<capacity;i++){
                newArr[i]=arr[i];
            }
            capacity=2*size;
            size++;
        }
        System.out.println("Size is:"+size+" and capacity is:"+capacity);
    }
    public void remove(int index){
        if(index<=this.arr.length){
            this.arr[index]=0;
            size--;
        }
        System.out.println("Size is:"+size+" and capacity is:"+capacity);
    }
}