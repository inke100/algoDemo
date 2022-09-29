package com.mycc;
/**
 * Created with IntelliJ IDEA.
 *
 * @author: mayongchang
 * @link <a href="https://leetcode.cn/problems/merge-two-sorted-lists/"></a>
 * Date: 2022/9/28
 * Time: 17:37
 * To change this template use File | Settings | File Templates.
 * Description: 合并两个有序列表
 */

import com.mycc.base.ListNode;
import com.mycc.utils.ListNodeUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 环形链表
 *
 *
 */
public class MergeTwoLists {
    public  ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        ListNode head=null,tail=null;

        while(list1!=null&&list2!=null){
            if(head==null){
                if(list1.val>list2.val){

                    tail =  head=new ListNode(list2.val);
                    list2=list2.next;
                }else{

                    tail=  head=new ListNode(list1.val);
                    list1=list1.next;
                }

            }else{
                if(list1.val>list2.val){

                    head.next=new ListNode(list2.val);
                    list2=list2.next;
                }else{

                    head.next=new ListNode(list1.val);
                    list1=list1.next;
                }
                head=head.next;
            }
        }
        if(list1!=null){
            if(head==null){
                tail=list1;
            }else{
                head.next=list1;
            }
        }
        if(list2!=null){

            if(head==null){
                tail=list2;
            }else{
                head.next=list2;
            }
        }
        return tail;
    }

    /**
     * 迭代 通过虚拟头节点 迭代比较
     * @param list1
     * @param list2
     * @return
     */
    public   ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        // 虚拟头结点
        ListNode dummy = new ListNode(-1), p = dummy;
        ListNode p1 = list1, p2 = list2;

        while (p1 != null && p2 != null) {
            // 比较 p1 和 p2 两个指针
            // 将值较小的的节点接到 p 指针
            if (p1.val > p2.val) {
                p.next = p2;
                p2 = p2.next;
            } else {
                p.next = p1;
                p1 = p1.next;
            }
            // p 指针不断前进
            p = p.next;
        }

        if (p1 != null) {
            p.next = p1;
        }

        if (p2 != null) {
            p.next = p2;
        }

        return dummy.next;
    }

    /**
     * 最优解 递归
     * @param list1
     * @param list2
     * @return
     */
    public  ListNode mergeTwoLists3(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode res = list1.val < list2.val ? list1 : list2;
        res.next = mergeTwoLists3(res.next, list1.val >= list2.val ? list1 : list2);
        return res;
    }



    @Test
    public void Test(){
        List<Integer> list1 = Arrays.asList(1,2,4,5,6,7);
        List<Integer> list2 = Arrays.asList( 1,3,4);
//        System.out.println(list.size());
        ListNode node1 = ListNodeUtil.list2Node(list1);
        ListNode node2 = ListNodeUtil.list2Node(list2);
        ListNode listNode = mergeTwoLists1(node1, node2);
        System.out.println("ListNodeUtil.node2List(listNode) = " + ListNodeUtil.node2List(listNode));
    }
}
