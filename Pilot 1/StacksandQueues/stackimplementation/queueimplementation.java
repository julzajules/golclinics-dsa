public class queueimplementation {
    //abstraction
    static class golQueue
    {
        private int[] items;
        private int capacity = 0;

        private int front = 0;
        private int rear = 0;
        //constructor
        public golQueue() 
        {
            items = new int[10]; //initialization
        }
        //suppose a user needs to define a new size, rather than use 10
        public golQueue(int size) 
        {
            items = new int[size]; //initialization
        }

        private void Copy(int[] source, int [] destination) 
        {
            for(int i = 0; i < source.length - 1; i ++) {
                destination[i] = source[i];
            }
        }
        //C# - method overload
        private void Copy(int currentIndex, int[] source, int[] destination) 
        {
            int idx = 0;

            //from current index to the end
            for(int i = currentIndex; i < source.length-1; i++) 
            {
                destination[idx] = source[i];
                idx++;
            }

            //from end to start of index
            for(int i = 0; i < currentIndex - 1; i++) 
            {
                destination[idx] = source[i];
                idx++;
            }
        }

        //Enqueue
        //Production queue - thread safety, lace conditions
        //type void - assumption is that it is successful
        public void Enqueue(int item) 
        {
            //if front == rear && capacity > 0
            if(capacity > 0 && rear == front) 
            {
                //copy - merge sort
                int[] sourceTemp = new int[items.length];
                sourceTemp = items;

                items = new int[items.length * 2];

                Copy(front, sourceTemp, items);
                items[rear] = item;
                capacity++;
                rear++;
                return;
            }


            //check is the queue is empty 
            if (front == 0 && rear == 0 && capacity == 0) 
            {
                items[rear] = item;
                capacity++;
                rear++;
                return;
            }
            // Queue is not full - rear != length - 1
            if (rear > 0 && rear <= items.length - 1) 
            {
                items[rear] = item;
                capacity++;
                rear++;
                return;
            }

            //if rear exceeds bound
              //check if it is full - front == 0 && rear == length - 1 (No dequeueing was done)
              //double array because you are not dequeueing, meaning that there is no space
            if (rear > items.length - 1 && front == 0)
            {
                //extend your array
                int[] tempSource = new int[items.length]; //current array
                tempSource = items;

                items = new int[items.length * 2]; //redefine the array/new array
                
                Copy(tempSource, items);
                items[rear] = item;
                rear++;
                capacity++;
                return;
            }
          
            //check if it is full - front !=0 && rear == length - 1(circular array)
            if(front > 0 && rear == items.length) 
            {
                rear = 0;
                items[rear] = item;
                capacity++;
                rear++;
            }

            //increment to a circular array or move all elements by one to the left everytime you dequeue (not optimal)
            //you can use capacity to check if the queue is empty or not
        }

        //Dequeue
        public int Dequeue() 
        {
            //fail first
            if (capacity == 0) 
            {
                System.out.print("Enter something");
                return -1; //contract btwn dev and user
            } else if (front == items.length && capacity > 0) 
            {
                front = 0;
                int frontItem = items[front];
                front++;
                capacity--;
                return frontItem;
                
            } else {
                int frontItem = items[front];
                front++;
                capacity--;
                return frontItem;
            }
        }
        //Peek
        public int Peek() 
        {
            if (capacity == 0) 
            {
                System.out.print("Enter something");
                return -1; //contract btwn dev and user
            } else {
                return items[front];
            }
        }

        //Size
        public int Size()
        {
            int queSize = items.length;
            return queSize;
        }

        //Capacity
        public int Capacity() 
        {
            return capacity;
        }
    }

    public static void main(String [] args) {
        
        golQueue queue = new golQueue(3);
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);

        int size = queue.Size();
        int capacity = queue.Capacity();

        System.out.println("Size before : "+ size);
        System.out.println("Capacity before : " + capacity);

        queue.Enqueue(4);
        size = queue.Size();
        capacity = queue.Capacity();

        System.out.println("Size after : "+ size);
        System.out.println("Capacity after : " + capacity);

        int value = queue.Dequeue();
        System.out.println("The value : "+ value);
        size = queue.Size();

        capacity = queue.Capacity();
        System.out.println("Size after : "+ size);
        System.out.println("Capacity after : " + capacity);
    }
}
