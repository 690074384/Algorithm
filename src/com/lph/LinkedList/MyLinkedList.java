package com.lph.LinkedList;

import java.util.Hashtable;

/**
 * @author lvpenghui
 * 实现单链表的基本操作,增加删除节点、排序、打印、计算长度
 */
public class MyLinkedList {

    /**
     *
     */
    public static class Node{
        int data;
        Node next;
        public Node(int n){
            this.data=n;
            this.next=null;
        }
    }

    Node head = null;//链表头的作用
    /**向链表中插入数据
     * @param d：插入数据的内容
     */
    public void addNode(int d){
        Node newNode=new Node(d);
        if(head==null){
            head=newNode;
            return;
        }
        Node tmp=head;
        while(tmp.next!=null){
            tmp=tmp.next;
        }
        //add Node to end
        tmp.next=newNode;
    }
    /**
     * @param index:删除第index个节点
     * @return 成功返回true，失败返回false
     */
    public Boolean deleteNode(int index){
        if(index<1||index>length()){
            return false;//删除元素位置不合理
        }
        //删除链表中的第一个元素
        if(index==1){
            head=head.next;
            return true;
        }
        int i=1;
        Node preNode=head;
        Node curNode=preNode.next;
        while(curNode!=null){
            if(i==index){
                preNode.next=curNode.next;
                return true;
            }
            preNode=curNode;
            curNode=curNode.next;
            i++;
        }
        return true;
    }
    /**
     * @return 返回链表的长度length
     */
    public int length(){
        int length=0;
        Node tmp=head;
        while(tmp!=null){
            length++;
            tmp=tmp.next;
        }
        return length;
    }
    /**
     * 对链表进行排序
     * @return 返回排序后的头结点
     */
    public Node orderList(){
        Node nextNode=null;
        int temp=0;
        Node curNode=head;
        while(curNode.next!=null){
            nextNode=curNode.next;
            while(nextNode!=null){
                if(curNode.data>nextNode.data){
                    temp=curNode.data;
                    curNode.data=nextNode.data;
                    nextNode.data=temp;
                }
                nextNode=nextNode.next;
            }
            curNode=curNode.next;
        }
        return head;
    }
    /**
     * 打印链表中所有数据
     */
    public void printList(){
        Node tmp=head;
        while(tmp!=null){
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }
        System.out.println();
    }
    /**
     * 从链表中删除数据的第一种方法
     * 遍历链表，把遍历到的数据存到一个Hashtable中，在遍历过程中若当前访问的值在Hashtable
     * 中存在，则可以删除
     * 优点：时间复杂度低    缺点：需要额外的存储空间来保存已访问过得数据
     */
    public void deleteDuplecate1(){
        Hashtable<Integer,Integer> table=new Hashtable<Integer,Integer>();
        Node tmp=head;
        Node pre=null;
        while (tmp!=null) {
            if(table.containsKey(tmp.data))
                pre.next=tmp.next;
            else{
                table.put(tmp.data, 1);
                pre=tmp;
            }
            tmp=tmp.next;
        }
    }
    /**
     * 从链表中删除重复数据的第二种方法
     * 双重循环遍历
     * 优缺点很明显
     */
    public void deleteDuplecate2(){
        Node p=head;
        while (p!=null) {
            Node q=p;
            while(q.next!=null){
                if(p.data==q.next.data){
                    q.next=q.next.next;
                }else{
                    q=q.next;
                }
            }
            p=p.next;
        }
    }
    /**
     * @param k：找到链表中倒数第k个节点
     * @return 该节点
     * 设置两个指针p1、p2，让p2比p1快k个节点，同时向后遍历，当p2为空，则p1为倒数第k个节点
     */
    public Node findElem(Node head,int k){
        if(k<1||k>this.length())
            return null;
        Node p1=head;
        Node p2=head;
        for (int i = 0; i < k-1; i++)
            p2=p2.next;
        while (p2.next!=null) {
            p2=p2.next;
            p1=p1.next;
        }
        return p1;
    }
    /**
     * 实现链表的反转
     * @param head 链表的头节点
     */
    public void reverseIteratively(Node head){
        Node pReversedHead=head;
        Node pNode=head;
        Node pPrev=null;
        while (pNode!=null) {
            Node pNext=pNode.next;
            if(pNext==null)
                pReversedHead=pNode;
            pNode.next=pPrev;
            pPrev=pNode;
            pNode=pNext;
        }
        this.head=pReversedHead;
    }
    /**
     * 通过递归从尾到头输出单链表
     * @param head
     */
    public void printListReversely(Node head){
        if(head!=null){
            printListReversely(head.next);
            System.out.print(head.data+" ");
        }
    }
    /**
     * 查询单链表的中间节点
     * 定义两个指针，一个每次走一步，一个每次走两步...
     * @param head
     * @return q为中间节点
     */
    public Node searchMid(Node head){
        Node q=head;
        Node p=head;
        while (p!=null&&p.next!=null&&p.next.next!=null) {
            q=q.next;
            p=p.next.next;
        }
        return q;
    }
    /**
     * 在不知道头指针的情况下删除指定节点
     * 链表尾节点无法删除，因为删除后无法使其前驱节点的next指针置为空
     * 其他节点，可以通过交换这个节点与其后继节点的值，然后删除后继节点
     * @param n
     * @return
     */
    public boolean deleteNode(Node n){
        if(n==null||n.next==null)
            return false;
        int tmp=n.data;
        n.data=n.next.data;
        n.next.data=tmp;
        n.next=n.next.next;
        return true;
    }
    /**
     * 判断两个链表是否相交
     * 如果两个链表相交，则肯定有相同的尾节点，遍历两个链表，记录尾节点，看是否相同
     * @param h1 链表1的头节点
     * @param h2 链表2的头结点
     * @return 是否相交
     */
    public boolean isIntersect(Node h1,Node h2){
        if(h1==null||h2==null)
            return false;
        Node tail1=h1;
        while (tail1.next!=null){
            tail1=tail1.next;
        }
        Node tail2=h2;
        while(tail2.next!=null){
            tail2=tail2.next;
        }
        return tail1==tail2;
    }
    /**
     * 找出相交的第一个节点
     * @param h1
     * @param h2
     * @return
     */
    public Node getFirstMeetNode(Node h1,Node h2){
        if(h1==null||h2==null)
            return null;
        Node tail1=h1;
        int len1=1;
        while (tail1.next!=null){
            tail1=tail1.next;
            len1++;
        }
        Node tail2=h2;
        int len2=1;
        while(tail2.next!=null){
            tail2=tail2.next;
            len2++;
        }
        if(tail1!=tail2){
            return null;
        }
        Node t1=h1;
        Node t2=h2;
        //找出较长的链表先遍历
        if(len1>len2){
            int d=len1-len2;
            while(d!=0){
                t1=t1.next;
                d--;
            }
        }
        if(len1<len2){
            int d=len2-len1;
            while(d!=0){
                t2=t2.next;
                d--;
            }
        }
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
        }
        return t1;
    }
    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();

    }
}