// { Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class AddTwo{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
static Node addLists(Node first, Node second){
// code here
// return head of sum list
Node head = new Node(0);
Node a = reverse(first);
Node b = reverse(second);
int carry = 0;
Node curr = head;
while(a != null || b != null) {
int n1 = (a==null) ? 0 : a.data;
int n2 = (b==null) ? 0 : b.data;
int sum = n1 + n2 + carry;
carry = (sum > 9) ? 1 : 0;
sum %= 10;
curr.next = new Node(sum);
curr = curr.next;
a = (a==null) ? a : a.next;
b = (b==null) ? b : b.next;
}

if(carry == 1)
curr.next = new Node(1);


Node finalHead = reverse(head.next);
return finalHead;
}

static Node reverse(Node head) {
Node curr = head;
Node prev = null, next = null;
while(curr != null) {
next = curr.next;
curr.next = prev;
prev = curr;
curr = next;
}
return prev;
}

}


2 4 5 3 3 4 5 


3 9 0






