package Stacks_Queues;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public void push(int item) {
        if(this.isFull()){
            // Double the size of the array
            int[] temp  = new int[data.length*2];
            // copy all the item of the data array into temp
            for (int i  =0 ; i < data.length ; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        super.push(item);
    }
}
