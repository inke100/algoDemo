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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 环形链表
 *
 *
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    return null;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        ListNode node = ListNodeUtil.list2Node(list);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }

    }
}