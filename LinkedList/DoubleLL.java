package LinkedList;

class Node{
    int data;
    
    Node next;
    Node back;
    Node(int data1,Node next1,Node back1){
        this.data = data1;
        
        this.next = next1;
        this.back = back1;
    }
    Node(int data1){
        this.data = data1;
        
        this.next = null;
        this.back = null;
    }
}
class DoubleLL {
    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data);
            head = head.next;
            if(head!=null)
                System.out.print("<--->");
            
        }
        System.out.println();
    }
    public static Node printLL(int arr[]){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static Node delNode(Node head){
        if(head==null || head.next == null){
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        
        return head;
    }
    public static Node tail(Node head){
        Node tail = head;
        if(tail==null || tail.next==null){
            return null;
        }
        while(tail.next!=null){
            tail = tail.next;
            
        }
        Node prev = tail.back;
        prev.next = null;
        tail.back = null;
        
        return head;
        
    }
    public static Node kthdel(Node head,int k){
        if(head==null){
            return null;
        }
        Node temp = head;
        
        int cnt = 0;
        while(temp!=null){
            cnt++;
            if(cnt==k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node front = temp.next;
        //Edge cases
        
        if(prev==null&&front==null){
            return null;
            
        }else if(prev==null){
            return delNode(head);
            
        }else if(front==null){
            return tail(head);
            
        }
        prev.next = front;
        front.back = prev;
        temp.next = null;
        temp.back = null;
        return head;
    }
    public static Node Nodedel(Node temp2) {
    Node prev = temp2.back;
    Node front = temp2.next;

    // Handle tail node
    if (front == null) {
        prev.next = null;
        temp2.back = null;
        return temp2;
    }

    // Handle head node (no previous)
    if (prev == null) {
        front.back = null;
        temp2.next = null;
        return temp2;
    }

    // Middle node deletion
    prev.next = front;
    front.back = prev;

    temp2.next = temp2.back = null;
    return temp2;
}

public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
    Node head = printLL(arr);

    Node deletedNode = Nodedel(head.next.next); 
    System.out.println("Deleted node: " + deletedNode.data);

    print(head); 
}
}