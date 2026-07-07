package Stacks_Queues;

public class DynamicQueue extends CustomQueue{
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }
    @Override
    public void insert(int item) throws Exception {
        if(this.isFull()){
            // Double the size of the array
            int[] temp  = new int[data.length*2];
            // copy all the item of the data array into temp
            for (int i  =0 ; i < data.length ; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        super.insert(item);
    }
}
