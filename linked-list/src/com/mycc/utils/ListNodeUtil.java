package com.mycc.utils;

import com.mycc.base.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: mayongchang
 * Date: 2022/9/28
 * Time: 18:06
 * To change this template use File | Settings | File Templates.
 * Description: 方便初始化node内容涵盖
 */
public class ListNodeUtil {
  /**
   * 字符转Node
   *
   * @param nodeString 初始化的只  ”1,2,3,4,5“
   * @return ListNode
   */
   public static ListNode string2Node(String nodeString){
     ListNode node =new ListNode(0);
     String[] splitArray = nodeString.split(",");
       for (String s : splitArray) {
           node = new ListNode(Integer.parseInt(s), node);
       }
     return node;
   }

    /**
     * list转node
     * @param list
     * @return
     */
   public static ListNode list2Node(List<Integer> list){
       ListNode node =new ListNode();
       Collections.reverse(list);
       for (int value:list) {
           node=new ListNode(value,node);
       }
       return node;
   }
    public  static List<Integer>  node2List(ListNode node){
        List<Integer>  list =new ArrayList<Integer>();
        while(node!=null){
            list.add(node.val);
            node=node.next;
        }
        return list;
    }
}
