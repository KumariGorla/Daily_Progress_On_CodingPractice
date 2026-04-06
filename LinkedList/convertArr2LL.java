package LinkedList;
//Convert an array to a Linked List
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class convertArr2LL {
    public static Node ConvArrtoLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
            
        }
        return head;
    }

//To print the length of the linked list
    /**public static int LenLL(Node head){
        int cnt = 0;
        Node temp = head;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }**/

//To Search an element in the linked list
    public static boolean SeLL(Node head,int val){
        Node temp = head;
        while(temp!=null){
        if(temp.data == val) return true;
        temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = ConvArrtoLL(arr);
        boolean Serch = SeLL(head, 3);
        System.out.println(Serch);
        //Node temp = head;
        //while(temp!=null){
        //    System.out.print(temp.data);
        //    temp = temp.next;
        //    if(temp!=null){{
        //        System.out.print("->");
        //    }}
        //}
        //int res = LenLL(head);
        //System.out.println(res);
    }
}